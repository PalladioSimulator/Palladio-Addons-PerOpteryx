package de.uka.ipd.sdq.dsexplore.bayesnets.utility;

/**
 * Contains utilities to make changes to edges 
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
