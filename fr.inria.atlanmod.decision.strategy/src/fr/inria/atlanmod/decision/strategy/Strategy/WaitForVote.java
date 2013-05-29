/**
 */
package fr.inria.atlanmod.decision.strategy.Strategy;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wait For Vote</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.atlanmod.decision.strategy.Strategy.WaitForVote#getRoles <em>Roles</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.atlanmod.decision.strategy.Strategy.StrategyPackage#getWaitForVote()
 * @model
 * @generated
 */
public interface WaitForVote extends Deadline {
	/**
	 * Returns the value of the '<em><b>Roles</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.atlanmod.decision.strategy.Strategy.Role}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' reference list.
	 * @see fr.inria.atlanmod.decision.strategy.Strategy.StrategyPackage#getWaitForVote_Roles()
	 * @model
	 * @generated
	 */
	EList<Role> getRoles();

} // WaitForVote
