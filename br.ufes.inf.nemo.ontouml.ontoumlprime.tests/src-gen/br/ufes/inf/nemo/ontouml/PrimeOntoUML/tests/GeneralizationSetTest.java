/**
 */
package br.ufes.inf.nemo.ontouml.PrimeOntoUML.tests;

import br.ufes.inf.nemo.ontouml.PrimeOntoUML.GeneralizationSet;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Generalization Set</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GeneralizationSetTest extends NamedElementTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(GeneralizationSetTest.class);
  }

  /**
   * Constructs a new Generalization Set test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GeneralizationSetTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Generalization Set test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected GeneralizationSet getFixture()
  {
    return (GeneralizationSet)fixture;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see junit.framework.TestCase#setUp()
   * @generated
   */
  @Override
  protected void setUp() throws Exception
  {
    setFixture(PrimeOntoUMLFactory.eINSTANCE.createGeneralizationSet());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see junit.framework.TestCase#tearDown()
   * @generated
   */
  @Override
  protected void tearDown() throws Exception
  {
    setFixture(null);
  }

} //GeneralizationSetTest
