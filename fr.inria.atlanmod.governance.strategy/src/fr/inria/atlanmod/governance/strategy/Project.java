/**
 */
package fr.inria.atlanmod.governance.strategy;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.atlanmod.governance.strategy.Project#getName <em>Name</em>}</li>
 *   <li>{@link fr.inria.atlanmod.governance.strategy.Project#getStrategies <em>Strategies</em>}</li>
 *   <li>{@link fr.inria.atlanmod.governance.strategy.Project#getRoles <em>Roles</em>}</li>
 *   <li>{@link fr.inria.atlanmod.governance.strategy.Project#getDeadlines <em>Deadlines</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.atlanmod.governance.strategy.StrategyPackage#getProject()
 * @model
 * @generated
 */
public interface Project extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see fr.inria.atlanmod.governance.strategy.StrategyPackage#getProject_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.inria.atlanmod.governance.strategy.Project#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Strategies</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.atlanmod.governance.strategy.Strategy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strategies</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strategies</em>' containment reference list.
	 * @see fr.inria.atlanmod.governance.strategy.StrategyPackage#getProject_Strategies()
	 * @model containment="true"
	 * @generated
	 */
	EList<Strategy> getStrategies();

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.atlanmod.governance.strategy.Role}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' containment reference list.
	 * @see fr.inria.atlanmod.governance.strategy.StrategyPackage#getProject_Roles()
	 * @model containment="true"
	 * @generated
	 */
	EList<Role> getRoles();

	/**
	 * Returns the value of the '<em><b>Deadlines</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.atlanmod.governance.strategy.Deadline}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deadlines</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deadlines</em>' containment reference list.
	 * @see fr.inria.atlanmod.governance.strategy.StrategyPackage#getProject_Deadlines()
	 * @model containment="true"
	 * @generated
	 */
	EList<Deadline> getDeadlines();

} // Project
