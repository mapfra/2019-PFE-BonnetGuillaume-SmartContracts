/**
 */
package LegalSC;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contrat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link LegalSC.Contrat#getEntete <em>Entete</em>}</li>
 *   <li>{@link LegalSC.Contrat#getClausesection <em>Clausesection</em>}</li>
 *   <li>{@link LegalSC.Contrat#getNom <em>Nom</em>}</li>
 * </ul>
 *
 * @see LegalSC.LegalSCPackage#getContrat()
 * @model
 * @generated
 */
public interface Contrat extends EObject {
	/**
	 * Returns the value of the '<em><b>Entete</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entete</em>' containment reference.
	 * @see #setEntete(Entete)
	 * @see LegalSC.LegalSCPackage#getContrat_Entete()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Entete getEntete();

	/**
	 * Sets the value of the '{@link LegalSC.Contrat#getEntete <em>Entete</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entete</em>' containment reference.
	 * @see #getEntete()
	 * @generated
	 */
	void setEntete(Entete value);

	/**
	 * Returns the value of the '<em><b>Clausesection</b></em>' containment reference list.
	 * The list contents are of type {@link LegalSC.ClauseSection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clausesection</em>' containment reference list.
	 * @see LegalSC.LegalSCPackage#getContrat_Clausesection()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ClauseSection> getClausesection();

	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see LegalSC.LegalSCPackage#getContrat_Nom()
	 * @model required="true"
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link LegalSC.Contrat#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

} // Contrat
