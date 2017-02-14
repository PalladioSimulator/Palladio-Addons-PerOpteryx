/**
 */
package strategyConfig;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Feature Config State</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see strategyConfig.ConcernconfigPackage#getFeatureConfigState()
 * @model
 * @generated
 */
public final class FeatureConfigState extends AbstractEnumerator {
	/**
	 * The '<em><b>NOT SET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NOT SET</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOT_SET_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NOT_SET = 0;

	/**
	 * The '<em><b>OVERRIDE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OVERRIDE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OVERRIDE_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OVERRIDE = 1;

	/**
	 * The '<em><b>DEFAULT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DEFAULT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEFAULT_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DEFAULT = 2;

	/**
	 * The '<em><b>NOT SET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_SET
	 * @generated
	 * @ordered
	 */
	public static final FeatureConfigState NOT_SET_LITERAL = new FeatureConfigState(NOT_SET, "NOT_SET", "NOT_SET");

	/**
	 * The '<em><b>OVERRIDE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OVERRIDE
	 * @generated
	 * @ordered
	 */
	public static final FeatureConfigState OVERRIDE_LITERAL = new FeatureConfigState(OVERRIDE, "OVERRIDE", "OVERRIDE");

	/**
	 * The '<em><b>DEFAULT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEFAULT
	 * @generated
	 * @ordered
	 */
	public static final FeatureConfigState DEFAULT_LITERAL = new FeatureConfigState(DEFAULT, "DEFAULT", "DEFAULT");

	/**
	 * An array of all the '<em><b>Feature Config State</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FeatureConfigState[] VALUES_ARRAY =
		new FeatureConfigState[] {
			NOT_SET_LITERAL,
			OVERRIDE_LITERAL,
			DEFAULT_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Feature Config State</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Feature Config State</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FeatureConfigState get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FeatureConfigState result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Feature Config State</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FeatureConfigState getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FeatureConfigState result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Feature Config State</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FeatureConfigState get(int value) {
		switch (value) {
			case NOT_SET: return NOT_SET_LITERAL;
			case OVERRIDE: return OVERRIDE_LITERAL;
			case DEFAULT: return DEFAULT_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private FeatureConfigState(int value, String name, String literal) {
		super(value, name, literal);
	}

} //FeatureConfigState
