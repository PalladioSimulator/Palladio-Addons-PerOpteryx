package de.uka.ipd.sdq.dsexplore.opt4j.optimizer.heuristic.operators.impl;

import org.apache.log4j.Logger;

import de.uka.ipd.sdq.pcm.resourceenvironment.ResourceContainer;
import de.uka.ipd.sdq.pcm.resourcetype.ProcessingResourceType;

public class ActiveResInfo {
	
	protected static Logger logger = Logger.getLogger(ActiveResInfo.class.getName());

	//resource container of the hardware resource
	ResourceContainer rc;
	
	//type of hardware resource
	ProcessingResourceType type;
	
	//LQN solution - utilisation of the hardware resource
	double utilisation;
	
	//LQN solution - queue length of the hardware resource
	double queueLength;
	
	//scheduling policy
	String schedulingPolicy;
	
	//rank of active resources: predicted utilisation - required utilisation
	double rank;
	
	//initial values
	public ActiveResInfo(){
		this.rc = null;
		this.type = null;
		this.utilisation = 0.0;
		this.queueLength = 0.0;
		this.schedulingPolicy = "";
		this.rank = 0.0;
	}
	
	public ActiveResInfo(ResourceContainer rc, ProcessingResourceType processingResourceType, double u, double q, String s, double r){
		this.rc = rc;
		this.type = processingResourceType;
		this.utilisation = u;
		this.queueLength = q;
		this.schedulingPolicy = s;
		this.rank = r;
	}
	
	public ActiveResInfo(ActiveResInfo h){
		this.rc = h.rc;
		this.type = h.type;
		this.utilisation = h.utilisation;
		this.queueLength = h.queueLength;
		this.schedulingPolicy = h.schedulingPolicy;
		this.rank = h.rank;
	}
	
	//print elements of ActiveResInfo type
	public void print(){
			logger.info("ActiveRes " + this.rc.getEntityName() + ","+
					    " type " + this.type.getEntityName() + ","+
					    " U: " + this.utilisation + ","+
					    " QL: " + this.queueLength + ","+
					    " scheduling " + this.schedulingPolicy + ","+
					    " rank " + this.rank);
		}

}
