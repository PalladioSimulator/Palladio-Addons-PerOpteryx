package edu.kit.ipd.are.dsexplore.concern.concernweaver.test.peropteryx.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.emf.ecore.EObject;
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
	private final static String PROVIDED_ROLE_MEDIA_ACCESS_ID = "_z2B7cHD2EeSA4fySuX9I2Q";
	private final static int TOTAL_COUNT_INTERFACE_WEAVING_INSTRUCTIONS = 3;
	private final static int TOTAL_COUNT_PROVIDED_INTERFACE_WEAVING_INSTRUCTIONS = 2;
	private final static int TOTAL_COUNT_REQUIRED_INTERFACE_WEAVING_INSTRUCTIONS = 1;
	private final static int TOTAL_COUNT_SIGNATURE_WEAVING_INSTRUCTIONS = 1;
	
	private EObject annotatedObject;
	private AnnotationTarget targetAnnotation;
	private JoinPoint joinPoint;
	
	private List<WeavingLocation> result;
	
	@Test
	public void testGetWeavingLocationWithInterfaceJoinPoint() {
		
		givenComponentWithCorrespondingAnnotationAndInterfaceJoinPoint();
		whenExtractingWeavingLocations();
		thenWeavingLocationShouldContaintAllInterfaceRelevantInformations();
		
	}
	
	@Test
	public void testGetWeavingLocationWithProvidedInterfaceJoinPoint() {
		
		givenComponentWithCorrespondingAnnotationAndProvidedInterfaceJoinPoint();
		whenExtractingWeavingLocations();
		thenWeavingLocationShouldContaintAllProvidedInterfaceRelevantInformations();
		
	}
	
	@Test
	public void testGetWeavingLocationWithRequiredInterfaceJoinPoint() {
		
		givenComponentWithCorrespondingAnnotationAndRequiredInterfaceJoinPoint();
		whenExtractingWeavingLocations();
		thenWeavingLocationShouldContaintAllRequiredInterfaceRelevantInformations();
		
	}
	
	@Test
	public void testGetWeavingLocationWithSignatureJoinPoint() {
		
		givenSignatureWithCorrespondingAnnotationAndSignatureJoinPoint();
		whenExtractingWeavingLocations();
		thenWeavingLocationShouldContaintAllSignatureRelevantInformations();
		
	}

	private void givenComponentWithCorrespondingAnnotationAndInterfaceJoinPoint() {
		
		initializeTestWith(JoinPoint.INTERFACE);
		
	}
	
	private void givenComponentWithCorrespondingAnnotationAndProvidedInterfaceJoinPoint() {
		
		initializeTestWith(JoinPoint.INTERFACE_PROVIDES);
		
	}
	
	private void givenComponentWithCorrespondingAnnotationAndRequiredInterfaceJoinPoint() {
		
		initializeTestWith(JoinPoint.INTERFACE_REQUIRES);
		
	}
	
	private void givenSignatureWithCorrespondingAnnotationAndSignatureJoinPoint() {
		
		initializeTestWith(JoinPoint.SIGNATURE);
		
	}

	private void whenExtractingWeavingLocations() {
		
		try {
			
			this.result = new WeavingLocationHandler(pcmToAdapt).getWeavingLocationsFrom(Arrays.asList(this.annotatedObject), this.targetAnnotation);
			
		} catch (Exception e) {
			
			fail("Test failed because of: " + e.getMessage());
			
		}
		
	}

	private void thenWeavingLocationShouldContaintAllInterfaceRelevantInformations() {
		
		shouldHaveExpectedCount(TOTAL_COUNT_INTERFACE_WEAVING_INSTRUCTIONS);
		shouldHaveExpectedConnectors();
		shouldHaveExpectedSignatures(getSignaturesOf((RepositoryComponent) this.annotatedObject));
		
	}
	
	private void thenWeavingLocationShouldContaintAllProvidedInterfaceRelevantInformations() {
		
		shouldHaveExpectedCount(TOTAL_COUNT_PROVIDED_INTERFACE_WEAVING_INSTRUCTIONS);
		shouldHaveExpectedConnectors();
		shouldHaveExpectedSignatures(getProvidedSignaturesOf((RepositoryComponent) this.annotatedObject));
		
	}
	
	private void thenWeavingLocationShouldContaintAllRequiredInterfaceRelevantInformations() {
		
		shouldHaveExpectedCount(TOTAL_COUNT_REQUIRED_INTERFACE_WEAVING_INSTRUCTIONS);
		shouldHaveExpectedConnectors();
		shouldHaveExpectedSignatures(getRequiredSignaturesOf((RepositoryComponent) this.annotatedObject));
		
	}
	
	private void thenWeavingLocationShouldContaintAllSignatureRelevantInformations() {
		
		shouldHaveExpectedCount(TOTAL_COUNT_SIGNATURE_WEAVING_INSTRUCTIONS);
		shouldHaveExpectedConnectors();
		shouldHaveExpectedSignatures(Arrays.asList((Signature) this.annotatedObject));
		
	}
	
	private void shouldHaveExpectedCount(int expectedCount) {
		
		assertEquals(expectedCount, this.result.size());
		
	}

	private void shouldHaveExpectedConnectors() {
		
		this.result.forEach(weavingLocation -> {
			
			assertTrue(weavingLocation.getLocation() instanceof AssemblyConnector);
			
		});
		
	}

	private void shouldHaveExpectedSignatures(List<Signature> expectedSignatures) {
		
		this.result.forEach(weavingLocation -> expectedSignatures.removeAll(weavingLocation.getAffectedSignatures()));
		
		assertTrue(expectedSignatures.isEmpty());
		
	}

	private void initializeTestWith(JoinPoint joinPoint) {
		
		setJoinPoint(joinPoint);
		initializeAnnotatedObjectBy(joinPoint);
		initializeAnnotationTarget();
		
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

	private void initializeAnnotatedObjectBy(JoinPoint joinPoint) {

		if (joinPoint.equals(JoinPoint.SIGNATURE)) {
			
			initializeSignature();
			
		} else {
			
			initializeComponent();
			
		}
		
	}
	
	private void initializeComponent() {
		
		this.annotatedObject = getTestComponent();
		
	}
	
	private void initializeSignature() {
		
		this.annotatedObject = getTestSignature();
		
	}

	private RepositoryComponent getTestComponent() {

		return pcmToAdapt.getRepositories().get(0).getComponents__Repository().stream().filter(eachComp -> eachComp.getId().equals(COMPONENT_MEDIA_ACCESS_ID))
				 																	   .findFirst().get();
		
	}
	
	private Signature getTestSignature() {

		return getTestComponent().getProvidedRoles_InterfaceProvidingEntity().stream().filter(each -> each.getId().equals(PROVIDED_ROLE_MEDIA_ACCESS_ID))
																					  .map(each -> getFirstSignatureOf((OperationProvidedRole) each))
																					  .findFirst().get();
		
	}
	
	private Signature getFirstSignatureOf(OperationProvidedRole providedRole) {
		
		return providedRole.getProvidedInterface__OperationProvidedRole().getSignatures__OperationInterface().get(0);
		
	}

	private void initializeAnnotationTarget() {
		
		this.targetAnnotation = createTestAnnotationTarget();
		
	}

	private AnnotationTarget createTestAnnotationTarget() {
		
		AnnotationTarget target = ConcernModelFactory.eINSTANCE.createAnnotationTarget();
		target.setJoinPoint(this.joinPoint);
		return target;
		
	}

	private void setJoinPoint(JoinPoint joinPoint) {
		
		this.joinPoint = joinPoint;
		
	}

}
