/**
 */
package LegalSC;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Si Alors</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link LegalSC.SiAlors#getCondition <em>Condition</em>}</li>
 *   <li>{@link LegalSC.SiAlors#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see LegalSC.LegalSCPackage#getSiAlors()
 * @model
 * @generated
 */
public interface SiAlors extends EObject {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Condition)
	 * @see LegalSC.LegalSCPackage#getSiAlors_Condition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Condition getCondition();

	/**
	 * Sets the value of the '{@link LegalSC.SiAlors#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Condition value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference list.
	 * The list contents are of type {@link LegalSC.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference list.
	 * @see LegalSC.LegalSCPackage#getSiAlors_Expression()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getExpression();

} // SiAlors
