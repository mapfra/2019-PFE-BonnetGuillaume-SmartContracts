package unice.xtext.pfe.legalsc.generator

import org.eclipse.emf.ecore.resource.Resource
import LegalSC.Contrat
import org.eclipse.xtext.generator.IFileSystemAccess2
import LegalSC.Entete
import LegalSC.ClauseSection
import LegalSC.Clause

class PdfGenerator {
	def static void pdfGenerate(Resource resource, IFileSystemAccess2 fsa){
		val c = resource.allContents.toIterable.filter(Contrat).get(0)
		fsa.generateFile(
			c.nom.toFirstUpper + ".tex",
			c.compile)
	}
	
	def static compile(Contrat c) '''
		\documentclass[a4paper,12pt]{article} 
		\begin{document}
		\begin{center}
		{\LARGE «c.nom»}
		\end{center}
		«c.entete.compile»
		«FOR cs : c.clausesection»
			«cs.compile»
		«ENDFOR»
		\end{document}
	'''
	
	def static compile(Entete e) '''
		Entre les soussignés:\\
		\\
		«FOR p : e.partie»
			«IF p.role == "Prestataire"»
				«p.nom»\\
				Wallet: «p.adresse»\\
				Ci-après désigné "le Prestataire"\\ 
				D’une part,\\
				\\
			«ENDIF»
		«ENDFOR»
		Et :\\
		\\
		«FOR p : e.partie»
			«IF p.role == "Client"»
				«p.nom»\\
				Wallet: «p.adresse»\\
				Ci-après désigné "le Client"\\
				D’autre part,\\
			«ENDIF»
		«ENDFOR»
		\\
		Fait le «e.date_debut»
	'''
	
	def static compile(ClauseSection s) '''
		\section{«s.nom»}
		«FOR c : s.clause»
			«c.compile»
		«ENDFOR»
	'''
	
	def static compile(Clause c) '''
		\subsection{«c.titre»}
		«c.texte»
	'''
	
}