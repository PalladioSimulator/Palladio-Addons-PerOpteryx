package de.uka.ipd.sdq.dsexplore.bayesnets.samplers;

import de.uka.ipd.sdq.dsexplore.bayesnets.utility.BayesNetwork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


/**
 * Used to sample data from a learnt Bayesian Network. 
 * <p><b> Algorithm description: </b> First the root node (i.e the node
 * having no parents) is assigned a data value according to the probability
 * parameters encoded in the network. Then, the children of the node
 * are assigned values (given the parent node value) using conditional 
 * probability parameters. This process continues until all nodes are 
 * assigned some value.<p> The whole process is repeated as many 
 * times as we want the number of offspring.
 * @author Apoorv
 *
 */

// TODO: In the roulettewheelvalue method, add code for handling 0/0 cases ... 
public class BOAsampler {

	int[][] Graph;
	int[][] DataMatrix;
	
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
		//System.out.println(Graph[0].length);
		BOAsampler sampler = new BOAsampler(Graph,DataMat);
		ArrayList<ArrayList<Integer>> result = sampler.getSamplingOrder(Graph);
		
		for(int i =0;i< result.size();i++){
			System.out.println(result.get(i).toString());
		}
		int[][] sample = sampler.sample(100);
		for(int i=0;i<sample.length;i++){
			for(int j=0;j<sample[i].length;j++){
				System.out.print(sample[i][j]);
			}
			System.out.println();
		}
		
		int[][] Graph1 = new int[27][27];
		Random r1 = new Random();
		for(int i=0;i<27;i++){
			for(int j=0;j<27;j++){
				Graph1[i][j] = r.nextInt(2);
				System.out.print(Graph1[i][j]);
			}
			System.out.println();
		}
		BayesNetwork bn = new BayesNetwork(27);
		int[][] Graph2 = bn.removeCycles(Graph1);
		ArrayList<ArrayList<Integer>> order =sampler.getOrder(Graph2);
		for(int i =0;i< order.size();i++){
			System.out.println(order.get(i).toString());
		}
	}
	/**
	 * Constructor for the class.
	 * @param Graph - An adjacency matrix representing the network/graph
	 * @param DataMatrix - A matrix containing the data
	 * @author Apoorv
	 */
	public BOAsampler(int[][] Graph, int[][] DataMatrix){
		this.Graph = Graph;
		this.DataMatrix = DataMatrix;
	}
	
	
	/**
	 * Method to sample solutions/offspring/data-points from the 
	 * Bayesian Network.
	 * @param NumberOfSamples - The number of data-points/offspring 
	 * one wants from the learnt Bayesian Network.
	 * @return A matrix containing the sampled offspring/data-points.
	 * Each row corresponds to an offspring/data-point.
	 * @author Apoorv
	 */
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
					
					int[][] ConditionalProbabilityMat = N.get(SamplingOrder.get(j).get(k));
					DataRow[SamplingOrder.get(j).get(k)] = roullettewheelvalue(SamplingOrder.get(j).get(k),ConditionalProbabilityMat,parentconfig);
					
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
	
	/**
	 * Assigns a value to the node using the given conditional 
	 * probability table (CondProbTable) and the parent configuration 
	 * (parentconfig).
	 * @param NodeValue - Value of the node
	 * @param CondProbTable - Conditional Probability Table encoded 
	 * in the Bayesian Network parameters. Rows correspond to 
	 * the parent configurations, and columns correspond to 
	 * the values which the data can take.
	 * @param parentconfig - The i<sup>th</sup> configuration
	 * of the parents
	 */
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

	/**
	 * Gives the order of nodes for carrying out the sampling (i.e 
	 * assigning values to nodes) in the given network/graph.
	 * @param Graph - The adjacency matrix representing the graph/network.
	 * @return An ArrayList of ArrayList. The first internal ArrayList
	 * corresponds to the list of nodes which are to be sampled first, 
	 * the second ArrayList corresponds to the list of nodes which 
	 * are to be sampled second and so on.
	 * @author Apoorv
	 */
	private ArrayList<ArrayList<Integer>> getSamplingOrder(int[][] Graph){
		ArrayList<ArrayList<Integer>> SamplingOrder = getOrder(Graph);
		for(int i = SamplingOrder.size()-1; i>0;i--){
			SamplingOrder.get(i).removeAll(SamplingOrder.get(i-1));
		}
		return SamplingOrder;
	}
	
	/**
	 * Have to see this. I forgot the functionality.
	 */
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
	
	/**
	 * Gives a list of all root nodes in the network/graph.
	 * Root nodes are those nodes which don't have any other
	 * node as its parent.
	 * @param Graph - An adjacency matrix of the network/graph.
	 * @return An ArrayList of Integer values. The integer values 
	 * correspond to the indices of the root nodes.
	 * @author Apoorv
	 */
	//TODO : Change the name of the method to something else. Current
	// name suggests something different from what is really intended. 
	// For example keep getAllRootNodes etc. or something similar.
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
