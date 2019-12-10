/**
 */
package LegalSC.impl;

import LegalSC.Execution;
import LegalSC.Expression;
import LegalSC.LegalSCPackage;
import LegalSC.SiAlors;

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
 * An implementation of the model object '<em><b>Execution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link LegalSC.impl.ExecutionImpl#getSialors <em>Sialors</em>}</li>
 *   <li>{@link LegalSC.impl.ExecutionImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link LegalSC.impl.ExecutionImpl#getDroitAcces <em>Droit Acces</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExecutionImpl extends MinimalEObjectImpl.Container implements Execution {
	/**
	 * The cached value of the '{@link #getSialors() <em>Sialors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSialors()
	 * @generated
	 * @ordered
	 */
	protected EList<SiAlors> sialors;

	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> expression;

	/**
	 * The default value of the '{@link #getDroitAcces() <em>Droit Acces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDroitAcces()
	 * @generated
	 * @ordered
	 */
	protected static final String DROIT_ACCES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDroitAcces() <em>Droit Acces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDroitAcces()
	 * @generated
	 * @ordered
	 */
	protected String droitAcces = DROIT_ACCES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecutionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LegalSCPackage.Literals.EXECUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SiAlors> getSialors() {
		if (sialors == null) {
			sialors = new EObjectContainmentEList<SiAlors>(SiAlors.class, this, LegalSCPackage.EXECUTION__SIALORS);
		}
		return sialors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Expression> getExpression() {
		if (expression == null) {
			expression = new EObjectContainmentEList<Expression>(Expression.class, this, LegalSCPackage.EXECUTION__EXPRESSION);
		}
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDroitAcces() {
		return droitAcces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDroitAcces(String newDroitAcces) {
		String oldDroitAcces = droitAcces;
		droitAcces = newDroitAcces;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LegalSCPackage.EXECUTION__DROIT_ACCES, oldDroitAcces, droitAcces));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LegalSCPackage.EXECUTION__SIALORS:
				return ((InternalEList<?>)getSialors()).basicRemove(otherEnd, msgs);
			case LegalSCPackage.EXECUTION__EXPRESSION:
				return ((InternalEList<?>)getExpression()).basicRemove(otherEnd, msgs);
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
			case LegalSCPackage.EXECUTION__SIALORS:
				return getSialors();
			case LegalSCPackage.EXECUTION__EXPRESSION:
				return getExpression();
			case LegalSCPackage.EXECUTION__DROIT_ACCES:
				return getDroitAcces();
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
			case LegalSCPackage.EXECUTION__SIALORS:
				getSialors().clear();
				getSialors().addAll((Collection<? extends SiAlors>)newValue);
				return;
			case LegalSCPackage.EXECUTION__EXPRESSION:
				getExpression().clear();
				getExpression().addAll((Collection<? extends Expression>)newValue);
				return;
			case LegalSCPackage.EXECUTION__DROIT_ACCES:
				setDroitAcces((String)newValue);
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
			case LegalSCPackage.EXECUTION__SIALORS:
				getSialors().clear();
				return;
			case LegalSCPackage.EXECUTION__EXPRESSION:
				getExpression().clear();
				return;
			case LegalSCPackage.EXECUTION__DROIT_ACCES:
				setDroitAcces(DROIT_ACCES_EDEFAULT);
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
			case LegalSCPackage.EXECUTION__SIALORS:
				return sialors != null && !sialors.isEmpty();
			case LegalSCPackage.EXECUTION__EXPRESSION:
				return expression != null && !expression.isEmpty();
			case LegalSCPackage.EXECUTION__DROIT_ACCES:
				return DROIT_ACCES_EDEFAULT == null ? droitAcces != null : !DROIT_ACCES_EDEFAULT.equals(droitAcces);
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
		result.append(" (droitAcces: ");
		result.append(droitAcces);
		result.append(')');
		return result.toString();
	}

} //ExecutionImpl
