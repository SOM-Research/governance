/**
 */
package fr.inria.atlanmod.decision.strategy.Strategy;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.inria.atlanmod.decision.strategy.Strategy.StrategyPackage
 * @generated
 */
public interface StrategyFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StrategyFactory eINSTANCE = fr.inria.atlanmod.decision.strategy.Strategy.impl.StrategyFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Project</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Project</em>'.
	 * @generated
	 */
	Project createProject();

	/**
	 * Returns a new object of class '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role</em>'.
	 * @generated
	 */
	Role createRole();

	/**
	 * Returns a new object of class '<em>Majority</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Majority</em>'.
	 * @generated
	 */
	Majority createMajority();

	/**
	 * Returns a new object of class '<em>Ratio Majority</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ratio Majority</em>'.
	 * @generated
	 */
	RatioMajority createRatioMajority();

	/**
	 * Returns a new object of class '<em>Leader Driven</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Leader Driven</em>'.
	 * @generated
	 */
	LeaderDriven createLeaderDriven();

	/**
	 * Returns a new object of class '<em>Phased Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Phased Strategy</em>'.
	 * @generated
	 */
	PhasedStrategy createPhasedStrategy();

	/**
	 * Returns a new object of class '<em>Timer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Timer</em>'.
	 * @generated
	 */
	Timer createTimer();

	/**
	 * Returns a new object of class '<em>OCL Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OCL Condition</em>'.
	 * @generated
	 */
	OCLCondition createOCLCondition();

	/**
	 * Returns a new object of class '<em>Wait For Vote</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wait For Vote</em>'.
	 * @generated
	 */
	WaitForVote createWaitForVote();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StrategyPackage getStrategyPackage();

} //StrategyFactory
