/**
 */
package fr.inria.atlanmod.decision.collaboration.Collaboration.impl;

import fr.inria.atlanmod.decision.collaboration.Collaboration.Collaboration;
import fr.inria.atlanmod.decision.collaboration.Collaboration.CollaborationPackage;
import fr.inria.atlanmod.decision.collaboration.Collaboration.Decision;
import fr.inria.atlanmod.decision.collaboration.Collaboration.Metadata;
import fr.inria.atlanmod.decision.collaboration.Collaboration.User;
import fr.inria.atlanmod.decision.collaboration.Collaboration.Vote;

import fr.inria.atlanmod.governance.strategy.CollaborationType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collaboration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.atlanmod.decision.collaboration.Collaboration.impl.CollaborationImpl#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link fr.inria.atlanmod.decision.collaboration.Collaboration.impl.CollaborationImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.inria.atlanmod.decision.collaboration.Collaboration.impl.CollaborationImpl#getRationale <em>Rationale</em>}</li>
 *   <li>{@link fr.inria.atlanmod.decision.collaboration.Collaboration.impl.CollaborationImpl#getType <em>Type</em>}</li>
 *   <li>{@link fr.inria.atlanmod.decision.collaboration.Collaboration.impl.CollaborationImpl#getVotes <em>Votes</em>}</li>
 *   <li>{@link fr.inria.atlanmod.decision.collaboration.Collaboration.impl.CollaborationImpl#getLeader <em>Leader</em>}</li>
 *   <li>{@link fr.inria.atlanmod.decision.collaboration.Collaboration.impl.CollaborationImpl#getIsDecided <em>Is Decided</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CollaborationImpl extends EObjectImpl implements Collaboration {
	/**
	 * The cached value of the '{@link #getMetadata() <em>Metadata</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadata()
	 * @generated
	 * @ordered
	 */
	protected EList<Metadata> metadata;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final CollaborationType TYPE_EDEFAULT = CollaborationType.TASK;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CollaborationType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVotes() <em>Votes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVotes()
	 * @generated
	 * @ordered
	 */
	protected EList<Vote> votes;

	/**
	 * The cached value of the '{@link #getLeader() <em>Leader</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeader()
	 * @generated
	 * @ordered
	 */
	protected User leader;

	/**
	 * The cached value of the '{@link #getIsDecided() <em>Is Decided</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDecided()
	 * @generated
	 * @ordered
	 */
	protected EList<Decision> isDecided;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollaborationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CollaborationPackage.Literals.COLLABORATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Metadata> getMetadata() {
		if (metadata == null) {
			metadata = new EObjectContainmentEList<Metadata>(Metadata.class, this, CollaborationPackage.COLLABORATION__METADATA);
		}
		return metadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollaborationPackage.COLLABORATION__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CollaborationPackage.COLLABORATION__RATIONALE, oldRationale, rationale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollaborationType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(CollaborationType newType) {
		CollaborationType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollaborationPackage.COLLABORATION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Vote> getVotes() {
		if (votes == null) {
			votes = new EObjectContainmentEList<Vote>(Vote.class, this, CollaborationPackage.COLLABORATION__VOTES);
		}
		return votes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User getLeader() {
		if (leader != null && leader.eIsProxy()) {
			InternalEObject oldLeader = (InternalEObject)leader;
			leader = (User)eResolveProxy(oldLeader);
			if (leader != oldLeader) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CollaborationPackage.COLLABORATION__LEADER, oldLeader, leader));
			}
		}
		return leader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User basicGetLeader() {
		return leader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeader(User newLeader, NotificationChain msgs) {
		User oldLeader = leader;
		leader = newLeader;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CollaborationPackage.COLLABORATION__LEADER, oldLeader, newLeader);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeader(User newLeader) {
		if (newLeader != leader) {
			NotificationChain msgs = null;
			if (leader != null)
				msgs = ((InternalEObject)leader).eInverseRemove(this, CollaborationPackage.USER__LEADS, User.class, msgs);
			if (newLeader != null)
				msgs = ((InternalEObject)newLeader).eInverseAdd(this, CollaborationPackage.USER__LEADS, User.class, msgs);
			msgs = basicSetLeader(newLeader, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollaborationPackage.COLLABORATION__LEADER, newLeader, newLeader));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Decision> getIsDecided() {
		if (isDecided == null) {
			isDecided = new EObjectWithInverseResolvingEList<Decision>(Decision.class, this, CollaborationPackage.COLLABORATION__IS_DECIDED, CollaborationPackage.DECISION__DECIDES);
		}
		return isDecided;
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
			case CollaborationPackage.COLLABORATION__LEADER:
				if (leader != null)
					msgs = ((InternalEObject)leader).eInverseRemove(this, CollaborationPackage.USER__LEADS, User.class, msgs);
				return basicSetLeader((User)otherEnd, msgs);
			case CollaborationPackage.COLLABORATION__IS_DECIDED:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsDecided()).basicAdd(otherEnd, msgs);
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
			case CollaborationPackage.COLLABORATION__METADATA:
				return ((InternalEList<?>)getMetadata()).basicRemove(otherEnd, msgs);
			case CollaborationPackage.COLLABORATION__VOTES:
				return ((InternalEList<?>)getVotes()).basicRemove(otherEnd, msgs);
			case CollaborationPackage.COLLABORATION__LEADER:
				return basicSetLeader(null, msgs);
			case CollaborationPackage.COLLABORATION__IS_DECIDED:
				return ((InternalEList<?>)getIsDecided()).basicRemove(otherEnd, msgs);
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
			case CollaborationPackage.COLLABORATION__METADATA:
				return getMetadata();
			case CollaborationPackage.COLLABORATION__NAME:
				return getName();
			case CollaborationPackage.COLLABORATION__RATIONALE:
				return getRationale();
			case CollaborationPackage.COLLABORATION__TYPE:
				return getType();
			case CollaborationPackage.COLLABORATION__VOTES:
				return getVotes();
			case CollaborationPackage.COLLABORATION__LEADER:
				if (resolve) return getLeader();
				return basicGetLeader();
			case CollaborationPackage.COLLABORATION__IS_DECIDED:
				return getIsDecided();
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
			case CollaborationPackage.COLLABORATION__METADATA:
				getMetadata().clear();
				getMetadata().addAll((Collection<? extends Metadata>)newValue);
				return;
			case CollaborationPackage.COLLABORATION__NAME:
				setName((String)newValue);
				return;
			case CollaborationPackage.COLLABORATION__RATIONALE:
				setRationale((String)newValue);
				return;
			case CollaborationPackage.COLLABORATION__TYPE:
				setType((CollaborationType)newValue);
				return;
			case CollaborationPackage.COLLABORATION__VOTES:
				getVotes().clear();
				getVotes().addAll((Collection<? extends Vote>)newValue);
				return;
			case CollaborationPackage.COLLABORATION__LEADER:
				setLeader((User)newValue);
				return;
			case CollaborationPackage.COLLABORATION__IS_DECIDED:
				getIsDecided().clear();
				getIsDecided().addAll((Collection<? extends Decision>)newValue);
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
			case CollaborationPackage.COLLABORATION__METADATA:
				getMetadata().clear();
				return;
			case CollaborationPackage.COLLABORATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CollaborationPackage.COLLABORATION__RATIONALE:
				setRationale(RATIONALE_EDEFAULT);
				return;
			case CollaborationPackage.COLLABORATION__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case CollaborationPackage.COLLABORATION__VOTES:
				getVotes().clear();
				return;
			case CollaborationPackage.COLLABORATION__LEADER:
				setLeader((User)null);
				return;
			case CollaborationPackage.COLLABORATION__IS_DECIDED:
				getIsDecided().clear();
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
			case CollaborationPackage.COLLABORATION__METADATA:
				return metadata != null && !metadata.isEmpty();
			case CollaborationPackage.COLLABORATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CollaborationPackage.COLLABORATION__RATIONALE:
				return RATIONALE_EDEFAULT == null ? rationale != null : !RATIONALE_EDEFAULT.equals(rationale);
			case CollaborationPackage.COLLABORATION__TYPE:
				return type != TYPE_EDEFAULT;
			case CollaborationPackage.COLLABORATION__VOTES:
				return votes != null && !votes.isEmpty();
			case CollaborationPackage.COLLABORATION__LEADER:
				return leader != null;
			case CollaborationPackage.COLLABORATION__IS_DECIDED:
				return isDecided != null && !isDecided.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", rationale: ");
		result.append(rationale);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //CollaborationImpl
