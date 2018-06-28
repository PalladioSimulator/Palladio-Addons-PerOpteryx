package main;
			
			public class ResourceEnvironment implements de.uka.ipd.sdq.simucomframework.resources.IResourceContainerFactory {
				
				private static final ResourceEnvironment instance = new ResourceEnvironment();
				
				public static ResourceEnvironment getInstance() {
					return instance;
				}
			
			   	public String[] getResourceContainerIDList() {
			   		java.util.List<String> resourceContainerIds = new java.util.ArrayList<String>();
			   		resourceContainerIds.add("_8-cpgNo_EdyxgfK4Hy_RFA");
			   		resourceContainerIds.add("_EX6xcdpAEdyxgfK4Hy_RFA");
			   		resourceContainerIds.add("_U2Nv4dpAEdyxgfK4Hy_RFA");
			   		resourceContainerIds.add("_L0Dy4dpAEdyxgfK4Hy_RFA");
			   		resourceContainerIds.add("_IwYkwSYYEd-qOJxMJOMJYA");
			   		resourceContainerIds.add("_PQNu8SYYEd-qOJxMJOMJYA");
			   		resourceContainerIds.add("_PwyscSYYEd-qOJxMJOMJYA");
			   		resourceContainerIds.add("_QEbaISYYEd-qOJxMJOMJYA");
			   		resourceContainerIds.add("_QgPzcSYYEd-qOJxMJOMJYA");
			   		return resourceContainerIds.toArray(new String[]{});
			   	}
			   
			   	public String[] getLinkingResourceContainerIDList() {
			   		return new String[] { 
			   			"_Sw3RcIbfEd-vRaQ65kIN7g"
			   		};
			   	}
			   	
			   	public java.util.ArrayList<String> getFromResourceContainerID(String linkingResourceContainerID) {
			   		java.util.ArrayList<String> resultList = new java.util.ArrayList<String>();
			   		if(linkingResourceContainerID.equals("_Sw3RcIbfEd-vRaQ65kIN7g")) {
			   		resultList.add("_8-cpgNo_EdyxgfK4Hy_RFA");
			   		resultList.add("_EX6xcdpAEdyxgfK4Hy_RFA");
			   		resultList.add("_U2Nv4dpAEdyxgfK4Hy_RFA");
			   		resultList.add("_L0Dy4dpAEdyxgfK4Hy_RFA");
			   		resultList.add("_IwYkwSYYEd-qOJxMJOMJYA");
			   		resultList.add("_PQNu8SYYEd-qOJxMJOMJYA");
			   		resultList.add("_PwyscSYYEd-qOJxMJOMJYA");
			   		resultList.add("_QEbaISYYEd-qOJxMJOMJYA");
			   		resultList.add("_QgPzcSYYEd-qOJxMJOMJYA");
			   		}
			   		return resultList;
			   	}
			   	
			   	public java.util.ArrayList<String> getToResourceContainerID(String linkingResourceContainerID) {
			   		java.util.ArrayList<String> resultList = new java.util.ArrayList<String>();
			   		if (linkingResourceContainerID.equals("_Sw3RcIbfEd-vRaQ65kIN7g")) {
			   		resultList.add("_8-cpgNo_EdyxgfK4Hy_RFA");
			   		resultList.add("_EX6xcdpAEdyxgfK4Hy_RFA");
			   		resultList.add("_U2Nv4dpAEdyxgfK4Hy_RFA");
			   		resultList.add("_L0Dy4dpAEdyxgfK4Hy_RFA");
			   		resultList.add("_IwYkwSYYEd-qOJxMJOMJYA");
			   		resultList.add("_PQNu8SYYEd-qOJxMJOMJYA");
			   		resultList.add("_PwyscSYYEd-qOJxMJOMJYA");
			   		resultList.add("_QEbaISYYEd-qOJxMJOMJYA");
			   		resultList.add("_QgPzcSYYEd-qOJxMJOMJYA");
			   		}
			   		return resultList;
			   	}
			   	
			   	public String getLinkingResourceContainerID(String fromResourceContainerID, String toResourceContainerID) {
			   		for (String id: getLinkingResourceContainerIDList()) {
			   			if (getFromResourceContainerID(id).contains(fromResourceContainerID) && getToResourceContainerID(id).contains(toResourceContainerID)) {
			   				return id;
			   			}
			   		}
			   		return null;
			   	}
			   	
			   	public void fillResourceContainerWithResources(de.uka.ipd.sdq.simucomframework.resources.SimulatedResourceContainer rc) {
			   		if (rc.getResourceContainerID().equals("_8-cpgNo_EdyxgfK4Hy_RFA")) {
			   			String[] _oro4gG3fEdy4YaaT__RYrLQ_provInterfaces = null;
			   			_oro4gG3fEdy4YaaT__RYrLQ_provInterfaces = new String[1];
			   			
			   			_oro4gG3fEdy4YaaT__RYrLQ_provInterfaces[0] = "CpuInterface";
			   			rc.addActiveResource(
			   			(org.palladiosimulator.pcm.resourceenvironment.ProcessingResourceSpecification) org.palladiosimulator.commons.emfutils.EMFLoadHelper.loadAndResolveEObject("file:/Users/Schneider/Universität/Masterarbeit/Palladio/PerOpteryxPlus/InnerEclipse/de.uka.ipd.sdq.temporary/model/platform/resource/IDS/BRS/brs.resourceenvironmentcand.resourceenvironment#_nEAE8NYpEeG1tZ5PjRtRiA"),
			   			_oro4gG3fEdy4YaaT__RYrLQ_provInterfaces,
			   			rc.getResourceContainerID(),
			   				de.uka.ipd.sdq.simucomframework.resources.SchedulingStrategy.PROCESSOR_SHARING
			   				);
			   		} else 
			   		if (rc.getResourceContainerID().equals("_EX6xcdpAEdyxgfK4Hy_RFA")) {
			   			String[] _oro4gG3fEdy4YaaT__RYrLQ_provInterfaces = null;
			   			_oro4gG3fEdy4YaaT__RYrLQ_provInterfaces = new String[1];
			   			
			   			_oro4gG3fEdy4YaaT__RYrLQ_provInterfaces[0] = "CpuInterface";
			   			rc.addActiveResource(
			   			(org.palladiosimulator.pcm.resourceenvironment.ProcessingResourceSpecification) org.palladiosimulator.commons.emfutils.EMFLoadHelper.loadAndResolveEObject("file:/Users/Schneider/Universität/Masterarbeit/Palladio/PerOpteryxPlus/InnerEclipse/de.uka.ipd.sdq.temporary/model/platform/resource/IDS/BRS/brs.resourceenvironmentcand.resourceenvironment#_nEBTENYpEeG1tZ5PjRtRiA"),
			   			_oro4gG3fEdy4YaaT__RYrLQ_provInterfaces,
			   			rc.getResourceContainerID(),
			   				de.uka.ipd.sdq.simucomframework.resources.SchedulingStrategy.PROCESSOR_SHARING
			   				);
			   		} else 
			   		if (rc.getResourceContainerID().equals("_U2Nv4dpAEdyxgfK4Hy_RFA")) {
			   			String[] _oro4gG3fEdy4YaaT__RYrLQ_provInterfaces = null;
			   			_oro4gG3fEdy4YaaT__RYrLQ_provInterfaces = new String[1];
			   			
			   			_oro4gG3fEdy4YaaT__RYrLQ_provInterfaces[0] = "CpuInterface";
			   			rc.addActiveResource(
			   			(org.palladiosimulator.pcm.resourceenvironment.ProcessingResourceSpecification) org.palladiosimulator.commons.emfutils.EMFLoadHelper.loadAndResolveEObject("file:/Users/Schneider/Universität/Masterarbeit/Palladio/PerOpteryxPlus/InnerEclipse/de.uka.ipd.sdq.temporary/model/platform/resource/IDS/BRS/brs.resourceenvironmentcand.resourceenvironment#_nEBTFNYpEeG1tZ5PjRtRiA"),
			   			_oro4gG3fEdy4YaaT__RYrLQ_provInterfaces,
			   			rc.getResourceContainerID(),
			   				de.uka.ipd.sdq.simucomframework.resources.SchedulingStrategy.PROCESSOR_SHARING
			   				);
			   		} else 
			   		if (rc.getResourceContainerID().equals("_L0Dy4dpAEdyxgfK4Hy_RFA")) {
			   			String[] _oro4gG3fEdy4YaaT__RYrLQ_provInterfaces = null;
			   			_oro4gG3fEdy4YaaT__RYrLQ_provInterfaces = new String[1];
			   			
			   			_oro4gG3fEdy4YaaT__RYrLQ_provInterfaces[0] = "CpuInterface";
			   			rc.addActiveResource(
			   			(org.palladiosimulator.pcm.resourceenvironment.ProcessingResourceSpecification) org.palladiosimulator.commons.emfutils.EMFLoadHelper.loadAndResolveEObject("file:/Users/Schneider/Universität/Masterarbeit/Palladio/PerOpteryxPlus/InnerEclipse/de.uka.ipd.sdq.temporary/model/platform/resource/IDS/BRS/brs.resourceenvironmentcand.resourceenvironment#_nEBTGNYpEeG1tZ5PjRtRiA"),
			   			_oro4gG3fEdy4YaaT__RYrLQ_provInterfaces,
			   			rc.getResourceContainerID(),
			   				de.uka.ipd.sdq.simucomframework.resources.SchedulingStrategy.PROCESSOR_SHARING
			   				);
			   		} else 
			   		if (rc.getResourceContainerID().equals("_IwYkwSYYEd-qOJxMJOMJYA")) {
			   			String[] _oro4gG3fEdy4YaaT__RYrLQ_provInterfaces = null;
			   			_oro4gG3fEdy4YaaT__RYrLQ_provInterfaces = new String[1];
			   			
			   			_oro4gG3fEdy4YaaT__RYrLQ_provInterfaces[0] = "CpuInterface";
			   			rc.addActiveResource(
			   			(org.palladiosimulator.pcm.resourceenvironment.ProcessingResourceSpecification) org.palladiosimulator.commons.emfutils.EMFLoadHelper.loadAndResolveEObject("file:/Users/Schneider/Universität/Masterarbeit/Palladio/PerOpteryxPlus/InnerEclipse/de.uka.ipd.sdq.temporary/model/platform/resource/IDS/BRS/brs.resourceenvironmentcand.resourceenvironment#_nEBTHNYpEeG1tZ5PjRtRiA"),
			   			_oro4gG3fEdy4YaaT__RYrLQ_provInterfaces,
			   			rc.getResourceContainerID(),
			   				de.uka.ipd.sdq.simucomframework.resources.SchedulingStrategy.PROCESSOR_SHARING
			   				);
			   		} else 
			   		if (rc.getResourceContainerID().equals("_PQNu8SYYEd-qOJxMJOMJYA")) {
			   			String[] _oro4gG3fEdy4YaaT__RYrLQ_provInterfaces = null;
			   			_oro4gG3fEdy4YaaT__RYrLQ_provInterfaces = new String[1];
			   			
			   			_oro4gG3fEdy4YaaT__RYrLQ_provInterfaces[0] = "CpuInterface";
			   			rc.addActiveResource(
			   			(org.palladiosimulator.pcm.resourceenvironment.ProcessingResourceSpecification) org.palladiosimulator.commons.emfutils.EMFLoadHelper.loadAndResolveEObject("file:/Users/Schneider/Universität/Masterarbeit/Palladio/PerOpteryxPlus/InnerEclipse/de.uka.ipd.sdq.temporary/model/platform/resource/IDS/BRS/brs.resourceenvironmentcand.resourceenvironment#_nEB6IdYpEeG1tZ5PjRtRiA"),
			   			_oro4gG3fEdy4YaaT__RYrLQ_provInterfaces,
			   			rc.getResourceContainerID(),
			   				de.uka.ipd.sdq.simucomframework.resources.SchedulingStrategy.PROCESSOR_SHARING
			   				);
			   		} else 
			   		if (rc.getResourceContainerID().equals("_PwyscSYYEd-qOJxMJOMJYA")) {
			   			String[] _oro4gG3fEdy4YaaT__RYrLQ_provInterfaces = null;
			   			_oro4gG3fEdy4YaaT__RYrLQ_provInterfaces = new String[1];
			   			
			   			_oro4gG3fEdy4YaaT__RYrLQ_provInterfaces[0] = "CpuInterface";
			   			rc.addActiveResource(
			   			(org.palladiosimulator.pcm.resourceenvironment.ProcessingResourceSpecification) org.palladiosimulator.commons.emfutils.EMFLoadHelper.loadAndResolveEObject("file:/Users/Schneider/Universität/Masterarbeit/Palladio/PerOpteryxPlus/InnerEclipse/de.uka.ipd.sdq.temporary/model/platform/resource/IDS/BRS/brs.resourceenvironmentcand.resourceenvironment#_nEB6JdYpEeG1tZ5PjRtRiA"),
			   			_oro4gG3fEdy4YaaT__RYrLQ_provInterfaces,
			   			rc.getResourceContainerID(),
			   				de.uka.ipd.sdq.simucomframework.resources.SchedulingStrategy.PROCESSOR_SHARING
			   				);
			   		} else 
			   		if (rc.getResourceContainerID().equals("_QEbaISYYEd-qOJxMJOMJYA")) {
			   			String[] _oro4gG3fEdy4YaaT__RYrLQ_provInterfaces = null;
			   			_oro4gG3fEdy4YaaT__RYrLQ_provInterfaces = new String[1];
			   			
			   			_oro4gG3fEdy4YaaT__RYrLQ_provInterfaces[0] = "CpuInterface";
			   			rc.addActiveResource(
			   			(org.palladiosimulator.pcm.resourceenvironment.ProcessingResourceSpecification) org.palladiosimulator.commons.emfutils.EMFLoadHelper.loadAndResolveEObject("file:/Users/Schneider/Universität/Masterarbeit/Palladio/PerOpteryxPlus/InnerEclipse/de.uka.ipd.sdq.temporary/model/platform/resource/IDS/BRS/brs.resourceenvironmentcand.resourceenvironment#_nEB6KdYpEeG1tZ5PjRtRiA"),
			   			_oro4gG3fEdy4YaaT__RYrLQ_provInterfaces,
			   			rc.getResourceContainerID(),
			   				de.uka.ipd.sdq.simucomframework.resources.SchedulingStrategy.PROCESSOR_SHARING
			   				);
			   		} else 
			   		if (rc.getResourceContainerID().equals("_QgPzcSYYEd-qOJxMJOMJYA")) {
			   			String[] _oro4gG3fEdy4YaaT__RYrLQ_provInterfaces = null;
			   			_oro4gG3fEdy4YaaT__RYrLQ_provInterfaces = new String[1];
			   			
			   			_oro4gG3fEdy4YaaT__RYrLQ_provInterfaces[0] = "CpuInterface";
			   			rc.addActiveResource(
			   			(org.palladiosimulator.pcm.resourceenvironment.ProcessingResourceSpecification) org.palladiosimulator.commons.emfutils.EMFLoadHelper.loadAndResolveEObject("file:/Users/Schneider/Universität/Masterarbeit/Palladio/PerOpteryxPlus/InnerEclipse/de.uka.ipd.sdq.temporary/model/platform/resource/IDS/BRS/brs.resourceenvironmentcand.resourceenvironment#_nEB6LdYpEeG1tZ5PjRtRiA"),
			   			_oro4gG3fEdy4YaaT__RYrLQ_provInterfaces,
			   			rc.getResourceContainerID(),
			   				de.uka.ipd.sdq.simucomframework.resources.SchedulingStrategy.PROCESSOR_SHARING
			   				);
			   		} else 
			   			throw new RuntimeException("Unknown resource container should be initialised. This should never happen");	
			   	}
			   	
			   	public void fillResourceContainerWithNestedResourceContainers(de.uka.ipd.sdq.simucomframework.resources.SimulatedResourceContainer rc) {
			   		if (rc.getResourceContainerID().equals("_8-cpgNo_EdyxgfK4Hy_RFA")) {
			   		} else 
			   		if (rc.getResourceContainerID().equals("_EX6xcdpAEdyxgfK4Hy_RFA")) {
			   		} else 
			   		if (rc.getResourceContainerID().equals("_U2Nv4dpAEdyxgfK4Hy_RFA")) {
			   		} else 
			   		if (rc.getResourceContainerID().equals("_L0Dy4dpAEdyxgfK4Hy_RFA")) {
			   		} else 
			   		if (rc.getResourceContainerID().equals("_IwYkwSYYEd-qOJxMJOMJYA")) {
			   		} else 
			   		if (rc.getResourceContainerID().equals("_PQNu8SYYEd-qOJxMJOMJYA")) {
			   		} else 
			   		if (rc.getResourceContainerID().equals("_PwyscSYYEd-qOJxMJOMJYA")) {
			   		} else 
			   		if (rc.getResourceContainerID().equals("_QEbaISYYEd-qOJxMJOMJYA")) {
			   		} else 
			   		if (rc.getResourceContainerID().equals("_QgPzcSYYEd-qOJxMJOMJYA")) {
			   		} else 
			   			throw new RuntimeException("Unknown resource container should be initialised. This should never happen");	
			   	}
			   
			   	public void fillLinkingResourceContainer(de.uka.ipd.sdq.simucomframework.resources.SimulatedLinkingResourceContainer rc) {
			   		if (rc.getResourceContainerID().equals("_Sw3RcIbfEd-vRaQ65kIN7g")) {
			   			rc.addActiveResource(
			   			     (org.palladiosimulator.pcm.resourceenvironment.LinkingResource) org.palladiosimulator.commons.emfutils.EMFLoadHelper.loadAndResolveEObject("file:/Users/Schneider/Universität/Masterarbeit/Palladio/PerOpteryxPlus/InnerEclipse/de.uka.ipd.sdq.temporary/model/platform/resource/IDS/BRS/brs.resourceenvironmentcand.resourceenvironment#_Sw3RcIbfEd-vRaQ65kIN7g"),
			   			rc.getResourceContainerID());
			   		}
			   		else
			   			throw new RuntimeException("Unknown resource container should be initialised. This should never happen");
			   	}
			   
			}
