/**
 */
package fr.inria.atlanmod.decision.strategy.Strategy;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ratio Majority</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.atlanmod.decision.strategy.Strategy.RatioMajority#getRatio <em>Ratio</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.atlanmod.decision.strategy.Strategy.StrategyPackage#getRatioMajority()
 * @model
 * @generated
 */
public interface RatioMajority extends Majority {
	/**
	 * Returns the value of the '<em><b>Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ratio</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ratio</em>' attribute.
	 * @see #setRatio(float)
	 * @see fr.inria.atlanmod.decision.strategy.Strategy.StrategyPackage#getRatioMajority_Ratio()
	 * @model required="true"
	 * @generated
	 */
	float getRatio();

	/**
	 * Sets the value of the '{@link fr.inria.atlanmod.decision.strategy.Strategy.RatioMajority#getRatio <em>Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ratio</em>' attribute.
	 * @see #getRatio()
	 * @generated
	 */
	void setRatio(float value);

} // RatioMajority
