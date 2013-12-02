/**
 */
package fr.inria.atlanmod.decision.collaboration.Collaboration.impl;

import fr.inria.atlanmod.decision.collaboration.Collaboration.*;

import org.eclipse.emf.ecore.EClass;
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
public class CollaborationFactoryImpl extends EFactoryImpl implements CollaborationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CollaborationFactory init() {
		try {
			CollaborationFactory theCollaborationFactory = (CollaborationFactory)EPackage.Registry.INSTANCE.getEFactory(CollaborationPackage.eNS_URI);
			if (theCollaborationFactory != null) {
				return theCollaborationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CollaborationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollaborationFactoryImpl() {
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
			case CollaborationPackage.INTERACTIONS: return createInteractions();
			case CollaborationPackage.VOTE: return createVote();
			case CollaborationPackage.USER: return createUser();
			case CollaborationPackage.COLLABORATION: return createCollaboration();
			case CollaborationPackage.DECISION: return createDecision();
			case CollaborationPackage.METADATA: return createMetadata();
			case CollaborationPackage.PRIORITY: return createPriority();
			case CollaborationPackage.TAG_BASED: return createTagBased();
			case CollaborationPackage.TAG: return createTag();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interactions createInteractions() {
		InteractionsImpl interactions = new InteractionsImpl();
		return interactions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vote createVote() {
		VoteImpl vote = new VoteImpl();
		return vote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User createUser() {
		UserImpl user = new UserImpl();
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collaboration createCollaboration() {
		CollaborationImpl collaboration = new CollaborationImpl();
		return collaboration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decision createDecision() {
		DecisionImpl decision = new DecisionImpl();
		return decision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metadata createMetadata() {
		MetadataImpl metadata = new MetadataImpl();
		return metadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Priority createPriority() {
		PriorityImpl priority = new PriorityImpl();
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TagBased createTagBased() {
		TagBasedImpl tagBased = new TagBasedImpl();
		return tagBased;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tag createTag() {
		TagImpl tag = new TagImpl();
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollaborationPackage getCollaborationPackage() {
		return (CollaborationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CollaborationPackage getPackage() {
		return CollaborationPackage.eINSTANCE;
	}

} //CollaborationFactoryImpl
