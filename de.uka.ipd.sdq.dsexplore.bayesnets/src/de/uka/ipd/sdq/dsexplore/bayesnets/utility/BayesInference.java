package de.uka.ipd.sdq.dsexplore.bayesnets.utility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * This class is used for all inference purposes. Currently, only 
 * P(Sample|Bayes Network) is supported. Other inference capabilities
 * will be (hopefully) added later.
 * @author Apoorv
 *
 */
public class BayesInference {

	/**
	 * An adjacency matrix representing the Bayesian Network
	 */
	int[][] Graph;
	/**
	 * The Data you have as a matrix. Each row is one datapoint
	 */
	int[][] Data;
	/**
	 * A {@link BayesNetwork} Object
	 */
	BayesNetwork BN;
	
	// The main contains sample code to help anyone 
	// use this class successfully.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] Graph = {{0,1,0,0},{0,0,1,1},{0,0,0,0},{0,0,0,0}};
		
		// create Data
		int[][] Data = new int[100][4];
		Random random = new Random();
		random.setSeed(1256456);
		for(int i=0;i<Data.length;i++){
			for(int j=0;j<Data[i].length;j++){
				//Data[i][j] = (int) Math.round(Math.random());
				Data[i][j] = random.nextInt(2);
			}
		}
		
		int[] Sample = {1,0,0,1}; // Example Sample
		
		BayesInference Inferer = new BayesInference(Graph, Data);
		// Calculate the probability that we will get this sample
		// when we sample the Graph 
		double Prob = Inferer.getProbabilityOfSampleGivenBayesNetwork(Sample);
		System.out.println(Prob); // View in console
	}
	
	/**
	 * Constructor for the class. 
	 * @param Graph - An adjacency matrix representing the Bayesian Network
	 * @param Data - The Data you have as a matrix. Each row is one datapoint
	 * 
	 * @author Apoorv
	 */
	public BayesInference(int[][] Graph, int[][] Data){
		this.Graph = Graph;
		this.Data = Data;
		this.BN = new BayesNetwork(Graph.length);
	}
	
	/**
	 * Calculates the P(Sample|Bayes Network). It is assumed that 
	 * the Graph has been chosen by the user. Normally, it is recommended
	 * that the Graph is learnt from the Data using other classes of this
	 * de.uka.ipd.sdq.dsexplore.bayesnets plugin. But one can specify any Graph
	 * and any Data that one likes.
	 * @param Sample - The sample as an int array. The length of the 
	 * Sample has to be equal to the number of variables in the Bayesian
	 * Network (this is equal to this.Graph.length)
	 * @return The probability P(Sample|Bayesian Network) as a double
	 * @author Apoorv
	 */
	public double getProbabilityOfSampleGivenBayesNetwork(int[] Sample){
		int n = Graph.length; // The number of variables
		double SampleProbGivenBayesNetwork = 1;
		for(int i=0;i<Sample.length;i++){
			int[] Parents = BN.getParents(Graph, i);
			// Now, calculate the configuration of the parents
			String ParentConfigAsString = "";
			for(int j=0;j<Parents.length;j++){
				ParentConfigAsString = ParentConfigAsString + ((Integer)Sample[Parents[j]]).toString();
			}
			double[] NodePdf = getNodePdf(i,ParentConfigAsString);
			SampleProbGivenBayesNetwork = SampleProbGivenBayesNetwork*NodePdf[Sample[i]];
		}
		return SampleProbGivenBayesNetwork;
		
	}
	
	/**
	 * Used to calculate the Probability Distribution Function (PDF)
	 * of the Node with respect to its parents.  
	 * @param Node - An integer index of the Node
	 * @param ParentConfigAsString - String created by appending
	 * the current states of all parents of Node
	 * @return The Node's PDF with respect to its parents
	 * @author Apoorv
	 */
	private double[] getNodePdf(int Node, String ParentConfigAsString) {
		// TODO Auto-generated method stub
		// Convert ParentConfigAsString to decimal
		// For PerOpteryx, only binary data is assumed currently
		// So, radix is set to 2 in the Integer.parseInt(s,radix) function
		int ParentConfig;
		// if-else is used because whenever
		// we encounter a root node having
		// no parents, ParentConfigAsString = "". This throws a
		// NumberFormatException in Integer,parseInt(s, radix).
		if(ParentConfigAsString == ""){
			ParentConfig = 0; 
		}else{				  
			ParentConfig = Integer.parseInt(ParentConfigAsString, 2);
		}
		 
		double[] NodePdf = getNodePdf(Node, ParentConfig);
		return NodePdf;
	}

	/**
	 * Used to calculate the Probability Distribution Function (PDF)
	 * of the Node with respect to its parents.  
	 * @param Node - An integer index of the Node
	 * @param ParentConfig - The integer number which tells us in
	 * which configuration the parents are.
	 * @return The Node's PDF with respect to its parents
	 * @author Apoorv
	 */
	private double[] getNodePdf(int Node, int ParentConfig){
		// First learn the parameters from the Graph and the Data
		int n = Data[1].length; // No. of nodes/variables
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
					for(int id=0;id< Data.length;id++){
						boolean countvar = true;
						int ip1 = 0;
						for(int ip : Parents){
							//System.out.println("i:"+i+","+"ip1:"+ip1+","+"j:"+j+","+"id:"+id+","+"ip:"+ip+","+"k:"+k);
							//System.out.println(w.get(i)[ip1][j]+" "+DataMatrix[id][ip]);
							if(((Integer) w.get(i)[ip1][j]).equals(Data[id][ip])){
								countvar = countvar&true;
							}else{
								countvar = countvar&false;
							}
							ip1++;
						}
						//System.out.println("countvar: "+countvar);
						//System.out.println("DataMatrix[id][i]: "+(DataMatrix[id][i] == k));
						if(countvar & Data[id][i] == k){
							count1++;
						}
					}
					N_inter[j][k] = count1;
				}
			}
			N.add(N_inter);
		}
		
		// Nijk calculated
		
		double[] NodePdf = new double[r]; // this stores the pdf
		int[] NodePdfAsFrequencies = N.get(Node)[ParentConfig];
		double SumOfFrequencies = 0;
		for(int i=0;i<NodePdfAsFrequencies.length;i++){
			SumOfFrequencies = SumOfFrequencies + (double)NodePdfAsFrequencies[i];
		}
		for(int i=0;i<NodePdf.length;i++){
			NodePdf[i] = ((double)NodePdfAsFrequencies[i])/SumOfFrequencies;
		}
		return NodePdf;
		
	}

}
