package de.uka.ipd.sdq.dsexplore.bayesnets.searchers;

import java.util.ArrayList;
import java.util.Random;

import de.uka.ipd.sdq.dsexplore.bayesnets.utility.BayesEdge;
import de.uka.ipd.sdq.dsexplore.bayesnets.utility.BayesNetwork;
import de.uka.ipd.sdq.dsexplore.bayesnets.utility.BayesNetworkScore;


// The process you have coded is flawed. Fix this ...
public class HillClimber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] DataMat = new int[1000][6];
		Random r = new Random();
		for(int i=0;i<100;i++){
			for(int j=0;j<6;j++){
				DataMat[i][j] = r.nextInt(2);
			}
			
		}
		HillClimber hc = new HillClimber();
		int[][] graph = hc.search(DataMat);
		for(int i=0;i<graph.length;i++){
			for(int j=0;j<graph.length;j++){
				System.out.print(graph[i][j]);
			}
			System.out.println();
		}
	}
	
	public int[][] search(int[][] DataMatrix){
		// Initialize the structure
		BayesNetwork bn = new BayesNetwork(DataMatrix[0].length);
		
		// Create an empty structure
		int[][] Graph = bn.createEmptyStructure();
		BayesNetworkScore bns = new BayesNetworkScore(Graph,DataMatrix);
		double GraphScore = bns.LogLik();
		//System.out.println(GraphScore);
		double maxscore = 0;
		do{
			//System.out.println("line42");
			maxscore = GraphScore;
			// Create the Attribute pair matrix. Each entry position
			// whose matrix value is 1 is an Attribute pair. 
			int[][] attributePairs = new int[DataMatrix[0].length][DataMatrix[0].length];
			for(int i=0 ; i < DataMatrix[0].length ; i++){
				for(int j=0 ; j < DataMatrix[0].length ; j++){
					if(j>i){
						attributePairs[i][j] = 1;
					}
				}
			}
			/*
			for(int iii=0;iii<attributePairs.length;iii++){
				for(int jjj=0;jjj<attributePairs.length;jjj++){
					System.out.print(attributePairs[iii][jjj]);
				}
				System.out.println();
			}
			*/
			// For each attribute pair, apply the operators in BayesEdge class
			BayesEdge bayesEdge = new BayesEdge();
			
			for(int i=0 ; i < attributePairs.length ; i++){
				for(int j=0 ; j < attributePairs.length ; j++){
					//System.out.println(i+" "+j);
					//System.out.println(attributePairs[i][j] == 1);
					
					if(attributePairs[i][j] == 1){
						// Generate 3 graphs
						ArrayList<int[][]> nextProbableGraphs = new ArrayList<int[][]>();
						BayesNetwork bnw = new BayesNetwork(DataMatrix[0].length);
						for(int m=0;m<3;m++){
							if(m==0){
								if(bnw.checkCycles(bayesEdge.addEdge(Graph, i, j))){
									nextProbableGraphs.add(bayesEdge.addEdge(Graph, i, j));
								}
								
							}else if(m==1){
								if(bnw.checkCycles(bayesEdge.removeEdge(Graph, i, j))){
									nextProbableGraphs.add(bayesEdge.removeEdge(Graph, i, j));
								}
							}else{
								if(bnw.checkCycles(bayesEdge.reverseEdge(Graph, i, j))){
									nextProbableGraphs.add(bayesEdge.reverseEdge(Graph, i, j));
								}
								
							}
							
						}
						
						// Traverse through the graphs and keep the best
						
						for(int k = 0;k< nextProbableGraphs.size();k++ ){
							
							for(int iii=0;iii<nextProbableGraphs.get(k).length;iii++){
								for(int jjj=0;jjj<nextProbableGraphs.get(k).length;jjj++){
									System.out.print(nextProbableGraphs.get(k)[iii][jjj]);
								}
								System.out.println();
							}
							
							BayesNetworkScore bns1 = new BayesNetworkScore(nextProbableGraphs.get(k),DataMatrix);
							double IntermediateGraphScore = bns1.LogLik();
							System.out.println(IntermediateGraphScore);
							if(IntermediateGraphScore > GraphScore){
								Graph = makeArrayCopy(nextProbableGraphs.get(k));
								GraphScore = IntermediateGraphScore;
							}
						}
						/*
						int[][] IntermediateGraph = null;
						BayesNetwork bnw = new BayesNetwork(DataMatrix[0].length);
						for(int k = 0;k<3;k++){
							//System.out.println(k);
							if(k==0 && bnw.checkCycles(bayesEdge.addEdge(Graph, i, j))){
								System.out.println("Add Edge");
								// Then apply operator1: Adding an edge
								IntermediateGraph = bayesEdge.addEdge(Graph, i, j);
								BayesNetworkScore bns1 = new BayesNetworkScore(IntermediateGraph,DataMatrix);
								double IntermediateGraphScore = bns1.LogLik();
								//System.out.println(IntermediateGraphScore);
								if(IntermediateGraphScore > GraphScore){
									Graph = makeArrayCopy(IntermediateGraph);
									
									for(int ii=0;ii<Graph.length;ii++){
										for(int jj=0;jj<Graph.length;jj++){
											System.out.print(Graph[ii][jj]);
										}
										System.out.println();
									}
									System.out.println();
									System.out.println();
									GraphScore = IntermediateGraphScore;
								}
								//System.out.println(GraphScore);
							}else if (k==1 && bnw.checkCycles(bayesEdge.removeEdge(Graph, i, j))){
								System.out.println("Remove Edge");
								// Then apply operator2: Removing an edge
								IntermediateGraph = bayesEdge.removeEdge(Graph, i, j);
								BayesNetworkScore bns1 = new BayesNetworkScore(IntermediateGraph,DataMatrix);
								double IntermediateGraphScore = bns1.LogLik();
								//System.out.println(IntermediateGraphScore);
								if(IntermediateGraphScore > GraphScore){
									Graph = makeArrayCopy(IntermediateGraph);
									
									for(int ii=0;ii<Graph.length;ii++){
										for(int jj=0;jj<Graph.length;jj++){
											System.out.print(Graph[ii][jj]);
										}
										System.out.println();
									}
									System.out.println();
									System.out.println();
									GraphScore = IntermediateGraphScore;
								}
								//System.out.println(GraphScore);
							}else if (k==2 && bnw.checkCycles(bayesEdge.addEdge(Graph, j, i))){
								System.out.println("Reverse Edge");
								// Then apply operator3: Reversing an edge
								IntermediateGraph = bayesEdge.addEdge(Graph, j, i);
								BayesNetworkScore bns1 = new BayesNetworkScore(IntermediateGraph,DataMatrix);
								double IntermediateGraphScore = bns1.LogLik();
								//System.out.println(IntermediateGraphScore);
								if(IntermediateGraphScore > GraphScore){
									Graph = makeArrayCopy(IntermediateGraph);
									
									for(int ii=0;ii<Graph.length;ii++){
										for(int jj=0;jj<Graph.length;jj++){
											System.out.print(Graph[ii][jj]);
										}
										System.out.println();
									}
									System.out.println();
									System.out.println();
									GraphScore = IntermediateGraphScore;
								}
								//System.out.println(GraphScore);
							}
						}
						*/
					}
					
				}
			}
			//System.out.println(GraphScore + "    " + maxscore);
		}while(GraphScore > maxscore );
		return Graph;
		
	}
	
	private int[][] makeArrayCopy(int[][] Array){
		int[][] ArrayCopy = new int[Array.length][Array[0].length];
		for(int i=0 ; i < Array.length ; i++){
			for(int j=0 ; j < Array[0].length ; j++){
				ArrayCopy[i][j] = Array[i][j];
			}
		}
		return ArrayCopy;
	}
	
	

}
