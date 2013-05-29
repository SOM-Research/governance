/**
 */
package fr.inria.atlanmod.decision.collaboration.Collaboration.impl;

import fr.inria.atlanmod.decision.collaboration.Collaboration.Collaboration;
import fr.inria.atlanmod.decision.collaboration.Collaboration.CollaborationPackage;
import fr.inria.atlanmod.decision.collaboration.Collaboration.Decision;
import fr.inria.atlanmod.decision.collaboration.Collaboration.Interactions;
import fr.inria.atlanmod.decision.collaboration.Collaboration.User;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interactions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.atlanmod.decision.collaboration.Collaboration.impl.InteractionsImpl#getUsers <em>Users</em>}</li>
 *   <li>{@link fr.inria.atlanmod.decision.collaboration.Collaboration.impl.InteractionsImpl#getCollaborations <em>Collaborations</em>}</li>
 *   <li>{@link fr.inria.atlanmod.decision.collaboration.Collaboration.impl.InteractionsImpl#getDecisions <em>Decisions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InteractionsImpl extends EObjectImpl implements Interactions {
	/**
	 * The cached value of the '{@link #getUsers() <em>Users</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsers()
	 * @generated
	 * @ordered
	 */
	protected EList<User> users;

	/**
	 * The cached value of the '{@link #getCollaborations() <em>Collaborations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollaborations()
	 * @generated
	 * @ordered
	 */
	protected EList<Collaboration> collaborations;

	/**
	 * The cached value of the '{@link #getDecisions() <em>Decisions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecisions()
	 * @generated
	 * @ordered
	 */
	protected EList<Decision> decisions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InteractionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CollaborationPackage.Literals.INTERACTIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<User> getUsers() {
		if (users == null) {
			users = new EObjectContainmentEList<User>(User.class, this, CollaborationPackage.INTERACTIONS__USERS);
		}
		return users;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Collaboration> getCollaborations() {
		if (collaborations == null) {
			collaborations = new EObjectContainmentEList<Collaboration>(Collaboration.class, this, CollaborationPackage.INTERACTIONS__COLLABORATIONS);
		}
		return collaborations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Decision> getDecisions() {
		if (decisions == null) {
			decisions = new EObjectContainmentEList<Decision>(Decision.class, this, CollaborationPackage.INTERACTIONS__DECISIONS);
		}
		return decisions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CollaborationPackage.INTERACTIONS__USERS:
				return ((InternalEList<?>)getUsers()).basicRemove(otherEnd, msgs);
			case CollaborationPackage.INTERACTIONS__COLLABORATIONS:
				return ((InternalEList<?>)getCollaborations()).basicRemove(otherEnd, msgs);
			case CollaborationPackage.INTERACTIONS__DECISIONS:
				return ((InternalEList<?>)getDecisions()).basicRemove(otherEnd, msgs);
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
			case CollaborationPackage.INTERACTIONS__USERS:
				return getUsers();
			case CollaborationPackage.INTERACTIONS__COLLABORATIONS:
				return getCollaborations();
			case CollaborationPackage.INTERACTIONS__DECISIONS:
				return getDecisions();
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
			case CollaborationPackage.INTERACTIONS__USERS:
				getUsers().clear();
				getUsers().addAll((Collection<? extends User>)newValue);
				return;
			case CollaborationPackage.INTERACTIONS__COLLABORATIONS:
				getCollaborations().clear();
				getCollaborations().addAll((Collection<? extends Collaboration>)newValue);
				return;
			case CollaborationPackage.INTERACTIONS__DECISIONS:
				getDecisions().clear();
				getDecisions().addAll((Collection<? extends Decision>)newValue);
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
			case CollaborationPackage.INTERACTIONS__USERS:
				getUsers().clear();
				return;
			case CollaborationPackage.INTERACTIONS__COLLABORATIONS:
				getCollaborations().clear();
				return;
			case CollaborationPackage.INTERACTIONS__DECISIONS:
				getDecisions().clear();
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
			case CollaborationPackage.INTERACTIONS__USERS:
				return users != null && !users.isEmpty();
			case CollaborationPackage.INTERACTIONS__COLLABORATIONS:
				return collaborations != null && !collaborations.isEmpty();
			case CollaborationPackage.INTERACTIONS__DECISIONS:
				return decisions != null && !decisions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InteractionsImpl
