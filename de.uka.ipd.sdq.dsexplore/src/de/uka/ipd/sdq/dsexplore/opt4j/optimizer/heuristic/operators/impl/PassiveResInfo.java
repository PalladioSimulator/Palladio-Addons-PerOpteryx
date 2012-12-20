package de.uka.ipd.sdq.dsexplore.opt4j.optimizer.heuristic.operators.impl;
import org.apache.log4j.Logger;
import de.uka.ipd.sdq.pcm.repository.PassiveResource;

public class PassiveResInfo {
	
	protected static Logger logger = Logger.getLogger(ActiveResInfo.class.getName());

	//passive resource
	PassiveResource pr;
	
	//component whose passive resource belongs to
	String component;
	
	//capacity of the passive resource
	int capacity;
	
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
		this.component = "";
		this.capacity = 1;
		this.queueLength = 0.0;
		this.waitingTime = 0.0;
		this.holdingTime = 0.0;
		this.rank = 0.0;
	}
	
	public PassiveResInfo(PassiveResource pr, String c, int i, double q, double w, double h, double r){
		this.pr = pr;
		this.component = c;
		this.capacity = i;
		this.queueLength = q;
		this.waitingTime = w;
		this.holdingTime = h;
		this.rank = r;
	}
	
	public PassiveResInfo(PassiveResInfo h){
		this.pr = h.pr;
		this.component = h.component;
		this.capacity = h.capacity;
		this.queueLength = h.queueLength;
		this.waitingTime = h.waitingTime;
		this.holdingTime = h.holdingTime;
		this.rank = h.rank;
	}
	
	//print elements of PassiveResInfo type
	public void print(){
			logger.info("PassiveRes " + this.pr.getEntityName() + ","+
					    " component " + this.component + ","+
					    " capacity: " + this.capacity + ","+
					    " QL: " + this.queueLength + ","+
					    " WT: " + this.waitingTime + ","+
					    " HT: " + this.holdingTime + ","+
					    " rank: " + this.rank);
		}

}
