/**
 */
package fr.inria.atlanmod.decision.strategy.Strategy;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.atlanmod.decision.strategy.Strategy.Timer#getTimeStamp <em>Time Stamp</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.atlanmod.decision.strategy.Strategy.StrategyPackage#getTimer()
 * @model
 * @generated
 */
public interface Timer extends Deadline {
	/**
	 * Returns the value of the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Stamp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Stamp</em>' attribute.
	 * @see #setTimeStamp(int)
	 * @see fr.inria.atlanmod.decision.strategy.Strategy.StrategyPackage#getTimer_TimeStamp()
	 * @model required="true"
	 * @generated
	 */
	int getTimeStamp();

	/**
	 * Sets the value of the '{@link fr.inria.atlanmod.decision.strategy.Strategy.Timer#getTimeStamp <em>Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Stamp</em>' attribute.
	 * @see #getTimeStamp()
	 * @generated
	 */
	void setTimeStamp(int value);

} // Timer
