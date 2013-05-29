/**
 */
package fr.inria.atlanmod.decision.strategy.Strategy;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OCL Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.atlanmod.decision.strategy.Strategy.OCLCondition#getOclExpression <em>Ocl Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.atlanmod.decision.strategy.Strategy.StrategyPackage#getOCLCondition()
 * @model
 * @generated
 */
public interface OCLCondition extends Deadline {
	/**
	 * Returns the value of the '<em><b>Ocl Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ocl Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ocl Expression</em>' attribute.
	 * @see #setOclExpression(String)
	 * @see fr.inria.atlanmod.decision.strategy.Strategy.StrategyPackage#getOCLCondition_OclExpression()
	 * @model required="true"
	 * @generated
	 */
	String getOclExpression();

	/**
	 * Sets the value of the '{@link fr.inria.atlanmod.decision.strategy.Strategy.OCLCondition#getOclExpression <em>Ocl Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ocl Expression</em>' attribute.
	 * @see #getOclExpression()
	 * @generated
	 */
	void setOclExpression(String value);

} // OCLCondition
