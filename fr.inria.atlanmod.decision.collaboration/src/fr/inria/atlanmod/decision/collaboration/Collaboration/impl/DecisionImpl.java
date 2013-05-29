/**
 */
package fr.inria.atlanmod.decision.collaboration.Collaboration.impl;

import fr.inria.atlanmod.decision.collaboration.Collaboration.Collaboration;
import fr.inria.atlanmod.decision.collaboration.Collaboration.CollaborationPackage;
import fr.inria.atlanmod.decision.collaboration.Collaboration.Decision;
import fr.inria.atlanmod.decision.collaboration.Collaboration.Vote;

import fr.inria.atlanmod.decision.strategy.Strategy.Strategy;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decision</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.atlanmod.decision.collaboration.Collaboration.impl.DecisionImpl#isAccepted <em>Accepted</em>}</li>
 *   <li>{@link fr.inria.atlanmod.decision.collaboration.Collaboration.impl.DecisionImpl#getTimeStamp <em>Time Stamp</em>}</li>
 *   <li>{@link fr.inria.atlanmod.decision.collaboration.Collaboration.impl.DecisionImpl#getVotes <em>Votes</em>}</li>
 *   <li>{@link fr.inria.atlanmod.decision.collaboration.Collaboration.impl.DecisionImpl#getDecides <em>Decides</em>}</li>
 *   <li>{@link fr.inria.atlanmod.decision.collaboration.Collaboration.impl.DecisionImpl#getStrategy <em>Strategy</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DecisionImpl extends EObjectImpl implements Decision {
	/**
	 * The default value of the '{@link #isAccepted() <em>Accepted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAccepted()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ACCEPTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAccepted() <em>Accepted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAccepted()
	 * @generated
	 * @ordered
	 */
	protected boolean accepted = ACCEPTED_EDEFAULT;

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
	 * The cached value of the '{@link #getVotes() <em>Votes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVotes()
	 * @generated
	 * @ordered
	 */
	protected EList<Vote> votes;

	/**
	 * The cached value of the '{@link #getDecides() <em>Decides</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecides()
	 * @generated
	 * @ordered
	 */
	protected Collaboration decides;

	/**
	 * The cached value of the '{@link #getStrategy() <em>Strategy</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategy()
	 * @generated
	 * @ordered
	 */
	protected Strategy strategy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DecisionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CollaborationPackage.Literals.DECISION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAccepted() {
		return accepted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccepted(boolean newAccepted) {
		boolean oldAccepted = accepted;
		accepted = newAccepted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollaborationPackage.DECISION__ACCEPTED, oldAccepted, accepted));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CollaborationPackage.DECISION__TIME_STAMP, oldTimeStamp, timeStamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Vote> getVotes() {
		if (votes == null) {
			votes = new EObjectWithInverseResolvingEList<Vote>(Vote.class, this, CollaborationPackage.DECISION__VOTES, CollaborationPackage.VOTE__ARE_PART);
		}
		return votes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collaboration getDecides() {
		if (decides != null && decides.eIsProxy()) {
			InternalEObject oldDecides = (InternalEObject)decides;
			decides = (Collaboration)eResolveProxy(oldDecides);
			if (decides != oldDecides) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CollaborationPackage.DECISION__DECIDES, oldDecides, decides));
			}
		}
		return decides;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collaboration basicGetDecides() {
		return decides;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDecides(Collaboration newDecides, NotificationChain msgs) {
		Collaboration oldDecides = decides;
		decides = newDecides;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CollaborationPackage.DECISION__DECIDES, oldDecides, newDecides);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecides(Collaboration newDecides) {
		if (newDecides != decides) {
			NotificationChain msgs = null;
			if (decides != null)
				msgs = ((InternalEObject)decides).eInverseRemove(this, CollaborationPackage.COLLABORATION__IS_DECIDED, Collaboration.class, msgs);
			if (newDecides != null)
				msgs = ((InternalEObject)newDecides).eInverseAdd(this, CollaborationPackage.COLLABORATION__IS_DECIDED, Collaboration.class, msgs);
			msgs = basicSetDecides(newDecides, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollaborationPackage.DECISION__DECIDES, newDecides, newDecides));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Strategy getStrategy() {
		if (strategy != null && strategy.eIsProxy()) {
			InternalEObject oldStrategy = (InternalEObject)strategy;
			strategy = (Strategy)eResolveProxy(oldStrategy);
			if (strategy != oldStrategy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CollaborationPackage.DECISION__STRATEGY, oldStrategy, strategy));
			}
		}
		return strategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Strategy basicGetStrategy() {
		return strategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrategy(Strategy newStrategy) {
		Strategy oldStrategy = strategy;
		strategy = newStrategy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollaborationPackage.DECISION__STRATEGY, oldStrategy, strategy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CollaborationPackage.DECISION__VOTES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVotes()).basicAdd(otherEnd, msgs);
			case CollaborationPackage.DECISION__DECIDES:
				if (decides != null)
					msgs = ((InternalEObject)decides).eInverseRemove(this, CollaborationPackage.COLLABORATION__IS_DECIDED, Collaboration.class, msgs);
				return basicSetDecides((Collaboration)otherEnd, msgs);
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
			case CollaborationPackage.DECISION__VOTES:
				return ((InternalEList<?>)getVotes()).basicRemove(otherEnd, msgs);
			case CollaborationPackage.DECISION__DECIDES:
				return basicSetDecides(null, msgs);
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
			case CollaborationPackage.DECISION__ACCEPTED:
				return isAccepted();
			case CollaborationPackage.DECISION__TIME_STAMP:
				return getTimeStamp();
			case CollaborationPackage.DECISION__VOTES:
				return getVotes();
			case CollaborationPackage.DECISION__DECIDES:
				if (resolve) return getDecides();
				return basicGetDecides();
			case CollaborationPackage.DECISION__STRATEGY:
				if (resolve) return getStrategy();
				return basicGetStrategy();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CollaborationPackage.DECISION__ACCEPTED:
				setAccepted((Boolean)newValue);
				return;
			case CollaborationPackage.DECISION__TIME_STAMP:
				setTimeStamp((String)newValue);
				return;
			case CollaborationPackage.DECISION__VOTES:
				getVotes().clear();
				getVotes().addAll((Collection<? extends Vote>)newValue);
				return;
			case CollaborationPackage.DECISION__DECIDES:
				setDecides((Collaboration)newValue);
				return;
			case CollaborationPackage.DECISION__STRATEGY:
				setStrategy((Strategy)newValue);
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
			case CollaborationPackage.DECISION__ACCEPTED:
				setAccepted(ACCEPTED_EDEFAULT);
				return;
			case CollaborationPackage.DECISION__TIME_STAMP:
				setTimeStamp(TIME_STAMP_EDEFAULT);
				return;
			case CollaborationPackage.DECISION__VOTES:
				getVotes().clear();
				return;
			case CollaborationPackage.DECISION__DECIDES:
				setDecides((Collaboration)null);
				return;
			case CollaborationPackage.DECISION__STRATEGY:
				setStrategy((Strategy)null);
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
			case CollaborationPackage.DECISION__ACCEPTED:
				return accepted != ACCEPTED_EDEFAULT;
			case CollaborationPackage.DECISION__TIME_STAMP:
				return TIME_STAMP_EDEFAULT == null ? timeStamp != null : !TIME_STAMP_EDEFAULT.equals(timeStamp);
			case CollaborationPackage.DECISION__VOTES:
				return votes != null && !votes.isEmpty();
			case CollaborationPackage.DECISION__DECIDES:
				return decides != null;
			case CollaborationPackage.DECISION__STRATEGY:
				return strategy != null;
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
		result.append(" (accepted: ");
		result.append(accepted);
		result.append(", timeStamp: ");
		result.append(timeStamp);
		result.append(')');
		return result.toString();
	}

} //DecisionImpl
