/**
 */
package LegalSC.impl;

import LegalSC.ClauseSection;
import LegalSC.Contrat;
import LegalSC.Entete;
import LegalSC.LegalSCPackage;

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
 * An implementation of the model object '<em><b>Contrat</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link LegalSC.impl.ContratImpl#getEntete <em>Entete</em>}</li>
 *   <li>{@link LegalSC.impl.ContratImpl#getClausesection <em>Clausesection</em>}</li>
 *   <li>{@link LegalSC.impl.ContratImpl#getNom <em>Nom</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContratImpl extends MinimalEObjectImpl.Container implements Contrat {
	/**
	 * The cached value of the '{@link #getEntete() <em>Entete</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntete()
	 * @generated
	 * @ordered
	 */
	protected Entete entete;

	/**
	 * The cached value of the '{@link #getClausesection() <em>Clausesection</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClausesection()
	 * @generated
	 * @ordered
	 */
	protected EList<ClauseSection> clausesection;

	/**
	 * The default value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected String nom = NOM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContratImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LegalSCPackage.Literals.CONTRAT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Entete getEntete() {
		return entete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntete(Entete newEntete, NotificationChain msgs) {
		Entete oldEntete = entete;
		entete = newEntete;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LegalSCPackage.CONTRAT__ENTETE, oldEntete, newEntete);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntete(Entete newEntete) {
		if (newEntete != entete) {
			NotificationChain msgs = null;
			if (entete != null)
				msgs = ((InternalEObject)entete).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LegalSCPackage.CONTRAT__ENTETE, null, msgs);
			if (newEntete != null)
				msgs = ((InternalEObject)newEntete).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LegalSCPackage.CONTRAT__ENTETE, null, msgs);
			msgs = basicSetEntete(newEntete, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LegalSCPackage.CONTRAT__ENTETE, newEntete, newEntete));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ClauseSection> getClausesection() {
		if (clausesection == null) {
			clausesection = new EObjectContainmentEList<ClauseSection>(ClauseSection.class, this, LegalSCPackage.CONTRAT__CLAUSESECTION);
		}
		return clausesection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNom() {
		return nom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNom(String newNom) {
		String oldNom = nom;
		nom = newNom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LegalSCPackage.CONTRAT__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LegalSCPackage.CONTRAT__ENTETE:
				return basicSetEntete(null, msgs);
			case LegalSCPackage.CONTRAT__CLAUSESECTION:
				return ((InternalEList<?>)getClausesection()).basicRemove(otherEnd, msgs);
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
			case LegalSCPackage.CONTRAT__ENTETE:
				return getEntete();
			case LegalSCPackage.CONTRAT__CLAUSESECTION:
				return getClausesection();
			case LegalSCPackage.CONTRAT__NOM:
				return getNom();
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
			case LegalSCPackage.CONTRAT__ENTETE:
				setEntete((Entete)newValue);
				return;
			case LegalSCPackage.CONTRAT__CLAUSESECTION:
				getClausesection().clear();
				getClausesection().addAll((Collection<? extends ClauseSection>)newValue);
				return;
			case LegalSCPackage.CONTRAT__NOM:
				setNom((String)newValue);
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
			case LegalSCPackage.CONTRAT__ENTETE:
				setEntete((Entete)null);
				return;
			case LegalSCPackage.CONTRAT__CLAUSESECTION:
				getClausesection().clear();
				return;
			case LegalSCPackage.CONTRAT__NOM:
				setNom(NOM_EDEFAULT);
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
			case LegalSCPackage.CONTRAT__ENTETE:
				return entete != null;
			case LegalSCPackage.CONTRAT__CLAUSESECTION:
				return clausesection != null && !clausesection.isEmpty();
			case LegalSCPackage.CONTRAT__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
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
		result.append(" (nom: ");
		result.append(nom);
		result.append(')');
		return result.toString();
	}

} //ContratImpl
