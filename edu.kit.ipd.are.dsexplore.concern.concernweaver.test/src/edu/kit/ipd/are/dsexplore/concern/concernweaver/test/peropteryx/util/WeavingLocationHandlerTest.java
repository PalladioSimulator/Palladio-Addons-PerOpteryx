package edu.kit.ipd.are.dsexplore.concern.concernweaver.test.peropteryx.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;
import org.palladiosimulator.pcm.core.composition.AssemblyConnector;
import org.palladiosimulator.pcm.repository.Interface;
import org.palladiosimulator.pcm.repository.OperationInterface;
import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.repository.OperationRequiredRole;
import org.palladiosimulator.pcm.repository.ProvidedRole;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.repository.RequiredRole;
import org.palladiosimulator.pcm.repository.Signature;

import ConcernModel.AnnotationTarget;
import ConcernModel.ConcernModelFactory;
import ConcernModel.JoinPoint;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingLocation;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingLocationHandler;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.test.util.WeavingTest;

public class WeavingLocationHandlerTest extends WeavingTest{
	
	private final static String COMPONENT_MEDIA_ACCESS_ID = "_9eK7YHDrEeSqnN80MQ2uGw";
	private final static int TOTAL_COUNT_INTERFACE_WEAVING_INSTRUCTIONS = 3;
	private final static int TOTAL_COUNT_PROVIDED_INTERFACE_WEAVING_INSTRUCTIONS = 2;
	private final static int TOTAL_COUNT_REQUIRED_INTERFACE_WEAVING_INSTRUCTIONS = 1;
	private final static int TOTAL_COUNT_SIGNATURE_WEAVING_INSTRUCTIONS = 1;
	
	private RepositoryComponent component;
	private AnnotationTarget targetAnnotation;
	private JoinPoint joinPoint;
	
	private List<WeavingLocation> weavingLocations;
	
	@Test
	public void testGetWeavingLocationWithInterfaceJoinPoint() {
		
		givenComponentWithCorrespondingAnnotationAndInterfaceJoinPoint();
		whenGettingWeavingLocations();
		thenWeavingLocationShouldContaintAllInterfaceRelevantInformations();
		
	}
	
	@Test
	public void testGetWeavingLocationWithProvidedInterfaceJoinPoint() {
		
		givenComponentWithCorrespondingAnnotationAndProvidedInterfaceJoinPoint();
		whenGettingWeavingLocations();
		thenWeavingLocationShouldContaintAllProvidedInterfaceRelevantInformations();
		
	}
	
	@Test
	public void testGetWeavingLocationWithRequiredInterfaceJoinPoint() {
		
		givenComponentWithCorrespondingAnnotationAndRequiredInterfaceJoinPoint();
		whenGettingWeavingLocations();
		thenWeavingLocationShouldContaintAllRequiredInterfaceRelevantInformations();
		
	}
	
	@Test
	public void testGetWeavingLocationWithSignatureJoinPoint() {
		
		givenComponentWithCorrespondingAnnotationAndSignatureJoinPoint();
		whenGettingWeavingLocations();
		thenWeavingLocationShouldContaintAllSignatureRelevantInformations();
		
	}

	private void givenComponentWithCorrespondingAnnotationAndInterfaceJoinPoint() {
		
		initializeTestWith(JoinPoint.INTERFACE, new ArrayList<Signature>());
		
	}
	
	private void givenComponentWithCorrespondingAnnotationAndProvidedInterfaceJoinPoint() {
		
		initializeTestWith(JoinPoint.INTERFACE_PROVIDES, new ArrayList<Signature>());
		
	}
	
	private void givenComponentWithCorrespondingAnnotationAndRequiredInterfaceJoinPoint() {
		
		initializeTestWith(JoinPoint.INTERFACE_REQUIRES, new ArrayList<Signature>());
		
	}
	
	private void givenComponentWithCorrespondingAnnotationAndSignatureJoinPoint() {
		
		initializeTestWith(JoinPoint.SIGNATURE, getTestSignatures());
		
	}

	private void whenGettingWeavingLocations() {
		
		try {
			
			this.weavingLocations = new WeavingLocationHandler(pcmToAdapt).getWeavingLocationFrom(this.component, this.targetAnnotation);
			
		} catch (Exception e) {
			
			fail("Test failed because of: " + e.getMessage());
			
		}
		
	}

	private void thenWeavingLocationShouldContaintAllInterfaceRelevantInformations() {
		
		shouldHaveExpectedCount(TOTAL_COUNT_INTERFACE_WEAVING_INSTRUCTIONS);
		shouldHaveExpectedConnectors();
		shouldHaveExpectedSignatures(getSignaturesOf(this.component));
		
	}
	
	private void thenWeavingLocationShouldContaintAllProvidedInterfaceRelevantInformations() {
		
		shouldHaveExpectedCount(TOTAL_COUNT_PROVIDED_INTERFACE_WEAVING_INSTRUCTIONS);
		shouldHaveExpectedConnectors();
		shouldHaveExpectedSignatures(getProvidedSignaturesOf(this.component));
		
	}
	
	private void thenWeavingLocationShouldContaintAllRequiredInterfaceRelevantInformations() {
		
		shouldHaveExpectedCount(TOTAL_COUNT_REQUIRED_INTERFACE_WEAVING_INSTRUCTIONS);
		shouldHaveExpectedConnectors();
		shouldHaveExpectedSignatures(getRequiredSignaturesOf(this.component));
		
	}
	
	private void thenWeavingLocationShouldContaintAllSignatureRelevantInformations() {
		
		shouldHaveExpectedCount(TOTAL_COUNT_SIGNATURE_WEAVING_INSTRUCTIONS);
		shouldHaveExpectedConnectors();
		shouldHaveExpectedSignatures(getRequiredSignaturesOf(this.component));
		
	}
	
	private void shouldHaveExpectedCount(int expectedCount) {
		
		assertEquals(expectedCount, this.weavingLocations.size());
		
	}

	private void shouldHaveExpectedConnectors() {
		
		this.weavingLocations.forEach(weavingLocation -> {
			
			assertTrue(weavingLocation.getLocation() instanceof AssemblyConnector);
			
		});
		
	}

	private void shouldHaveExpectedSignatures(List<Signature> expectedSignatures) {
		
		this.weavingLocations.forEach(weavingLocation -> expectedSignatures.removeAll(weavingLocation.getAffectedSignatures()));
		
		assertTrue(expectedSignatures.size() == 0);
		
	}

	private void initializeTestWith(JoinPoint joinPoint, List<Signature> signatures) {
		
		setJoinPoint(joinPoint);
		initializeComponent();
		initializeAnnotationTarget(signatures);
		
	}
	
	private List<Signature> getSignaturesOf(RepositoryComponent component) {
		
		return getSignaturesFrom(getInterfacesFrom(component));
		
	}
	
	private List<Signature> getProvidedSignaturesOf(RepositoryComponent component) {
		
		return getSignaturesFrom(getProvidedInterfacesFrom(component.getProvidedRoles_InterfaceProvidingEntity()));
		
	}
	
	private List<Signature> getRequiredSignaturesOf(RepositoryComponent component) {
		
		return getSignaturesFrom(getRequiredInterfacesFrom(component.getRequiredRoles_InterfaceRequiringEntity()));
		
	}
	
	private List<Signature> getSignaturesFrom(Stream<Interface> interfaces) {
		
		return interfaces.filter(each -> each instanceof OperationInterface)
	   					 .flatMap(each -> ((OperationInterface) each).getSignatures__OperationInterface().stream())
	   					 .collect(Collectors.toList());
		
	}
	
	private Stream<Interface> getInterfacesFrom(RepositoryComponent component) {
		
		return Stream.concat(getProvidedInterfacesFrom(component.getProvidedRoles_InterfaceProvidingEntity()),
				 			 getRequiredInterfacesFrom(component.getRequiredRoles_InterfaceRequiringEntity()));
		
	}

	private Stream<Interface> getRequiredInterfacesFrom(List<RequiredRole> requiredRoles) {
		
		return requiredRoles.stream().filter(each -> each instanceof OperationRequiredRole)
									 .map(each -> ((OperationRequiredRole) each).getRequiredInterface__OperationRequiredRole());
		
	}

	private Stream<Interface> getProvidedInterfacesFrom(List<ProvidedRole> providedRoles) {
		
		return providedRoles.stream().filter(each -> each instanceof OperationProvidedRole)
				 					 .map(each -> ((OperationProvidedRole) each).getProvidedInterface__OperationProvidedRole());
		
	}
	
	private List<Signature> getTestSignatures() {
		
		return getRequiredSignaturesOf(getTestComponent());
		
	}

	private void initializeComponent() {
		
		this.component = getTestComponent();
		
	}

	private RepositoryComponent getTestComponent() {

		return pcmToAdapt.getRepositories().get(0).getComponents__Repository().stream().filter(eachComp -> eachComp.getId().equals(COMPONENT_MEDIA_ACCESS_ID))
				 																	   .findFirst().get();
		
	}

	private void initializeAnnotationTarget(List<Signature> signatures) {
		
		this.targetAnnotation = ConcernModelFactory.eINSTANCE.createAnnotationTarget();
		this.targetAnnotation.setJoinPoint(this.joinPoint);
		this.targetAnnotation.getSignatures().addAll(signatures);
		
	}

	private void setJoinPoint(JoinPoint joinPoint) {
		
		this.joinPoint = joinPoint;
		
	}

}
