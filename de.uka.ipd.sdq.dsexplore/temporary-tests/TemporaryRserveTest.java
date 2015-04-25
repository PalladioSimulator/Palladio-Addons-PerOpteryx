package de.uka.ipd.sdq.dsexplore.opt4j.operator;

import org.rosuda.REngine.REXP;
import org.rosuda.REngine.REXPMismatchException;
import org.rosuda.REngine.Rserve.RConnection;
import org.rosuda.REngine.Rserve.RserveException;

public class TemporaryRserveTest {

	public static void main(String[] args) throws RserveException {
		// TODO Auto-generated method stub

		// Test for Rserve. Open R and type library(Rserve) followed by Rserve()
		// This will start Rserve. R can be closed after this and Rserve will
		// still run
				
				
		RConnection connector=new RConnection();
		
		// 1) Test for normal R calls
		try {
			connector.eval("x = 100");
			REXP rexp = connector.eval("y = sqrt(x)");
			double x = rexp.asDouble();
			System.out.println(x); // prints out 10.0
		} catch (RserveException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (REXPMismatchException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// 2) Test for external R package calls (fails)
		try {
			connector.eval("library(bnlearn)"); // load library
			REXP rexp = connector.eval("acyclic(empty.graph(LETTERS[1:8]))"); // Check whether an empty graph is acyclic (returns true)
		} catch (RserveException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		// End of Rserve tests ----------------------------------------------------------------------------
	}

}
