package org.xtext.example.mydsl.generator

import org.eclipse.emf.ecore.resource.Resource
import LegalSC.Contrat
import org.eclipse.xtext.generator.IFileSystemAccess2

class MigratorGenerator {
	def public static void migratorGenerate(Resource resource, IFileSystemAccess2 fsa){
		val c = resource.allContents.toIterable.filter(Contrat).get(0)
		fsa.generateFile(
			"5_"+c.nom + "_migration.js",
			c.compile)
	}
	
	def static compile(Contrat c)'''
	const Contract = artifacts.require("«c.nom.toLowerCase»");
	
	module.exports = function(deployer) {
	  deployer.deploy(Contract, <pdfHash>);
	};
	'''
}