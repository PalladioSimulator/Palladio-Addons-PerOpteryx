package de.uka.ipd.sdq.dsexplore.opt4j.optimizer.heuristic.operators.impl;
import org.apache.log4j.Logger;
import de.uka.ipd.sdq.pcm.repository.BasicComponent;
import de.uka.ipd.sdq.pcm.repository.PassiveResource;

public class PassiveResInfo {
	
	protected static Logger logger = Logger.getLogger(ActiveResInfo.class.getName());

	//passive resource
	PassiveResource pr;
	
	//component whose passive resource belongs to
	BasicComponent bc;
	
	//capacity of the passive resource
	int capacity;
	
	//LQN solution - queue length of the passive resource
	double utilisation;
	
	//LQN solution - queue length of the passive resource
	double queueLength;
	
	//LQN solution - waiting time of the passive resource
	double waitingTime;
	
	//LQN solution - holding time of the passive resource
	double holdingTime;
	
	//rank of passive resources: predicted waiting time - 2 * holding time
	double rank;
	
	//initial values
	public PassiveResInfo(){
		this.pr = null;
		this.bc = null;
		this.capacity = 1;
		this.utilisation = 0.0;
		this.queueLength = 0.0;
		this.waitingTime = 0.0;
		this.holdingTime = 0.0;
		this.rank = 0.0;
	}
	
	public PassiveResInfo(PassiveResource pr, BasicComponent c, int i, double u, double q, double w, double h, double r){
		this.pr = pr;
		this.bc = c;
		this.capacity = i;
		this.utilisation = u;
		this.queueLength = q;
		this.waitingTime = w;
		this.holdingTime = h;
		this.rank = r;
	}
	
	public PassiveResInfo(PassiveResInfo h){
		this.pr = h.pr;
		this.bc = h.bc;
		this.capacity = h.capacity;
		this.utilisation = h.utilisation;
		this.queueLength = h.queueLength;
		this.waitingTime = h.waitingTime;
		this.holdingTime = h.holdingTime;
		this.rank = h.rank;
	}
	
	//print elements of PassiveResInfo type
	public void print(){
			logger.info("PassiveRes " + this.pr.getEntityName() + ","+
					    " component " + this.bc.getEntityName() + ","+
					    " capacity: " + this.capacity + ","+
					    " utilisation: " + this.utilisation + ","+
					    " QL: " + this.queueLength + ","+
					    " WT: " + this.waitingTime + ","+
					    " HT: " + this.holdingTime + ","+
					    " rank: " + this.rank);
		}

}
