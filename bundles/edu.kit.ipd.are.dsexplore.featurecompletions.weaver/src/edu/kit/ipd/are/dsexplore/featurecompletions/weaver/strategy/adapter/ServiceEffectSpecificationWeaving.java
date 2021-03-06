package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.adapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.pcm.core.composition.Connector;
import org.palladiosimulator.pcm.parameter.VariableUsage;
import org.palladiosimulator.pcm.repository.BasicComponent;
import org.palladiosimulator.pcm.repository.OperationSignature;
import org.palladiosimulator.pcm.repository.ProvidedRole;
import org.palladiosimulator.pcm.repository.RequiredRole;
import org.palladiosimulator.pcm.repository.Signature;
import org.palladiosimulator.pcm.seff.ExternalCallAction;
import org.palladiosimulator.pcm.seff.ServiceEffectSpecification;
import org.palladiosimulator.pcm.seff.SetVariableAction;

import FeatureCompletionModel.ComplementumVisnetis;
import de.uka.ipd.sdq.dsexplore.tools.stereotypeapi.StereotypeAPIHelper;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.ErrorMessage;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.FCCUtil;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.port.FCCWeaverException;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.WeavingInstruction;
import featureSolution.AdapterInclusion;
import featureSolution.InclusionMechanism;

/**
 * This class is responsible for weaving the SEFF of the adapter in the context
 * of the adapter transformation strategy.
 *
 * @author scheerer
 *
 */
public abstract class ServiceEffectSpecificationWeaving {

	public class ExternalCallInfo {

		public Signature calledService;
		public RequiredRole requiredRole;
		public List<VariableUsage> returnVariableUsage;
		public List<VariableUsage> inputVariableUsages;
		public List<SetVariableAction> setVariableActions;

		public ExternalCallInfo(Signature calledService, RequiredRole requiredRole) {
			this(calledService, requiredRole, new ArrayList<VariableUsage>(), new ArrayList<VariableUsage>(), new ArrayList<SetVariableAction>());
		}

		public ExternalCallInfo(Signature calledService, RequiredRole requiredRole, List<VariableUsage> returnVariableUsage, List<VariableUsage> inputVariableUsages,
				List<SetVariableAction> setVariableActions) {
			this.calledService = calledService;
			this.requiredRole = requiredRole;
			this.returnVariableUsage = returnVariableUsage;
			this.inputVariableUsages = inputVariableUsages;
			this.setVariableActions = setVariableActions;
		}
	}

	protected final IAdapterWeaving parent;

	public ServiceEffectSpecificationWeaving(IAdapterWeaving parent) {
		this.parent = parent;
	}

	private InclusionMechanism inclusionMechanism;
	private List<ProvidedRole> consumedFeautresOfECC;

	protected Connector weavingLocation;
	private List<? extends OperationSignature> affected;

	private ComplementumVisnetis visnetis;

	private void setTransformationStrategy(InclusionMechanism inclusionMechanism) {
		this.inclusionMechanism = inclusionMechanism;
	}

	private void setConsumedFeaturesOfECC(List<ProvidedRole> consumedFeautresOfECC) {
		this.consumedFeautresOfECC = consumedFeautresOfECC;
	}

	private void setWeavingLocation(Connector weavingLocation, List<? extends OperationSignature> affected) {
		this.weavingLocation = weavingLocation;
		this.affected = affected;
	}

	public void weave(WeavingInstruction weavingInstruction) throws FCCWeaverException {
		this.visnetis = weavingInstruction.getCV();
		this.setWeavingLocation(weavingInstruction.getWeavingLocation(), weavingInstruction.getAffected());
		this.setConsumedFeaturesOfECC(weavingInstruction.getFCCWithConsumedFeatures().getSecond());
		this.setTransformationStrategy(weavingInstruction.getInclusionMechanism());
		this.createServiceEffectSpecificationForAdapterBy(this.getCalledComponent());
	}

	/**
	 * Retrieves the required component which requires several services the
	 * adapter provides now. Based on the connection of the components the
	 * adapter is inserted in between the calling component needs to be
	 * retrieved differently.
	 *
	 * @return The required component which is calling several services it
	 *         requires.
	 */
	protected abstract BasicComponent getCalledComponent();

	/**
	 * Retrieves the provided component which provides several services the
	 * adapter requires now. Based on the connection of the components the
	 * adapter is inserted in between the called component needs to be retrieved
	 * differently.
	 *
	 * @return The provided component which is called by the adapter and was
	 *         required by the requiring component in the first place.
	 * @throws ConcernWeavingException
	 *             - Will be thrown if an error occurs during the recovering of
	 *             the called component.
	 */
	protected abstract BasicComponent getCallingComponent() throws FCCWeaverException;

	/**
	 * Retrieves the external call informations for a given SEFF which contains
	 * the service, required role and the input and output parameters.
	 *
	 * @param seffToTransform
	 *            - The SEFF from which the informations are extracted.
	 * @return the external call informations.
	 * @throws ConcernWeavingException
	 *             - Will be thrown if an error occurs.
	 */
	protected abstract ExternalCallInfo getExternalCallInfoFrom(ServiceEffectSpecification seffToTransform) throws FCCWeaverException;

	private void createServiceEffectSpecificationForAdapterBy(BasicComponent calledComponent) throws FCCWeaverException {
		this.createServiceEffectSpecificationsBy(calledComponent)
				.forEach(eachCreatedSeff -> this.parent.getPCMSEFFManager().addServiceEffectSpecificationTo((BasicComponent) this.parent.getAdapterComponent(), eachCreatedSeff));
	}

	private List<ServiceEffectSpecification> createServiceEffectSpecificationsBy(BasicComponent calledComponent) throws FCCWeaverException {
		try {
			return this.getSEFFsInvokedByTheAdapterFrom(calledComponent).map(eachSeff -> this.transformToAdaperSeffAndCheckForException(eachSeff)).collect(Collectors.toList());
		} catch (Exception ex) {
			throw new FCCWeaverException(ex.getMessage());
		}
	}

	private Stream<ServiceEffectSpecification> getSEFFsInvokedByTheAdapterFrom(BasicComponent calledComponent) {
		List<ServiceEffectSpecification> result = new ArrayList<>();
		for (ServiceEffectSpecification seff : calledComponent.getServiceEffectSpecifications__BasicComponent()) {
			if (this.isInvokedByAdapter(seff.getDescribedService__SEFF())) {
				result.add(seff);
			}
		}
		return result.stream();
	}

	private boolean isInvokedByAdapter(Signature signature) {
		List<Signature> signatures = this.getAllRequiredServicesOfAdapter().collect(Collectors.toList());

		for (Signature sig : signatures) {
			if (FCCUtil.areEqual(sig, signature)) {
				return true;
			}
		}
		return false;

	}

	/**
	 * Filter all signatures without annotation iff any annotated
	 *
	 * @author Dominik Fuchss
	 */
	private List<ExternalCallInfo> filterAccordingToOptionalAnnotations(List<ExternalCallInfo> infos) {

		List<ExternalCallInfo> infosWithoutAnnotationInSolution = new ArrayList<>();
		List<ExternalCallInfo> infosWithAnnotationInSolution = new ArrayList<>();

		for (ExternalCallInfo ei : infos) {
			boolean isInSolution = !StereotypeAPIHelper.getViaStereoTypeFrom(ei.calledService.eContainer(), ComplementumVisnetis.class, "fulfillsComplementumVisnetis").isEmpty();
			if (!isInSolution) {
				continue;
			}

			List<ComplementumVisnetis> vis = StereotypeAPIHelper.getViaStereoTypeFrom(ei.calledService, ComplementumVisnetis.class, "fulfillsComplementumVisnetis");
			if (vis.contains(this.visnetis)) {
				infosWithAnnotationInSolution.add(ei);
			} else {
				infosWithoutAnnotationInSolution.add(ei);
			}
		}

		if (!infosWithAnnotationInSolution.isEmpty()) {
			infos.removeAll(infosWithoutAnnotationInSolution);
		}

		return infos;
	}

	private Stream<Signature> getAllRequiredServicesOfAdapter() {
		return this.getAllRequiredRolesOfAdapter().flatMap(eachRequRole -> FCCUtil.getSignaturesOfReferencedInterfaceBy(eachRequRole, this.visnetis, false));
	}

	private Stream<RequiredRole> getAllRequiredRolesOfAdapter() {
		return this.parent.getAdapterComponent().getRequiredRoles_InterfaceRequiringEntity().stream();
	}

	private ServiceEffectSpecification transformToAdaperSeffAndCheckForException(ServiceEffectSpecification seffToTransform) {
		try {
			return this.transformToAdapterSeff(seffToTransform);
		} catch (FCCWeaverException ex) {
			throw new RuntimeException(ex);
		}
	}

	private ServiceEffectSpecification transformToAdapterSeff(ServiceEffectSpecification seffToTransform) throws FCCWeaverException {
		ServiceEffectSpecification createdAdapterSeff = this.parent.getPCMSEFFManager().createServiceEffectSpecificationFor(seffToTransform.getDescribedService__SEFF());
		if (this.isAffected(seffToTransform.getDescribedService__SEFF())) {
			return this.parent.getPCMSEFFManager().addExternalCallActionPipeBy(this.createOrderedExternalCallActionPipeBy(seffToTransform), createdAdapterSeff);
		}
		return this.parent.getPCMSEFFManager().addExternalCallActionPipeBy(this.createOrdinaryPutThroughActionPipeBy(seffToTransform), createdAdapterSeff);
	}

	private boolean isAffected(Signature describedService) {
		return this.affected.contains(describedService);

	}

	private List<ExternalCallInfo> createOrdinaryPutThroughActionPipeBy(ServiceEffectSpecification seffToTransform) throws FCCWeaverException {
		return this.filterAccordingToOptionalAnnotations(Arrays.asList(this.getExternalCallInfoFrom(seffToTransform)));
	}

	private List<ExternalCallInfo> createOrderedExternalCallActionPipeBy(ServiceEffectSpecification seffToTransform) throws FCCWeaverException {
		List<ExternalCallInfo> externalCallInfos = new ArrayList<>();
		switch (((AdapterInclusion) this.inclusionMechanism).getAppears()) {
		case AFTER:
			externalCallInfos.add(this.getExternalCallInfoFrom(seffToTransform));
			externalCallInfos.addAll(this.getExternalCallInfosFrom(this.consumedFeautresOfECC, true));
			break;
		case BEFORE:
			externalCallInfos.addAll(this.getExternalCallInfosFrom(this.consumedFeautresOfECC, true));
			externalCallInfos.add(this.getExternalCallInfoFrom(seffToTransform));
			break;
		case AROUND:
			externalCallInfos.addAll(this.getExternalCallInfosFrom(this.consumedFeautresOfECC, true));
			externalCallInfos.add(this.getExternalCallInfoFrom(seffToTransform));
			externalCallInfos.addAll(this.getExternalCallInfosFrom(this.consumedFeautresOfECC, true));
			break;
		default:
			externalCallInfos.addAll(this.getExternalCallInfosFrom(this.consumedFeautresOfECC, true));
			externalCallInfos.add(this.getExternalCallInfoFrom(seffToTransform));
			break;
		}
		return this.filterAccordingToOptionalAnnotations(externalCallInfos);
	}

	private List<ExternalCallInfo> getExternalCallInfosFrom(List<ProvidedRole> consumedFeautresOfECC, boolean isInSolution) {
		return this.getAllRequiredRolesOfAdapterConnectedWith(consumedFeautresOfECC).flatMap(eachRequiredRole -> this.transformToExternalCallInfo(eachRequiredRole, isInSolution))
				.collect(Collectors.toList());
	}

	private Stream<RequiredRole> getAllRequiredRolesOfAdapterConnectedWith(List<ProvidedRole> consumedFeaturesOfECC) {
		return this.getAllRequiredRolesOfAdapter().filter(eachOperationRequiredRole -> this.existConnection(eachOperationRequiredRole, consumedFeaturesOfECC));
	}

	private boolean existConnection(RequiredRole requiredRole, List<ProvidedRole> providedRoles) {
		return providedRoles.stream().anyMatch(eachProvidedRole -> FCCUtil.referencesSameInterface(requiredRole, eachProvidedRole));
	}

	protected RequiredRole getRequiredRoleOfAdapterBy(Signature signature) throws FCCWeaverException {
		return this.getAllRequiredRolesOfAdapter().filter(eachRequiredRole -> FCCUtil.areEqual(FCCUtil.getInterfaceFrom(eachRequiredRole).get(), signature.eContainer())).findFirst()
				.orElseThrow(() -> new FCCWeaverException(ErrorMessage.missingRoleReferencing(signature, this.parent.getAdapterComponent())));
	}

	// At this stage there is no possibility to get the value characterizations
	// of input or output parameters of a given ECC.
	// TODO implement variable usage
	private Stream<ExternalCallInfo> transformToExternalCallInfo(RequiredRole requiredRole, boolean isInSolution) {
		return FCCUtil.getSignaturesOfReferencedInterfaceBy(requiredRole, this.visnetis, isInSolution).map(eachSignature -> new ExternalCallInfo(eachSignature, requiredRole));
	}

	protected List<SetVariableAction> getSetVariableActions(ServiceEffectSpecification seffToTransform) {
		List<SetVariableAction> setVariableActions = new ArrayList<>();
		TreeIterator<EObject> seffIterator = seffToTransform.eAllContents();
		while (seffIterator.hasNext()) {
			EObject current = seffIterator.next();
			if (current instanceof SetVariableAction) {
				setVariableActions.add((SetVariableAction) current);
			}
		}
		return setVariableActions;
	}

	private Optional<ExternalCallAction> getExternalCallActionInvoking(Signature calledService) throws FCCWeaverException {
		for (ServiceEffectSpecification eachSEFF : this.getCallingComponent().getServiceEffectSpecifications__BasicComponent()) {
			Optional<ExternalCallAction> externalCallAction = this.getExternalCallActionFrom(eachSEFF, calledService);
			if (externalCallAction.isPresent()) {
				return externalCallAction;
			}
		}
		return Optional.empty();
	}

	private Optional<ExternalCallAction> getExternalCallActionFrom(ServiceEffectSpecification seff, Signature calledService) {
		TreeIterator<EObject> iterator = seff.eAllContents();
		while (iterator.hasNext()) {
			EObject current = iterator.next();
			if (this.isExternalCallAction(current)) {
				ExternalCallAction extCallAction = (ExternalCallAction) current;
				if (FCCUtil.areEqual(calledService, extCallAction.getCalledService_ExternalService())) {
					return Optional.of(extCallAction);
				}
			}
		}
		return Optional.empty();
	}

	private boolean isExternalCallAction(EObject object) {
		return object instanceof ExternalCallAction;
	}

	protected List<VariableUsage> getInputVariableUsageIfServiceIsCalled(Signature calledService) throws FCCWeaverException {
		Optional<ExternalCallAction> ext = this.getExternalCallActionInvoking(calledService);
		if (ext.isPresent()) {
			return ext.get().getInputVariableUsages__CallAction();
		}
		return Collections.emptyList();
	}

	protected List<VariableUsage> getReturnVariableUsageIfServiceIsCalled(Signature calledService) throws FCCWeaverException {
		Optional<ExternalCallAction> ext = this.getExternalCallActionInvoking(calledService);
		if (ext.isPresent()) {
			return ext.get().getReturnVariableUsage__CallReturnAction();
		}
		return Collections.emptyList();
	}
}
