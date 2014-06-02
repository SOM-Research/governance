/**
 */
package fr.inria.atlanmod.governance.strategy.impl;

import fr.inria.atlanmod.governance.strategy.PhasedRule;
import fr.inria.atlanmod.governance.strategy.Rule;
import fr.inria.atlanmod.governance.strategy.StrategyPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Phased Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.atlanmod.governance.strategy.impl.PhasedRuleImpl#getPhases <em>Phases</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PhasedRuleImpl extends RuleImpl implements PhasedRule {
	/**
	 * The cached value of the '{@link #getPhases() <em>Phases</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhases()
	 * @generated
	 * @ordered
	 */
	protected EList<Rule> phases;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhasedRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StrategyPackage.Literals.PHASED_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rule> getPhases() {
		if (phases == null) {
			phases = new EObjectResolvingEList<Rule>(Rule.class, this, StrategyPackage.PHASED_RULE__PHASES);
		}
		return phases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StrategyPackage.PHASED_RULE__PHASES:
				return getPhases();
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
			case StrategyPackage.PHASED_RULE__PHASES:
				getPhases().clear();
				getPhases().addAll((Collection<? extends Rule>)newValue);
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
			case StrategyPackage.PHASED_RULE__PHASES:
				getPhases().clear();
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
			case StrategyPackage.PHASED_RULE__PHASES:
				return phases != null && !phases.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PhasedRuleImpl
