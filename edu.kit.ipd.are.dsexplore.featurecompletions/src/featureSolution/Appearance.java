/**
 */
package featureSolution;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Appearance</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see featureSolution.FeatureSolutionPackage#getAppearance()
 * @model
 * @generated
 */
public final class Appearance extends AbstractEnumerator {
	/**
	 * The '<em><b>BEFORE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BEFORE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BEFORE_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BEFORE = 0;

	/**
	 * The '<em><b>AFTER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AFTER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AFTER_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AFTER = 1;

	/**
	 * The '<em><b>AROUND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AROUND</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AROUND_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AROUND = 2;

	/**
	 * The '<em><b>BEFORE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEFORE
	 * @generated
	 * @ordered
	 */
	public static final Appearance BEFORE_LITERAL = new Appearance(BEFORE, "BEFORE", "BEFORE");

	/**
	 * The '<em><b>AFTER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AFTER
	 * @generated
	 * @ordered
	 */
	public static final Appearance AFTER_LITERAL = new Appearance(AFTER, "AFTER", "AFTER");

	/**
	 * The '<em><b>AROUND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AROUND
	 * @generated
	 * @ordered
	 */
	public static final Appearance AROUND_LITERAL = new Appearance(AROUND, "AROUND", "AROUND");

	/**
	 * An array of all the '<em><b>Appearance</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Appearance[] VALUES_ARRAY =
		new Appearance[] {
			BEFORE_LITERAL,
			AFTER_LITERAL,
			AROUND_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Appearance</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Appearance</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Appearance get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Appearance result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Appearance</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Appearance getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Appearance result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Appearance</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Appearance get(int value) {
		switch (value) {
			case BEFORE: return BEFORE_LITERAL;
			case AFTER: return AFTER_LITERAL;
			case AROUND: return AROUND_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Appearance(int value, String name, String literal) {
		super(value, name, literal);
	}

} //Appearance
