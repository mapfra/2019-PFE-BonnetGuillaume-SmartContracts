/*
 * generated by Xtext 2.17.0
 */
package unice.xtext.pfe.legalsc.ide

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import unice.xtext.pfe.legalsc.LegalSCRuntimeModule
import unice.xtext.pfe.legalsc.LegalSCStandaloneSetup

/**
 * Initialization support for running Xtext languages as language servers.
 */
class LegalSCIdeSetup extends LegalSCStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new LegalSCRuntimeModule, new LegalSCIdeModule))
	}
	
}