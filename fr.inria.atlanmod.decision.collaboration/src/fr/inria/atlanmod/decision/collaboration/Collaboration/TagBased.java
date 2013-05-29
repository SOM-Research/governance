/**
 */
package fr.inria.atlanmod.decision.collaboration.Collaboration;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tag Based</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.atlanmod.decision.collaboration.Collaboration.TagBased#getTags <em>Tags</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.CollaborationPackage#getTagBased()
 * @model
 * @generated
 */
public interface TagBased extends Metadata {
	/**
	 * Returns the value of the '<em><b>Tags</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.atlanmod.decision.collaboration.Collaboration.Tag}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tags</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tags</em>' containment reference list.
	 * @see fr.inria.atlanmod.decision.collaboration.Collaboration.CollaborationPackage#getTagBased_Tags()
	 * @model containment="true"
	 * @generated
	 */
	EList<Tag> getTags();

} // TagBased
