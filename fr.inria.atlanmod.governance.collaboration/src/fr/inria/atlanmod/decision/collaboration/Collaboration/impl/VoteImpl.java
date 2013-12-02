/**
 */
package fr.inria.atlanmod.decision.collaboration.Collaboration.impl;

import fr.inria.atlanmod.decision.collaboration.Collaboration.CollaborationPackage;
import fr.inria.atlanmod.decision.collaboration.Collaboration.Decision;
import fr.inria.atlanmod.decision.collaboration.Collaboration.User;
import fr.inria.atlanmod.decision.collaboration.Collaboration.Vote;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vote</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.atlanmod.decision.collaboration.Collaboration.impl.VoteImpl#getArePart <em>Are Part</em>}</li>
 *   <li>{@link fr.inria.atlanmod.decision.collaboration.Collaboration.impl.VoteImpl#getVotedBy <em>Voted By</em>}</li>
 *   <li>{@link fr.inria.atlanmod.decision.collaboration.Collaboration.impl.VoteImpl#isAgreement <em>Agreement</em>}</li>
 *   <li>{@link fr.inria.atlanmod.decision.collaboration.Collaboration.impl.VoteImpl#getTimeStamp <em>Time Stamp</em>}</li>
 *   <li>{@link fr.inria.atlanmod.decision.collaboration.Collaboration.impl.VoteImpl#getRationale <em>Rationale</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VoteImpl extends EObjectImpl implements Vote {
	/**
	 * The cached value of the '{@link #getArePart() <em>Are Part</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArePart()
	 * @generated
	 * @ordered
	 */
	protected Decision arePart;

	/**
	 * The cached value of the '{@link #getVotedBy() <em>Voted By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVotedBy()
	 * @generated
	 * @ordered
	 */
	protected User votedBy;

	/**
	 * The default value of the '{@link #isAgreement() <em>Agreement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAgreement()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AGREEMENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAgreement() <em>Agreement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAgreement()
	 * @generated
	 * @ordered
	 */
	protected boolean agreement = AGREEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeStamp() <em>Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeStamp()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_STAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeStamp() <em>Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeStamp()
	 * @generated
	 * @ordered
	 */
	protected String timeStamp = TIME_STAMP_EDEFAULT;

	/**
	 * The default value of the '{@link #getRationale() <em>Rationale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRationale()
	 * @generated
	 * @ordered
	 */
	protected static final String RATIONALE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRationale() <em>Rationale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRationale()
	 * @generated
	 * @ordered
	 */
	protected String rationale = RATIONALE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VoteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CollaborationPackage.Literals.VOTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decision getArePart() {
		if (arePart != null && arePart.eIsProxy()) {
			InternalEObject oldArePart = (InternalEObject)arePart;
			arePart = (Decision)eResolveProxy(oldArePart);
			if (arePart != oldArePart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CollaborationPackage.VOTE__ARE_PART, oldArePart, arePart));
			}
		}
		return arePart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decision basicGetArePart() {
		return arePart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArePart(Decision newArePart, NotificationChain msgs) {
		Decision oldArePart = arePart;
		arePart = newArePart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CollaborationPackage.VOTE__ARE_PART, oldArePart, newArePart);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArePart(Decision newArePart) {
		if (newArePart != arePart) {
			NotificationChain msgs = null;
			if (arePart != null)
				msgs = ((InternalEObject)arePart).eInverseRemove(this, CollaborationPackage.DECISION__VOTES, Decision.class, msgs);
			if (newArePart != null)
				msgs = ((InternalEObject)newArePart).eInverseAdd(this, CollaborationPackage.DECISION__VOTES, Decision.class, msgs);
			msgs = basicSetArePart(newArePart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollaborationPackage.VOTE__ARE_PART, newArePart, newArePart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User getVotedBy() {
		if (votedBy != null && votedBy.eIsProxy()) {
			InternalEObject oldVotedBy = (InternalEObject)votedBy;
			votedBy = (User)eResolveProxy(oldVotedBy);
			if (votedBy != oldVotedBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CollaborationPackage.VOTE__VOTED_BY, oldVotedBy, votedBy));
			}
		}
		return votedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User basicGetVotedBy() {
		return votedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVotedBy(User newVotedBy, NotificationChain msgs) {
		User oldVotedBy = votedBy;
		votedBy = newVotedBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CollaborationPackage.VOTE__VOTED_BY, oldVotedBy, newVotedBy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVotedBy(User newVotedBy) {
		if (newVotedBy != votedBy) {
			NotificationChain msgs = null;
			if (votedBy != null)
				msgs = ((InternalEObject)votedBy).eInverseRemove(this, CollaborationPackage.USER__VOTES, User.class, msgs);
			if (newVotedBy != null)
				msgs = ((InternalEObject)newVotedBy).eInverseAdd(this, CollaborationPackage.USER__VOTES, User.class, msgs);
			msgs = basicSetVotedBy(newVotedBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollaborationPackage.VOTE__VOTED_BY, newVotedBy, newVotedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAgreement() {
		return agreement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAgreement(boolean newAgreement) {
		boolean oldAgreement = agreement;
		agreement = newAgreement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollaborationPackage.VOTE__AGREEMENT, oldAgreement, agreement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTimeStamp() {
		return timeStamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeStamp(String newTimeStamp) {
		String oldTimeStamp = timeStamp;
		timeStamp = newTimeStamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollaborationPackage.VOTE__TIME_STAMP, oldTimeStamp, timeStamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRationale() {
		return rationale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRationale(String newRationale) {
		String oldRationale = rationale;
		rationale = newRationale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollaborationPackage.VOTE__RATIONALE, oldRationale, rationale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CollaborationPackage.VOTE__ARE_PART:
				if (arePart != null)
					msgs = ((InternalEObject)arePart).eInverseRemove(this, CollaborationPackage.DECISION__VOTES, Decision.class, msgs);
				return basicSetArePart((Decision)otherEnd, msgs);
			case CollaborationPackage.VOTE__VOTED_BY:
				if (votedBy != null)
					msgs = ((InternalEObject)votedBy).eInverseRemove(this, CollaborationPackage.USER__VOTES, User.class, msgs);
				return basicSetVotedBy((User)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CollaborationPackage.VOTE__ARE_PART:
				return basicSetArePart(null, msgs);
			case CollaborationPackage.VOTE__VOTED_BY:
				return basicSetVotedBy(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CollaborationPackage.VOTE__ARE_PART:
				if (resolve) return getArePart();
				return basicGetArePart();
			case CollaborationPackage.VOTE__VOTED_BY:
				if (resolve) return getVotedBy();
				return basicGetVotedBy();
			case CollaborationPackage.VOTE__AGREEMENT:
				return isAgreement();
			case CollaborationPackage.VOTE__TIME_STAMP:
				return getTimeStamp();
			case CollaborationPackage.VOTE__RATIONALE:
				return getRationale();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CollaborationPackage.VOTE__ARE_PART:
				setArePart((Decision)newValue);
				return;
			case CollaborationPackage.VOTE__VOTED_BY:
				setVotedBy((User)newValue);
				return;
			case CollaborationPackage.VOTE__AGREEMENT:
				setAgreement((Boolean)newValue);
				return;
			case CollaborationPackage.VOTE__TIME_STAMP:
				setTimeStamp((String)newValue);
				return;
			case CollaborationPackage.VOTE__RATIONALE:
				setRationale((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CollaborationPackage.VOTE__ARE_PART:
				setArePart((Decision)null);
				return;
			case CollaborationPackage.VOTE__VOTED_BY:
				setVotedBy((User)null);
				return;
			case CollaborationPackage.VOTE__AGREEMENT:
				setAgreement(AGREEMENT_EDEFAULT);
				return;
			case CollaborationPackage.VOTE__TIME_STAMP:
				setTimeStamp(TIME_STAMP_EDEFAULT);
				return;
			case CollaborationPackage.VOTE__RATIONALE:
				setRationale(RATIONALE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CollaborationPackage.VOTE__ARE_PART:
				return arePart != null;
			case CollaborationPackage.VOTE__VOTED_BY:
				return votedBy != null;
			case CollaborationPackage.VOTE__AGREEMENT:
				return agreement != AGREEMENT_EDEFAULT;
			case CollaborationPackage.VOTE__TIME_STAMP:
				return TIME_STAMP_EDEFAULT == null ? timeStamp != null : !TIME_STAMP_EDEFAULT.equals(timeStamp);
			case CollaborationPackage.VOTE__RATIONALE:
				return RATIONALE_EDEFAULT == null ? rationale != null : !RATIONALE_EDEFAULT.equals(rationale);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (agreement: ");
		result.append(agreement);
		result.append(", timeStamp: ");
		result.append(timeStamp);
		result.append(", rationale: ");
		result.append(rationale);
		result.append(')');
		return result.toString();
	}

} //VoteImpl
