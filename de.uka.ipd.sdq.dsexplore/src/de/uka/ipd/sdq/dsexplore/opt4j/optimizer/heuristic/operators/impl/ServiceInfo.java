package de.uka.ipd.sdq.dsexplore.opt4j.optimizer.heuristic.operators.impl;

import org.apache.log4j.Logger;

import de.uka.ipd.sdq.pcm.allocation.AllocationContext;

public class ServiceInfo {
	
	protected static Logger logger = Logger.getLogger(ServiceInfo.class.getName());

	//name of the service
	String serviceName;
	
	//name of the component providing the service
	String compName;
	
	//allocation context of the component providing the service
	AllocationContext compAllocContext;
	
	//User Requirement - response time of the service
	double userRTreq;
	
	//LQN solution - response time of the service
	double respT;
	
	//User Requirement - throughput of the service
	double userTHreq;
		
	//LQN solution - response time of the service
	double throughput;
	
	//rank of active resources: predicted throughput - required throughput
	double rank;
	
	//frequency of the service
	double frequency;
	
	//initial values
	public ServiceInfo(){
		this.serviceName = "";
		this.compName = "";
		//this.compAllocContext = null;
		this.userRTreq = 0.0;
		this.respT = 0.0;
		this.userTHreq = 0.0;
		this.throughput = 0.0;
		this.rank = 0.0;
		this.frequency = 0.0;
	}
	
	public ServiceInfo(String sName, String cName, double uRT, double r, double uTH, double t, double rank, double f){
		this.serviceName = sName;
		this.compName = cName;
		//this.compAllocContext = compAllocContext;
		this.userRTreq = uRT;
		this.respT = r;
		this.userTHreq = uTH;
		this.throughput = t;
		this.rank = rank;
		this.frequency = f;
	}
	
	//print elements of ServiceInfo type
	public void print(){
			logger.info("SEFF " + this.serviceName + ","+
					    " by " + this.compName + ","+
					    //" instance " + this.compAllocContext.getEntityName() + ","+
					    " RT(user requirement) " + this.userRTreq + ","+
					    " RT(lqn solution) " + this.respT + ","+
					    " TH(user requirement) " + this.userTHreq + ","+
					    " TH(lqn solution) " + this.throughput + ","+
					    " rank " + this.rank + ","+
					    " frequency " + this.frequency);
		}

}
