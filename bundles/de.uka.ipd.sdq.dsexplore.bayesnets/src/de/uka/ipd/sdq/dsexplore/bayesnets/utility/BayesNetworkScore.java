package de.uka.ipd.sdq.dsexplore.bayesnets.utility;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Random;

/**
 * Class for calculating the score of a Bayesian Network. It
 * contains various scoring techniques which the user can use at
 * his/her own discretion.
 * @author Apoorv
 *
 */
public class BayesNetworkScore {
/**
 * Adjacency matrix for the Graph	
 */
private int[][] Graph;
/**
 * The data used to learn a Bayesian Network. It is assumed to be
 * binary currently
 */
private int[][] Data;
protected static final double SQTPI = 2.50662827463100050242E0; //for gamma function
// Create the constructor here

/**
 * Constructor for the class. Initializes the Graph and Data fields
 * @param int[][] GraphMatrix - Adjacency matrix for the Graph
 * @param int[][] DataMatrix - Matrix for the Data containing 0 and 1.
 * @return
 * @author
 */
public BayesNetworkScore(int[][] GraphMatrix, int[][] DataMatrix){
	/*// Copy GraphMatrix to Graph
	for(int i = 0;i< GraphMatrix.length;i++){
		for(int j = 0;j< GraphMatrix.length;j++){
			Graph[i][j] = GraphMatrix[i][j];
		}
	}
	// End of for loop */
	Graph = GraphMatrix;
/*	// Copy DataMatrix to Data
	for(int i = 0;i< DataMatrix.length;i++){
		for(int j = 0;j< DataMatrix[1].length;j++){
			Data[i][j] = DataMatrix[i][j];
		}
	}
	// End of for loop */
	Data = DataMatrix;
}

// Constructor code ends here

// For testing ...
public static void main(String[] args){
	
	/*
	int[][][] test = {{{1,2},{2,1},{1,0}},{{2,3,4},{3,2},{2,1}}};
	int b = test.length;
	int num = 4;
	String input0 = "1010";
	String input1 = "10";

	// Use as radix 2 because it's binary    
	int number0 = Integer.parseInt(input0, 2);
	int number1 = Integer.parseInt(input1, 2);

	int sum = number0 + number1;
	*/
	int[][] GraphNet = {{0,1,1,1},{0,0,1,1},{0,0,0,1},{0,0,0,0}};
	//int[][] DataMat = {{0,0,0,1},{0,0,0,0},{0,0,0,0},{0,0,1,0},{0,0,0,0},{0,1,0,0},{0,0,0,0},{0,0,0,0}};
	int[][] DataMat = new int[16][4];
	Random r = new Random();
	for(int i=0;i<16;i++){
		for(int j=0;j<4;j++){
			DataMat[i][j] = r.nextInt(2);
		}
		
	}
	BayesNetworkScore bs = new BayesNetworkScore(GraphNet, DataMat);
	//System.out.println(Integer.toBinaryString(sum));
	double out = 0;
	out = bs.K2NetworkScore();
	System.out.println(bs.getFactorial(5));
	System.out.println(out);
	System.out.println(bs.BDeuNetworkScore());
	System.out.println(bs.LogLik());
	System.out.println(bs.BIC());
	System.out.println(bs.AIC());
	System.out.println(bs.getFactorial(804));
	/*
	int[][] w = new int[4][16];
	for(int j = 0;j< 4;j++){
		int Threshold=(int) Math.pow(2, (4-(j+1)) );
		int count = 1;
		boolean flip = false;
		for(int k = 0;k< 16;k++){
			if(flip == false){
				w[j][k] = 0;
			}else if(flip == true){
				w[j][k] = 1;
			}
			
			if(count%Threshold == 0){
				flip = !flip;
			}
			count++;
		}
	}
	for(int j = 0;j< 4;j++){
		for(int k = 0;k< 16;k++){
			System.out.print(w[j][k]);
		}
		System.out.println();
	}
	*/
}

// Start writing methods here
// If you want to have an idea of how the score 
// calculation is coded, please see the K2NetworkScore()
// method in detail. It contains some comments and clarifications
// which will make digestion of the code easier and faster. All other 
// methods are coded in the same way.

/**
 * Scores the network according to the K2 scoring technique
 * @param No parameters
 * @return The score of the network as a double
 * @author Apoorv
 */
public double K2NetworkScore(){
	/*The NetworkScore method calculates the score of a given Bayesian
	 * Network (stored in variable Graph) by using the given data (stored 
	 * in the variable Data). The string ScoreMethod can take the values
	 * "K2", "Bdeu" (more to be added later ...) */
	
	// Start by calculating the various variables
	int n = Data[1].length; // No. of nodes/variables
	
	int r = 2; // Number of states of the random variable Xi
	// Currently, only binary variables are considered. Hence,
	// for every variable Xi, the no. of states are 2.
	
	// Prepare matrix q. q[i] is the number of configurations which parents of
	// Xi can take.
	BayesNetwork BN = new BayesNetwork(n);
	int[] q = new int[n]; // initialize q array.
	for(int i = 0;i<n;i++){
		// for every Xi variable, calculate q[i].
		// q[i] = r^(No. of parents of Xi)
		q[i] = (int) Math.pow(r,(BN.getParents(Graph, i)).length);
	}
	
	// create the w matrix which stores the configurations for the parents 
	// of node Xi. A heads up: it is stored in a little different way than 
	// which normally/ automatically comes to the mind. w.get(i) will
	// fetch the ith variable's (i.e Xi's) matrix. This matrix stores 
	// the various configurations of its parents. However, note that
	// a row represents a data variable, while a column represents
	// a configuration of the parents. Thus, the matrix will have dimensions
	// :- (No. of parents of variable Xi)*(2^(No. of parents of variable Xi))
	
	//int[][][] w = new int[n][n][(int) Math.pow(2, n)];
	ArrayList<int[][]> w = new ArrayList<int[][]>(); // Initialize w 
	for(int i = 0;i< n;i++){ // Keep in mind - n is no. of variables/Xis  
		// Create the wij matrix
		int[][] w_inter = new int[BN.getParents(Graph, i).length][(int) Math.pow(2, BN.getParents(Graph, i).length)];
		// w_inter corresponds to Xi's matrix.
		// <--------------------------------------------------------------------->
		// This code between the dotted lines
		// fills in the w_inter matrix with all possible
		// configurations. For example, 1st column is the 1st
		// configuration (all zeroes), 2nd column is the 2nd config
		// and so on. The ordering of parents is top-down. Which 
		// means, the uppermost row contains the most significant bits
		// while the lowermost row contains the least significant bits.
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
		// <---------------------------------------------------------------------->
		w.add(w_inter);
	}
	// Created and stored the various configurations pertaining to various Xi nodes
	
	
	// Now again create the 3 Dimensional matrix Nijk
	//int[][][] N = new int[n][(int) Math.pow(2, n)][r];
	// N.get(i) will give a matrix that corresponds to Nijk.
	// Specifically, N.get(i)[j][k] will be equal to Nijk.
	ArrayList<int[][]> N = new ArrayList<int[][]>();
	for(int i = 0;i< n;i++){ // n:- No. of data variables
		int[][] N_inter = new int[q[i]][r]; 
		// The following for loop fills up N_inter appropriately.
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
						if(w.get(i)[ip1][j] == Data[id][ip]){
							countvar = countvar&true;
						}else{
							countvar = countvar&false;
						}
						ip1++;
					}
					if(countvar == true & Data[id][i] == k){
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
	
	// Calculate the actual score
	double score = 0;
	for(int i = 0;i< n;i++){
		for(int j = 0;j< q[i];j++){
			double term1count = 0;
			for(int k = 0;k< r;k++){
				//System.out.println(N.get(i)[j][k]);
				term1count = term1count + Math.log(getFactorial(N.get(i)[j][k]));
				//System.out.println(getFactorial(N[i][j][k]));
			}
			//System.out.println("t1 k2:" + term1count);
			double term2count = 0;
			term2count = term2count + Math.log(getFactorial(r-1)/getFactorial(Nij.get(i)[j] + r - 1));
			//System.out.println("t2 k2:" + term2count);
			score = score + term1count + term2count;
		}
	}
	return score;
}

// The BDeu comes out to be positive!? Check this ...
/**
 * Scores the network according to the BDeu scoring technique. (Not
 * recommended for use currently)
 * @param No parameters
 * @return The score of the network as a double
 * @author Apoorv
 */
public double BDeuNetworkScore(){
	/*The NetworkScore method calculates the score of a given Bayesian
	 * Network (stored in variable Graph) by using the given data (stored 
	 * in the variable Data). The string ScoreMethod can take the values
	 * "K2", "Bdeu" (more to be added later ...) */
	
	int N_prime = 40; // Pseudo counts 
	
	// Start by calculating the various variables
	int n = Data[1].length; // No. of nodes/variables
	
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
						if(w.get(i)[ip1][j] == Data[id][ip]){
							countvar = countvar&true;
						}else{
							countvar = countvar&false;
						}
						ip1++;
					}
					if(countvar == true & Data[id][i] == k){
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
	
	// Calculate the actual score
	double score = 0;
	for(int i = 0;i< n;i++){
		for(int j = 0;j< q[i];j++){
			double term1count = 0;
			for(int k = 0;k< r;k++){
				term1count = term1count + Math.log(gamma(N.get(i)[j][k] + ((double)N_prime)/((double) r*q[i]))/gamma(((double) N_prime)/((double) r*q[i])));
				//System.out.println(getFactorial(N[i][j][k]));
			}
			double term2count = 0;
			term2count = term2count + Math.log( gamma((double)N_prime)/((double)q[i]))/gamma(Nij.get(i)[j] + ((double)N_prime)/((double)q[i]) );
			score = score + term1count + term2count;
		}
	}
	return score;
}

/**
 * Scores the network using the log-likelihood technique.
 * @param No parameters
 * @return The score of the network as a double
 * @author Apoorv
 */
public double LogLik(){
	/*The NetworkScore method calculates the score of a given Bayesian
	 * Network (stored in variable Graph) by using the given data (stored 
	 * in the variable Data). The string ScoreMethod can take the values
	 * "K2", "Bdeu" (more to be added later ...) */
	
	 
	
	// Start by calculating the various variables
	int n = Data[1].length; // No. of nodes/variables
	
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
						if(w.get(i)[ip1][j] == Data[id][ip]){
							countvar = countvar&true;
						}else{
							countvar = countvar&false;
						}
						ip1++;
					}
					if(countvar == true & Data[id][i] == k){
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
	
	// Calculate the actual score
	double score = 0;
	for(int i = 0;i< n;i++){
		for(int j = 0;j< q[i];j++){
			for(int k = 0;k< r;k++){
				if(N.get(i)[j][k] == 0){
					score = score ;//+ N.get(i)[j][k]*Math.log(N.get(i)[j][k]/(Nij.get(i)[j]+1));
				}else{
					score = score + N.get(i)[j][k]*Math.log(((double)N.get(i)[j][k])/((double)Nij.get(i)[j]));
					//System.out.println(((double)N.get(i)[j][k])/((double)Nij.get(i)[j]));
					
				}
			}
		}
	}
	return score;
}

/**
 * Scores the network according to the Bayesian Information Criterion
 * (BIC) technique.
 * @param No parameters
 * @return The score of the network as a double
 * @author Apoorv
 */
public double BIC(){
	/*The NetworkScore method calculates the score of a given Bayesian
	 * Network (stored in variable Graph) by using the given data (stored 
	 * in the variable Data). The string ScoreMethod can take the values
	 * "K2", "Bdeu" (more to be added later ...) */
	
	// Start by calculating the various variables
	int n = Data[1].length; // No. of nodes/variables
	
	int r = 2; // Number of states of the random variable Xi
	
	// Prepare matrix q. q[i] is the number of configurations which parents of
	// Xi can take.
	BayesNetwork BN = new BayesNetwork(n);
	int[] q = new int[n];
	for(int i = 0;i<n;i++){
		q[i] = (int) Math.pow(r,(BN.getParents(Graph, i)).length);
	}

	// Calculate the actual score
	double B = 0;
	for(int i=0 ; i <n ; i++){
		B = B + (r-1)*q[i];
	}
	double score = LogLik() - 0.5*Math.log(Data.length)*B;
	
	return score;
}


/**
 * Scores the network according to the Akaike Information Criterion
 * (AIC) technique.
 * @param No parameters
 * @return The score of the network as a double
 * @author Apoorv
 */
public double AIC(){
	/*The NetworkScore method calculates the score of a given Bayesian
	 * Network (stored in variable Graph) by using the given data (stored 
	 * in the variable Data). The string ScoreMethod can take the values
	 * "K2", "Bdeu" (more to be added later ...) */
	
	// Start by calculating the various variables
	int n = Data[1].length; // No. of nodes/variables
	
	int r = 2; // Number of states of the random variable Xi
	
	// Prepare matrix q. q[i] is the number of configurations which parents of
	// Xi can take.
	BayesNetwork BN = new BayesNetwork(n);
	int[] q = new int[n];
	for(int i = 0;i<n;i++){
		q[i] = (int) Math.pow(r,(BN.getParents(Graph, i)).length);
	}

	// Calculate the actual score
	double B = 0;
	for(int i=0 ; i <n ; i++){
		B = B + (r-1)*q[i];
	}
	double score = LogLik() - B;
	
	return score;
}


/**
 * Calculates the factorial of Number. If Number is too large,
 * then Stirling's approximation formula is used.
 * @param int Number - The number for which we have to calculate
 * the factorial
 * @return The factorial of the given Number
 * @author Apoorv
 */
private double getFactorial(int Number){
	if(Number == 1){
		return 1;
	}
	if(Number == 0){
		return 1;
	}
	//if(Number > 20){
		double Result = Math.sqrt(2*Math.PI*Number)*Math.pow(Number/Math.E, Number);
		return Result;
	//}
	/*double Factorial = Number*getFactorial(Number - 1);
	return Factorial;*/
}

/**
 * Returns the Gamma function of the argument.
 * @param double x - argument
 * @return Gamma(x)
 * @author Apoorv
 */
private double gamma(double x) {

  double P[] = { 1.60119522476751861407E-4, 1.19135147006586384913E-3,
    1.04213797561761569935E-2, 4.76367800457137231464E-2,
    2.07448227648435975150E-1, 4.94214826801497100753E-1,
    9.99999999999999996796E-1 };
  double Q[] = { -2.31581873324120129819E-5, 5.39605580493303397842E-4,
    -4.45641913851797240494E-3, 1.18139785222060435552E-2,
    3.58236398605498653373E-2, -2.34591795718243348568E-1,
    7.14304917030273074085E-2, 1.00000000000000000320E0 };

  double p, z;
  double q = Math.abs(x);

  if (q > 33.0) {
    if (x < 0.0) {
      p = Math.floor(q);
      if (p == q) {
        throw new ArithmeticException("gamma: overflow");
      }
      z = q - p;
      if (z > 0.5) {
        p += 1.0;
        z = q - p;
      }
      z = q * Math.sin(Math.PI * z);
      if (z == 0.0) {
        throw new ArithmeticException("gamma: overflow");
      }
      z = Math.abs(z);
      z = Math.PI / (z * stirlingFormula(q));

      return -z;
    } else {
      return stirlingFormula(x);
    }
  }

  z = 1.0;
  while (x >= 3.0) {
    x -= 1.0;
    z *= x;
  }

  while (x < 0.0) {
    if (x == 0.0) {
      throw new ArithmeticException("gamma: singular");
    } else if (x > -1.E-9) {
      return (z / ((1.0 + 0.5772156649015329 * x) * x));
    }
    z /= x;
    x += 1.0;
  }

  while (x < 2.0) {
    if (x == 0.0) {
      throw new ArithmeticException("gamma: singular");
    } else if (x < 1.e-9) {
      return (z / ((1.0 + 0.5772156649015329 * x) * x));
    }
    z /= x;
    x += 1.0;
  }

  if ((x == 2.0) || (x == 3.0)) {
    return z;
  }

  x -= 2.0;
  p = polevl(x, P, 6);
  q = polevl(x, Q, 7);
  return z * p / q;
}

/**
 * Returns the Gamma function computed by Stirling's formula. The polynomial
 * STIR is valid for 33 <= x <= 172.
 */
private double stirlingFormula(double x) {

  double STIR[] = { 7.87311395793093628397E-4, -2.29549961613378126380E-4,
    -2.68132617805781232825E-3, 3.47222221605458667310E-3,
    8.33333333333482257126E-2, };
  double MAXSTIR = 143.01608;

  double w = 1.0 / x;
  double y = Math.exp(x);

  w = 1.0 + w * polevl(w, STIR, 4);

  if (x > MAXSTIR) {
    /* Avoid overflow in Math.pow() */
    double v = Math.pow(x, 0.5 * x - 0.25);
    y = v * (v / y);
  } else {
    y = Math.pow(x, x - 0.5) / y;
  }
  y = SQTPI * y * w;
  return y;
}

/**
 * Evaluates the given polynomial of degree <tt>N</tt> at <tt>x</tt>.
 * 
 * <pre>
 *                     2          N
 * y  =  C  + C x + C x  +...+ C x
 *        0    1     2          N
 * 
 * Coefficients are stored in reverse order:
 * 
 * coef[0] = C  , ..., coef[N] = C  .
 *            N                   0
 * </pre>
 * 
 * In the interest of speed, there are no checks for out of bounds arithmetic.
 * 
 * @param x argument to the polynomial.
 * @param coef the coefficients of the polynomial.
 * @param N the degree of the polynomial.
 */
private double polevl(double x, double coef[], int N) {

  double ans;
  ans = coef[0];

  for (int i = 1; i <= N; i++) {
    ans = ans * x + coef[i];
  }

  return ans;
}



}
