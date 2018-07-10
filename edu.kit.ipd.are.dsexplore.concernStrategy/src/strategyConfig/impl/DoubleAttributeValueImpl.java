/**
 */
package strategyConfig.impl;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectValidator;

import strategyConfig.ConcernconfigPackage;
import strategyConfig.DoubleAttributeValue;

import strategyConfig.util.ConcernconfigValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Double Attribute Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DoubleAttributeValueImpl extends AttributeValueImpl implements DoubleAttributeValue {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DoubleAttributeValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ConcernconfigPackage.Literals.DOUBLE_ATTRIBUTE_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean AttributeValueIsDefinedInFeatureAndEqualsTypeDouble(DiagnosticChain diagnostics, Map context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConcernconfigValidator.DIAGNOSTIC_SOURCE,
						 ConcernconfigValidator.DOUBLE_ATTRIBUTE_VALUE__ATTRIBUTE_VALUE_IS_DEFINED_IN_FEATURE_AND_EQUALS_TYPE_DOUBLE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AttributeValueIsDefinedInFeatureAndEqualsTypeDouble", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

} //DoubleAttributeValueImpl
