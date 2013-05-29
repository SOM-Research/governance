/**
 */
package fr.inria.atlanmod.decision.collaboration.Collaboration;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interactions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.atlanmod.decision.collaboration.Collaboration.Interactions#getUsers <em>Users</em>}</li>
 *   <li>{@link fr.inria.atlanmod.decision.collaboration.Collaboration.Interactions#getCollaborations <em>Collaborations</em>}</li>
 *   <li>{@link fr.inria.atlanmod.decision.collaboration.Collaboration.Interactions#getDecisions <em>Decisions</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.CollaborationPackage#getInteractions()
 * @model
 * @generated
 */
public interface Interactions extends EObject {
	/**
	 * Returns the value of the '<em><b>Users</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.atlanmod.decision.collaboration.Collaboration.User}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Users</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Users</em>' containment reference list.
	 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.CollaborationPackage#getInteractions_Users()
	 * @model containment="true"
	 * @generated
	 */
	EList<User> getUsers();

	/**
	 * Returns the value of the '<em><b>Collaborations</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.atlanmod.decision.collaboration.Collaboration.Collaboration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collaborations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collaborations</em>' containment reference list.
	 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.CollaborationPackage#getInteractions_Collaborations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Collaboration> getCollaborations();

	/**
	 * Returns the value of the '<em><b>Decisions</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.atlanmod.decision.collaboration.Collaboration.Decision}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decisions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decisions</em>' containment reference list.
	 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.CollaborationPackage#getInteractions_Decisions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Decision> getDecisions();

} // Interactions
