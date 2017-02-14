/**
 */
package concernStrategy;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Attribute Types</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see concernStrategy.StrategymodelPackage#getAttributeTypes()
 * @model
 * @generated
 */
public final class AttributeTypes extends AbstractEnumerator {
	/**
	 * The '<em><b>INT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INT_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INT = 0;

	/**
	 * The '<em><b>STRING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>STRING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STRING_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STRING = 1;

	/**
	 * The '<em><b>REAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REAL_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REAL = 2;

	/**
	 * The '<em><b>INT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT
	 * @generated
	 * @ordered
	 */
	public static final AttributeTypes INT_LITERAL = new AttributeTypes(INT, "INT", "INT");

	/**
	 * The '<em><b>STRING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING
	 * @generated
	 * @ordered
	 */
	public static final AttributeTypes STRING_LITERAL = new AttributeTypes(STRING, "STRING", "STRING");

	/**
	 * The '<em><b>REAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REAL
	 * @generated
	 * @ordered
	 */
	public static final AttributeTypes REAL_LITERAL = new AttributeTypes(REAL, "REAL", "REAL");

	/**
	 * An array of all the '<em><b>Attribute Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AttributeTypes[] VALUES_ARRAY =
		new AttributeTypes[] {
			INT_LITERAL,
			STRING_LITERAL,
			REAL_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Attribute Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Attribute Types</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AttributeTypes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AttributeTypes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Attribute Types</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AttributeTypes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AttributeTypes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Attribute Types</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AttributeTypes get(int value) {
		switch (value) {
			case INT: return INT_LITERAL;
			case STRING: return STRING_LITERAL;
			case REAL: return REAL_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private AttributeTypes(int value, String name, String literal) {
		super(value, name, literal);
	}

} //AttributeTypes
