/**
 */
package LegalSC;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Execution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link LegalSC.Execution#getSialors <em>Sialors</em>}</li>
 *   <li>{@link LegalSC.Execution#getExpression <em>Expression</em>}</li>
 *   <li>{@link LegalSC.Execution#getDroitAcces <em>Droit Acces</em>}</li>
 * </ul>
 *
 * @see LegalSC.LegalSCPackage#getExecution()
 * @model
 * @generated
 */
public interface Execution extends EObject {
	/**
	 * Returns the value of the '<em><b>Sialors</b></em>' containment reference list.
	 * The list contents are of type {@link LegalSC.SiAlors}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sialors</em>' containment reference list.
	 * @see LegalSC.LegalSCPackage#getExecution_Sialors()
	 * @model containment="true"
	 * @generated
	 */
	EList<SiAlors> getSialors();

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference list.
	 * The list contents are of type {@link LegalSC.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference list.
	 * @see LegalSC.LegalSCPackage#getExecution_Expression()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getExpression();

	/**
	 * Returns the value of the '<em><b>Droit Acces</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Droit Acces</em>' attribute.
	 * @see #setDroitAcces(String)
	 * @see LegalSC.LegalSCPackage#getExecution_DroitAcces()
	 * @model required="true"
	 * @generated
	 */
	String getDroitAcces();

	/**
	 * Sets the value of the '{@link LegalSC.Execution#getDroitAcces <em>Droit Acces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Droit Acces</em>' attribute.
	 * @see #getDroitAcces()
	 * @generated
	 */
	void setDroitAcces(String value);

} // Execution
