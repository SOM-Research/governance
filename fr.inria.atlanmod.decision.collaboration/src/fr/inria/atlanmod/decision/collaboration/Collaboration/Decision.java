/**
 */
package fr.inria.atlanmod.decision.collaboration.Collaboration;

import fr.inria.atlanmod.governance.strategy.Strategy;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decision</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.atlanmod.decision.collaboration.Collaboration.Decision#isAccepted <em>Accepted</em>}</li>
 *   <li>{@link fr.inria.atlanmod.decision.collaboration.Collaboration.Decision#getTimeStamp <em>Time Stamp</em>}</li>
 *   <li>{@link fr.inria.atlanmod.decision.collaboration.Collaboration.Decision#getVotes <em>Votes</em>}</li>
 *   <li>{@link fr.inria.atlanmod.decision.collaboration.Collaboration.Decision#getDecides <em>Decides</em>}</li>
 *   <li>{@link fr.inria.atlanmod.decision.collaboration.Collaboration.Decision#getStrategy <em>Strategy</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.CollaborationPackage#getDecision()
 * @model
 * @generated
 */
public interface Decision extends EObject {
	/**
	 * Returns the value of the '<em><b>Accepted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accepted</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accepted</em>' attribute.
	 * @see #setAccepted(boolean)
	 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.CollaborationPackage#getDecision_Accepted()
	 * @model
	 * @generated
	 */
	boolean isAccepted();

	/**
	 * Sets the value of the '{@link fr.inria.atlanmod.decision.collaboration.Collaboration.Decision#isAccepted <em>Accepted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accepted</em>' attribute.
	 * @see #isAccepted()
	 * @generated
	 */
	void setAccepted(boolean value);

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
	 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.CollaborationPackage#getDecision_TimeStamp()
	 * @model
	 * @generated
	 */
	String getTimeStamp();

	/**
	 * Sets the value of the '{@link fr.inria.atlanmod.decision.collaboration.Collaboration.Decision#getTimeStamp <em>Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Stamp</em>' attribute.
	 * @see #getTimeStamp()
	 * @generated
	 */
	void setTimeStamp(String value);

	/**
	 * Returns the value of the '<em><b>Votes</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.atlanmod.decision.collaboration.Collaboration.Vote}.
	 * It is bidirectional and its opposite is '{@link fr.inria.atlanmod.decision.collaboration.Collaboration.Vote#getArePart <em>Are Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Votes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Votes</em>' reference list.
	 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.CollaborationPackage#getDecision_Votes()
	 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.Vote#getArePart
	 * @model opposite="arePart"
	 * @generated
	 */
	EList<Vote> getVotes();

	/**
	 * Returns the value of the '<em><b>Decides</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.inria.atlanmod.decision.collaboration.Collaboration.Collaboration#getIsDecided <em>Is Decided</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decides</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decides</em>' reference.
	 * @see #setDecides(Collaboration)
	 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.CollaborationPackage#getDecision_Decides()
	 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.Collaboration#getIsDecided
	 * @model opposite="isDecided"
	 * @generated
	 */
	Collaboration getDecides();

	/**
	 * Sets the value of the '{@link fr.inria.atlanmod.decision.collaboration.Collaboration.Decision#getDecides <em>Decides</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decides</em>' reference.
	 * @see #getDecides()
	 * @generated
	 */
	void setDecides(Collaboration value);

	/**
	 * Returns the value of the '<em><b>Strategy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strategy</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strategy</em>' reference.
	 * @see #setStrategy(Strategy)
	 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.CollaborationPackage#getDecision_Strategy()
	 * @model
	 * @generated
	 */
	Strategy getStrategy();

	/**
	 * Sets the value of the '{@link fr.inria.atlanmod.decision.collaboration.Collaboration.Decision#getStrategy <em>Strategy</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strategy</em>' reference.
	 * @see #getStrategy()
	 * @generated
	 */
	void setStrategy(Strategy value);

} // Decision
