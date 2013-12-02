/**
 */
package fr.inria.atlanmod.decision.collaboration.Collaboration;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.CollaborationFactory
 * @model kind="package"
 * @generated
 */
public interface CollaborationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Collaboration";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://atlanmod.fr/collaboration";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "collaboration";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CollaborationPackage eINSTANCE = fr.inria.atlanmod.decision.collaboration.Collaboration.impl.CollaborationPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.inria.atlanmod.decision.collaboration.Collaboration.impl.InteractionsImpl <em>Interactions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.impl.InteractionsImpl
	 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.impl.CollaborationPackageImpl#getInteractions()
	 * @generated
	 */
	int INTERACTIONS = 0;

	/**
	 * The feature id for the '<em><b>Users</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTIONS__USERS = 0;

	/**
	 * The feature id for the '<em><b>Collaborations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTIONS__COLLABORATIONS = 1;

	/**
	 * The feature id for the '<em><b>Decisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTIONS__DECISIONS = 2;

	/**
	 * The number of structural features of the '<em>Interactions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTIONS_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link fr.inria.atlanmod.decision.collaboration.Collaboration.impl.VoteImpl <em>Vote</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.impl.VoteImpl
	 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.impl.CollaborationPackageImpl#getVote()
	 * @generated
	 */
	int VOTE = 1;

	/**
	 * The feature id for the '<em><b>Are Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOTE__ARE_PART = 0;

	/**
	 * The feature id for the '<em><b>Voted By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOTE__VOTED_BY = 1;

	/**
	 * The feature id for the '<em><b>Agreement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOTE__AGREEMENT = 2;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOTE__TIME_STAMP = 3;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOTE__RATIONALE = 4;

	/**
	 * The number of structural features of the '<em>Vote</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOTE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link fr.inria.atlanmod.decision.collaboration.Collaboration.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.impl.UserImpl
	 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.impl.CollaborationPackageImpl#getUser()
	 * @generated
	 */
	int USER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Votes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__VOTES = 1;

	/**
	 * The feature id for the '<em><b>Leads</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__LEADS = 2;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ROLES = 3;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link fr.inria.atlanmod.decision.collaboration.Collaboration.impl.CollaborationImpl <em>Collaboration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.impl.CollaborationImpl
	 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.impl.CollaborationPackageImpl#getCollaboration()
	 * @generated
	 */
	int COLLABORATION = 3;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION__METADATA = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION__NAME = 1;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION__RATIONALE = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Votes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION__VOTES = 4;

	/**
	 * The feature id for the '<em><b>Leader</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION__LEADER = 5;

	/**
	 * The feature id for the '<em><b>Is Decided</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION__IS_DECIDED = 6;

	/**
	 * The number of structural features of the '<em>Collaboration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link fr.inria.atlanmod.decision.collaboration.Collaboration.impl.DecisionImpl <em>Decision</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.impl.DecisionImpl
	 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.impl.CollaborationPackageImpl#getDecision()
	 * @generated
	 */
	int DECISION = 4;

	/**
	 * The feature id for the '<em><b>Accepted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__ACCEPTED = 0;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__TIME_STAMP = 1;

	/**
	 * The feature id for the '<em><b>Votes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__VOTES = 2;

	/**
	 * The feature id for the '<em><b>Decides</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__DECIDES = 3;

	/**
	 * The feature id for the '<em><b>Strategy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__STRATEGY = 4;

	/**
	 * The number of structural features of the '<em>Decision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link fr.inria.atlanmod.decision.collaboration.Collaboration.impl.MetadataImpl <em>Metadata</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.impl.MetadataImpl
	 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.impl.CollaborationPackageImpl#getMetadata()
	 * @generated
	 */
	int METADATA = 5;

	/**
	 * The number of structural features of the '<em>Metadata</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.atlanmod.decision.collaboration.Collaboration.impl.PriorityImpl <em>Priority</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.impl.PriorityImpl
	 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.impl.CollaborationPackageImpl#getPriority()
	 * @generated
	 */
	int PRIORITY = 6;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITY__VALUE = METADATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Priority</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITY_FEATURE_COUNT = METADATA_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.inria.atlanmod.decision.collaboration.Collaboration.impl.TagBasedImpl <em>Tag Based</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.impl.TagBasedImpl
	 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.impl.CollaborationPackageImpl#getTagBased()
	 * @generated
	 */
	int TAG_BASED = 7;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_BASED__TAGS = METADATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tag Based</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_BASED_FEATURE_COUNT = METADATA_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.inria.atlanmod.decision.collaboration.Collaboration.impl.TagImpl <em>Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.impl.TagImpl
	 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.impl.CollaborationPackageImpl#getTag()
	 * @generated
	 */
	int TAG = 8;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link fr.inria.atlanmod.decision.collaboration.Collaboration.Interactions <em>Interactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interactions</em>'.
	 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.Interactions
	 * @generated
	 */
	EClass getInteractions();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.atlanmod.decision.collaboration.Collaboration.Interactions#getUsers <em>Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Users</em>'.
	 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.Interactions#getUsers()
	 * @see #getInteractions()
	 * @generated
	 */
	EReference getInteractions_Users();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.atlanmod.decision.collaboration.Collaboration.Interactions#getCollaborations <em>Collaborations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Collaborations</em>'.
	 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.Interactions#getCollaborations()
	 * @see #getInteractions()
	 * @generated
	 */
	EReference getInteractions_Collaborations();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.atlanmod.decision.collaboration.Collaboration.Interactions#getDecisions <em>Decisions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Decisions</em>'.
	 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.Interactions#getDecisions()
	 * @see #getInteractions()
	 * @generated
	 */
	EReference getInteractions_Decisions();

	/**
	 * Returns the meta object for class '{@link fr.inria.atlanmod.decision.collaboration.Collaboration.Vote <em>Vote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vote</em>'.
	 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.Vote
	 * @generated
	 */
	EClass getVote();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.atlanmod.decision.collaboration.Collaboration.Vote#getArePart <em>Are Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Are Part</em>'.
	 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.Vote#getArePart()
	 * @see #getVote()
	 * @generated
	 */
	EReference getVote_ArePart();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.atlanmod.decision.collaboration.Collaboration.Vote#getVotedBy <em>Voted By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Voted By</em>'.
	 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.Vote#getVotedBy()
	 * @see #getVote()
	 * @generated
	 */
	EReference getVote_VotedBy();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.atlanmod.decision.collaboration.Collaboration.Vote#isAgreement <em>Agreement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Agreement</em>'.
	 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.Vote#isAgreement()
	 * @see #getVote()
	 * @generated
	 */
	EAttribute getVote_Agreement();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.atlanmod.decision.collaboration.Collaboration.Vote#getTimeStamp <em>Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Stamp</em>'.
	 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.Vote#getTimeStamp()
	 * @see #getVote()
	 * @generated
	 */
	EAttribute getVote_TimeStamp();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.atlanmod.decision.collaboration.Collaboration.Vote#getRationale <em>Rationale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rationale</em>'.
	 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.Vote#getRationale()
	 * @see #getVote()
	 * @generated
	 */
	EAttribute getVote_Rationale();

	/**
	 * Returns the meta object for class '{@link fr.inria.atlanmod.decision.collaboration.Collaboration.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.atlanmod.decision.collaboration.Collaboration.User#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.User#getName()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Name();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.atlanmod.decision.collaboration.Collaboration.User#getVotes <em>Votes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Votes</em>'.
	 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.User#getVotes()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Votes();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.atlanmod.decision.collaboration.Collaboration.User#getLeads <em>Leads</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Leads</em>'.
	 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.User#getLeads()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Leads();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.atlanmod.decision.collaboration.Collaboration.User#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Roles</em>'.
	 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.User#getRoles()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Roles();

	/**
	 * Returns the meta object for class '{@link fr.inria.atlanmod.decision.collaboration.Collaboration.Collaboration <em>Collaboration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collaboration</em>'.
	 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.Collaboration
	 * @generated
	 */
	EClass getCollaboration();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.atlanmod.decision.collaboration.Collaboration.Collaboration#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metadata</em>'.
	 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.Collaboration#getMetadata()
	 * @see #getCollaboration()
	 * @generated
	 */
	EReference getCollaboration_Metadata();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.atlanmod.decision.collaboration.Collaboration.Collaboration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.Collaboration#getName()
	 * @see #getCollaboration()
	 * @generated
	 */
	EAttribute getCollaboration_Name();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.atlanmod.decision.collaboration.Collaboration.Collaboration#getRationale <em>Rationale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rationale</em>'.
	 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.Collaboration#getRationale()
	 * @see #getCollaboration()
	 * @generated
	 */
	EAttribute getCollaboration_Rationale();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.atlanmod.decision.collaboration.Collaboration.Collaboration#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.Collaboration#getType()
	 * @see #getCollaboration()
	 * @generated
	 */
	EAttribute getCollaboration_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.atlanmod.decision.collaboration.Collaboration.Collaboration#getVotes <em>Votes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Votes</em>'.
	 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.Collaboration#getVotes()
	 * @see #getCollaboration()
	 * @generated
	 */
	EReference getCollaboration_Votes();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.atlanmod.decision.collaboration.Collaboration.Collaboration#getLeader <em>Leader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Leader</em>'.
	 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.Collaboration#getLeader()
	 * @see #getCollaboration()
	 * @generated
	 */
	EReference getCollaboration_Leader();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.atlanmod.decision.collaboration.Collaboration.Collaboration#getIsDecided <em>Is Decided</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Decided</em>'.
	 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.Collaboration#getIsDecided()
	 * @see #getCollaboration()
	 * @generated
	 */
	EReference getCollaboration_IsDecided();

	/**
	 * Returns the meta object for class '{@link fr.inria.atlanmod.decision.collaboration.Collaboration.Decision <em>Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decision</em>'.
	 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.Decision
	 * @generated
	 */
	EClass getDecision();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.atlanmod.decision.collaboration.Collaboration.Decision#isAccepted <em>Accepted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accepted</em>'.
	 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.Decision#isAccepted()
	 * @see #getDecision()
	 * @generated
	 */
	EAttribute getDecision_Accepted();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.atlanmod.decision.collaboration.Collaboration.Decision#getTimeStamp <em>Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Stamp</em>'.
	 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.Decision#getTimeStamp()
	 * @see #getDecision()
	 * @generated
	 */
	EAttribute getDecision_TimeStamp();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.atlanmod.decision.collaboration.Collaboration.Decision#getVotes <em>Votes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Votes</em>'.
	 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.Decision#getVotes()
	 * @see #getDecision()
	 * @generated
	 */
	EReference getDecision_Votes();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.atlanmod.decision.collaboration.Collaboration.Decision#getDecides <em>Decides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Decides</em>'.
	 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.Decision#getDecides()
	 * @see #getDecision()
	 * @generated
	 */
	EReference getDecision_Decides();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.atlanmod.decision.collaboration.Collaboration.Decision#getStrategy <em>Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Strategy</em>'.
	 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.Decision#getStrategy()
	 * @see #getDecision()
	 * @generated
	 */
	EReference getDecision_Strategy();

	/**
	 * Returns the meta object for class '{@link fr.inria.atlanmod.decision.collaboration.Collaboration.Metadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metadata</em>'.
	 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.Metadata
	 * @generated
	 */
	EClass getMetadata();

	/**
	 * Returns the meta object for class '{@link fr.inria.atlanmod.decision.collaboration.Collaboration.Priority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Priority</em>'.
	 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.Priority
	 * @generated
	 */
	EClass getPriority();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.atlanmod.decision.collaboration.Collaboration.Priority#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.Priority#getValue()
	 * @see #getPriority()
	 * @generated
	 */
	EAttribute getPriority_Value();

	/**
	 * Returns the meta object for class '{@link fr.inria.atlanmod.decision.collaboration.Collaboration.TagBased <em>Tag Based</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tag Based</em>'.
	 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.TagBased
	 * @generated
	 */
	EClass getTagBased();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.atlanmod.decision.collaboration.Collaboration.TagBased#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tags</em>'.
	 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.TagBased#getTags()
	 * @see #getTagBased()
	 * @generated
	 */
	EReference getTagBased_Tags();

	/**
	 * Returns the meta object for class '{@link fr.inria.atlanmod.decision.collaboration.Collaboration.Tag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tag</em>'.
	 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.Tag
	 * @generated
	 */
	EClass getTag();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.atlanmod.decision.collaboration.Collaboration.Tag#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.Tag#getValue()
	 * @see #getTag()
	 * @generated
	 */
	EAttribute getTag_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CollaborationFactory getCollaborationFactory();

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
		 * The meta object literal for the '{@link fr.inria.atlanmod.decision.collaboration.Collaboration.impl.InteractionsImpl <em>Interactions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.impl.InteractionsImpl
		 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.impl.CollaborationPackageImpl#getInteractions()
		 * @generated
		 */
		EClass INTERACTIONS = eINSTANCE.getInteractions();

		/**
		 * The meta object literal for the '<em><b>Users</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTIONS__USERS = eINSTANCE.getInteractions_Users();

		/**
		 * The meta object literal for the '<em><b>Collaborations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTIONS__COLLABORATIONS = eINSTANCE.getInteractions_Collaborations();

		/**
		 * The meta object literal for the '<em><b>Decisions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTIONS__DECISIONS = eINSTANCE.getInteractions_Decisions();

		/**
		 * The meta object literal for the '{@link fr.inria.atlanmod.decision.collaboration.Collaboration.impl.VoteImpl <em>Vote</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.impl.VoteImpl
		 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.impl.CollaborationPackageImpl#getVote()
		 * @generated
		 */
		EClass VOTE = eINSTANCE.getVote();

		/**
		 * The meta object literal for the '<em><b>Are Part</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VOTE__ARE_PART = eINSTANCE.getVote_ArePart();

		/**
		 * The meta object literal for the '<em><b>Voted By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VOTE__VOTED_BY = eINSTANCE.getVote_VotedBy();

		/**
		 * The meta object literal for the '<em><b>Agreement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOTE__AGREEMENT = eINSTANCE.getVote_Agreement();

		/**
		 * The meta object literal for the '<em><b>Time Stamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOTE__TIME_STAMP = eINSTANCE.getVote_TimeStamp();

		/**
		 * The meta object literal for the '<em><b>Rationale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOTE__RATIONALE = eINSTANCE.getVote_Rationale();

		/**
		 * The meta object literal for the '{@link fr.inria.atlanmod.decision.collaboration.Collaboration.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.impl.UserImpl
		 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.impl.CollaborationPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__NAME = eINSTANCE.getUser_Name();

		/**
		 * The meta object literal for the '<em><b>Votes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__VOTES = eINSTANCE.getUser_Votes();

		/**
		 * The meta object literal for the '<em><b>Leads</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__LEADS = eINSTANCE.getUser_Leads();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__ROLES = eINSTANCE.getUser_Roles();

		/**
		 * The meta object literal for the '{@link fr.inria.atlanmod.decision.collaboration.Collaboration.impl.CollaborationImpl <em>Collaboration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.impl.CollaborationImpl
		 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.impl.CollaborationPackageImpl#getCollaboration()
		 * @generated
		 */
		EClass COLLABORATION = eINSTANCE.getCollaboration();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLABORATION__METADATA = eINSTANCE.getCollaboration_Metadata();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLABORATION__NAME = eINSTANCE.getCollaboration_Name();

		/**
		 * The meta object literal for the '<em><b>Rationale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLABORATION__RATIONALE = eINSTANCE.getCollaboration_Rationale();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLABORATION__TYPE = eINSTANCE.getCollaboration_Type();

		/**
		 * The meta object literal for the '<em><b>Votes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLABORATION__VOTES = eINSTANCE.getCollaboration_Votes();

		/**
		 * The meta object literal for the '<em><b>Leader</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLABORATION__LEADER = eINSTANCE.getCollaboration_Leader();

		/**
		 * The meta object literal for the '<em><b>Is Decided</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLABORATION__IS_DECIDED = eINSTANCE.getCollaboration_IsDecided();

		/**
		 * The meta object literal for the '{@link fr.inria.atlanmod.decision.collaboration.Collaboration.impl.DecisionImpl <em>Decision</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.impl.DecisionImpl
		 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.impl.CollaborationPackageImpl#getDecision()
		 * @generated
		 */
		EClass DECISION = eINSTANCE.getDecision();

		/**
		 * The meta object literal for the '<em><b>Accepted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECISION__ACCEPTED = eINSTANCE.getDecision_Accepted();

		/**
		 * The meta object literal for the '<em><b>Time Stamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECISION__TIME_STAMP = eINSTANCE.getDecision_TimeStamp();

		/**
		 * The meta object literal for the '<em><b>Votes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECISION__VOTES = eINSTANCE.getDecision_Votes();

		/**
		 * The meta object literal for the '<em><b>Decides</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECISION__DECIDES = eINSTANCE.getDecision_Decides();

		/**
		 * The meta object literal for the '<em><b>Strategy</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECISION__STRATEGY = eINSTANCE.getDecision_Strategy();

		/**
		 * The meta object literal for the '{@link fr.inria.atlanmod.decision.collaboration.Collaboration.impl.MetadataImpl <em>Metadata</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.impl.MetadataImpl
		 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.impl.CollaborationPackageImpl#getMetadata()
		 * @generated
		 */
		EClass METADATA = eINSTANCE.getMetadata();

		/**
		 * The meta object literal for the '{@link fr.inria.atlanmod.decision.collaboration.Collaboration.impl.PriorityImpl <em>Priority</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.impl.PriorityImpl
		 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.impl.CollaborationPackageImpl#getPriority()
		 * @generated
		 */
		EClass PRIORITY = eINSTANCE.getPriority();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIORITY__VALUE = eINSTANCE.getPriority_Value();

		/**
		 * The meta object literal for the '{@link fr.inria.atlanmod.decision.collaboration.Collaboration.impl.TagBasedImpl <em>Tag Based</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.impl.TagBasedImpl
		 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.impl.CollaborationPackageImpl#getTagBased()
		 * @generated
		 */
		EClass TAG_BASED = eINSTANCE.getTagBased();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAG_BASED__TAGS = eINSTANCE.getTagBased_Tags();

		/**
		 * The meta object literal for the '{@link fr.inria.atlanmod.decision.collaboration.Collaboration.impl.TagImpl <em>Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.impl.TagImpl
		 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.impl.CollaborationPackageImpl#getTag()
		 * @generated
		 */
		EClass TAG = eINSTANCE.getTag();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAG__VALUE = eINSTANCE.getTag_Value();

	}

} //CollaborationPackage
