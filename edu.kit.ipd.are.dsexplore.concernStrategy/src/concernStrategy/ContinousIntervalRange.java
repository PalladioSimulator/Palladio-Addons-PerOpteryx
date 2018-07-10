/**
 */
package concernStrategy;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Continous Interval Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link concernStrategy.ContinousIntervalRange#getTo <em>To</em>}</li>
 *   <li>{@link concernStrategy.ContinousIntervalRange#getFrom <em>From</em>}</li>
 * </ul>
 *
 * @see concernStrategy.StrategymodelPackage#getContinousIntervalRange()
 * @model
 * @generated
 */
public interface ContinousIntervalRange extends IntervalRange {
	/**
	 * Returns the value of the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' attribute.
	 * @see #setTo(double)
	 * @see concernStrategy.StrategymodelPackage#getContinousIntervalRange_To()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	double getTo();

	/**
	 * Sets the value of the '{@link concernStrategy.ContinousIntervalRange#getTo <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' attribute.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(double value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' attribute.
	 * @see #setFrom(double)
	 * @see concernStrategy.StrategymodelPackage#getContinousIntervalRange_From()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	double getFrom();

	/**
	 * Sets the value of the '{@link concernStrategy.ContinousIntervalRange#getFrom <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' attribute.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(double value);

} // ContinousIntervalRange
