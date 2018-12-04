package de.uka.ipd.sdq.dsexplore.bayesnets.searchers;

import java.util.Random;

import de.uka.ipd.sdq.dsexplore.bayesnets.utility.BayesNetwork;
import de.uka.ipd.sdq.dsexplore.bayesnets.utility.BayesNetworkScore;

/**
 * Searches randomly in the search space for Bayesian Networks.
 * Yet to be implemented completely.
 * @author Apoorv
 *
 */
public class RandomSearch {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] DataMat = new int[100][27];
		Random r = new Random();
		for(int i=0;i<100;i++){
			for(int j=0;j<27;j++){
				DataMat[i][j] = r.nextInt(2);
			}
			
		}
		RandomSearch rs = new RandomSearch();
		int[][] graph = rs.search(DataMat);
		for(int i=0;i<graph.length;i++){
			for(int j=0;j<graph.length;j++){
				System.out.print(graph[i][j]);
			}
			System.out.println();
		}
	}
	
	/**
	 * This method searches the best bayesian networks 
	 * in the search space. The search order is random.
	 * @param DataMatrix - The matrix containing data. Each row
	 * represents a data instance
	 * @return An Adjacency matrix of the best learnt Bayesian network. 
	 * @author Apoorv
	 */
	public int[][] search(int[][] DataMatrix){
		// Initialize the structure
		BayesNetwork bn = new BayesNetwork(DataMatrix[0].length);
		int[][] learnedStructure = null;
		double learnedStructureScore = 0;
		for(int i=0;i<500;i++){
			int[][] Graph = bn.createRandomStructure();
			BayesNetworkScore bns = new BayesNetworkScore(Graph, DataMatrix);
			double score = bns.LogLik();
			if(i==1){
				learnedStructureScore = score;
				learnedStructure = Graph;
			}else{
				if(learnedStructureScore < score){
					//update
					learnedStructureScore = score;
					System.out.println(learnedStructureScore);
					learnedStructure = Graph;
				}
			}
			
		}
		return learnedStructure;
		
	}

}
