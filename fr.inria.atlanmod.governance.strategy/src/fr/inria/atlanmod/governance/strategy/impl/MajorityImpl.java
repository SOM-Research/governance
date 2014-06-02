/**
 */
package fr.inria.atlanmod.governance.strategy.impl;

import fr.inria.atlanmod.governance.strategy.Majority;
import fr.inria.atlanmod.governance.strategy.RangeType;
import fr.inria.atlanmod.governance.strategy.StrategyPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Majority</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.atlanmod.governance.strategy.impl.MajorityImpl#getRange <em>Range</em>}</li>
 *   <li>{@link fr.inria.atlanmod.governance.strategy.impl.MajorityImpl#getMinVotes <em>Min Votes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MajorityImpl extends RuleImpl implements Majority {
	/**
	 * The default value of the '{@link #getRange() <em>Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange()
	 * @generated
	 * @ordered
	 */
	protected static final RangeType RANGE_EDEFAULT = RangeType.PRESENT;

	/**
	 * The cached value of the '{@link #getRange() <em>Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange()
	 * @generated
	 * @ordered
	 */
	protected RangeType range = RANGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinVotes() <em>Min Votes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinVotes()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_VOTES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinVotes() <em>Min Votes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinVotes()
	 * @generated
	 * @ordered
	 */
	protected int minVotes = MIN_VOTES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MajorityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StrategyPackage.Literals.MAJORITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeType getRange() {
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRange(RangeType newRange) {
		RangeType oldRange = range;
		range = newRange == null ? RANGE_EDEFAULT : newRange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StrategyPackage.MAJORITY__RANGE, oldRange, range));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinVotes() {
		return minVotes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinVotes(int newMinVotes) {
		int oldMinVotes = minVotes;
		minVotes = newMinVotes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StrategyPackage.MAJORITY__MIN_VOTES, oldMinVotes, minVotes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StrategyPackage.MAJORITY__RANGE:
				return getRange();
			case StrategyPackage.MAJORITY__MIN_VOTES:
				return getMinVotes();
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
			case StrategyPackage.MAJORITY__RANGE:
				setRange((RangeType)newValue);
				return;
			case StrategyPackage.MAJORITY__MIN_VOTES:
				setMinVotes((Integer)newValue);
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
			case StrategyPackage.MAJORITY__RANGE:
				setRange(RANGE_EDEFAULT);
				return;
			case StrategyPackage.MAJORITY__MIN_VOTES:
				setMinVotes(MIN_VOTES_EDEFAULT);
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
			case StrategyPackage.MAJORITY__RANGE:
				return range != RANGE_EDEFAULT;
			case StrategyPackage.MAJORITY__MIN_VOTES:
				return minVotes != MIN_VOTES_EDEFAULT;
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
		result.append(" (range: ");
		result.append(range);
		result.append(", minVotes: ");
		result.append(minVotes);
		result.append(')');
		return result.toString();
	}

} //MajorityImpl
