/**
 */
package fr.inria.atlanmod.governance.strategy;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Strategy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.atlanmod.governance.strategy.Strategy#getDeadline <em>Deadline</em>}</li>
 *   <li>{@link fr.inria.atlanmod.governance.strategy.Strategy#getFilter <em>Filter</em>}</li>
 *   <li>{@link fr.inria.atlanmod.governance.strategy.Strategy#getPeople <em>People</em>}</li>
 *   <li>{@link fr.inria.atlanmod.governance.strategy.Strategy#getName <em>Name</em>}</li>
 *   <li>{@link fr.inria.atlanmod.governance.strategy.Strategy#getAppliedTo <em>Applied To</em>}</li>
 *   <li>{@link fr.inria.atlanmod.governance.strategy.Strategy#getStage <em>Stage</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.atlanmod.governance.strategy.StrategyPackage#getStrategy()
 * @model abstract="true"
 * @generated
 */
public interface Strategy extends EObject {
	/**
	 * Returns the value of the '<em><b>Deadline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deadline</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deadline</em>' reference.
	 * @see #setDeadline(Deadline)
	 * @see fr.inria.atlanmod.governance.strategy.StrategyPackage#getStrategy_Deadline()
	 * @model
	 * @generated
	 */
	Deadline getDeadline();

	/**
	 * Sets the value of the '{@link fr.inria.atlanmod.governance.strategy.Strategy#getDeadline <em>Deadline</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deadline</em>' reference.
	 * @see #getDeadline()
	 * @generated
	 */
	void setDeadline(Deadline value);

	/**
	 * Returns the value of the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter</em>' attribute.
	 * @see #isSetFilter()
	 * @see #unsetFilter()
	 * @see #setFilter(String)
	 * @see fr.inria.atlanmod.governance.strategy.StrategyPackage#getStrategy_Filter()
	 * @model unsettable="true"
	 * @generated
	 */
	String getFilter();

	/**
	 * Sets the value of the '{@link fr.inria.atlanmod.governance.strategy.Strategy#getFilter <em>Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter</em>' attribute.
	 * @see #isSetFilter()
	 * @see #unsetFilter()
	 * @see #getFilter()
	 * @generated
	 */
	void setFilter(String value);

	/**
	 * Unsets the value of the '{@link fr.inria.atlanmod.governance.strategy.Strategy#getFilter <em>Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFilter()
	 * @see #getFilter()
	 * @see #setFilter(String)
	 * @generated
	 */
	void unsetFilter();

	/**
	 * Returns whether the value of the '{@link fr.inria.atlanmod.governance.strategy.Strategy#getFilter <em>Filter</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Filter</em>' attribute is set.
	 * @see #unsetFilter()
	 * @see #getFilter()
	 * @see #setFilter(String)
	 * @generated
	 */
	boolean isSetFilter();

	/**
	 * Returns the value of the '<em><b>People</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.atlanmod.governance.strategy.Role}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>People</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>People</em>' reference list.
	 * @see fr.inria.atlanmod.governance.strategy.StrategyPackage#getStrategy_People()
	 * @model
	 * @generated
	 */
	EList<Role> getPeople();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see fr.inria.atlanmod.governance.strategy.StrategyPackage#getStrategy_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.inria.atlanmod.governance.strategy.Strategy#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Applied To</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.inria.atlanmod.governance.strategy.CollaborationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applied To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applied To</em>' attribute.
	 * @see fr.inria.atlanmod.governance.strategy.CollaborationType
	 * @see #isSetAppliedTo()
	 * @see #unsetAppliedTo()
	 * @see #setAppliedTo(CollaborationType)
	 * @see fr.inria.atlanmod.governance.strategy.StrategyPackage#getStrategy_AppliedTo()
	 * @model unsettable="true"
	 * @generated
	 */
	CollaborationType getAppliedTo();

	/**
	 * Sets the value of the '{@link fr.inria.atlanmod.governance.strategy.Strategy#getAppliedTo <em>Applied To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applied To</em>' attribute.
	 * @see fr.inria.atlanmod.governance.strategy.CollaborationType
	 * @see #isSetAppliedTo()
	 * @see #unsetAppliedTo()
	 * @see #getAppliedTo()
	 * @generated
	 */
	void setAppliedTo(CollaborationType value);

	/**
	 * Unsets the value of the '{@link fr.inria.atlanmod.governance.strategy.Strategy#getAppliedTo <em>Applied To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAppliedTo()
	 * @see #getAppliedTo()
	 * @see #setAppliedTo(CollaborationType)
	 * @generated
	 */
	void unsetAppliedTo();

	/**
	 * Returns whether the value of the '{@link fr.inria.atlanmod.governance.strategy.Strategy#getAppliedTo <em>Applied To</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Applied To</em>' attribute is set.
	 * @see #unsetAppliedTo()
	 * @see #getAppliedTo()
	 * @see #setAppliedTo(CollaborationType)
	 * @generated
	 */
	boolean isSetAppliedTo();

	/**
	 * Returns the value of the '<em><b>Stage</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.inria.atlanmod.governance.strategy.StageType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stage</em>' attribute.
	 * @see fr.inria.atlanmod.governance.strategy.StageType
	 * @see #isSetStage()
	 * @see #unsetStage()
	 * @see #setStage(StageType)
	 * @see fr.inria.atlanmod.governance.strategy.StrategyPackage#getStrategy_Stage()
	 * @model unsettable="true"
	 * @generated
	 */
	StageType getStage();

	/**
	 * Sets the value of the '{@link fr.inria.atlanmod.governance.strategy.Strategy#getStage <em>Stage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stage</em>' attribute.
	 * @see fr.inria.atlanmod.governance.strategy.StageType
	 * @see #isSetStage()
	 * @see #unsetStage()
	 * @see #getStage()
	 * @generated
	 */
	void setStage(StageType value);

	/**
	 * Unsets the value of the '{@link fr.inria.atlanmod.governance.strategy.Strategy#getStage <em>Stage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStage()
	 * @see #getStage()
	 * @see #setStage(StageType)
	 * @generated
	 */
	void unsetStage();

	/**
	 * Returns whether the value of the '{@link fr.inria.atlanmod.governance.strategy.Strategy#getStage <em>Stage</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Stage</em>' attribute is set.
	 * @see #unsetStage()
	 * @see #getStage()
	 * @see #setStage(StageType)
	 * @generated
	 */
	boolean isSetStage();

} // Strategy
