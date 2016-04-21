/**
 */
package de.uka.ipd.sdq.pcm.designdecision.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import de.uka.ipd.sdq.pcm.designdecision.Candidate;
import de.uka.ipd.sdq.pcm.designdecision.Candidates;
import de.uka.ipd.sdq.pcm.designdecision.ClassChoice;
import de.uka.ipd.sdq.pcm.designdecision.ContinousRangeChoice;
import de.uka.ipd.sdq.pcm.designdecision.DecisionSpace;
import de.uka.ipd.sdq.pcm.designdecision.DegreeOfFreedomInstance;
import de.uka.ipd.sdq.pcm.designdecision.DiscreteRangeChoice;
import de.uka.ipd.sdq.pcm.designdecision.designdecisionFactory;
import de.uka.ipd.sdq.pcm.designdecision.designdecisionPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 *
 * @generated
 */
public class designdecisionFactoryImpl extends EFactoryImpl implements designdecisionFactory {
    /**
     * Creates the default factory implementation. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static designdecisionFactory init() {
        try {
            final designdecisionFactory thedesigndecisionFactory = (designdecisionFactory) EPackage.Registry.INSTANCE
                    .getEFactory(designdecisionPackage.eNS_URI);
            if (thedesigndecisionFactory != null) {
                return thedesigndecisionFactory;
            }
        } catch (final Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new designdecisionFactoryImpl();
    }

    /**
     * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public designdecisionFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EObject create(final EClass eClass) {
        switch (eClass.getClassifierID()) {
        case designdecisionPackage.DISCRETE_RANGE_CHOICE:
            return this.createDiscreteRangeChoice();
        case designdecisionPackage.DEGREE_OF_FREEDOM_INSTANCE:
            return this.createDegreeOfFreedomInstance();
        case designdecisionPackage.CLASS_CHOICE:
            return this.createClassChoice();
        case designdecisionPackage.CONTINOUS_RANGE_CHOICE:
            return this.createContinousRangeChoice();
        case designdecisionPackage.DECISION_SPACE:
            return this.createDecisionSpace();
        case designdecisionPackage.CANDIDATE:
            return this.createCandidate();
        case designdecisionPackage.CANDIDATES:
            return this.createCandidates();
        default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public DiscreteRangeChoice createDiscreteRangeChoice() {
        final DiscreteRangeChoiceImpl discreteRangeChoice = new DiscreteRangeChoiceImpl();
        return discreteRangeChoice;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public DegreeOfFreedomInstance createDegreeOfFreedomInstance() {
        final DegreeOfFreedomInstanceImpl degreeOfFreedomInstance = new DegreeOfFreedomInstanceImpl();
        return degreeOfFreedomInstance;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ClassChoice createClassChoice() {
        final ClassChoiceImpl classChoice = new ClassChoiceImpl();
        return classChoice;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ContinousRangeChoice createContinousRangeChoice() {
        final ContinousRangeChoiceImpl continousRangeChoice = new ContinousRangeChoiceImpl();
        return continousRangeChoice;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public DecisionSpace createDecisionSpace() {
        final DecisionSpaceImpl decisionSpace = new DecisionSpaceImpl();
        return decisionSpace;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Candidate createCandidate() {
        final CandidateImpl candidate = new CandidateImpl();
        return candidate;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Candidates createCandidates() {
        final CandidatesImpl candidates = new CandidatesImpl();
        return candidates;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public designdecisionPackage getdesigndecisionPackage() {
        return (designdecisionPackage) this.getEPackage();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @deprecated
     * @generated
     */
    @Deprecated
    public static designdecisionPackage getPackage() {
        return designdecisionPackage.eINSTANCE;
    }

} // designdecisionFactoryImpl
