/**
 */
package FeatureCompletionModel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Visnetum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see FeatureCompletionModel.FeatureCompletionPackage#getVisnetum()
 * @model
 * @generated
 */
public enum Visnetum implements Enumerator {
	/**
	 * The '<em><b>SIGNATURE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGNATURE_VALUE
	 * @generated
	 * @ordered
	 */
	SIGNATURE(0, "SIGNATURE", "SIGNATURE"),

	/**
	 * The '<em><b>INTERFACE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERFACE_VALUE
	 * @generated
	 * @ordered
	 */
	INTERFACE(1, "INTERFACE", "INTERFACE"),

	/**
	 * The '<em><b>INTERFACE REQUIRES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERFACE_REQUIRES_VALUE
	 * @generated
	 * @ordered
	 */
	INTERFACE_REQUIRES(2, "INTERFACE_REQUIRES", "INTERFACE_REQUIRES"),

	/**
	 * The '<em><b>INTERFACE PROVIDES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERFACE_PROVIDES_VALUE
	 * @generated
	 * @ordered
	 */
	INTERFACE_PROVIDES(3, "INTERFACE_PROVIDES", "INTERFACE_PROVIDES"),

	/**
	 * The '<em><b>COMPONENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPONENT_VALUE
	 * @generated
	 * @ordered
	 */
	COMPONENT(4, "COMPONENT", "COMPONENT");

	/**
	 * The '<em><b>SIGNATURE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SIGNATURE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SIGNATURE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SIGNATURE_VALUE = 0;

	/**
	 * The '<em><b>INTERFACE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INTERFACE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTERFACE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INTERFACE_VALUE = 1;

	/**
	 * The '<em><b>INTERFACE REQUIRES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INTERFACE REQUIRES</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTERFACE_REQUIRES
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INTERFACE_REQUIRES_VALUE = 2;

	/**
	 * The '<em><b>INTERFACE PROVIDES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INTERFACE PROVIDES</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTERFACE_PROVIDES
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INTERFACE_PROVIDES_VALUE = 3;

	/**
	 * The '<em><b>COMPONENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COMPONENT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPONENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COMPONENT_VALUE = 4;

	/**
	 * An array of all the '<em><b>Visnetum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Visnetum[] VALUES_ARRAY =
		new Visnetum[] {
			SIGNATURE,
			INTERFACE,
			INTERFACE_REQUIRES,
			INTERFACE_PROVIDES,
			COMPONENT,
		};

	/**
	 * A public read-only list of all the '<em><b>Visnetum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Visnetum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

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
			case SIGNATURE_VALUE: return SIGNATURE;
			case INTERFACE_VALUE: return INTERFACE;
			case INTERFACE_REQUIRES_VALUE: return INTERFACE_REQUIRES;
			case INTERFACE_PROVIDES_VALUE: return INTERFACE_PROVIDES;
			case COMPONENT_VALUE: return COMPONENT;
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
	private Visnetum(int value, String name, String literal) {
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
	
} //Visnetum
