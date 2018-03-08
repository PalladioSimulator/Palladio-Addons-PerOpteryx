/**
 */
package ConcernModel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Association</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ConcernModel.ConcernModelPackage#getAssociation()
 * @model
 * @generated
 */
public enum Association implements Enumerator {
	/**
	 * The '<em><b>INDIFFERENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INDIFFERENT_VALUE
	 * @generated
	 * @ordered
	 */
	INDIFFERENT(0, "INDIFFERENT", "INDIFFERENT"),

	/**
	 * The '<em><b>TOGETHER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOGETHER_VALUE
	 * @generated
	 * @ordered
	 */
	TOGETHER(1, "TOGETHER", "TOGETHER"),

	/**
	 * The '<em><b>ISOLATED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISOLATED_VALUE
	 * @generated
	 * @ordered
	 */
	ISOLATED(2, "ISOLATED", "ISOLATED"),

	/**
	 * The '<em><b>SEPARATED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEPARATED_VALUE
	 * @generated
	 * @ordered
	 */
	SEPARATED(3, "SEPARATED", "SEPARATED");

	/**
	 * The '<em><b>INDIFFERENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INDIFFERENT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INDIFFERENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INDIFFERENT_VALUE = 0;

	/**
	 * The '<em><b>TOGETHER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TOGETHER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TOGETHER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TOGETHER_VALUE = 1;

	/**
	 * The '<em><b>ISOLATED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ISOLATED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ISOLATED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ISOLATED_VALUE = 2;

	/**
	 * The '<em><b>SEPARATED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SEPARATED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SEPARATED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SEPARATED_VALUE = 3;

	/**
	 * An array of all the '<em><b>Association</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Association[] VALUES_ARRAY =
		new Association[] {
			INDIFFERENT,
			TOGETHER,
			ISOLATED,
			SEPARATED,
		};

	/**
	 * A public read-only list of all the '<em><b>Association</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Association> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Association</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Association get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Association result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Association</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Association getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Association result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Association</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Association get(int value) {
		switch (value) {
			case INDIFFERENT_VALUE: return INDIFFERENT;
			case TOGETHER_VALUE: return TOGETHER;
			case ISOLATED_VALUE: return ISOLATED;
			case SEPARATED_VALUE: return SEPARATED;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Association(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //Association
