/**
 */
package LegalSC;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see LegalSC.LegalSCFactory
 * @model kind="package"
 * @generated
 */
public interface LegalSCPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "LegalSC";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://LSC/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "lsc";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LegalSCPackage eINSTANCE = LegalSC.impl.LegalSCPackageImpl.init();

	/**
	 * The meta object id for the '{@link LegalSC.impl.ContratImpl <em>Contrat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LegalSC.impl.ContratImpl
	 * @see LegalSC.impl.LegalSCPackageImpl#getContrat()
	 * @generated
	 */
	int CONTRAT = 0;

	/**
	 * The feature id for the '<em><b>Entete</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRAT__ENTETE = 0;

	/**
	 * The feature id for the '<em><b>Clausesection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRAT__CLAUSESECTION = 1;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRAT__NOM = 2;

	/**
	 * The number of structural features of the '<em>Contrat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRAT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Contrat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRAT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link LegalSC.impl.EnteteImpl <em>Entete</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LegalSC.impl.EnteteImpl
	 * @see LegalSC.impl.LegalSCPackageImpl#getEntete()
	 * @generated
	 */
	int ENTETE = 1;

	/**
	 * The feature id for the '<em><b>Prix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTETE__PRIX = 0;

	/**
	 * The feature id for the '<em><b>Date debut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTETE__DATE_DEBUT = 1;

	/**
	 * The feature id for the '<em><b>Date fin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTETE__DATE_FIN = 2;

	/**
	 * The feature id for the '<em><b>Objet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTETE__OBJET = 3;

	/**
	 * The feature id for the '<em><b>Partie</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTETE__PARTIE = 4;

	/**
	 * The number of structural features of the '<em>Entete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTETE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Entete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTETE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link LegalSC.impl.ClauseSectionImpl <em>Clause Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LegalSC.impl.ClauseSectionImpl
	 * @see LegalSC.impl.LegalSCPackageImpl#getClauseSection()
	 * @generated
	 */
	int CLAUSE_SECTION = 2;

	/**
	 * The feature id for the '<em><b>Clause</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAUSE_SECTION__CLAUSE = 0;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAUSE_SECTION__NOM = 1;

	/**
	 * The number of structural features of the '<em>Clause Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAUSE_SECTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Clause Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAUSE_SECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link LegalSC.impl.ClauseImpl <em>Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LegalSC.impl.ClauseImpl
	 * @see LegalSC.impl.LegalSCPackageImpl#getClause()
	 * @generated
	 */
	int CLAUSE = 3;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAUSE__NOM = 0;

	/**
	 * The feature id for the '<em><b>Texte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAUSE__TEXTE = 1;

	/**
	 * The feature id for the '<em><b>Execution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAUSE__EXECUTION = 2;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAUSE__VARIABLE = 3;

	/**
	 * The number of structural features of the '<em>Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAUSE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAUSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link LegalSC.impl.PartieImpl <em>Partie</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LegalSC.impl.PartieImpl
	 * @see LegalSC.impl.LegalSCPackageImpl#getPartie()
	 * @generated
	 */
	int PARTIE = 4;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIE__NOM = 0;

	/**
	 * The feature id for the '<em><b>Adresse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIE__ADRESSE = 1;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIE__ROLE = 2;

	/**
	 * The number of structural features of the '<em>Partie</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Partie</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link LegalSC.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LegalSC.impl.VariableImpl
	 * @see LegalSC.impl.LegalSCPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NOM = 1;

	/**
	 * The feature id for the '<em><b>Valeur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__VALEUR = 2;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link LegalSC.impl.ExecutionImpl <em>Execution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LegalSC.impl.ExecutionImpl
	 * @see LegalSC.impl.LegalSCPackageImpl#getExecution()
	 * @generated
	 */
	int EXECUTION = 6;

	/**
	 * The feature id for the '<em><b>Sialors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION__SIALORS = 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION__EXPRESSION = 1;

	/**
	 * The feature id for the '<em><b>Droit Acces</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION__DROIT_ACCES = 2;

	/**
	 * The number of structural features of the '<em>Execution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Execution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link LegalSC.impl.SiAlorsImpl <em>Si Alors</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LegalSC.impl.SiAlorsImpl
	 * @see LegalSC.impl.LegalSCPackageImpl#getSiAlors()
	 * @generated
	 */
	int SI_ALORS = 7;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_ALORS__CONDITION = 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_ALORS__EXPRESSION = 1;

	/**
	 * The number of structural features of the '<em>Si Alors</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_ALORS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Si Alors</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_ALORS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link LegalSC.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LegalSC.impl.ConditionImpl
	 * @see LegalSC.impl.LegalSCPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 8;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__CONDITION = 0;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link LegalSC.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LegalSC.impl.ExpressionImpl
	 * @see LegalSC.impl.LegalSCPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 9;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__EXPRESSION = 0;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link LegalSC.Contrat <em>Contrat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contrat</em>'.
	 * @see LegalSC.Contrat
	 * @generated
	 */
	EClass getContrat();

	/**
	 * Returns the meta object for the containment reference '{@link LegalSC.Contrat#getEntete <em>Entete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entete</em>'.
	 * @see LegalSC.Contrat#getEntete()
	 * @see #getContrat()
	 * @generated
	 */
	EReference getContrat_Entete();

	/**
	 * Returns the meta object for the containment reference list '{@link LegalSC.Contrat#getClausesection <em>Clausesection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Clausesection</em>'.
	 * @see LegalSC.Contrat#getClausesection()
	 * @see #getContrat()
	 * @generated
	 */
	EReference getContrat_Clausesection();

	/**
	 * Returns the meta object for the attribute '{@link LegalSC.Contrat#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see LegalSC.Contrat#getNom()
	 * @see #getContrat()
	 * @generated
	 */
	EAttribute getContrat_Nom();

	/**
	 * Returns the meta object for class '{@link LegalSC.Entete <em>Entete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entete</em>'.
	 * @see LegalSC.Entete
	 * @generated
	 */
	EClass getEntete();

	/**
	 * Returns the meta object for the attribute '{@link LegalSC.Entete#getPrix <em>Prix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prix</em>'.
	 * @see LegalSC.Entete#getPrix()
	 * @see #getEntete()
	 * @generated
	 */
	EAttribute getEntete_Prix();

	/**
	 * Returns the meta object for the attribute '{@link LegalSC.Entete#getDate_debut <em>Date debut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date debut</em>'.
	 * @see LegalSC.Entete#getDate_debut()
	 * @see #getEntete()
	 * @generated
	 */
	EAttribute getEntete_Date_debut();

	/**
	 * Returns the meta object for the attribute '{@link LegalSC.Entete#getDate_fin <em>Date fin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date fin</em>'.
	 * @see LegalSC.Entete#getDate_fin()
	 * @see #getEntete()
	 * @generated
	 */
	EAttribute getEntete_Date_fin();

	/**
	 * Returns the meta object for the attribute '{@link LegalSC.Entete#getObjet <em>Objet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Objet</em>'.
	 * @see LegalSC.Entete#getObjet()
	 * @see #getEntete()
	 * @generated
	 */
	EAttribute getEntete_Objet();

	/**
	 * Returns the meta object for the containment reference list '{@link LegalSC.Entete#getPartie <em>Partie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Partie</em>'.
	 * @see LegalSC.Entete#getPartie()
	 * @see #getEntete()
	 * @generated
	 */
	EReference getEntete_Partie();

	/**
	 * Returns the meta object for class '{@link LegalSC.ClauseSection <em>Clause Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clause Section</em>'.
	 * @see LegalSC.ClauseSection
	 * @generated
	 */
	EClass getClauseSection();

	/**
	 * Returns the meta object for the containment reference list '{@link LegalSC.ClauseSection#getClause <em>Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Clause</em>'.
	 * @see LegalSC.ClauseSection#getClause()
	 * @see #getClauseSection()
	 * @generated
	 */
	EReference getClauseSection_Clause();

	/**
	 * Returns the meta object for the attribute '{@link LegalSC.ClauseSection#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see LegalSC.ClauseSection#getNom()
	 * @see #getClauseSection()
	 * @generated
	 */
	EAttribute getClauseSection_Nom();

	/**
	 * Returns the meta object for class '{@link LegalSC.Clause <em>Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clause</em>'.
	 * @see LegalSC.Clause
	 * @generated
	 */
	EClass getClause();

	/**
	 * Returns the meta object for the attribute '{@link LegalSC.Clause#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see LegalSC.Clause#getNom()
	 * @see #getClause()
	 * @generated
	 */
	EAttribute getClause_Nom();

	/**
	 * Returns the meta object for the attribute '{@link LegalSC.Clause#getTexte <em>Texte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Texte</em>'.
	 * @see LegalSC.Clause#getTexte()
	 * @see #getClause()
	 * @generated
	 */
	EAttribute getClause_Texte();

	/**
	 * Returns the meta object for the containment reference '{@link LegalSC.Clause#getExecution <em>Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Execution</em>'.
	 * @see LegalSC.Clause#getExecution()
	 * @see #getClause()
	 * @generated
	 */
	EReference getClause_Execution();

	/**
	 * Returns the meta object for the containment reference list '{@link LegalSC.Clause#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variable</em>'.
	 * @see LegalSC.Clause#getVariable()
	 * @see #getClause()
	 * @generated
	 */
	EReference getClause_Variable();

	/**
	 * Returns the meta object for class '{@link LegalSC.Partie <em>Partie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Partie</em>'.
	 * @see LegalSC.Partie
	 * @generated
	 */
	EClass getPartie();

	/**
	 * Returns the meta object for the attribute '{@link LegalSC.Partie#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see LegalSC.Partie#getNom()
	 * @see #getPartie()
	 * @generated
	 */
	EAttribute getPartie_Nom();

	/**
	 * Returns the meta object for the attribute '{@link LegalSC.Partie#getAdresse <em>Adresse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adresse</em>'.
	 * @see LegalSC.Partie#getAdresse()
	 * @see #getPartie()
	 * @generated
	 */
	EAttribute getPartie_Adresse();

	/**
	 * Returns the meta object for the attribute '{@link LegalSC.Partie#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see LegalSC.Partie#getRole()
	 * @see #getPartie()
	 * @generated
	 */
	EAttribute getPartie_Role();

	/**
	 * Returns the meta object for class '{@link LegalSC.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see LegalSC.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link LegalSC.Variable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see LegalSC.Variable#getType()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Type();

	/**
	 * Returns the meta object for the attribute '{@link LegalSC.Variable#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see LegalSC.Variable#getNom()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Nom();

	/**
	 * Returns the meta object for the attribute '{@link LegalSC.Variable#getValeur <em>Valeur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valeur</em>'.
	 * @see LegalSC.Variable#getValeur()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Valeur();

	/**
	 * Returns the meta object for class '{@link LegalSC.Execution <em>Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution</em>'.
	 * @see LegalSC.Execution
	 * @generated
	 */
	EClass getExecution();

	/**
	 * Returns the meta object for the containment reference list '{@link LegalSC.Execution#getSialors <em>Sialors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sialors</em>'.
	 * @see LegalSC.Execution#getSialors()
	 * @see #getExecution()
	 * @generated
	 */
	EReference getExecution_Sialors();

	/**
	 * Returns the meta object for the containment reference list '{@link LegalSC.Execution#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expression</em>'.
	 * @see LegalSC.Execution#getExpression()
	 * @see #getExecution()
	 * @generated
	 */
	EReference getExecution_Expression();

	/**
	 * Returns the meta object for the attribute '{@link LegalSC.Execution#getDroitAcces <em>Droit Acces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Droit Acces</em>'.
	 * @see LegalSC.Execution#getDroitAcces()
	 * @see #getExecution()
	 * @generated
	 */
	EAttribute getExecution_DroitAcces();

	/**
	 * Returns the meta object for class '{@link LegalSC.SiAlors <em>Si Alors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Si Alors</em>'.
	 * @see LegalSC.SiAlors
	 * @generated
	 */
	EClass getSiAlors();

	/**
	 * Returns the meta object for the containment reference '{@link LegalSC.SiAlors#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see LegalSC.SiAlors#getCondition()
	 * @see #getSiAlors()
	 * @generated
	 */
	EReference getSiAlors_Condition();

	/**
	 * Returns the meta object for the containment reference list '{@link LegalSC.SiAlors#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expression</em>'.
	 * @see LegalSC.SiAlors#getExpression()
	 * @see #getSiAlors()
	 * @generated
	 */
	EReference getSiAlors_Expression();

	/**
	 * Returns the meta object for class '{@link LegalSC.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see LegalSC.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the attribute '{@link LegalSC.Condition#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see LegalSC.Condition#getCondition()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_Condition();

	/**
	 * Returns the meta object for class '{@link LegalSC.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see LegalSC.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for the attribute '{@link LegalSC.Expression#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see LegalSC.Expression#getExpression()
	 * @see #getExpression()
	 * @generated
	 */
	EAttribute getExpression_Expression();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LegalSCFactory getLegalSCFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link LegalSC.impl.ContratImpl <em>Contrat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LegalSC.impl.ContratImpl
		 * @see LegalSC.impl.LegalSCPackageImpl#getContrat()
		 * @generated
		 */
		EClass CONTRAT = eINSTANCE.getContrat();

		/**
		 * The meta object literal for the '<em><b>Entete</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRAT__ENTETE = eINSTANCE.getContrat_Entete();

		/**
		 * The meta object literal for the '<em><b>Clausesection</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRAT__CLAUSESECTION = eINSTANCE.getContrat_Clausesection();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRAT__NOM = eINSTANCE.getContrat_Nom();

		/**
		 * The meta object literal for the '{@link LegalSC.impl.EnteteImpl <em>Entete</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LegalSC.impl.EnteteImpl
		 * @see LegalSC.impl.LegalSCPackageImpl#getEntete()
		 * @generated
		 */
		EClass ENTETE = eINSTANCE.getEntete();

		/**
		 * The meta object literal for the '<em><b>Prix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTETE__PRIX = eINSTANCE.getEntete_Prix();

		/**
		 * The meta object literal for the '<em><b>Date debut</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTETE__DATE_DEBUT = eINSTANCE.getEntete_Date_debut();

		/**
		 * The meta object literal for the '<em><b>Date fin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTETE__DATE_FIN = eINSTANCE.getEntete_Date_fin();

		/**
		 * The meta object literal for the '<em><b>Objet</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTETE__OBJET = eINSTANCE.getEntete_Objet();

		/**
		 * The meta object literal for the '<em><b>Partie</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTETE__PARTIE = eINSTANCE.getEntete_Partie();

		/**
		 * The meta object literal for the '{@link LegalSC.impl.ClauseSectionImpl <em>Clause Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LegalSC.impl.ClauseSectionImpl
		 * @see LegalSC.impl.LegalSCPackageImpl#getClauseSection()
		 * @generated
		 */
		EClass CLAUSE_SECTION = eINSTANCE.getClauseSection();

		/**
		 * The meta object literal for the '<em><b>Clause</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAUSE_SECTION__CLAUSE = eINSTANCE.getClauseSection_Clause();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLAUSE_SECTION__NOM = eINSTANCE.getClauseSection_Nom();

		/**
		 * The meta object literal for the '{@link LegalSC.impl.ClauseImpl <em>Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LegalSC.impl.ClauseImpl
		 * @see LegalSC.impl.LegalSCPackageImpl#getClause()
		 * @generated
		 */
		EClass CLAUSE = eINSTANCE.getClause();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLAUSE__NOM = eINSTANCE.getClause_Nom();

		/**
		 * The meta object literal for the '<em><b>Texte</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLAUSE__TEXTE = eINSTANCE.getClause_Texte();

		/**
		 * The meta object literal for the '<em><b>Execution</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAUSE__EXECUTION = eINSTANCE.getClause_Execution();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAUSE__VARIABLE = eINSTANCE.getClause_Variable();

		/**
		 * The meta object literal for the '{@link LegalSC.impl.PartieImpl <em>Partie</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LegalSC.impl.PartieImpl
		 * @see LegalSC.impl.LegalSCPackageImpl#getPartie()
		 * @generated
		 */
		EClass PARTIE = eINSTANCE.getPartie();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTIE__NOM = eINSTANCE.getPartie_Nom();

		/**
		 * The meta object literal for the '<em><b>Adresse</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTIE__ADRESSE = eINSTANCE.getPartie_Adresse();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTIE__ROLE = eINSTANCE.getPartie_Role();

		/**
		 * The meta object literal for the '{@link LegalSC.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LegalSC.impl.VariableImpl
		 * @see LegalSC.impl.LegalSCPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__TYPE = eINSTANCE.getVariable_Type();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__NOM = eINSTANCE.getVariable_Nom();

		/**
		 * The meta object literal for the '<em><b>Valeur</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__VALEUR = eINSTANCE.getVariable_Valeur();

		/**
		 * The meta object literal for the '{@link LegalSC.impl.ExecutionImpl <em>Execution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LegalSC.impl.ExecutionImpl
		 * @see LegalSC.impl.LegalSCPackageImpl#getExecution()
		 * @generated
		 */
		EClass EXECUTION = eINSTANCE.getExecution();

		/**
		 * The meta object literal for the '<em><b>Sialors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION__SIALORS = eINSTANCE.getExecution_Sialors();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION__EXPRESSION = eINSTANCE.getExecution_Expression();

		/**
		 * The meta object literal for the '<em><b>Droit Acces</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION__DROIT_ACCES = eINSTANCE.getExecution_DroitAcces();

		/**
		 * The meta object literal for the '{@link LegalSC.impl.SiAlorsImpl <em>Si Alors</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LegalSC.impl.SiAlorsImpl
		 * @see LegalSC.impl.LegalSCPackageImpl#getSiAlors()
		 * @generated
		 */
		EClass SI_ALORS = eINSTANCE.getSiAlors();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SI_ALORS__CONDITION = eINSTANCE.getSiAlors_Condition();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SI_ALORS__EXPRESSION = eINSTANCE.getSiAlors_Expression();

		/**
		 * The meta object literal for the '{@link LegalSC.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LegalSC.impl.ConditionImpl
		 * @see LegalSC.impl.LegalSCPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__CONDITION = eINSTANCE.getCondition_Condition();

		/**
		 * The meta object literal for the '{@link LegalSC.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LegalSC.impl.ExpressionImpl
		 * @see LegalSC.impl.LegalSCPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION__EXPRESSION = eINSTANCE.getExpression_Expression();

	}

} //LegalSCPackage
