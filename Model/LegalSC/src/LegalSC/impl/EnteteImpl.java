/**
 */
package LegalSC.impl;

import LegalSC.Entete;
import LegalSC.LegalSCPackage;
import LegalSC.Partie;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entete</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link LegalSC.impl.EnteteImpl#getPrix <em>Prix</em>}</li>
 *   <li>{@link LegalSC.impl.EnteteImpl#getDate_debut <em>Date debut</em>}</li>
 *   <li>{@link LegalSC.impl.EnteteImpl#getDate_fin <em>Date fin</em>}</li>
 *   <li>{@link LegalSC.impl.EnteteImpl#getObjet <em>Objet</em>}</li>
 *   <li>{@link LegalSC.impl.EnteteImpl#getPartie <em>Partie</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnteteImpl extends MinimalEObjectImpl.Container implements Entete {
	/**
	 * The default value of the '{@link #getPrix() <em>Prix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrix()
	 * @generated
	 * @ordered
	 */
	protected static final float PRIX_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPrix() <em>Prix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrix()
	 * @generated
	 * @ordered
	 */
	protected float prix = PRIX_EDEFAULT;

	/**
	 * The default value of the '{@link #getDate_debut() <em>Date debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate_debut()
	 * @generated
	 * @ordered
	 */
	protected static final String DATE_DEBUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate_debut() <em>Date debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate_debut()
	 * @generated
	 * @ordered
	 */
	protected String date_debut = DATE_DEBUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDate_fin() <em>Date fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate_fin()
	 * @generated
	 * @ordered
	 */
	protected static final String DATE_FIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate_fin() <em>Date fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate_fin()
	 * @generated
	 * @ordered
	 */
	protected String date_fin = DATE_FIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getObjet() <em>Objet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjet()
	 * @generated
	 * @ordered
	 */
	protected static final String OBJET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObjet() <em>Objet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjet()
	 * @generated
	 * @ordered
	 */
	protected String objet = OBJET_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPartie() <em>Partie</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartie()
	 * @generated
	 * @ordered
	 */
	protected EList<Partie> partie;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnteteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LegalSCPackage.Literals.ENTETE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getPrix() {
		return prix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrix(float newPrix) {
		float oldPrix = prix;
		prix = newPrix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LegalSCPackage.ENTETE__PRIX, oldPrix, prix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDate_debut() {
		return date_debut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDate_debut(String newDate_debut) {
		String oldDate_debut = date_debut;
		date_debut = newDate_debut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LegalSCPackage.ENTETE__DATE_DEBUT, oldDate_debut, date_debut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDate_fin() {
		return date_fin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDate_fin(String newDate_fin) {
		String oldDate_fin = date_fin;
		date_fin = newDate_fin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LegalSCPackage.ENTETE__DATE_FIN, oldDate_fin, date_fin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getObjet() {
		return objet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setObjet(String newObjet) {
		String oldObjet = objet;
		objet = newObjet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LegalSCPackage.ENTETE__OBJET, oldObjet, objet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Partie> getPartie() {
		if (partie == null) {
			partie = new EObjectContainmentEList<Partie>(Partie.class, this, LegalSCPackage.ENTETE__PARTIE);
		}
		return partie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LegalSCPackage.ENTETE__PARTIE:
				return ((InternalEList<?>)getPartie()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LegalSCPackage.ENTETE__PRIX:
				return getPrix();
			case LegalSCPackage.ENTETE__DATE_DEBUT:
				return getDate_debut();
			case LegalSCPackage.ENTETE__DATE_FIN:
				return getDate_fin();
			case LegalSCPackage.ENTETE__OBJET:
				return getObjet();
			case LegalSCPackage.ENTETE__PARTIE:
				return getPartie();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LegalSCPackage.ENTETE__PRIX:
				setPrix((Float)newValue);
				return;
			case LegalSCPackage.ENTETE__DATE_DEBUT:
				setDate_debut((String)newValue);
				return;
			case LegalSCPackage.ENTETE__DATE_FIN:
				setDate_fin((String)newValue);
				return;
			case LegalSCPackage.ENTETE__OBJET:
				setObjet((String)newValue);
				return;
			case LegalSCPackage.ENTETE__PARTIE:
				getPartie().clear();
				getPartie().addAll((Collection<? extends Partie>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case LegalSCPackage.ENTETE__PRIX:
				setPrix(PRIX_EDEFAULT);
				return;
			case LegalSCPackage.ENTETE__DATE_DEBUT:
				setDate_debut(DATE_DEBUT_EDEFAULT);
				return;
			case LegalSCPackage.ENTETE__DATE_FIN:
				setDate_fin(DATE_FIN_EDEFAULT);
				return;
			case LegalSCPackage.ENTETE__OBJET:
				setObjet(OBJET_EDEFAULT);
				return;
			case LegalSCPackage.ENTETE__PARTIE:
				getPartie().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case LegalSCPackage.ENTETE__PRIX:
				return prix != PRIX_EDEFAULT;
			case LegalSCPackage.ENTETE__DATE_DEBUT:
				return DATE_DEBUT_EDEFAULT == null ? date_debut != null : !DATE_DEBUT_EDEFAULT.equals(date_debut);
			case LegalSCPackage.ENTETE__DATE_FIN:
				return DATE_FIN_EDEFAULT == null ? date_fin != null : !DATE_FIN_EDEFAULT.equals(date_fin);
			case LegalSCPackage.ENTETE__OBJET:
				return OBJET_EDEFAULT == null ? objet != null : !OBJET_EDEFAULT.equals(objet);
			case LegalSCPackage.ENTETE__PARTIE:
				return partie != null && !partie.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (prix: ");
		result.append(prix);
		result.append(", date_debut: ");
		result.append(date_debut);
		result.append(", date_fin: ");
		result.append(date_fin);
		result.append(", objet: ");
		result.append(objet);
		result.append(')');
		return result.toString();
	}

} //EnteteImpl
