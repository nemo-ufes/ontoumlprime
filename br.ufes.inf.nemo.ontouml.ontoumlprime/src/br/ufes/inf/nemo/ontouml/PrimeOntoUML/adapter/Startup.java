package br.ufes.inf.nemo.ontouml.PrimeOntoUML.adapter;

import org.eclipse.ui.IStartup;

import br.ufes.inf.nemo.ontouml.PrimeOntoUML.util.CompleteOCLValidator;

// Uses this startup because Xcore removes all generated files when the build is cleaned.
// (and this blocked me from changing the Ecore package initialization).
// Source: http://help.eclipse.org/galileo/topic/org.eclipse.emf.validation.doc/tutorials/validationAdapterTutorial.html#registering
public class Startup implements IStartup {
	public void earlyStartup() {
		CompleteOCLValidator.register();
	}
}
