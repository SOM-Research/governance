/**
 */
package fr.inria.atlanmod.decision.strategy.Strategy;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Majority</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.atlanmod.decision.strategy.Strategy.Majority#getRange <em>Range</em>}</li>
 *   <li>{@link fr.inria.atlanmod.decision.strategy.Strategy.Majority#getMinVotes <em>Min Votes</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.atlanmod.decision.strategy.Strategy.StrategyPackage#getMajority()
 * @model
 * @generated
 */
public interface Majority extends Strategy {
	/**
	 * Returns the value of the '<em><b>Range</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.inria.atlanmod.decision.strategy.Strategy.RangeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Range</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range</em>' attribute.
	 * @see fr.inria.atlanmod.decision.strategy.Strategy.RangeType
	 * @see #setRange(RangeType)
	 * @see fr.inria.atlanmod.decision.strategy.Strategy.StrategyPackage#getMajority_Range()
	 * @model required="true"
	 * @generated
	 */
	RangeType getRange();

	/**
	 * Sets the value of the '{@link fr.inria.atlanmod.decision.strategy.Strategy.Majority#getRange <em>Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range</em>' attribute.
	 * @see fr.inria.atlanmod.decision.strategy.Strategy.RangeType
	 * @see #getRange()
	 * @generated
	 */
	void setRange(RangeType value);

	/**
	 * Returns the value of the '<em><b>Min Votes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Votes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Votes</em>' attribute.
	 * @see #setMinVotes(int)
	 * @see fr.inria.atlanmod.decision.strategy.Strategy.StrategyPackage#getMajority_MinVotes()
	 * @model
	 * @generated
	 */
	int getMinVotes();

	/**
	 * Sets the value of the '{@link fr.inria.atlanmod.decision.strategy.Strategy.Majority#getMinVotes <em>Min Votes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Votes</em>' attribute.
	 * @see #getMinVotes()
	 * @generated
	 */
	void setMinVotes(int value);

} // Majority
