package de.uka.ipd.sdq.dsexplore.bayesnets.utility;

/**
 * Contains utilities to make changes to edges of a Bayesian Network. 
 * With this class, you can add, remove or reverse an edge between any
 * two nodes in the Bayesian Network.  
 * @author Apoorv
 *
 */
public class BayesEdge {

	public static void main(String[] args){
		BayesEdge b = new BayesEdge();
		int[][] graph = {{0,1,0,1},{0,0,1,0},{1,0,0,1},{0,0,0,0}};
		int[][] dag = b.reverseEdge(graph, 3, 2);
		for(int i=0;i<graph.length;i++){
			for(int j=0;j<graph.length;j++){
				System.out.println(dag[i][j]+" ");
			}
			System.out.println("\n");
		}
	}
	
	// Start writing methods here
	/**
	 * Adds an edge between node FromNode to node ToNode. Note that
	 * the edge is directed and originates from FromNode and goes to 
	 * ToNode.
	 * @param int[][] Graph - The Bayesian network graph represented
	 * as a Adjacency matrix. 
	 * @param int FromNode - An integer value specifying the originating 
	 * node
	 * @param int ToNode - An integer value specifying the target node
	 * @return The revised int[][] matrix representing the Graph. This
	 * is stored in a different memory location than the input int[][] Graph
	 * @author Apoorv
	 */
	public int[][] addEdge(int[][] Graph,int FromNode, int ToNode){
		/*This method adds an edge from the node FromNode
		 * to the node ToNode */
		// Node ordering starts from 0.
		int[][] ResultGraph = makeArrayCopy(Graph);
		if(ResultGraph[FromNode][ToNode] == 0){
			ResultGraph[FromNode][ToNode] = 1;
			return ResultGraph;
		}else{
			
			System.out.println("There already exists an edge from "+FromNode+" to "+ToNode+" !!! ");
			return ResultGraph;
		}
	}
	
	/**
	 * Removes an edge between node FromNode to node ToNode. Note that this
	 * method removes the edge which is directed and originates from FromNode
	 * and goes to ToNode. If no such directed edge exists, then the 
	 * method prints out the appropriate message.
	 * @param int[][] Graph - The Bayesian network graph represented
	 * as a Adjacency matrix. 
	 * @param int FromNode - An integer value specifying the originating 
	 * node
	 * @param int ToNode - An integer value specifying the target node
	 * @return The revised int[][] matrix representing the Graph. This
	 * is stored in a different memory location than the input int[][] Graph
	 * @author Apoorv
	 */
	public int[][] removeEdge(int[][] Graph,int FromNode, int ToNode){
		/*This method removes an edge from the node FromNode
		 * to the node ToNode */
		// Node ordering starts from 0.
		int[][] ResultGraph = makeArrayCopy(Graph);
		if(ResultGraph[FromNode][ToNode] == 1){
			ResultGraph[FromNode][ToNode] = 0;
			return ResultGraph;
		}else{
			
			System.out.println("There already doesn't exist an edge from "+FromNode+" to "+ToNode+" !!! ");
			return ResultGraph;
		}
	}
	
	/**
	 * Reverses an edge between node FromNode to node ToNode. If no such
	 * edge exists, then the appropriate message is displayed.
	 * @param int[][] Graph - The Bayesian network graph represented
	 * as a Adjacency matrix. 
	 * @param int FromNode - An integer value specifying the originating 
	 * node
	 * @param int ToNode - An integer value specifying the target node
	 * @return The revised int[][] matrix representing the Graph. This
	 * is stored in a different memory location than the input int[][] Graph
	 * @author Apoorv
	 */
	public int[][] reverseEdge(int[][] Graph,int FromNode, int ToNode){
		/*This method removes an edge from the node FromNode
		 * to the node ToNode */
		// Node ordering starts from 0.
		int[][] ResultGraph = makeArrayCopy(Graph);
		if(ResultGraph[FromNode][ToNode] == 1){
			ResultGraph = removeEdge(Graph, FromNode, ToNode);
			ResultGraph = addEdge(Graph, ToNode, FromNode);
			return ResultGraph;
		}else{
			
			System.out.println("There already doesn't exist an edge from "+FromNode+" to "+ToNode+" !!! ");
			return ResultGraph;
		}
	}
	/**
	 * Method for copying an integer array. 
	 * @param int[][] Array - An integer matrix.
	 * @return Another integer matrix which holds the same values
	 * as the argument of the method. This is stored at a different
	 * memory location than the input matrix.
	 * @author Apoorv
	 */
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
