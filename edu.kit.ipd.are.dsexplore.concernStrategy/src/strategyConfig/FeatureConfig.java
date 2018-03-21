/**
 */
package strategyConfig;

import concernStrategy.FeatureDiagram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link strategyConfig.FeatureConfig#getFeatureConfigState <em>Feature Config State</em>}</li>
 *   <li>{@link strategyConfig.FeatureConfig#getConfignode <em>Confignode</em>}</li>
 *   <li>{@link strategyConfig.FeatureConfig#getAnnotatedElement <em>Annotated Element</em>}</li>
 *   <li>{@link strategyConfig.FeatureConfig#getConfigurationOverrides <em>Configuration Overrides</em>}</li>
 *   <li>{@link strategyConfig.FeatureConfig#getConfigurationDefault <em>Configuration Default</em>}</li>
 * </ul>
 *
 * @see strategyConfig.ConcernconfigPackage#getFeatureConfig()
 * @model
 * @generated
 */
public interface FeatureConfig extends EObject {
	/**
	 * Returns the value of the '<em><b>Feature Config State</b></em>' attribute.
	 * The default value is <code>"NOT_SET"</code>.
	 * The literals are from the enumeration {@link strategyConfig.FeatureConfigState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>
	 *     <span
	 *     style="WIDOWS: 2; TEXT-TRANSFORM: none; TEXT-INDENT: 0px; BORDER-COLLAPSE: separate; FONT: medium 'Times New Roman'; WHITE-SPACE: normal; ORPHANS: 2; LETTER-SPACING: normal; COLOR: rgb(0,0,0); WORD-SPACING: 0px; -webkit-border-horizontal-spacing: 0px; -webkit-border-vertical-spacing: 0px; -webkit-text-decorations-in-effect: none; -webkit-text-size-adjust: auto; -webkit-text-stroke-width: 0px"
	 *      class="Apple-style-span"><span
	 *     style="LINE-HEIGHT: 16px; FONT-FAMILY: Verdana, Arial, Helvetica, sans-serif; FONT-SIZE: 11px"
	 *     class="Apple-style-span">Returns the result of showFeatureConfigState()</span></span>
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Feature Config State</em>' attribute.
	 * @see strategyConfig.FeatureConfigState
	 * @see #setFeatureConfigState(FeatureConfigState)
	 * @see strategyConfig.ConcernconfigPackage#getFeatureConfig_FeatureConfigState()
	 * @model default="NOT_SET" required="true" ordered="false"
	 * @generated
	 */
	FeatureConfigState getFeatureConfigState();

	/**
	 * Sets the value of the '{@link strategyConfig.FeatureConfig#getFeatureConfigState <em>Feature Config State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Config State</em>' attribute.
	 * @see strategyConfig.FeatureConfigState
	 * @see #getFeatureConfigState()
	 * @generated
	 */
	void setFeatureConfigState(FeatureConfigState value);

	/**
	 * Returns the value of the '<em><b>Confignode</b></em>' containment reference list.
	 * The list contents are of type {@link strategyConfig.ConfigNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Confignode</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confignode</em>' containment reference list.
	 * @see strategyConfig.ConcernconfigPackage#getFeatureConfig_Confignode()
	 * @model type="strategyConfig.ConfigNode" containment="true" ordered="false"
	 * @generated
	 */
	EList getConfignode();

	/**
	 * Returns the value of the '<em><b>Annotated Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotated Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotated Element</em>' reference.
	 * @see #setAnnotatedElement(FeatureDiagram)
	 * @see strategyConfig.ConcernconfigPackage#getFeatureConfig_AnnotatedElement()
	 * @model ordered="false"
	 * @generated
	 */
	FeatureDiagram getAnnotatedElement();

	/**
	 * Sets the value of the '{@link strategyConfig.FeatureConfig#getAnnotatedElement <em>Annotated Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotated Element</em>' reference.
	 * @see #getAnnotatedElement()
	 * @generated
	 */
	void setAnnotatedElement(FeatureDiagram value);

	/**
	 * Returns the value of the '<em><b>Configuration Overrides</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link strategyConfig.Configuration#getConfigOverrides <em>Config Overrides</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration Overrides</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration Overrides</em>' container reference.
	 * @see #setConfigurationOverrides(Configuration)
	 * @see strategyConfig.ConcernconfigPackage#getFeatureConfig_ConfigurationOverrides()
	 * @see strategyConfig.Configuration#getConfigOverrides
	 * @model opposite="configOverrides" transient="false" ordered="false"
	 * @generated
	 */
	Configuration getConfigurationOverrides();

	/**
	 * Sets the value of the '{@link strategyConfig.FeatureConfig#getConfigurationOverrides <em>Configuration Overrides</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration Overrides</em>' container reference.
	 * @see #getConfigurationOverrides()
	 * @generated
	 */
	void setConfigurationOverrides(Configuration value);

	/**
	 * Returns the value of the '<em><b>Configuration Default</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link strategyConfig.Configuration#getDefaultConfig <em>Default Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration Default</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration Default</em>' container reference.
	 * @see #setConfigurationDefault(Configuration)
	 * @see strategyConfig.ConcernconfigPackage#getFeatureConfig_ConfigurationDefault()
	 * @see strategyConfig.Configuration#getDefaultConfig
	 * @model opposite="defaultConfig" transient="false" ordered="false"
	 * @generated
	 */
	Configuration getConfigurationDefault();

	/**
	 * Sets the value of the '{@link strategyConfig.FeatureConfig#getConfigurationDefault <em>Configuration Default</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration Default</em>' container reference.
	 * @see #getConfigurationDefault()
	 * @generated
	 */
	void setConfigurationDefault(Configuration value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>
	 *     <span
	 *     style="WIDOWS: 2; TEXT-TRANSFORM: none; TEXT-INDENT: 0px; BORDER-COLLAPSE: separate; FONT: medium 'Times New Roman'; WHITE-SPACE: normal; ORPHANS: 2; LETTER-SPACING: normal; COLOR: rgb(0,0,0); WORD-SPACING: 0px; -webkit-border-horizontal-spacing: 0px; -webkit-border-vertical-spacing: 0px; -webkit-text-decorations-in-effect: none; -webkit-text-size-adjust: auto; -webkit-text-stroke-width: 0px"
	 *      class="Apple-style-span"><span
	 *     style="LINE-HEIGHT: 16px; FONT-FAMILY: Verdana, Arial, Helvetica, sans-serif; FONT-SIZE: 11px"
	 *     class="Apple-style-span">The FeatureConfigState of a FeatureConfig is DEFAULT, if the FeatureConfig equals its
	 *     configurationDefault.defaultConfig. It is OVERRIDE, if it is included in its configurationOverrides.configOverrides. If
	 *     neither of these conditions applies, the FeatureConfigState is NOT_SET</span></span>
	 * </p>
	 * if (configurationDefault->size() = 1 and configurationDefault.defaultConfig = self) then FeatureConfigState::DEFAULT
	 *  else (
	 *  if (configurationOverrides->size() = 1 and configurationOverrides.configOverrides->size() > 0 and configurationOverrides.configOverrides->includes(self)) then FeatureConfigState::OVERRIDE
	 *  else FeatureConfigState::NOT_SET
	 *  endif
	 *  ) endif
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if (configurationDefault-&gt;size() = 1 and configurationDefault.defaultConfig = self) then FeatureConfigState::DEFAULT\r\n else (\r\n if (configurationOverrides-&gt;size() = 1 and configurationOverrides.configOverrides-&gt;size() &gt; 0 and configurationOverrides.configOverrides-&gt;includes(self)) then FeatureConfigState::OVERRIDE\r\n else FeatureConfigState::NOT_SET\r\n endif\r\n ) endif'"
	 * @generated
	 */
	FeatureConfigState showFeatureConfigState();

} // FeatureConfig
