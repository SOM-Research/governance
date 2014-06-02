/**
 */
package fr.inria.atlanmod.governance.strategy.impl;

import fr.inria.atlanmod.governance.strategy.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StrategyFactoryImpl extends EFactoryImpl implements StrategyFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StrategyFactory init() {
		try {
			StrategyFactory theStrategyFactory = (StrategyFactory)EPackage.Registry.INSTANCE.getEFactory(StrategyPackage.eNS_URI);
			if (theStrategyFactory != null) {
				return theStrategyFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StrategyFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrategyFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case StrategyPackage.PROJECT: return createProject();
			case StrategyPackage.ROLE: return createRole();
			case StrategyPackage.MAJORITY: return createMajority();
			case StrategyPackage.RATIO_MAJORITY: return createRatioMajority();
			case StrategyPackage.LEADER_DRIVEN: return createLeaderDriven();
			case StrategyPackage.PHASED_RULE: return createPhasedRule();
			case StrategyPackage.TIMER: return createTimer();
			case StrategyPackage.OCL_CONDITION: return createOCLCondition();
			case StrategyPackage.WAIT_FOR_VOTE: return createWaitForVote();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case StrategyPackage.RANGE_TYPE:
				return createRangeTypeFromString(eDataType, initialValue);
			case StrategyPackage.COLLABORATION_TYPE:
				return createCollaborationTypeFromString(eDataType, initialValue);
			case StrategyPackage.STAGE_TYPE:
				return createStageTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case StrategyPackage.RANGE_TYPE:
				return convertRangeTypeToString(eDataType, instanceValue);
			case StrategyPackage.COLLABORATION_TYPE:
				return convertCollaborationTypeToString(eDataType, instanceValue);
			case StrategyPackage.STAGE_TYPE:
				return convertStageTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project createProject() {
		ProjectImpl project = new ProjectImpl();
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role createRole() {
		RoleImpl role = new RoleImpl();
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Majority createMajority() {
		MajorityImpl majority = new MajorityImpl();
		return majority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RatioMajority createRatioMajority() {
		RatioMajorityImpl ratioMajority = new RatioMajorityImpl();
		return ratioMajority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeaderDriven createLeaderDriven() {
		LeaderDrivenImpl leaderDriven = new LeaderDrivenImpl();
		return leaderDriven;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhasedRule createPhasedRule() {
		PhasedRuleImpl phasedRule = new PhasedRuleImpl();
		return phasedRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Timer createTimer() {
		TimerImpl timer = new TimerImpl();
		return timer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLCondition createOCLCondition() {
		OCLConditionImpl oclCondition = new OCLConditionImpl();
		return oclCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WaitForVote createWaitForVote() {
		WaitForVoteImpl waitForVote = new WaitForVoteImpl();
		return waitForVote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeType createRangeTypeFromString(EDataType eDataType, String initialValue) {
		RangeType result = RangeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRangeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollaborationType createCollaborationTypeFromString(EDataType eDataType, String initialValue) {
		CollaborationType result = CollaborationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCollaborationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StageType createStageTypeFromString(EDataType eDataType, String initialValue) {
		StageType result = StageType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStageTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrategyPackage getStrategyPackage() {
		return (StrategyPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StrategyPackage getPackage() {
		return StrategyPackage.eINSTANCE;
	}

} //StrategyFactoryImpl
