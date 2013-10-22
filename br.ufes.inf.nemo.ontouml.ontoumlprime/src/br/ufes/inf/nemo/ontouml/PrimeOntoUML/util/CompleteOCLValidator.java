package br.ufes.inf.nemo.ontouml.PrimeOntoUML.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.ocl.examples.xtext.completeocl.validation.CompleteOCLEObjectValidator;

import br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLPackage;

//import br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLPackage;

public class CompleteOCLValidator extends CompleteOCLEObjectValidator {
	public static URI OCL_URI = URI.createPlatformPluginURI("/br.ufes.inf.nemo.ontouml.ontoumlprime/model/ontoumlprime.ocl", true);

	public static final CompleteOCLValidator INSTANCE = new CompleteOCLValidator();
	// public static final String DIAGNOSTIC_SOURCE = "br.ufes.inf.nemo.ontouml.PrimeOntoUML";

	public CompleteOCLValidator() {
		super(PrimeOntoUMLPackage.eINSTANCE, OCL_URI, null);
	}

	private CompleteOCLValidator(PrimeOntoUMLPackage ePackage) {
		super(ePackage, OCL_URI, null);
	}

	@Override
	protected EPackage getEPackage() {
		return PrimeOntoUMLPackage.eINSTANCE;
	}

	public static void register() {
		register(PrimeOntoUMLPackage.eINSTANCE);
		
	}

	private static Descriptor getDescriptorFor(final CompleteOCLValidator validator) {
		return new EValidator.Descriptor() {
			public EValidator getEValidator() {
				return validator;
			}
		};
	}

	private static void register(PrimeOntoUMLPackage ePackage){
	    EValidator.Registry.INSTANCE.put(ePackage, getDescriptorFor(new CompleteOCLValidator(ePackage))); 
	}

}
