/**
 */
package fr.inria.atlanmod.decision.collaboration.Collaboration;

import fr.inria.atlanmod.governance.strategy.CollaborationType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collaboration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.atlanmod.decision.collaboration.Collaboration.Collaboration#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link fr.inria.atlanmod.decision.collaboration.Collaboration.Collaboration#getName <em>Name</em>}</li>
 *   <li>{@link fr.inria.atlanmod.decision.collaboration.Collaboration.Collaboration#getRationale <em>Rationale</em>}</li>
 *   <li>{@link fr.inria.atlanmod.decision.collaboration.Collaboration.Collaboration#getType <em>Type</em>}</li>
 *   <li>{@link fr.inria.atlanmod.decision.collaboration.Collaboration.Collaboration#getVotes <em>Votes</em>}</li>
 *   <li>{@link fr.inria.atlanmod.decision.collaboration.Collaboration.Collaboration#getLeader <em>Leader</em>}</li>
 *   <li>{@link fr.inria.atlanmod.decision.collaboration.Collaboration.Collaboration#getIsDecided <em>Is Decided</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.CollaborationPackage#getCollaboration()
 * @model
 * @generated
 */
public interface Collaboration extends EObject {
	/**
	 * Returns the value of the '<em><b>Metadata</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.atlanmod.decision.collaboration.Collaboration.Metadata}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metadata</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metadata</em>' containment reference list.
	 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.CollaborationPackage#getCollaboration_Metadata()
	 * @model containment="true"
	 * @generated
	 */
	EList<Metadata> getMetadata();

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
	 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.CollaborationPackage#getCollaboration_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.inria.atlanmod.decision.collaboration.Collaboration.Collaboration#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Rationale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rationale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rationale</em>' attribute.
	 * @see #setRationale(String)
	 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.CollaborationPackage#getCollaboration_Rationale()
	 * @model
	 * @generated
	 */
	String getRationale();

	/**
	 * Sets the value of the '{@link fr.inria.atlanmod.decision.collaboration.Collaboration.Collaboration#getRationale <em>Rationale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rationale</em>' attribute.
	 * @see #getRationale()
	 * @generated
	 */
	void setRationale(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.inria.atlanmod.governance.strategy.CollaborationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see fr.inria.atlanmod.governance.strategy.CollaborationType
	 * @see #setType(CollaborationType)
	 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.CollaborationPackage#getCollaboration_Type()
	 * @model
	 * @generated
	 */
	CollaborationType getType();

	/**
	 * Sets the value of the '{@link fr.inria.atlanmod.decision.collaboration.Collaboration.Collaboration#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see fr.inria.atlanmod.governance.strategy.CollaborationType
	 * @see #getType()
	 * @generated
	 */
	void setType(CollaborationType value);

	/**
	 * Returns the value of the '<em><b>Votes</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.atlanmod.decision.collaboration.Collaboration.Vote}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Votes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Votes</em>' containment reference list.
	 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.CollaborationPackage#getCollaboration_Votes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Vote> getVotes();

	/**
	 * Returns the value of the '<em><b>Leader</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.inria.atlanmod.decision.collaboration.Collaboration.User#getLeads <em>Leads</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Leader</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Leader</em>' reference.
	 * @see #setLeader(User)
	 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.CollaborationPackage#getCollaboration_Leader()
	 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.User#getLeads
	 * @model opposite="leads"
	 * @generated
	 */
	User getLeader();

	/**
	 * Sets the value of the '{@link fr.inria.atlanmod.decision.collaboration.Collaboration.Collaboration#getLeader <em>Leader</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Leader</em>' reference.
	 * @see #getLeader()
	 * @generated
	 */
	void setLeader(User value);

	/**
	 * Returns the value of the '<em><b>Is Decided</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.atlanmod.decision.collaboration.Collaboration.Decision}.
	 * It is bidirectional and its opposite is '{@link fr.inria.atlanmod.decision.collaboration.Collaboration.Decision#getDecides <em>Decides</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Decided</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Decided</em>' reference list.
	 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.CollaborationPackage#getCollaboration_IsDecided()
	 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.Decision#getDecides
	 * @model opposite="decides"
	 * @generated
	 */
	EList<Decision> getIsDecided();

} // Collaboration
