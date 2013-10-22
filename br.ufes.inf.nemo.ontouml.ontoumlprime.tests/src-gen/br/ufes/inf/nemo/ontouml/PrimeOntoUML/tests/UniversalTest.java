/**
 */
package br.ufes.inf.nemo.ontouml.PrimeOntoUML.tests;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.junit.Test;

import br.ufes.inf.nemo.ontouml.PrimeOntoUML.GeneralizationSet;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Model;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLFactory;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLPackage;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.SubstanceSortalUniversal;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Universal;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.UniversalImpl;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.util.CompleteOCLValidator;

/**
 * <!-- begin-user-doc --> A test case for the model object '
 * <em><b>Universal</b></em>'. <!-- end-user-doc -->
 * @generated
 */
public abstract class UniversalTest extends NamedElementTest {

	/**
	 * Constructs a new Universal test case with the given name. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public UniversalTest(String name) {
    super(name);
  }

	/**
   * Returns the fixture for this Universal test case.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected Universal getFixture() {
    return (Universal)fixture;
  }

	
} // UniversalTest
