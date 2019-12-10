/**
 */
package LegalSC;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entete</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link LegalSC.Entete#getPrix <em>Prix</em>}</li>
 *   <li>{@link LegalSC.Entete#getDate_debut <em>Date debut</em>}</li>
 *   <li>{@link LegalSC.Entete#getDate_fin <em>Date fin</em>}</li>
 *   <li>{@link LegalSC.Entete#getObjet <em>Objet</em>}</li>
 *   <li>{@link LegalSC.Entete#getPartie <em>Partie</em>}</li>
 * </ul>
 *
 * @see LegalSC.LegalSCPackage#getEntete()
 * @model
 * @generated
 */
public interface Entete extends EObject {
	/**
	 * Returns the value of the '<em><b>Prix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prix</em>' attribute.
	 * @see #setPrix(float)
	 * @see LegalSC.LegalSCPackage#getEntete_Prix()
	 * @model required="true"
	 * @generated
	 */
	float getPrix();

	/**
	 * Sets the value of the '{@link LegalSC.Entete#getPrix <em>Prix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prix</em>' attribute.
	 * @see #getPrix()
	 * @generated
	 */
	void setPrix(float value);

	/**
	 * Returns the value of the '<em><b>Date debut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date debut</em>' attribute.
	 * @see #setDate_debut(String)
	 * @see LegalSC.LegalSCPackage#getEntete_Date_debut()
	 * @model required="true"
	 * @generated
	 */
	String getDate_debut();

	/**
	 * Sets the value of the '{@link LegalSC.Entete#getDate_debut <em>Date debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date debut</em>' attribute.
	 * @see #getDate_debut()
	 * @generated
	 */
	void setDate_debut(String value);

	/**
	 * Returns the value of the '<em><b>Date fin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date fin</em>' attribute.
	 * @see #setDate_fin(String)
	 * @see LegalSC.LegalSCPackage#getEntete_Date_fin()
	 * @model
	 * @generated
	 */
	String getDate_fin();

	/**
	 * Sets the value of the '{@link LegalSC.Entete#getDate_fin <em>Date fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date fin</em>' attribute.
	 * @see #getDate_fin()
	 * @generated
	 */
	void setDate_fin(String value);

	/**
	 * Returns the value of the '<em><b>Objet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objet</em>' attribute.
	 * @see #setObjet(String)
	 * @see LegalSC.LegalSCPackage#getEntete_Objet()
	 * @model required="true"
	 * @generated
	 */
	String getObjet();

	/**
	 * Sets the value of the '{@link LegalSC.Entete#getObjet <em>Objet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Objet</em>' attribute.
	 * @see #getObjet()
	 * @generated
	 */
	void setObjet(String value);

	/**
	 * Returns the value of the '<em><b>Partie</b></em>' containment reference list.
	 * The list contents are of type {@link LegalSC.Partie}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partie</em>' containment reference list.
	 * @see LegalSC.LegalSCPackage#getEntete_Partie()
	 * @model containment="true" lower="2" upper="2"
	 * @generated
	 */
	EList<Partie> getPartie();

} // Entete
