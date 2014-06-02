/**
 */
package fr.inria.atlanmod.governance.strategy.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import fr.inria.atlanmod.governance.strategy.LeaderDriven;
import fr.inria.atlanmod.governance.strategy.Rule;
import fr.inria.atlanmod.governance.strategy.StrategyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Leader Driven</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.atlanmod.governance.strategy.impl.LeaderDrivenImpl#getDefault <em>Default</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LeaderDrivenImpl extends RuleImpl implements LeaderDriven {
	/**
	 * The cached value of the '{@link #getDefault() <em>Default</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected Rule default_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LeaderDrivenImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StrategyPackage.Literals.LEADER_DRIVEN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule getDefault() {
		if (default_ != null && default_.eIsProxy()) {
			InternalEObject oldDefault = (InternalEObject)default_;
			default_ = (Rule)eResolveProxy(oldDefault);
			if (default_ != oldDefault) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StrategyPackage.LEADER_DRIVEN__DEFAULT, oldDefault, default_));
			}
		}
		return default_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule basicGetDefault() {
		return default_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefault(Rule newDefault) {
		Rule oldDefault = default_;
		default_ = newDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StrategyPackage.LEADER_DRIVEN__DEFAULT, oldDefault, default_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StrategyPackage.LEADER_DRIVEN__DEFAULT:
				if (resolve) return getDefault();
				return basicGetDefault();
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
			case StrategyPackage.LEADER_DRIVEN__DEFAULT:
				setDefault((Rule)newValue);
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
			case StrategyPackage.LEADER_DRIVEN__DEFAULT:
				setDefault((Rule)null);
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
			case StrategyPackage.LEADER_DRIVEN__DEFAULT:
				return default_ != null;
		}
		return super.eIsSet(featureID);
	}

} //LeaderDrivenImpl
