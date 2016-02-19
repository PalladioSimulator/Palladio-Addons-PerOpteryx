/**
 */
package de.uka.ipd.sdq.pcm.designdecision.qualityproperties.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import de.uka.ipd.sdq.pcm.designdecision.qualityproperties.ConfidenceInterval;
import de.uka.ipd.sdq.pcm.designdecision.qualityproperties.DoubleQualityProperty;
import de.uka.ipd.sdq.pcm.designdecision.qualityproperties.ElementQualityProperty;
import de.uka.ipd.sdq.pcm.designdecision.qualityproperties.IntegerQualityProperty;
import de.uka.ipd.sdq.pcm.designdecision.qualityproperties.NumericQualityProperty;
import de.uka.ipd.sdq.pcm.designdecision.qualityproperties.QualityPrediction;
import de.uka.ipd.sdq.pcm.designdecision.qualityproperties.QualityProperty;
import de.uka.ipd.sdq.pcm.designdecision.qualityproperties.qualitypropertiesPackage;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides an adapter
 * <code>createXXX</code> method for each class of the model. <!-- end-user-doc -->
 * @see de.uka.ipd.sdq.pcm.designdecision.qualityproperties.qualitypropertiesPackage
 * @generated
 */
public class qualitypropertiesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected static qualitypropertiesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public qualitypropertiesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = qualitypropertiesPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc
	 * --> This implementation returns <code>true</code> if the object is either the model's package
	 * or is an instance object of the model. <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected qualitypropertiesSwitch<Adapter> modelSwitch = new qualitypropertiesSwitch<Adapter>() {
		@Override
		public Adapter caseNumericQualityProperty(NumericQualityProperty object) {
			return createNumericQualityPropertyAdapter();
		}

		@Override
		public Adapter caseConfidenceInterval(ConfidenceInterval object) {
			return createConfidenceIntervalAdapter();
		}

		@Override
		public Adapter caseElementQualityProperty(ElementQualityProperty object) {
			return createElementQualityPropertyAdapter();
		}

		@Override
		public Adapter caseIntegerQualityProperty(IntegerQualityProperty object) {
			return createIntegerQualityPropertyAdapter();
		}

		@Override
		public Adapter caseDoubleQualityProperty(DoubleQualityProperty object) {
			return createDoubleQualityPropertyAdapter();
		}

		@Override
		public Adapter caseQualityPrediction(QualityPrediction object) {
			return createQualityPredictionAdapter();
		}

		@Override
		public Adapter caseQualityProperty(QualityProperty object) {
			return createQualityPropertyAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.qualityproperties.NumericQualityProperty <em>Numeric Quality Property</em>}'.
	 * <!-- begin-user-doc --> This default implementation
	* returns null so that we can easily ignore cases; it's useful to ignore a case when
	* inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.qualityproperties.NumericQualityProperty
	 * @generated
	 */
	public Adapter createNumericQualityPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.qualityproperties.ConfidenceInterval <em>Confidence Interval</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns
	* null so that we can easily ignore cases; it's useful to ignore a case when inheritance will
	* catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.qualityproperties.ConfidenceInterval
	 * @generated
	 */
	public Adapter createConfidenceIntervalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.qualityproperties.ElementQualityProperty <em>Element Quality Property</em>}'.
	 * <!-- begin-user-doc --> This default implementation
	* returns null so that we can easily ignore cases; it's useful to ignore a case when
	* inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.qualityproperties.ElementQualityProperty
	 * @generated
	 */
	public Adapter createElementQualityPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.qualityproperties.IntegerQualityProperty <em>Integer Quality Property</em>}'.
	 * <!-- begin-user-doc --> This default implementation
	* returns null so that we can easily ignore cases; it's useful to ignore a case when
	* inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.qualityproperties.IntegerQualityProperty
	 * @generated
	 */
	public Adapter createIntegerQualityPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.qualityproperties.DoubleQualityProperty <em>Double Quality Property</em>}'.
	 * <!-- begin-user-doc --> This default implementation
	* returns null so that we can easily ignore cases; it's useful to ignore a case when
	* inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.qualityproperties.DoubleQualityProperty
	 * @generated
	 */
	public Adapter createDoubleQualityPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.qualityproperties.QualityPrediction <em>Quality Prediction</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns
	* null so that we can easily ignore cases; it's useful to ignore a case when inheritance will
	* catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.qualityproperties.QualityPrediction
	 * @generated
	 */
	public Adapter createQualityPredictionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.qualityproperties.QualityProperty <em>Quality Property</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null
	* so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch
	* all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.qualityproperties.QualityProperty
	 * @generated
	 */
	public Adapter createQualityPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc --> This default
	* implementation returns null. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} // qualitypropertiesAdapterFactory
