package de.uka.ipd.sdq.dsexplore.bayesnets.utility;

import java.util.Arrays;
import java.util.Random;

/**
 * This class is used for representing a Bayesian Network. It
 * also contains many methods to operate on a given Bayesian Network.
 * @author Apoorv
 *
 */
public class BayesNetwork {
/**
 * The Number of variables/nodes the Bayesian network will have	
 */
private int NumberOfVariables;

// Constructor
/**
 * The constructor for the class. Initialzes the number of variables.
 */
public BayesNetwork(int var){
	NumberOfVariables = var;
	
}

public static void main(String[] args){
	BayesNetwork b = new BayesNetwork(4);
	int[][] graph = {{0,1,0,1},{0,0,1,1},{0,0,0,0},{0,0,0,0}};
	//int[][] mat = b.removeLeavesAndRoots(graph);
	//int[] mat1 = b.getRemovedNodes(graph);
	//int[][] dag = b.createRandomStructure();
	int[] dag = b.getChildren(graph, 0);
	for(int i=0;i<dag.length;i++){
		//for(int j=0;j<graph.length;j++){
			System.out.println(dag[i]+" ");
		//}
		//System.out.println("\n");
	}
	int[] some = b.getParents(graph, 0);
	for(int i=0;i<some.length;i++){
		System.out.println(i);
		System.out.println(some[i]);
	}
}


/*All Network functions will go here */
/**
 * Creates a random network structure. Currently, the network
 * produced will mostly be a DAG (Directed Acyclic Graph), though
 * it isn't guaranteed.
 * @param No Parameters
 * @return An int[][] adjacency matrix of the created Graph/Network
 * @author Apoorv
 */
public int[][] createRandomStructure(){
	int[][] Structure = new int[NumberOfVariables][NumberOfVariables];
	Random rnum = new Random();
	for(int i=0;i< NumberOfVariables;i++){
		for(int j=0;j< NumberOfVariables;j++){
			if(i == j){
				Structure[i][j] = 0;
			}else{
				if(j > i){
					Structure[i][j] = rnum.nextInt(2);
				}else{
					if(Structure[j][i] == 0){
						Structure[i][j] = rnum.nextInt(2);
					}else{
						Structure[i][j] = 0;
					}
					
				}
			}
		}
	}
	
	// Created Structure. Now check for cycles
	boolean isACyclic = checkCycles(Structure);
	
	if(isACyclic == false){
		Structure = removeCycles(Structure);
	}
	return Structure;
}

/**
 * Creates an empty network structure with no edges between the
 * various nodes.
 * @param No Parameters
 * @return An int[][] adjacency matrix of the created Graph/Network
 * @author Apoorv
 */
public int[][] createEmptyStructure(){
	int[][] Structure = new int[NumberOfVariables][NumberOfVariables];
	return Structure;
}

/**
 * Removes the cycles (if they exist) in a given 
 * network structure. For the logic of removing cycles, please see the
 * comments in code.
 * @param int[][] Graph - The Adjaceny matrix of the Bayesian Network
 * @return An int[][] adjacency matrix of the result Graph/Network
 * @author Apoorv
 */
public int[][] removeCycles(int[][] Graph) {
	// TODO Auto-generated method stub
	int[][] GraphCopy = new int[Graph.length][Graph.length];
	/* Don't do this -> GraphCopy = Graph; because then
	 * you create a pointer called GraphCopy which also points
	 * to the same memory location as Graph points*/
	// Use for loop instead
	for(int i=0;i< Graph.length;i++){
		for(int j=0;j< Graph.length;j++){
			GraphCopy[i][j] = Graph[i][j];
		}
	}
	
	if(checkCycles(Graph) == true){
		System.out.println("The graph structure is already acyclic !!!");
		return Graph;
	}else{
		/* Remove all leaves and roots. until the remaining graph 
		 * is cyclic. Now calculate the number of nodes
		 * n and the number of branches b in the graph.
		 * The smallest number of branches a which one should 
		 * cut to obtain an acyclic graph is a = b-n+1.*/
		
		int[] RemovedNodes = getRemovedNodes(Graph);
		
		// Make the rows and columns zero, corresponding to each of these RemovedNodes.
		for(int i : RemovedNodes){
			for(int j=0;j< Graph.length;j++){
				Graph[i][j]=0;
				Graph[j][i]=0;
			}
		}
		
		// --------------------------
		int n = Graph.length - RemovedNodes.length; // Remaining nodes
		// Calculate b
		int b=0;
		for(int i=0;i<Graph.length;i++){
			for(int j=0;j<Graph.length;j++){
				b=b+Graph[i][j];
			}
		}
		// b calculated
		//Random rnum = new Random();
		int RemoveMinimumEdges = b-n+1;
		int RemoveCount=0;
		while(RemoveCount<RemoveMinimumEdges){
			//System.out.println("I am in !!!");
			for(int i=0;i<Graph.length;i++){
				for(int j=0;j<Graph.length;j++){
					if(Graph[i][j] == 1 & RemoveCount<RemoveMinimumEdges){
						Graph[i][j]=0;
						RemoveCount = RemoveCount + 1;
					}
				}
			}
		}
		int[][] RemNodeGraph = new int[Graph.length][Graph.length];
		for(int i : RemovedNodes){
			for(int j=0;j<Graph.length;j++){
				
				RemNodeGraph[i][j]=GraphCopy[i][j];
				RemNodeGraph[j][i]=GraphCopy[j][i];
				/*if(Graph[i][j]>1){
					Graph[i][j]=1;
				}*/
			}
		}
		int[][] ResultGraph = new int[Graph.length][Graph.length];
		for(int i=0;i<Graph.length;i++){
			for(int j=0;j<Graph.length;j++){
				
				ResultGraph[i][j]=RemNodeGraph[i][j]+Graph[i][j];
				
				/*if(Graph[i][j]>1){
					Graph[i][j]=1;
				}*/
			}
		}
		return ResultGraph;
	}
	
}

/**
 * This method checks the Graph for any cycles contained in it.
 * If the Graph is acyclic, then it returns TRUE. Otherwise,
 * it returns FALSE.
 * @param int[][] Graph
 * @return boolean - TRUE if Graph is acyclic, else FALSE
 * @author Apoorv
 */
public boolean checkCycles(int[][] Graph){
	boolean result;
	// If graph is empty, return true
	if(Graph.length == 0){
		return true;
	}
	
	// Check for leaves. If there is no leaf, return false
	int countLeaf=0;
	int[] leaf = new int[Graph.length];
	for(int i=0;i< Graph.length;i++){
		int countChildren=0;
		for(int j=0;j< Graph.length;j++){
			countChildren = countChildren + Graph[i][j];
		}
		if(countChildren == 0){
			countLeaf = countLeaf+1;
			leaf[i] = 1;
		}else{
			leaf[i] = 0;
		}
	}
	if(countLeaf == 0){
		return false;
	}
	// ------------------------------------------------
	// Remove a leaf and again call the function
	int removeLeaf = 0;
	for(int i=0;i< Graph.length;i++){
		if(leaf[i] == 1){
			removeLeaf = i;
			break;
		}
	}
	int[][] NewGraph = new int[Graph.length - 1][Graph.length - 1];
	int inew=0;
	for(int i=0;i< Graph.length;i++){
		if(i == removeLeaf){
			continue;
		}
		int jnew=0;
		for(int j=0;j< Graph.length;j++){
			if(j == removeLeaf){
				continue;
			}
			NewGraph[inew][jnew] = Graph[i][j];
			jnew++;
		}
		inew++;
	}
	result = checkCycles(NewGraph);
	return result;
}

/**
 * This method removes all the leaves and roots contained in a Graph.
 * It returns the resulting Graph to the user.
 * @param int[][] Graph
 * @return An int[][] adjacency matrix of the resulting Graph/Network
 * @author Apoorv
 */
public int[][] removeLeavesAndRoots(int[][] Graph){
	
	// If the graph is empty, return the graph
	if(Graph.length == 0){
		return Graph;
	}
	// Check for leaves. 
		int countLeaf=0;
		int[] leaf = new int[Graph.length];
		for(int i=0;i< Graph.length;i++){
			int countChildren=0;
			for(int j=0;j< Graph.length;j++){
				countChildren = countChildren + Graph[i][j];
			}
			if(countChildren == 0){
				countLeaf = countLeaf+1;
				leaf[i] = 1;
			}else{
				leaf[i] = 0;
			}
		}
		
		// Check for roots. 
				int countRoot=0;
				int[] root = new int[Graph.length];
				for(int i=0;i< Graph.length;i++){
					int countParent=0;
					for(int j=0;j< Graph.length;j++){
						countParent = countParent + Graph[j][i];
					}
					if(countParent == 0){
						countRoot = countRoot+1;
						root[i] = 1;
					}else{
						root[i] = 0;
					}
				}
		if(countLeaf == 0 & countRoot == 0){
			return Graph;
		}else{
			if(countLeaf != 0){
				/*Then create a new Graph called NewGraph
				 * with the removed leaf */
				
				int removeLeaf = 0;
				for(int i=0;i< Graph.length;i++){
					if(leaf[i] == 1){
						removeLeaf = i;
						break;
					}
				}
				
				int[][] NewGraph = new int[Graph.length-1][Graph.length-1];
				int inew=0;
				for(int i=0;i< Graph.length;i++){
					if(i == removeLeaf){
						continue;
					}
					int jnew=0;
					for(int j=0;j< Graph.length;j++){
						if(j == removeLeaf){
							continue;
						}
						NewGraph[inew][jnew] = Graph[i][j];
						
						jnew++;
					}
					inew++;
				}
				// Apply Recursion
				int[][] ResultGraph = removeLeavesAndRoots(NewGraph);
				return ResultGraph;
			}else{
				/*Then create a new Graph called NewGraph
				 * with the removed root */
				
				int removeRoot = 0;
				for(int i=0;i< Graph.length;i++){
					if(root[i] == 1){
						removeRoot = i;
						break;
					}
				}
				
				int[][] NewGraph = new int[Graph.length-1][Graph.length-1];
				int inew=0;
				for(int i=0;i< Graph.length;i++){
					if(i == removeRoot){
						continue;
					}
					int jnew=0;
					for(int j=0;j< Graph.length;j++){
						if(j == removeRoot){
							continue;
						}
						NewGraph[inew][jnew] = Graph[i][j];
						jnew++;
					}
					inew++;
				}
				// Apply Recursion
				int[][] ResultGraph = removeLeavesAndRoots(NewGraph);
				return ResultGraph;
			}
			
		}
		
}

/**
 * This method keeps a track of all the nodes which are removed 
 * when we remove all the leaves and roots of the Graph. The indices of
 * the removed leaves and roots are returned as an array of integers.
 * @param int[][] Graph
 * @return An int[] array of the removed leaves and roots of the 
 * Graph/Network
 * @author Apoorv
 */
public int[] getRemovedNodes(int[][] Graph){
	
	// If the graph is empty, return the graph
	if(Graph.length == 0){
		int[] RemovedNodes = {};
		return RemovedNodes;
	}
	// Check for leaves. 
		int countLeaf=0;
		int[] leaf = new int[Graph.length];
		for(int i=0;i< Graph.length;i++){
			int countChildren=0;
			for(int j=0;j< Graph.length;j++){
				countChildren = countChildren + Graph[i][j];
			}
			if(countChildren == 0){
				countLeaf = countLeaf+1;
				leaf[i] = 1;
			}else{
				leaf[i] = 0;
			}
		}
		
		// Check for roots. 
				int countRoot=0;
				int[] root = new int[Graph.length];
				for(int i=0;i< Graph.length;i++){
					int countParent=0;
					for(int j=0;j< Graph.length;j++){
						countParent = countParent + Graph[j][i];
					}
					if(countParent == 0){
						countRoot = countRoot+1;
						root[i] = 1;
					}else{
						root[i] = 0;
					}
				}
		if(countLeaf == 0 & countRoot == 0){
			int[] RemovedNodes = {};
			return RemovedNodes;
		}else{
			if(countLeaf != 0){
				/*Then create a new Graph called NewGraph
				 * with the removed leaf */
				
				int removeLeaf = 0;
				for(int i=0;i< Graph.length;i++){
					if(leaf[i] == 1){
						removeLeaf = i;
						break;
					}
				}
				
				int[][] NewGraph = new int[Graph.length-1][Graph.length-1];
				int inew=0;
				for(int i=0;i< Graph.length;i++){
					if(i == removeLeaf){
						continue;
					}
					int jnew=0;
					for(int j=0;j< Graph.length;j++){
						if(j == removeLeaf){
							continue;
						}
						NewGraph[inew][jnew] = Graph[i][j];
						
						jnew++;
					}
					inew++;
				}
				// Apply Recursion
				int[] CurrentRemovedNode = {removeLeaf};
				int[] FinalRemovedNode = getRemovedNodes(NewGraph);
				// Concatenate CurrentRemovedNode and FinalRemovedNode and return
				int[] ResultNodes = new int[CurrentRemovedNode.length + FinalRemovedNode.length];
				for(int i=0;i< CurrentRemovedNode.length + FinalRemovedNode.length;i++){
					if(i<CurrentRemovedNode.length){
						ResultNodes[i]= CurrentRemovedNode[i];
					}else{
						ResultNodes[i]= FinalRemovedNode[i-CurrentRemovedNode.length];
					}
					
				}
				return ResultNodes;
			}else{
				/*Then create a new Graph called NewGraph
				 * with the removed root */
				
				int removeRoot = 0;
				for(int i=0;i< Graph.length;i++){
					if(root[i] == 1){
						removeRoot = i;
						break;
					}
				}
				
				int[][] NewGraph = new int[Graph.length-1][Graph.length-1];
				int inew=0;
				for(int i=0;i< Graph.length;i++){
					if(i == removeRoot){
						continue;
					}
					int jnew=0;
					for(int j=0;j< Graph.length;j++){
						if(j == removeRoot){
							continue;
						}
						NewGraph[inew][jnew] = Graph[i][j];
						jnew++;
					}
					inew++;
				}
				// Apply Recursion
				int[] CurrentRemovedNode = {removeRoot};
				int[] FinalRemovedNode = getRemovedNodes(NewGraph);
				// Concatenate CurrentRemovedNode and FinalRemovedNode and return
				int[] ResultNodes = new int[CurrentRemovedNode.length + FinalRemovedNode.length];
				for(int i=0;i< CurrentRemovedNode.length + FinalRemovedNode.length;i++){
					if(i<CurrentRemovedNode.length){
						ResultNodes[i]= CurrentRemovedNode[i];
					}else{
						ResultNodes[i]= FinalRemovedNode[i-CurrentRemovedNode.length];
					}
					
				}
				return ResultNodes;
			}
			
		}
		
}

/**
 * Used to retrieve the list of Parents of the node Node.
 * @param int[][] Graph - Adjacency matrix of the Bayesian Graph
 * @param int Node - The node about which we want the information 
 * about the parents.
 * @return An int[] array of the indices of the parents of Node
 * @author Apoorv
 */
public int[] getParents(int[][] Graph, int Node){
	int[] ParentNodes = new int[Graph.length];
	int CountParents=0;
	for(int i=0;i< Graph.length;i++){
		if(Graph[i][Node] == 1){
			ParentNodes[i] = i;
			CountParents++;
		}else{
			ParentNodes[i] = -1; // Some negative number
		}
	}
	int NumberOfParents = CountParents;
	int[] FinalParentNodes = new int[NumberOfParents];
	int inew = 0;
	for(int i=0;i< Graph.length;i++){
		if(ParentNodes[i] == -1){
			continue;
		}else{
			FinalParentNodes[inew] = ParentNodes[i];
			inew++;
		}
		 
	}
	return FinalParentNodes; 
}


/**
 * Used to retrieve the list of children of the node Node.
 * @param int[][] Graph - Adjacency matrix of the Bayesian Graph
 * @param int Node - The node about which we want the information 
 * about the children.
 * @return An int[] array of the indices of the children of Node
 * @author Apoorv
 */
public int[] getChildren(int[][] Graph, int Node){
	int[] ChildrenNodes = new int[Graph.length];
	int CountChildren=0;
	for(int i=0;i< Graph.length;i++){
		if(Graph[Node][i] == 1){
			ChildrenNodes[i] = i;
			CountChildren++;
		}else{
			ChildrenNodes[i] = -1; // Some negative number
		}
	}
	int NumberOfChildren = CountChildren;
	int[] FinalChildrenNodes = new int[NumberOfChildren];
	int inew = 0;
	for(int i=0;i< Graph.length;i++){
		if(ChildrenNodes[i] == -1){
			continue;
		}else{
			FinalChildrenNodes[inew] = ChildrenNodes[i];
			inew++;
		}
		 
	}
	return FinalChildrenNodes; 
}

}
