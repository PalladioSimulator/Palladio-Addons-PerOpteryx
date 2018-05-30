/**
 */
package strategyConfig;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * External container for default and overrides config
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link strategyConfig.Configuration#getDefaultConfig <em>Default Config</em>}</li>
 *   <li>{@link strategyConfig.Configuration#getName <em>Name</em>}</li>
 *   <li>{@link strategyConfig.Configuration#getConfigOverrides <em>Config Overrides</em>}</li>
 * </ul>
 *
 * @see strategyConfig.ConcernconfigPackage#getConfiguration()
 * @model
 * @generated
 */
public interface Configuration extends EObject {
	/**
	 * Returns the value of the '<em><b>Default Config</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link strategyConfig.FeatureConfig#getConfigurationDefault <em>Configuration Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Config</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Config</em>' containment reference.
	 * @see #setDefaultConfig(FeatureConfig)
	 * @see strategyConfig.ConcernconfigPackage#getConfiguration_DefaultConfig()
	 * @see strategyConfig.FeatureConfig#getConfigurationDefault
	 * @model opposite="configurationDefault" containment="true" required="true" ordered="false"
	 * @generated
	 */
	FeatureConfig getDefaultConfig();

	/**
	 * Sets the value of the '{@link strategyConfig.Configuration#getDefaultConfig <em>Default Config</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Config</em>' containment reference.
	 * @see #getDefaultConfig()
	 * @generated
	 */
	void setDefaultConfig(FeatureConfig value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see strategyConfig.ConcernconfigPackage#getConfiguration_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link strategyConfig.Configuration#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Config Overrides</b></em>' containment reference list.
	 * The list contents are of type {@link strategyConfig.FeatureConfig}.
	 * It is bidirectional and its opposite is '{@link strategyConfig.FeatureConfig#getConfigurationOverrides <em>Configuration Overrides</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Config Overrides</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config Overrides</em>' containment reference list.
	 * @see strategyConfig.ConcernconfigPackage#getConfiguration_ConfigOverrides()
	 * @see strategyConfig.FeatureConfig#getConfigurationOverrides
	 * @model type="strategyConfig.FeatureConfig" opposite="configurationOverrides" containment="true" ordered="false"
	 * @generated
	 */
	EList getConfigOverrides();

} // Configuration
