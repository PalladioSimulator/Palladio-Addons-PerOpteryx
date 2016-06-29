package de.uka.ipd.sdq.dsexplore.helper;

import org.eclipse.emf.compare.impl.ComparisonImpl;
import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.resourceenvironment.ProcessingResourceSpecification;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;
import org.palladiosimulator.pcm.resourceenvironment.impl.ProcessingResourceSpecificationImpl;

import de.uka.ipd.sdq.pcm.designdecision.DegreeOfFreedomInstance;
import de.uka.ipd.sdq.pcm.designdecision.specific.ProcessingResourceDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.impl.ContinuousRangeDegreeImpl;

public class DegreeOfFreedomHelper {

    public static String getDegreeDescription(final DegreeOfFreedomInstance decision) {
        String suffix = "";
        if (decision instanceof ProcessingResourceDegree){
            suffix = ":"+((ProcessingResourceDegree)decision).getProcessingresourcetype().getEntityName();
        } 
        if (decision instanceof ContinuousRangeDegreeImpl && decision.getPrimaryChanged() instanceof ProcessingResourceSpecificationImpl) {
        	suffix = ":"+((ResourceContainer)((ProcessingResourceSpecification)decision.getPrimaryChanged()).eContainer()).getEntityName();
        }
        String primaryChangeableName = "";
        if (decision.getPrimaryChanged() == null && !decision.getDecoratorModel().isEmpty() && decision.getDecoratorModel().get(0) instanceof ComparisonImpl) {
        	Object com = decision.getDecoratorModel().get(0);
        	String name = com.getClass().getName();
        	primaryChangeableName = name;
        } else {
        	primaryChangeableName = decision.getPrimaryChanged().toString();
        }
        if (decision.getPrimaryChanged() instanceof Entity){
            primaryChangeableName = ((Entity)decision.getPrimaryChanged()).getEntityName();
        }

        return decision.getClass().getSimpleName() + ":" + primaryChangeableName + suffix;
    }

}
