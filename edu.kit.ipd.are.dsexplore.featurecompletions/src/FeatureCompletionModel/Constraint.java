/**
 */
package FeatureCompletionModel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Constraint</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see FeatureCompletionModel.FeatureCompletionPackage#getConstraint()
 * @model
 * @generated
 */
public final class Constraint extends AbstractEnumerator {
	/**
	 * The '<em><b>ANY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ANY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ANY_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ANY = 0;

	/**
	 * The '<em><b>TOGETHER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TOGETHER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TOGETHER_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TOGETHER = 1;

	/**
	 * The '<em><b>ISOLATED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ISOLATED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ISOLATED_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ISOLATED = 2;

	/**
	 * The '<em><b>SEPARATED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SEPARATED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SEPARATED_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SEPARATED = 3;

	/**
	 * The '<em><b>ANY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANY
	 * @generated
	 * @ordered
	 */
	public static final Constraint ANY_LITERAL = new Constraint(ANY, "ANY", "ANY");

	/**
	 * The '<em><b>TOGETHER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOGETHER
	 * @generated
	 * @ordered
	 */
	public static final Constraint TOGETHER_LITERAL = new Constraint(TOGETHER, "TOGETHER", "TOGETHER");

	/**
	 * The '<em><b>ISOLATED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISOLATED
	 * @generated
	 * @ordered
	 */
	public static final Constraint ISOLATED_LITERAL = new Constraint(ISOLATED, "ISOLATED", "ISOLATED");

	/**
	 * The '<em><b>SEPARATED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEPARATED
	 * @generated
	 * @ordered
	 */
	public static final Constraint SEPARATED_LITERAL = new Constraint(SEPARATED, "SEPARATED", "SEPARATED");

	/**
	 * An array of all the '<em><b>Constraint</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Constraint[] VALUES_ARRAY =
		new Constraint[] {
			ANY_LITERAL,
			TOGETHER_LITERAL,
			ISOLATED_LITERAL,
			SEPARATED_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Constraint</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Constraint</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Constraint get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Constraint result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Constraint</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Constraint getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Constraint result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Constraint</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Constraint get(int value) {
		switch (value) {
			case ANY: return ANY_LITERAL;
			case TOGETHER: return TOGETHER_LITERAL;
			case ISOLATED: return ISOLATED_LITERAL;
			case SEPARATED: return SEPARATED_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Constraint(int value, String name, String literal) {
		super(value, name, literal);
	}

} //Constraint
