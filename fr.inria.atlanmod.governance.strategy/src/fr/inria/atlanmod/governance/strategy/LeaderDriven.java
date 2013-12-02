/**
 */
package fr.inria.atlanmod.governance.strategy;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Leader Driven</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.atlanmod.governance.strategy.LeaderDriven#getDefault <em>Default</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.atlanmod.governance.strategy.StrategyPackage#getLeaderDriven()
 * @model
 * @generated
 */
public interface LeaderDriven extends Strategy {
	/**
	 * Returns the value of the '<em><b>Default</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default</em>' reference.
	 * @see #setDefault(Strategy)
	 * @see fr.inria.atlanmod.governance.strategy.StrategyPackage#getLeaderDriven_Default()
	 * @model required="true"
	 * @generated
	 */
	Strategy getDefault();

	/**
	 * Sets the value of the '{@link fr.inria.atlanmod.governance.strategy.LeaderDriven#getDefault <em>Default</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' reference.
	 * @see #getDefault()
	 * @generated
	 */
	void setDefault(Strategy value);

} // LeaderDriven
