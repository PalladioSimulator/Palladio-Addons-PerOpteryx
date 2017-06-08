/**
 */
package strategyConfig;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Config State</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see strategyConfig.ConcernconfigPackage#getConfigState()
 * @model
 * @generated
 */
public final class ConfigState extends AbstractEnumerator {
	/**
	 * The '<em><b>SELECTED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SELECTED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SELECTED_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SELECTED = 0;

	/**
	 * The '<em><b>ELIMINATED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ELIMINATED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ELIMINATED_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ELIMINATED = 1;

	/**
	 * The '<em><b>DEFAULT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * use value from deaultConfig
	 * aka NULL, not set, do not override
	 * <!-- end-model-doc -->
	 * @see #DEFAULT_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DEFAULT = 2;

	/**
	 * The '<em><b>SELECTED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SELECTED
	 * @generated
	 * @ordered
	 */
	public static final ConfigState SELECTED_LITERAL = new ConfigState(SELECTED, "SELECTED", "SELECTED");

	/**
	 * The '<em><b>ELIMINATED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELIMINATED
	 * @generated
	 * @ordered
	 */
	public static final ConfigState ELIMINATED_LITERAL = new ConfigState(ELIMINATED, "ELIMINATED", "ELIMINATED");

	/**
	 * The '<em><b>DEFAULT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEFAULT
	 * @generated
	 * @ordered
	 */
	public static final ConfigState DEFAULT_LITERAL = new ConfigState(DEFAULT, "DEFAULT", "DEFAULT");

	/**
	 * An array of all the '<em><b>Config State</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ConfigState[] VALUES_ARRAY =
		new ConfigState[] {
			SELECTED_LITERAL,
			ELIMINATED_LITERAL,
			DEFAULT_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Config State</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Config State</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConfigState get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConfigState result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Config State</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConfigState getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConfigState result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Config State</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConfigState get(int value) {
		switch (value) {
			case SELECTED: return SELECTED_LITERAL;
			case ELIMINATED: return ELIMINATED_LITERAL;
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
	private ConfigState(int value, String name, String literal) {
		super(value, name, literal);
	}

} //ConfigState
