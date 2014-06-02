/**
 */
package fr.inria.atlanmod.governance.strategy.impl;

import fr.inria.atlanmod.governance.strategy.CollaborationType;
import fr.inria.atlanmod.governance.strategy.Deadline;
import fr.inria.atlanmod.governance.strategy.Role;
import fr.inria.atlanmod.governance.strategy.Rule;
import fr.inria.atlanmod.governance.strategy.StageType;
import fr.inria.atlanmod.governance.strategy.StrategyPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.atlanmod.governance.strategy.impl.RuleImpl#getDeadline <em>Deadline</em>}</li>
 *   <li>{@link fr.inria.atlanmod.governance.strategy.impl.RuleImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link fr.inria.atlanmod.governance.strategy.impl.RuleImpl#getPeople <em>People</em>}</li>
 *   <li>{@link fr.inria.atlanmod.governance.strategy.impl.RuleImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.inria.atlanmod.governance.strategy.impl.RuleImpl#getAppliedTo <em>Applied To</em>}</li>
 *   <li>{@link fr.inria.atlanmod.governance.strategy.impl.RuleImpl#getStage <em>Stage</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class RuleImpl extends EObjectImpl implements Rule {
	/**
	 * The cached value of the '{@link #getDeadline() <em>Deadline</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeadline()
	 * @generated
	 * @ordered
	 */
	protected Deadline deadline;

	/**
	 * The default value of the '{@link #getFilter() <em>Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilter()
	 * @generated
	 * @ordered
	 */
	protected static final String FILTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFilter() <em>Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilter()
	 * @generated
	 * @ordered
	 */
	protected String filter = FILTER_EDEFAULT;

	/**
	 * This is true if the Filter attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean filterESet;

	/**
	 * The cached value of the '{@link #getPeople() <em>People</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeople()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> people;

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
	 * The default value of the '{@link #getAppliedTo() <em>Applied To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppliedTo()
	 * @generated
	 * @ordered
	 */
	protected static final CollaborationType APPLIED_TO_EDEFAULT = CollaborationType.TASK;

	/**
	 * The cached value of the '{@link #getAppliedTo() <em>Applied To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppliedTo()
	 * @generated
	 * @ordered
	 */
	protected CollaborationType appliedTo = APPLIED_TO_EDEFAULT;

	/**
	 * This is true if the Applied To attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean appliedToESet;

	/**
	 * The default value of the '{@link #getStage() <em>Stage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStage()
	 * @generated
	 * @ordered
	 */
	protected static final StageType STAGE_EDEFAULT = StageType.TASK_REVIEW;

	/**
	 * The cached value of the '{@link #getStage() <em>Stage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStage()
	 * @generated
	 * @ordered
	 */
	protected StageType stage = STAGE_EDEFAULT;

	/**
	 * This is true if the Stage attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean stageESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StrategyPackage.Literals.RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deadline getDeadline() {
		if (deadline != null && deadline.eIsProxy()) {
			InternalEObject oldDeadline = (InternalEObject)deadline;
			deadline = (Deadline)eResolveProxy(oldDeadline);
			if (deadline != oldDeadline) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StrategyPackage.RULE__DEADLINE, oldDeadline, deadline));
			}
		}
		return deadline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deadline basicGetDeadline() {
		return deadline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeadline(Deadline newDeadline) {
		Deadline oldDeadline = deadline;
		deadline = newDeadline;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StrategyPackage.RULE__DEADLINE, oldDeadline, deadline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFilter() {
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilter(String newFilter) {
		String oldFilter = filter;
		filter = newFilter;
		boolean oldFilterESet = filterESet;
		filterESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StrategyPackage.RULE__FILTER, oldFilter, filter, !oldFilterESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFilter() {
		String oldFilter = filter;
		boolean oldFilterESet = filterESet;
		filter = FILTER_EDEFAULT;
		filterESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StrategyPackage.RULE__FILTER, oldFilter, FILTER_EDEFAULT, oldFilterESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFilter() {
		return filterESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role> getPeople() {
		if (people == null) {
			people = new EObjectResolvingEList<Role>(Role.class, this, StrategyPackage.RULE__PEOPLE);
		}
		return people;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StrategyPackage.RULE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollaborationType getAppliedTo() {
		return appliedTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppliedTo(CollaborationType newAppliedTo) {
		CollaborationType oldAppliedTo = appliedTo;
		appliedTo = newAppliedTo == null ? APPLIED_TO_EDEFAULT : newAppliedTo;
		boolean oldAppliedToESet = appliedToESet;
		appliedToESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StrategyPackage.RULE__APPLIED_TO, oldAppliedTo, appliedTo, !oldAppliedToESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAppliedTo() {
		CollaborationType oldAppliedTo = appliedTo;
		boolean oldAppliedToESet = appliedToESet;
		appliedTo = APPLIED_TO_EDEFAULT;
		appliedToESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StrategyPackage.RULE__APPLIED_TO, oldAppliedTo, APPLIED_TO_EDEFAULT, oldAppliedToESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAppliedTo() {
		return appliedToESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StageType getStage() {
		return stage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStage(StageType newStage) {
		StageType oldStage = stage;
		stage = newStage == null ? STAGE_EDEFAULT : newStage;
		boolean oldStageESet = stageESet;
		stageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StrategyPackage.RULE__STAGE, oldStage, stage, !oldStageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStage() {
		StageType oldStage = stage;
		boolean oldStageESet = stageESet;
		stage = STAGE_EDEFAULT;
		stageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StrategyPackage.RULE__STAGE, oldStage, STAGE_EDEFAULT, oldStageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStage() {
		return stageESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StrategyPackage.RULE__DEADLINE:
				if (resolve) return getDeadline();
				return basicGetDeadline();
			case StrategyPackage.RULE__FILTER:
				return getFilter();
			case StrategyPackage.RULE__PEOPLE:
				return getPeople();
			case StrategyPackage.RULE__NAME:
				return getName();
			case StrategyPackage.RULE__APPLIED_TO:
				return getAppliedTo();
			case StrategyPackage.RULE__STAGE:
				return getStage();
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
			case StrategyPackage.RULE__DEADLINE:
				setDeadline((Deadline)newValue);
				return;
			case StrategyPackage.RULE__FILTER:
				setFilter((String)newValue);
				return;
			case StrategyPackage.RULE__PEOPLE:
				getPeople().clear();
				getPeople().addAll((Collection<? extends Role>)newValue);
				return;
			case StrategyPackage.RULE__NAME:
				setName((String)newValue);
				return;
			case StrategyPackage.RULE__APPLIED_TO:
				setAppliedTo((CollaborationType)newValue);
				return;
			case StrategyPackage.RULE__STAGE:
				setStage((StageType)newValue);
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
			case StrategyPackage.RULE__DEADLINE:
				setDeadline((Deadline)null);
				return;
			case StrategyPackage.RULE__FILTER:
				unsetFilter();
				return;
			case StrategyPackage.RULE__PEOPLE:
				getPeople().clear();
				return;
			case StrategyPackage.RULE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case StrategyPackage.RULE__APPLIED_TO:
				unsetAppliedTo();
				return;
			case StrategyPackage.RULE__STAGE:
				unsetStage();
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
			case StrategyPackage.RULE__DEADLINE:
				return deadline != null;
			case StrategyPackage.RULE__FILTER:
				return isSetFilter();
			case StrategyPackage.RULE__PEOPLE:
				return people != null && !people.isEmpty();
			case StrategyPackage.RULE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case StrategyPackage.RULE__APPLIED_TO:
				return isSetAppliedTo();
			case StrategyPackage.RULE__STAGE:
				return isSetStage();
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
		result.append(" (filter: ");
		if (filterESet) result.append(filter); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(", appliedTo: ");
		if (appliedToESet) result.append(appliedTo); else result.append("<unset>");
		result.append(", stage: ");
		if (stageESet) result.append(stage); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //RuleImpl
