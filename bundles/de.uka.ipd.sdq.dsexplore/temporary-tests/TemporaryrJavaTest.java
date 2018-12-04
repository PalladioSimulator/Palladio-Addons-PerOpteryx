package de.uka.ipd.sdq.dsexplore.opt4j.operator;

import org.rosuda.JRI.Rengine;

public class TemporaryrJavaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Tests of rJava. 
		Rengine rengine = new Rengine (new String[]{"--no-save"}, false, null);
				
		// 1) Test for normal R calls
		rengine.eval("x=100");
		org.rosuda.JRI.REXP re = rengine.eval("y=sqrt(x)");
		System.out.println(re.asDouble());
		
		// 2) Test for external R package calls 
		rengine.eval("library(bnlearn)");// load library
		System.out.println("Line 58");
		org.rosuda.JRI.REXP r = rengine.eval("acyclic(empty.graph(LETTERS[1:8]))"); // Check whether an empty graph is acyclic (returns true)
		System.out.println(r.asString());
		rengine.end();
	}

}
