/**
 */
package FeatureCompletionModel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Visnetum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see FeatureCompletionModel.FeatureCompletionPackage#getVisnetum()
 * @model
 * @generated
 */
public final class Visnetum extends AbstractEnumerator {
	/**
	 * The '<em><b>SIGNATURE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SIGNATURE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SIGNATURE_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SIGNATURE = 0;

	/**
	 * The '<em><b>INTERFACE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INTERFACE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTERFACE_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INTERFACE = 1;

	/**
	 * The '<em><b>INTERFACE REQUIRES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INTERFACE REQUIRES</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTERFACE_REQUIRES_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INTERFACE_REQUIRES = 2;

	/**
	 * The '<em><b>INTERFACE PROVIDES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INTERFACE PROVIDES</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTERFACE_PROVIDES_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INTERFACE_PROVIDES = 3;

	/**
	 * The '<em><b>COMPONENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COMPONENT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPONENT_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COMPONENT = 4;

	/**
	 * The '<em><b>SIGNATURE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGNATURE
	 * @generated
	 * @ordered
	 */
	public static final Visnetum SIGNATURE_LITERAL = new Visnetum(SIGNATURE, "SIGNATURE", "SIGNATURE");

	/**
	 * The '<em><b>INTERFACE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERFACE
	 * @generated
	 * @ordered
	 */
	public static final Visnetum INTERFACE_LITERAL = new Visnetum(INTERFACE, "INTERFACE", "INTERFACE");

	/**
	 * The '<em><b>INTERFACE REQUIRES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERFACE_REQUIRES
	 * @generated
	 * @ordered
	 */
	public static final Visnetum INTERFACE_REQUIRES_LITERAL = new Visnetum(INTERFACE_REQUIRES, "INTERFACE_REQUIRES", "INTERFACE_REQUIRES");

	/**
	 * The '<em><b>INTERFACE PROVIDES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERFACE_PROVIDES
	 * @generated
	 * @ordered
	 */
	public static final Visnetum INTERFACE_PROVIDES_LITERAL = new Visnetum(INTERFACE_PROVIDES, "INTERFACE_PROVIDES", "INTERFACE_PROVIDES");

	/**
	 * The '<em><b>COMPONENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPONENT
	 * @generated
	 * @ordered
	 */
	public static final Visnetum COMPONENT_LITERAL = new Visnetum(COMPONENT, "COMPONENT", "COMPONENT");

	/**
	 * An array of all the '<em><b>Visnetum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Visnetum[] VALUES_ARRAY =
		new Visnetum[] {
			SIGNATURE_LITERAL,
			INTERFACE_LITERAL,
			INTERFACE_REQUIRES_LITERAL,
			INTERFACE_PROVIDES_LITERAL,
			COMPONENT_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Visnetum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Visnetum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Visnetum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Visnetum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Visnetum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Visnetum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Visnetum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Visnetum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Visnetum get(int value) {
		switch (value) {
			case SIGNATURE: return SIGNATURE_LITERAL;
			case INTERFACE: return INTERFACE_LITERAL;
			case INTERFACE_REQUIRES: return INTERFACE_REQUIRES_LITERAL;
			case INTERFACE_PROVIDES: return INTERFACE_PROVIDES_LITERAL;
			case COMPONENT: return COMPONENT_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Visnetum(int value, String name, String literal) {
		super(value, name, literal);
	}

} //Visnetum
