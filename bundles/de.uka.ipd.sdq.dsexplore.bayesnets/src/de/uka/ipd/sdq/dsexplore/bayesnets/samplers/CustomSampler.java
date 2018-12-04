package de.uka.ipd.sdq.dsexplore.bayesnets.samplers;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import de.uka.ipd.sdq.dsexplore.bayesnets.utility.BayesNetwork;

public class CustomSampler {

	int[][] Graph;
	int[][] DataMatrix;
	List<Integer> bitsPerDegree;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] Graph = {{0,1,1,0},{0,0,0,1},{0,0,0,1},{0,0,0,0}};
		int[][] DataMat = new int[10][4];
		Random r = new Random();
		for(int i=0;i<10;i++){
			for(int j=0;j<4;j++){
				DataMat[i][j] = r.nextInt(2);
				System.out.print(DataMat[i][j]);
			}
			System.out.println();
		}
		List<Integer> somelist = new ArrayList<Integer>();
		somelist.add(1);
		somelist.add(3);
		CustomSampler cs = new CustomSampler(Graph,DataMat,somelist);
		int[][] sample=cs.sample(10);
		System.out.println("----------------------");
		for(int i=0;i<sample.length;i++){
			for(int j=0;j<sample[i].length;j++){
				System.out.print(sample[i][j]);
			}
			System.out.println();
		}
	}

	
	public CustomSampler(int[][] Graph, int[][] DataMatrix, List<Integer> list){
		this.Graph = Graph;
		this.DataMatrix = DataMatrix;
		this.bitsPerDegree = list;
	}
	
public int[][] sample(int NumberOfSamples){
		
		int n = DataMatrix[1].length; // No. of nodes/variables
		//int n=4;
		int r = 2; // Number of states of the random variable Xi
		
		// Prepare matrix q. q[i] is the number of configurations which parents of
		// Xi can take.
		BayesNetwork BN = new BayesNetwork(n);
		int[] q = new int[n];
		for(int i = 0;i<n;i++){
			q[i] = (int) Math.pow(r,(BN.getParents(Graph, i)).length);
		}
		
		// create the w matrix which stores the configurations for the parents 
		// of node Xi
		//int[][][] w = new int[n][n][(int) Math.pow(2, n)];
		ArrayList<int[][]> w = new ArrayList<int[][]>();
		for(int i = 0;i< n;i++){
			// Create the wij matrix
			int[][] w_inter = new int[BN.getParents(Graph, i).length][(int) Math.pow(2, BN.getParents(Graph, i).length)];
			for(int j = 0;j< (BN.getParents(Graph, i)).length;j++){
				int Threshold=(int) Math.pow(2,(BN.getParents(Graph, i)).length-(j+1));
				int count = 1;
				boolean flip = false;
				for(int k = 0;k< q[i];k++){
					if(flip == false){
						w_inter[j][k] = 0;
					}else if(flip == true){
						w_inter[j][k] = 1;
					}
					
					if(count%Threshold == 0){
						flip = !flip;
					}
					count++;
				}
			}
			w.add(w_inter);
		}
		// Created and stored the various configurations pertaining to various Xi nodes
		
		
		// Now again create the 3 Dimensional matrix Nijk
		//int[][][] N = new int[n][(int) Math.pow(2, n)][r];
		ArrayList<int[][]> N = new ArrayList<int[][]>();
		for(int i = 0;i< n;i++){
			int[][] N_inter = new int[q[i]][r];
			for(int j = 0;j< q[i];j++){
				for(int k=0;k< r;k++){
					// Create a matrix for parents of node i (Xi)
					int[] Parents = BN.getParents(Graph, i);
					int count1=0;
					
					// Count the number of instances in data Data, where
					// Xi =k and Pa(Xi)=jth config.
					//traverse through the Data
					for(int id=0;id< DataMatrix.length;id++){
						boolean countvar = true;
						int ip1 = 0;
						for(int ip : Parents){
							//System.out.println("i:"+i+","+"ip1:"+ip1+","+"j:"+j+","+"id:"+id+","+"ip:"+ip+","+"k:"+k);
							//System.out.println(w.get(i)[ip1][j]+" "+DataMatrix[id][ip]);
							if(((Integer) w.get(i)[ip1][j]).equals(DataMatrix[id][ip])){
								countvar = countvar&true;
							}else{
								countvar = countvar&false;
							}
							ip1++;
						}
						//System.out.println("countvar: "+countvar);
						//System.out.println("DataMatrix[id][i]: "+(DataMatrix[id][i] == k));
						if(countvar & DataMatrix[id][i] == k){
							count1++;
						}
					}
					N_inter[j][k] = count1;
				}
			}
			N.add(N_inter);
		}
		
		// Nijk calculated
		// Calculate Nij
		//int[][][] Nij = new int[n][(int) Math.pow(2, n)][1];
		ArrayList<int[]> Nij = new ArrayList<int[]>();
		for(int i = 0;i< n;i++){
			int[] Nij_inter = new int[q[i]];
			for(int j = 0;j< q[i];j++){
				int count = 0;
				for(int k = 0;k< r;k++){
					count = count + N.get(i)[j][k];
				}
				Nij_inter[j] = count;
			}
			Nij.add(Nij_inter);
		}
		
		int[][] SampledData = new int[NumberOfSamples][DataMatrix[0].length];
		ArrayList<ArrayList<Integer>> Result = new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> SamplingOrder = getSamplingOrder(Graph);
		
		for(int i = 0; i < NumberOfSamples; i++){
			boolean[] dontDetermineValue = new boolean[DataMatrix[0].length];
			int[] DataRow = new int[DataMatrix[0].length];
			for(int j=0;j<SamplingOrder.size();j++){
				for(int k=0;k<SamplingOrder.get(j).size();k++){
					// determine value here
					//System.out.println("For : "+SamplingOrder.get(j).get(k));
					int parentconfig;
					if(j==0){
						parentconfig = 0;
					}else{
						int[] parentslist = BN.getParents(Graph, SamplingOrder.get(j).get(k));
						String binaryString = "";
						for(int index=0; index<parentslist.length;index++){
							binaryString = binaryString+DataRow[parentslist[index]];
						}
						parentconfig = Integer.parseInt(binaryString,2);
					}
					if(!dontDetermineValue[SamplingOrder.get(j).get(k)]){
						int[][] ConditionalProbabilityMat = N.get(SamplingOrder.get(j).get(k));
						DataRow[SamplingOrder.get(j).get(k)] = roullettewheelvalue(SamplingOrder.get(j).get(k),ConditionalProbabilityMat,parentconfig);
						if(DataRow[SamplingOrder.get(j).get(k)]==1){
							updateDontDetermineValue(SamplingOrder.get(j).get(k),DataRow[SamplingOrder.get(j).get(k)],dontDetermineValue);
						}
						
					}
					
					
					
				}
			}
			// Convert DataRow to ArrayList<Integer>
			ArrayList<Integer> DataRowList = new ArrayList<Integer>();
			for(int m=0;m<DataRow.length;m++){
				DataRowList.add(DataRow[m]);
			}
			Result.add(DataRowList);
		}
		
		// Convert Result to int[][]
		for(int i=0;i<Result.size();i++ ){
			for(int j=0;j<Result.get(i).size();j++){
				SampledData[i][j] = Result.get(i).get(j);
			}
		}
		return SampledData;
	}
	
	private void updateDontDetermineValue(int Node, int NodeValue,boolean[] dontDetermineValue) {
	// TODO Auto-generated method stub
		List<Integer> processedList = new ArrayList<Integer>();
		for(int i=0;i<this.bitsPerDegree.size();i++){
			if(i==0){
				processedList.add(this.bitsPerDegree.get(i)); 
			}else{
				processedList.add(this.bitsPerDegree.get(i)+processedList.get(i-1));
			}
		}
		
		int block =0;
		for(int i=0;i<processedList.size();i++){
			if(Node < processedList.get(i)){
				block = i;
				break;
			}
		}
		
		// Now update that block's dontDetermineValues
		if(block!=0){
			for(int i=processedList.get(block-1);i<processedList.get(block);i++){
				dontDetermineValue[i] = true;
			}
		}else{
			for(int i=0;i<processedList.get(block);i++){
				dontDetermineValue[i] = true;
			}
		}
		
	
}


	private int roullettewheelvalue(int NodeValue, int[][] CondProbTable,
			int parentconfig) {
		// TODO Auto-generated method stub
		// Find Probabilities
		double[] condprobmat = new double[CondProbTable[0].length];
		double den =0;
		for(int i=0;i<CondProbTable[0].length;i++){
			condprobmat[i] = (double) CondProbTable[parentconfig][i];
			den = den + CondProbTable[parentconfig][i];
		}
		for(int i=0;i<condprobmat.length;i++){
			condprobmat[i] = (condprobmat[i])/den ;
		}
		for(int i=1;i<condprobmat.length;i++){
			condprobmat[i] = condprobmat[i]+condprobmat[i-1];
		}
		
		// Apply roulette wheel strategy
		double randNum = Math.random();
		int kValue = 0;
		for(int i=0;i<condprobmat.length;i++){
			if(randNum <= condprobmat[i]){
				kValue = i;
				break;
			}
		}
		
		return kValue;
	}

	private ArrayList<ArrayList<Integer>> getSamplingOrder(int[][] Graph){
		ArrayList<ArrayList<Integer>> SamplingOrder = getOrder(Graph);
		for(int i = SamplingOrder.size()-1; i>0;i--){
			SamplingOrder.get(i).removeAll(SamplingOrder.get(i-1));
		}
		return SamplingOrder;
	}
	
	private ArrayList<ArrayList<Integer>> getOrder(int[][] Graph){
		ArrayList<ArrayList<Integer>> SamplingOrderNodeList = new ArrayList<ArrayList<Integer>>();
		if(Graph == null){
			return SamplingOrderNodeList;
		}else{
			ArrayList<Integer> ListOfParents = getAllParents(Graph);
			
			// Now trim the Graph
			int[][] TrimmedGraph = new int[Graph.length][Graph.length];
			if( ( (Integer)ListOfParents.size() ).equals(((Integer)Graph.length)) ){
				TrimmedGraph = null;
			}else{
				//int[][] TrimmedGraph = new int[Graph.length - ListOfParents.size()][Graph.length - ListOfParents.size()];
				
				for(int i=0;i<Graph.length;i++){
					if(!ListOfParents.contains(i)){
						for(int j=0;j<Graph.length;j++){
							if(!ListOfParents.contains(j)){
								TrimmedGraph[i][j] = Graph[i][j];
							}
						}
						
					}		
				}
			}
			SamplingOrderNodeList = getOrder(TrimmedGraph);
			//SamplingOrderNodeList.get(0).removeAll(ListOfParents);
			SamplingOrderNodeList.add(0, ListOfParents);
			return SamplingOrderNodeList;
		
		}
	}
	
	public ArrayList<Integer> getAllParents(int[][] Graph){
		ArrayList<Integer> AllParents = new ArrayList<Integer>();
		for(int i=0;i<Graph.length;i++){
			boolean isZero = true;
			for(int j=0;j<Graph.length;j++){
				isZero = isZero&&(Graph[j][i] == 0);
			}
			if(isZero){
				AllParents.add(i);
			}
		}
		return AllParents;
	}
	
}
