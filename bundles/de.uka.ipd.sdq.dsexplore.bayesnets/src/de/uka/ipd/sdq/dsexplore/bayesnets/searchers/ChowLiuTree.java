package de.uka.ipd.sdq.dsexplore.bayesnets.searchers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import de.uka.ipd.sdq.dsexplore.bayesnets.samplers.BOAsampler;
import de.uka.ipd.sdq.dsexplore.bayesnets.utility.BayesNetworkScore;

// Done totally. Try for PerOpteryx ...
/**
 * ChowLiuTree is another algorithm for searching the space of Bayesian 
 * networks quickly. It gives reasonable networks that model the data 
 * quite well in shorter time than other algorithms like Hill Climber etc. 
 * However, it only models Bayesian networks which have a tree structure.
 * <p> <b>Here is the algorithm </b>: Calculate the mutual info. between
 * all pairs of nodes in the network. Start with the pair of nodes having 
 * the highest mutual info value and add an (undirected) edge between them.
 * Look for the next highest mutual info pair of nodes, and add an 
 * (undirected) edge between them iff adding the edge does not produce 
 * cycles in the network. Carry on the process till you can add no more 
 * edges. In the end, you get a Maximum Spanning Tree structure, which has 
 * all edges which are undirected. In order to make the network/graph 
 * directed, just choose a node at random in the structure, and assign 
 * directions to all edges in such a way that they go away from the chosen 
 * node.
 * @author Apoorv
 *
 */
public class ChowLiuTree {

	/**
	 * The matrix containing the data. Each row
	 * represents a data instance.
	 */
	int[][] Data;
	
	// For testing purposes ...
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] DataMat = new int[100][27];
		Random r = new Random();
		for(int i=0;i<100;i++){
			for(int j=0;j<27;j++){
				DataMat[i][j] = r.nextInt(2);
			}
			
		}
		HillClimber hc = new HillClimber();
		int[][] graph1 = hc.search(DataMat, 5);
		ChowLiuTree clt = new ChowLiuTree(DataMat);
		int[][] graph = clt.search();
		
		for(int i=0;i<graph.length;i++){
			for(int j=0;j<graph.length;j++){
				System.out.print(graph[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("Sampled Data from the network");
		BOAsampler boasampler = new BOAsampler(graph, DataMat);
		
		int[][] sampledData = boasampler.sample(10);
		
		for(int i=0;i<sampledData.length;i++){
			for(int j=0;j<sampledData[0].length;j++){
				System.out.print(sampledData[i][j]);
			}
			System.out.println();
		}
		
		BayesNetworkScore bns = new BayesNetworkScore(graph, DataMat);
		System.out.println(bns.BIC());
		BayesNetworkScore bns1 = new BayesNetworkScore(graph1, DataMat);
		System.out.println(bns1.BIC());
	}
	
	/**
	 * Constructor for the class.
	 * @param Data - The matrix containing the data. Each row
	 * represents a data instance.
	 * @author Apoorv
	 */
	public ChowLiuTree(int[][] Data){
		this.Data = Data;
	}
	
	 
	/**
	 * This method searches the best bayesian networks 
	 * in the search space using the chow liu algortihm. 
	 * It returns the best Bayesian network (as an adjacency matrix) 
	 * it has found over its search.
	 * @param None
	 * @return An Adjacency matrix of the best learnt Bayesian network. 
	 * @author Apoorv
	 */
	public int[][] search(){
		// Compute the mutual info between all pairs of nodes
		int n=Data[0].length;
		double[][] MutInfMat = new double[(n*n - n)/2][3];
		for(int i=0;i<MutInfMat.length;i++){
			for(int j=0;j<MutInfMat[0].length;j++){
				MutInfMat[i][j]=0;
				System.out.print(MutInfMat[i][j]);
			}
			System.out.println();
		}
		int index =0;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(j>i){
					double MutInf = mutualInfo(i,j);
					MutInfMat[index][0] = i;
					MutInfMat[index][1] = j;
					MutInfMat[index][2] = MutInf;
					index++;
				}
			}
		}
		
		for(int i=0;i<MutInfMat.length;i++){
			for(int j=0;j<MutInfMat[0].length;j++){
				System.out.print(MutInfMat[i][j]);
			}
			System.out.println();
		}
		
		// Sort MutInfMat according to last column (the column where mutual information is stored)
		double[][] MutInfMatSorted = sortMatrix(MutInfMat,2);
		for(int i=0;i<MutInfMatSorted.length;i++){
			for(int j=0;j<MutInfMatSorted[0].length;j++){
				System.out.print(MutInfMatSorted[i][j]);
			}
			System.out.println();
		}
		
		
		int[][] ResultGraph = new int[n][n];
		// Traverse MutInfMatSorted bottom up and add edges to form a tree
		
		for(int i=MutInfMatSorted.length-1;i>=0;i--){
			System.out.println("i:"+i);
			List<Integer> list = new ArrayList<Integer>();
			
			if(!checkPath((int)MutInfMatSorted[i][0],(int)MutInfMatSorted[i][1],ResultGraph,list)){
				// then add path between MutInfMatSorted[i][0] and MutInfMatSorted[i][1]
				ResultGraph[(int) MutInfMatSorted[i][0]][(int) MutInfMatSorted[i][1]] = 1;
				ResultGraph[(int) MutInfMatSorted[i][1]][(int) MutInfMatSorted[i][0]] = 1;
			}
		}
		System.out.println("ResultGraph:");
		for(int i=0;i<ResultGraph.length;i++){
			for(int j=0;j<ResultGraph.length;j++){
				System.out.print(ResultGraph[i][j]);
			}
			System.out.println();
		}
		
		List<Integer> nodelist = new ArrayList<Integer>();
		Random nodeSelector = new Random();
		makeDirected(nodeSelector.nextInt(n),ResultGraph,nodelist);
		return ResultGraph;
	}
	
	/**
	 * This method calculates the mutual information between a pair of 
	 * nodes Node1 and Node2.
	 * @param Node1 - First node of the pair of nodes.
	 * @param Node2 - Second node of the pair of nodes.
	 * @return The mutual information as a double. 
	 * @author Apoorv
	 */ 
	public double mutualInfo(int Node1, int Node2){
		double Result = 0;
		int[] r = determineNumOfStates();
		for(int i=0;i<r[Node1];i++){
			for(int j=0;j<r[Node2];j++){
				double num = calcProb(Node1,i,Node2,j);
				double den1 = calcProb(Node1,i);
				double den2 = calcProb(Node2,j);
				Result = Result + num*Math.log( num/(den1*den2) );
			}
		}
		return Result;
	}

	/**
	 * Calculates the probability that <b>Node</b> takes on <b>Value</b>,
	 * given the Data provided.
	 * @param Node - A node in the graph/network
	 * @param Value - Value of the data
	 * @return The probability as a double value.
	 * @author Apoorv 
	 */
	private double calcProb(int Node, int Value){
		double Num = 0;
		double Den = 0;
		for(int i=0;i<Data.length;i++){
			if(Data[i][Node] == Value){
				Num++;
			}
			Den++;
		}
		return Num/Den;
	}
	
	/**
	 * Calculates the probability that (<b>Node1</b> takes on <b>Value1</b>) 
	 * AND (<b>Node2</b> takes on <b>Value2</b>) simultaneously,
	 * given the Data provided.
	 * @param Node1 - A node in the graph/network
	 * @param Value1 - Value of the data corresponding to Node1
	 * @param Node2 - A node in the graph/network
	 * @param Value2 - Value of the data corresponding to Node2
	 * @return The probability as a double value.
	 * @author Apoorv 
	 */
	private double calcProb(int Node1, int Value1, int Node2, int Value2){
		double Num = 0;
		double Den = 0;
		for(int i=0;i<Data.length;i++){
			if((Data[i][Node1] == Value1) && (Data[i][Node2] == Value2)){
				Num++;
			}
			Den++;
		}
		return Num/Den;
	}
	
	/**
	 * Calculates the number of distinct values each data dimension 
	 * can take.
	 * @param None 
	 * @return The distinct states as an array. The array has the same 
	 * length as a data matrix row.
	 * @author Apoorv 
	 */
	private int[] determineNumOfStates(){
		int[] Result = new int[Data[0].length];
		for(int i = 0; i< Data[0].length;i++){
			Set<Integer> ColumnValues = new HashSet<Integer>(); 
			for(int j = 0; j< Data.length;j++){
				ColumnValues.add(Data[j][i]);
			}
			Result[i] = ColumnValues.size();
		}
		return Result;
	}
	
	
	// Note: only for undirected graphs (have a symmetric adjacency matrix)
	// Its basically a BFS written recursively mostly ...
	/**
	 * Checks whether a path already exists between Node1 and Node2.
	 * @param Node1 - A node in the Graph
	 * @param Node2 - Another node in the Graph
	 * @param Graph - Adjacency matrix of the Network
	 * @param visitedNodes - List of the nodes which one can visit 
	 * from Node1.
	 * @return TRUE if path exists, FALSE if it doesn't.
	 * @author Apoorv 
	 */
	private boolean checkPath(int Node1, int Node2, int[][] Graph, List<Integer> visitedNodes){
		boolean Result = false;
		visitedNodes.add(Node1);
		List<Integer> NeighboursOfNode1 = getNeighbours(Node1,Graph);
		if(NeighboursOfNode1.contains(Node2)){
			Result = true;
		}else{
			for(int i = 0; i<NeighboursOfNode1.size();i++){
				if(!visitedNodes.contains(NeighboursOfNode1.get(i))){
					Result = Result || checkPath(NeighboursOfNode1.get(i),Node2,Graph,visitedNodes);
				}
				
			}
		}
		
		return Result;
	}

	/**
	 * Gets the neighbouring nodes of argument node
	 * @param node - A node in the Graph
	 * @param graph - Adjacency matrix of the Network
	 * @return List of indices of all negihbouring nodes.
	 * @author Apoorv 
	 */
	private List<Integer> getNeighbours(int node, int[][] graph) {
		// TODO Auto-generated method stub
		List<Integer> Neighbours = new ArrayList<Integer>();
		for(int i=0;i<graph[node].length;i++){
			if(graph[node][i] == 1){
				Neighbours.add(i);
			}
		}
		return Neighbours;
	}
	
	/**
	 *  Sorts a matrix based on a particular column
	 *  @param Matrix - Any matrix
	 *  @param Column - Index of the column of the matrix
	 */
	private double[][] sortMatrix(double[][] Matrix, final int Column){
		Arrays.sort(Matrix, new java.util.Comparator<double[]>(){
			public int compare(double[]a,double[]b){
                //return (int) (a[Column]-b[Column]);
				return Double.compare(a[Column], b[Column]);
            }
		});
		return Matrix;
	}
	
	// Graph is assumed to be undirected tree
	//Node is the root node from which all directed edges 
	// go away
	/**
	 *  Makes the undirected graph a directed graph
	 *  @param Node - A node in the Graph
	 *  @param Graph - An adjacency matrix of the network
	 *  @param visitedNodes - The list of all nodes which can be visited
	 *  from Node
	 *  @author Apoorv
	 */
	private void makeDirected(int Node, int[][] Graph, List<Integer> visitedNodes){
		visitedNodes.add(Node);
		List<Integer> NeighboursOfNode = getNeighbours(Node,Graph);
		for(int i = 0; i<NeighboursOfNode.size();i++){
			if(!visitedNodes.contains(NeighboursOfNode.get(i))){
				Graph[NeighboursOfNode.get(i)][Node] = 0;
				makeDirected(NeighboursOfNode.get(i), Graph, visitedNodes);
			}
			
		}
	}
	
}
