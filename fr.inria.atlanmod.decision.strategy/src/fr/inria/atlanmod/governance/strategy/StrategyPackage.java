/**
 */
package fr.inria.atlanmod.governance.strategy;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.inria.atlanmod.governance.strategy.StrategyFactory
 * @model kind="package"
 * @generated
 */
public interface StrategyPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "strategy";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://atlanmod.fr/strategy";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "strategy";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StrategyPackage eINSTANCE = fr.inria.atlanmod.governance.strategy.impl.StrategyPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.inria.atlanmod.governance.strategy.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.atlanmod.governance.strategy.impl.ProjectImpl
	 * @see fr.inria.atlanmod.governance.strategy.impl.StrategyPackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Strategies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__STRATEGIES = 1;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__ROLES = 2;

	/**
	 * The feature id for the '<em><b>Deadlines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__DEADLINES = 3;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link fr.inria.atlanmod.governance.strategy.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.atlanmod.governance.strategy.impl.RoleImpl
	 * @see fr.inria.atlanmod.governance.strategy.impl.StrategyPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link fr.inria.atlanmod.governance.strategy.impl.StrategyImpl <em>Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.atlanmod.governance.strategy.impl.StrategyImpl
	 * @see fr.inria.atlanmod.governance.strategy.impl.StrategyPackageImpl#getStrategy()
	 * @generated
	 */
	int STRATEGY = 2;

	/**
	 * The feature id for the '<em><b>Deadline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__DEADLINE = 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__FILTER = 1;

	/**
	 * The feature id for the '<em><b>People</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__PEOPLE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__NAME = 3;

	/**
	 * The feature id for the '<em><b>Applied To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__APPLIED_TO = 4;

	/**
	 * The feature id for the '<em><b>Stage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__STAGE = 5;

	/**
	 * The number of structural features of the '<em>Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link fr.inria.atlanmod.governance.strategy.impl.MajorityImpl <em>Majority</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.atlanmod.governance.strategy.impl.MajorityImpl
	 * @see fr.inria.atlanmod.governance.strategy.impl.StrategyPackageImpl#getMajority()
	 * @generated
	 */
	int MAJORITY = 3;

	/**
	 * The feature id for the '<em><b>Deadline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAJORITY__DEADLINE = STRATEGY__DEADLINE;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAJORITY__FILTER = STRATEGY__FILTER;

	/**
	 * The feature id for the '<em><b>People</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAJORITY__PEOPLE = STRATEGY__PEOPLE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAJORITY__NAME = STRATEGY__NAME;

	/**
	 * The feature id for the '<em><b>Applied To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAJORITY__APPLIED_TO = STRATEGY__APPLIED_TO;

	/**
	 * The feature id for the '<em><b>Stage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAJORITY__STAGE = STRATEGY__STAGE;

	/**
	 * The feature id for the '<em><b>Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAJORITY__RANGE = STRATEGY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min Votes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAJORITY__MIN_VOTES = STRATEGY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Majority</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAJORITY_FEATURE_COUNT = STRATEGY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.inria.atlanmod.governance.strategy.impl.RatioMajorityImpl <em>Ratio Majority</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.atlanmod.governance.strategy.impl.RatioMajorityImpl
	 * @see fr.inria.atlanmod.governance.strategy.impl.StrategyPackageImpl#getRatioMajority()
	 * @generated
	 */
	int RATIO_MAJORITY = 4;

	/**
	 * The feature id for the '<em><b>Deadline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MAJORITY__DEADLINE = MAJORITY__DEADLINE;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MAJORITY__FILTER = MAJORITY__FILTER;

	/**
	 * The feature id for the '<em><b>People</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MAJORITY__PEOPLE = MAJORITY__PEOPLE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MAJORITY__NAME = MAJORITY__NAME;

	/**
	 * The feature id for the '<em><b>Applied To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MAJORITY__APPLIED_TO = MAJORITY__APPLIED_TO;

	/**
	 * The feature id for the '<em><b>Stage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MAJORITY__STAGE = MAJORITY__STAGE;

	/**
	 * The feature id for the '<em><b>Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MAJORITY__RANGE = MAJORITY__RANGE;

	/**
	 * The feature id for the '<em><b>Min Votes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MAJORITY__MIN_VOTES = MAJORITY__MIN_VOTES;

	/**
	 * The feature id for the '<em><b>Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MAJORITY__RATIO = MAJORITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ratio Majority</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MAJORITY_FEATURE_COUNT = MAJORITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.inria.atlanmod.governance.strategy.impl.LeaderDrivenImpl <em>Leader Driven</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.atlanmod.governance.strategy.impl.LeaderDrivenImpl
	 * @see fr.inria.atlanmod.governance.strategy.impl.StrategyPackageImpl#getLeaderDriven()
	 * @generated
	 */
	int LEADER_DRIVEN = 5;

	/**
	 * The feature id for the '<em><b>Deadline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEADER_DRIVEN__DEADLINE = STRATEGY__DEADLINE;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEADER_DRIVEN__FILTER = STRATEGY__FILTER;

	/**
	 * The feature id for the '<em><b>People</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEADER_DRIVEN__PEOPLE = STRATEGY__PEOPLE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEADER_DRIVEN__NAME = STRATEGY__NAME;

	/**
	 * The feature id for the '<em><b>Applied To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEADER_DRIVEN__APPLIED_TO = STRATEGY__APPLIED_TO;

	/**
	 * The feature id for the '<em><b>Stage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEADER_DRIVEN__STAGE = STRATEGY__STAGE;

	/**
	 * The feature id for the '<em><b>Default</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEADER_DRIVEN__DEFAULT = STRATEGY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Leader Driven</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEADER_DRIVEN_FEATURE_COUNT = STRATEGY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.inria.atlanmod.governance.strategy.impl.PhasedStrategyImpl <em>Phased Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.atlanmod.governance.strategy.impl.PhasedStrategyImpl
	 * @see fr.inria.atlanmod.governance.strategy.impl.StrategyPackageImpl#getPhasedStrategy()
	 * @generated
	 */
	int PHASED_STRATEGY = 6;

	/**
	 * The feature id for the '<em><b>Deadline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASED_STRATEGY__DEADLINE = STRATEGY__DEADLINE;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASED_STRATEGY__FILTER = STRATEGY__FILTER;

	/**
	 * The feature id for the '<em><b>People</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASED_STRATEGY__PEOPLE = STRATEGY__PEOPLE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASED_STRATEGY__NAME = STRATEGY__NAME;

	/**
	 * The feature id for the '<em><b>Applied To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASED_STRATEGY__APPLIED_TO = STRATEGY__APPLIED_TO;

	/**
	 * The feature id for the '<em><b>Stage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASED_STRATEGY__STAGE = STRATEGY__STAGE;

	/**
	 * The feature id for the '<em><b>Phases</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASED_STRATEGY__PHASES = STRATEGY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Phased Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASED_STRATEGY_FEATURE_COUNT = STRATEGY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.inria.atlanmod.governance.strategy.impl.DeadlineImpl <em>Deadline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.atlanmod.governance.strategy.impl.DeadlineImpl
	 * @see fr.inria.atlanmod.governance.strategy.impl.StrategyPackageImpl#getDeadline()
	 * @generated
	 */
	int DEADLINE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEADLINE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Deadline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEADLINE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link fr.inria.atlanmod.governance.strategy.impl.TimerImpl <em>Timer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.atlanmod.governance.strategy.impl.TimerImpl
	 * @see fr.inria.atlanmod.governance.strategy.impl.StrategyPackageImpl#getTimer()
	 * @generated
	 */
	int TIMER = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER__NAME = DEADLINE__NAME;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER__TIME_STAMP = DEADLINE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Timer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_FEATURE_COUNT = DEADLINE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.inria.atlanmod.governance.strategy.impl.OCLConditionImpl <em>OCL Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.atlanmod.governance.strategy.impl.OCLConditionImpl
	 * @see fr.inria.atlanmod.governance.strategy.impl.StrategyPackageImpl#getOCLCondition()
	 * @generated
	 */
	int OCL_CONDITION = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CONDITION__NAME = DEADLINE__NAME;

	/**
	 * The feature id for the '<em><b>Ocl Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CONDITION__OCL_EXPRESSION = DEADLINE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>OCL Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CONDITION_FEATURE_COUNT = DEADLINE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.inria.atlanmod.governance.strategy.impl.WaitForVoteImpl <em>Wait For Vote</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.atlanmod.governance.strategy.impl.WaitForVoteImpl
	 * @see fr.inria.atlanmod.governance.strategy.impl.StrategyPackageImpl#getWaitForVote()
	 * @generated
	 */
	int WAIT_FOR_VOTE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_FOR_VOTE__NAME = DEADLINE__NAME;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_FOR_VOTE__ROLES = DEADLINE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Wait For Vote</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_FOR_VOTE_FEATURE_COUNT = DEADLINE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.inria.atlanmod.governance.strategy.RangeType <em>Range Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.atlanmod.governance.strategy.RangeType
	 * @see fr.inria.atlanmod.governance.strategy.impl.StrategyPackageImpl#getRangeType()
	 * @generated
	 */
	int RANGE_TYPE = 11;

	/**
	 * The meta object id for the '{@link fr.inria.atlanmod.governance.strategy.CollaborationType <em>Collaboration Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.atlanmod.governance.strategy.CollaborationType
	 * @see fr.inria.atlanmod.governance.strategy.impl.StrategyPackageImpl#getCollaborationType()
	 * @generated
	 */
	int COLLABORATION_TYPE = 12;

	/**
	 * The meta object id for the '{@link fr.inria.atlanmod.governance.strategy.StageType <em>Stage Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.atlanmod.governance.strategy.StageType
	 * @see fr.inria.atlanmod.governance.strategy.impl.StrategyPackageImpl#getStageType()
	 * @generated
	 */
	int STAGE_TYPE = 13;


	/**
	 * Returns the meta object for class '{@link fr.inria.atlanmod.governance.strategy.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see fr.inria.atlanmod.governance.strategy.Project
	 * @generated
	 */
	EClass getProject();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.atlanmod.governance.strategy.Project#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.inria.atlanmod.governance.strategy.Project#getName()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.atlanmod.governance.strategy.Project#getStrategies <em>Strategies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Strategies</em>'.
	 * @see fr.inria.atlanmod.governance.strategy.Project#getStrategies()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Strategies();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.atlanmod.governance.strategy.Project#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roles</em>'.
	 * @see fr.inria.atlanmod.governance.strategy.Project#getRoles()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Roles();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.atlanmod.governance.strategy.Project#getDeadlines <em>Deadlines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Deadlines</em>'.
	 * @see fr.inria.atlanmod.governance.strategy.Project#getDeadlines()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Deadlines();

	/**
	 * Returns the meta object for class '{@link fr.inria.atlanmod.governance.strategy.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see fr.inria.atlanmod.governance.strategy.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.atlanmod.governance.strategy.Role#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.inria.atlanmod.governance.strategy.Role#getName()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_Name();

	/**
	 * Returns the meta object for class '{@link fr.inria.atlanmod.governance.strategy.Strategy <em>Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strategy</em>'.
	 * @see fr.inria.atlanmod.governance.strategy.Strategy
	 * @generated
	 */
	EClass getStrategy();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.atlanmod.governance.strategy.Strategy#getDeadline <em>Deadline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Deadline</em>'.
	 * @see fr.inria.atlanmod.governance.strategy.Strategy#getDeadline()
	 * @see #getStrategy()
	 * @generated
	 */
	EReference getStrategy_Deadline();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.atlanmod.governance.strategy.Strategy#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see fr.inria.atlanmod.governance.strategy.Strategy#getFilter()
	 * @see #getStrategy()
	 * @generated
	 */
	EAttribute getStrategy_Filter();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.atlanmod.governance.strategy.Strategy#getPeople <em>People</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>People</em>'.
	 * @see fr.inria.atlanmod.governance.strategy.Strategy#getPeople()
	 * @see #getStrategy()
	 * @generated
	 */
	EReference getStrategy_People();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.atlanmod.governance.strategy.Strategy#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.inria.atlanmod.governance.strategy.Strategy#getName()
	 * @see #getStrategy()
	 * @generated
	 */
	EAttribute getStrategy_Name();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.atlanmod.governance.strategy.Strategy#getAppliedTo <em>Applied To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Applied To</em>'.
	 * @see fr.inria.atlanmod.governance.strategy.Strategy#getAppliedTo()
	 * @see #getStrategy()
	 * @generated
	 */
	EAttribute getStrategy_AppliedTo();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.atlanmod.governance.strategy.Strategy#getStage <em>Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stage</em>'.
	 * @see fr.inria.atlanmod.governance.strategy.Strategy#getStage()
	 * @see #getStrategy()
	 * @generated
	 */
	EAttribute getStrategy_Stage();

	/**
	 * Returns the meta object for class '{@link fr.inria.atlanmod.governance.strategy.Majority <em>Majority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Majority</em>'.
	 * @see fr.inria.atlanmod.governance.strategy.Majority
	 * @generated
	 */
	EClass getMajority();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.atlanmod.governance.strategy.Majority#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Range</em>'.
	 * @see fr.inria.atlanmod.governance.strategy.Majority#getRange()
	 * @see #getMajority()
	 * @generated
	 */
	EAttribute getMajority_Range();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.atlanmod.governance.strategy.Majority#getMinVotes <em>Min Votes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Votes</em>'.
	 * @see fr.inria.atlanmod.governance.strategy.Majority#getMinVotes()
	 * @see #getMajority()
	 * @generated
	 */
	EAttribute getMajority_MinVotes();

	/**
	 * Returns the meta object for class '{@link fr.inria.atlanmod.governance.strategy.RatioMajority <em>Ratio Majority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ratio Majority</em>'.
	 * @see fr.inria.atlanmod.governance.strategy.RatioMajority
	 * @generated
	 */
	EClass getRatioMajority();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.atlanmod.governance.strategy.RatioMajority#getRatio <em>Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ratio</em>'.
	 * @see fr.inria.atlanmod.governance.strategy.RatioMajority#getRatio()
	 * @see #getRatioMajority()
	 * @generated
	 */
	EAttribute getRatioMajority_Ratio();

	/**
	 * Returns the meta object for class '{@link fr.inria.atlanmod.governance.strategy.LeaderDriven <em>Leader Driven</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Leader Driven</em>'.
	 * @see fr.inria.atlanmod.governance.strategy.LeaderDriven
	 * @generated
	 */
	EClass getLeaderDriven();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.atlanmod.governance.strategy.LeaderDriven#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Default</em>'.
	 * @see fr.inria.atlanmod.governance.strategy.LeaderDriven#getDefault()
	 * @see #getLeaderDriven()
	 * @generated
	 */
	EReference getLeaderDriven_Default();

	/**
	 * Returns the meta object for class '{@link fr.inria.atlanmod.governance.strategy.PhasedStrategy <em>Phased Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Phased Strategy</em>'.
	 * @see fr.inria.atlanmod.governance.strategy.PhasedStrategy
	 * @generated
	 */
	EClass getPhasedStrategy();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.atlanmod.governance.strategy.PhasedStrategy#getPhases <em>Phases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Phases</em>'.
	 * @see fr.inria.atlanmod.governance.strategy.PhasedStrategy#getPhases()
	 * @see #getPhasedStrategy()
	 * @generated
	 */
	EReference getPhasedStrategy_Phases();

	/**
	 * Returns the meta object for class '{@link fr.inria.atlanmod.governance.strategy.Deadline <em>Deadline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deadline</em>'.
	 * @see fr.inria.atlanmod.governance.strategy.Deadline
	 * @generated
	 */
	EClass getDeadline();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.atlanmod.governance.strategy.Deadline#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.inria.atlanmod.governance.strategy.Deadline#getName()
	 * @see #getDeadline()
	 * @generated
	 */
	EAttribute getDeadline_Name();

	/**
	 * Returns the meta object for class '{@link fr.inria.atlanmod.governance.strategy.Timer <em>Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timer</em>'.
	 * @see fr.inria.atlanmod.governance.strategy.Timer
	 * @generated
	 */
	EClass getTimer();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.atlanmod.governance.strategy.Timer#getTimeStamp <em>Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Stamp</em>'.
	 * @see fr.inria.atlanmod.governance.strategy.Timer#getTimeStamp()
	 * @see #getTimer()
	 * @generated
	 */
	EAttribute getTimer_TimeStamp();

	/**
	 * Returns the meta object for class '{@link fr.inria.atlanmod.governance.strategy.OCLCondition <em>OCL Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OCL Condition</em>'.
	 * @see fr.inria.atlanmod.governance.strategy.OCLCondition
	 * @generated
	 */
	EClass getOCLCondition();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.atlanmod.governance.strategy.OCLCondition#getOclExpression <em>Ocl Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ocl Expression</em>'.
	 * @see fr.inria.atlanmod.governance.strategy.OCLCondition#getOclExpression()
	 * @see #getOCLCondition()
	 * @generated
	 */
	EAttribute getOCLCondition_OclExpression();

	/**
	 * Returns the meta object for class '{@link fr.inria.atlanmod.governance.strategy.WaitForVote <em>Wait For Vote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wait For Vote</em>'.
	 * @see fr.inria.atlanmod.governance.strategy.WaitForVote
	 * @generated
	 */
	EClass getWaitForVote();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.atlanmod.governance.strategy.WaitForVote#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Roles</em>'.
	 * @see fr.inria.atlanmod.governance.strategy.WaitForVote#getRoles()
	 * @see #getWaitForVote()
	 * @generated
	 */
	EReference getWaitForVote_Roles();

	/**
	 * Returns the meta object for enum '{@link fr.inria.atlanmod.governance.strategy.RangeType <em>Range Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Range Type</em>'.
	 * @see fr.inria.atlanmod.governance.strategy.RangeType
	 * @generated
	 */
	EEnum getRangeType();

	/**
	 * Returns the meta object for enum '{@link fr.inria.atlanmod.governance.strategy.CollaborationType <em>Collaboration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Collaboration Type</em>'.
	 * @see fr.inria.atlanmod.governance.strategy.CollaborationType
	 * @generated
	 */
	EEnum getCollaborationType();

	/**
	 * Returns the meta object for enum '{@link fr.inria.atlanmod.governance.strategy.StageType <em>Stage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Stage Type</em>'.
	 * @see fr.inria.atlanmod.governance.strategy.StageType
	 * @generated
	 */
	EEnum getStageType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StrategyFactory getStrategyFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fr.inria.atlanmod.governance.strategy.impl.ProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.atlanmod.governance.strategy.impl.ProjectImpl
		 * @see fr.inria.atlanmod.governance.strategy.impl.StrategyPackageImpl#getProject()
		 * @generated
		 */
		EClass PROJECT = eINSTANCE.getProject();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__NAME = eINSTANCE.getProject_Name();

		/**
		 * The meta object literal for the '<em><b>Strategies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__STRATEGIES = eINSTANCE.getProject_Strategies();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__ROLES = eINSTANCE.getProject_Roles();

		/**
		 * The meta object literal for the '<em><b>Deadlines</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__DEADLINES = eINSTANCE.getProject_Deadlines();

		/**
		 * The meta object literal for the '{@link fr.inria.atlanmod.governance.strategy.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.atlanmod.governance.strategy.impl.RoleImpl
		 * @see fr.inria.atlanmod.governance.strategy.impl.StrategyPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__NAME = eINSTANCE.getRole_Name();

		/**
		 * The meta object literal for the '{@link fr.inria.atlanmod.governance.strategy.impl.StrategyImpl <em>Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.atlanmod.governance.strategy.impl.StrategyImpl
		 * @see fr.inria.atlanmod.governance.strategy.impl.StrategyPackageImpl#getStrategy()
		 * @generated
		 */
		EClass STRATEGY = eINSTANCE.getStrategy();

		/**
		 * The meta object literal for the '<em><b>Deadline</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRATEGY__DEADLINE = eINSTANCE.getStrategy_Deadline();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRATEGY__FILTER = eINSTANCE.getStrategy_Filter();

		/**
		 * The meta object literal for the '<em><b>People</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRATEGY__PEOPLE = eINSTANCE.getStrategy_People();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRATEGY__NAME = eINSTANCE.getStrategy_Name();

		/**
		 * The meta object literal for the '<em><b>Applied To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRATEGY__APPLIED_TO = eINSTANCE.getStrategy_AppliedTo();

		/**
		 * The meta object literal for the '<em><b>Stage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRATEGY__STAGE = eINSTANCE.getStrategy_Stage();

		/**
		 * The meta object literal for the '{@link fr.inria.atlanmod.governance.strategy.impl.MajorityImpl <em>Majority</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.atlanmod.governance.strategy.impl.MajorityImpl
		 * @see fr.inria.atlanmod.governance.strategy.impl.StrategyPackageImpl#getMajority()
		 * @generated
		 */
		EClass MAJORITY = eINSTANCE.getMajority();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAJORITY__RANGE = eINSTANCE.getMajority_Range();

		/**
		 * The meta object literal for the '<em><b>Min Votes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAJORITY__MIN_VOTES = eINSTANCE.getMajority_MinVotes();

		/**
		 * The meta object literal for the '{@link fr.inria.atlanmod.governance.strategy.impl.RatioMajorityImpl <em>Ratio Majority</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.atlanmod.governance.strategy.impl.RatioMajorityImpl
		 * @see fr.inria.atlanmod.governance.strategy.impl.StrategyPackageImpl#getRatioMajority()
		 * @generated
		 */
		EClass RATIO_MAJORITY = eINSTANCE.getRatioMajority();

		/**
		 * The meta object literal for the '<em><b>Ratio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RATIO_MAJORITY__RATIO = eINSTANCE.getRatioMajority_Ratio();

		/**
		 * The meta object literal for the '{@link fr.inria.atlanmod.governance.strategy.impl.LeaderDrivenImpl <em>Leader Driven</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.atlanmod.governance.strategy.impl.LeaderDrivenImpl
		 * @see fr.inria.atlanmod.governance.strategy.impl.StrategyPackageImpl#getLeaderDriven()
		 * @generated
		 */
		EClass LEADER_DRIVEN = eINSTANCE.getLeaderDriven();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEADER_DRIVEN__DEFAULT = eINSTANCE.getLeaderDriven_Default();

		/**
		 * The meta object literal for the '{@link fr.inria.atlanmod.governance.strategy.impl.PhasedStrategyImpl <em>Phased Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.atlanmod.governance.strategy.impl.PhasedStrategyImpl
		 * @see fr.inria.atlanmod.governance.strategy.impl.StrategyPackageImpl#getPhasedStrategy()
		 * @generated
		 */
		EClass PHASED_STRATEGY = eINSTANCE.getPhasedStrategy();

		/**
		 * The meta object literal for the '<em><b>Phases</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHASED_STRATEGY__PHASES = eINSTANCE.getPhasedStrategy_Phases();

		/**
		 * The meta object literal for the '{@link fr.inria.atlanmod.governance.strategy.impl.DeadlineImpl <em>Deadline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.atlanmod.governance.strategy.impl.DeadlineImpl
		 * @see fr.inria.atlanmod.governance.strategy.impl.StrategyPackageImpl#getDeadline()
		 * @generated
		 */
		EClass DEADLINE = eINSTANCE.getDeadline();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEADLINE__NAME = eINSTANCE.getDeadline_Name();

		/**
		 * The meta object literal for the '{@link fr.inria.atlanmod.governance.strategy.impl.TimerImpl <em>Timer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.atlanmod.governance.strategy.impl.TimerImpl
		 * @see fr.inria.atlanmod.governance.strategy.impl.StrategyPackageImpl#getTimer()
		 * @generated
		 */
		EClass TIMER = eINSTANCE.getTimer();

		/**
		 * The meta object literal for the '<em><b>Time Stamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMER__TIME_STAMP = eINSTANCE.getTimer_TimeStamp();

		/**
		 * The meta object literal for the '{@link fr.inria.atlanmod.governance.strategy.impl.OCLConditionImpl <em>OCL Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.atlanmod.governance.strategy.impl.OCLConditionImpl
		 * @see fr.inria.atlanmod.governance.strategy.impl.StrategyPackageImpl#getOCLCondition()
		 * @generated
		 */
		EClass OCL_CONDITION = eINSTANCE.getOCLCondition();

		/**
		 * The meta object literal for the '<em><b>Ocl Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OCL_CONDITION__OCL_EXPRESSION = eINSTANCE.getOCLCondition_OclExpression();

		/**
		 * The meta object literal for the '{@link fr.inria.atlanmod.governance.strategy.impl.WaitForVoteImpl <em>Wait For Vote</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.atlanmod.governance.strategy.impl.WaitForVoteImpl
		 * @see fr.inria.atlanmod.governance.strategy.impl.StrategyPackageImpl#getWaitForVote()
		 * @generated
		 */
		EClass WAIT_FOR_VOTE = eINSTANCE.getWaitForVote();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WAIT_FOR_VOTE__ROLES = eINSTANCE.getWaitForVote_Roles();

		/**
		 * The meta object literal for the '{@link fr.inria.atlanmod.governance.strategy.RangeType <em>Range Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.atlanmod.governance.strategy.RangeType
		 * @see fr.inria.atlanmod.governance.strategy.impl.StrategyPackageImpl#getRangeType()
		 * @generated
		 */
		EEnum RANGE_TYPE = eINSTANCE.getRangeType();

		/**
		 * The meta object literal for the '{@link fr.inria.atlanmod.governance.strategy.CollaborationType <em>Collaboration Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.atlanmod.governance.strategy.CollaborationType
		 * @see fr.inria.atlanmod.governance.strategy.impl.StrategyPackageImpl#getCollaborationType()
		 * @generated
		 */
		EEnum COLLABORATION_TYPE = eINSTANCE.getCollaborationType();

		/**
		 * The meta object literal for the '{@link fr.inria.atlanmod.governance.strategy.StageType <em>Stage Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.atlanmod.governance.strategy.StageType
		 * @see fr.inria.atlanmod.governance.strategy.impl.StrategyPackageImpl#getStageType()
		 * @generated
		 */
		EEnum STAGE_TYPE = eINSTANCE.getStageType();

	}

} //StrategyPackage
