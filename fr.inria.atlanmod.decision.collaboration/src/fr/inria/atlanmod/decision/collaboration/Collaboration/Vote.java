/**
 */
package fr.inria.atlanmod.decision.collaboration.Collaboration;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vote</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.atlanmod.decision.collaboration.Collaboration.Vote#getArePart <em>Are Part</em>}</li>
 *   <li>{@link fr.inria.atlanmod.decision.collaboration.Collaboration.Vote#getVotedBy <em>Voted By</em>}</li>
 *   <li>{@link fr.inria.atlanmod.decision.collaboration.Collaboration.Vote#isAgreement <em>Agreement</em>}</li>
 *   <li>{@link fr.inria.atlanmod.decision.collaboration.Collaboration.Vote#getTimeStamp <em>Time Stamp</em>}</li>
 *   <li>{@link fr.inria.atlanmod.decision.collaboration.Collaboration.Vote#getRationale <em>Rationale</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.CollaborationPackage#getVote()
 * @model
 * @generated
 */
public interface Vote extends EObject {
	/**
	 * Returns the value of the '<em><b>Are Part</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.inria.atlanmod.decision.collaboration.Collaboration.Decision#getVotes <em>Votes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Are Part</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Are Part</em>' reference.
	 * @see #setArePart(Decision)
	 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.CollaborationPackage#getVote_ArePart()
	 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.Decision#getVotes
	 * @model opposite="votes"
	 * @generated
	 */
	Decision getArePart();

	/**
	 * Sets the value of the '{@link fr.inria.atlanmod.decision.collaboration.Collaboration.Vote#getArePart <em>Are Part</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Are Part</em>' reference.
	 * @see #getArePart()
	 * @generated
	 */
	void setArePart(Decision value);

	/**
	 * Returns the value of the '<em><b>Voted By</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.inria.atlanmod.decision.collaboration.Collaboration.User#getVotes <em>Votes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Voted By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voted By</em>' reference.
	 * @see #setVotedBy(User)
	 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.CollaborationPackage#getVote_VotedBy()
	 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.User#getVotes
	 * @model opposite="votes"
	 * @generated
	 */
	User getVotedBy();

	/**
	 * Sets the value of the '{@link fr.inria.atlanmod.decision.collaboration.Collaboration.Vote#getVotedBy <em>Voted By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voted By</em>' reference.
	 * @see #getVotedBy()
	 * @generated
	 */
	void setVotedBy(User value);

	/**
	 * Returns the value of the '<em><b>Agreement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Agreement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agreement</em>' attribute.
	 * @see #setAgreement(boolean)
	 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.CollaborationPackage#getVote_Agreement()
	 * @model
	 * @generated
	 */
	boolean isAgreement();

	/**
	 * Sets the value of the '{@link fr.inria.atlanmod.decision.collaboration.Collaboration.Vote#isAgreement <em>Agreement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agreement</em>' attribute.
	 * @see #isAgreement()
	 * @generated
	 */
	void setAgreement(boolean value);

	/**
	 * Returns the value of the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Stamp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Stamp</em>' attribute.
	 * @see #setTimeStamp(String)
	 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.CollaborationPackage#getVote_TimeStamp()
	 * @model
	 * @generated
	 */
	String getTimeStamp();

	/**
	 * Sets the value of the '{@link fr.inria.atlanmod.decision.collaboration.Collaboration.Vote#getTimeStamp <em>Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Stamp</em>' attribute.
	 * @see #getTimeStamp()
	 * @generated
	 */
	void setTimeStamp(String value);

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
	 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.CollaborationPackage#getVote_Rationale()
	 * @model
	 * @generated
	 */
	String getRationale();

	/**
	 * Sets the value of the '{@link fr.inria.atlanmod.decision.collaboration.Collaboration.Vote#getRationale <em>Rationale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rationale</em>' attribute.
	 * @see #getRationale()
	 * @generated
	 */
	void setRationale(String value);

} // Vote
