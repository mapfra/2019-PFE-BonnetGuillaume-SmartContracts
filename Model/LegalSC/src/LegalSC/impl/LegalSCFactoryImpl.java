/**
 */
package LegalSC.impl;

import LegalSC.*;

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
public class LegalSCFactoryImpl extends EFactoryImpl implements LegalSCFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LegalSCFactory init() {
		try {
			LegalSCFactory theLegalSCFactory = (LegalSCFactory)EPackage.Registry.INSTANCE.getEFactory(LegalSCPackage.eNS_URI);
			if (theLegalSCFactory != null) {
				return theLegalSCFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LegalSCFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegalSCFactoryImpl() {
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
			case LegalSCPackage.CONTRAT: return createContrat();
			case LegalSCPackage.ENTETE: return createEntete();
			case LegalSCPackage.CLAUSE_SECTION: return createClauseSection();
			case LegalSCPackage.CLAUSE: return createClause();
			case LegalSCPackage.PARTIE: return createPartie();
			case LegalSCPackage.VARIABLE: return createVariable();
			case LegalSCPackage.EXECUTION: return createExecution();
			case LegalSCPackage.SI_ALORS: return createSiAlors();
			case LegalSCPackage.CONDITION: return createCondition();
			case LegalSCPackage.EXPRESSION: return createExpression();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Contrat createContrat() {
		ContratImpl contrat = new ContratImpl();
		return contrat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Entete createEntete() {
		EnteteImpl entete = new EnteteImpl();
		return entete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClauseSection createClauseSection() {
		ClauseSectionImpl clauseSection = new ClauseSectionImpl();
		return clauseSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Clause createClause() {
		ClauseImpl clause = new ClauseImpl();
		return clause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Partie createPartie() {
		PartieImpl partie = new PartieImpl();
		return partie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Execution createExecution() {
		ExecutionImpl execution = new ExecutionImpl();
		return execution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SiAlors createSiAlors() {
		SiAlorsImpl siAlors = new SiAlorsImpl();
		return siAlors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Condition createCondition() {
		ConditionImpl condition = new ConditionImpl();
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression createExpression() {
		ExpressionImpl expression = new ExpressionImpl();
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LegalSCPackage getLegalSCPackage() {
		return (LegalSCPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LegalSCPackage getPackage() {
		return LegalSCPackage.eINSTANCE;
	}

} //LegalSCFactoryImpl
