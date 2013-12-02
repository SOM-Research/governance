/**
 */
package fr.inria.atlanmod.decision.collaboration.Collaboration;

import fr.inria.atlanmod.governance.strategy.Role;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.atlanmod.decision.collaboration.Collaboration.User#getName <em>Name</em>}</li>
 *   <li>{@link fr.inria.atlanmod.decision.collaboration.Collaboration.User#getVotes <em>Votes</em>}</li>
 *   <li>{@link fr.inria.atlanmod.decision.collaboration.Collaboration.User#getLeads <em>Leads</em>}</li>
 *   <li>{@link fr.inria.atlanmod.decision.collaboration.Collaboration.User#getRoles <em>Roles</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.CollaborationPackage#getUser()
 * @model
 * @generated
 */
public interface User extends EObject {
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
	 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.CollaborationPackage#getUser_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.inria.atlanmod.decision.collaboration.Collaboration.User#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Votes</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.atlanmod.decision.collaboration.Collaboration.Vote}.
	 * It is bidirectional and its opposite is '{@link fr.inria.atlanmod.decision.collaboration.Collaboration.Vote#getVotedBy <em>Voted By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Votes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Votes</em>' reference list.
	 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.CollaborationPackage#getUser_Votes()
	 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.Vote#getVotedBy
	 * @model opposite="votedBy"
	 * @generated
	 */
	EList<Vote> getVotes();

	/**
	 * Returns the value of the '<em><b>Leads</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.atlanmod.decision.collaboration.Collaboration.Collaboration}.
	 * It is bidirectional and its opposite is '{@link fr.inria.atlanmod.decision.collaboration.Collaboration.Collaboration#getLeader <em>Leader</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Leads</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Leads</em>' reference list.
	 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.CollaborationPackage#getUser_Leads()
	 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.Collaboration#getLeader
	 * @model opposite="leader"
	 * @generated
	 */
	EList<Collaboration> getLeads();

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.atlanmod.governance.strategy.Role}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' reference list.
	 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.CollaborationPackage#getUser_Roles()
	 * @model
	 * @generated
	 */
	EList<Role> getRoles();

} // User
