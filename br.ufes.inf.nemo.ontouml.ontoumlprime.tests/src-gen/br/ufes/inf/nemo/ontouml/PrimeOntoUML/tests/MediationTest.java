/**
 */
package br.ufes.inf.nemo.ontouml.PrimeOntoUML.tests;

import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Mediation;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Mediation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MediationTest extends BinaryDirectedRelationshipTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(MediationTest.class);
  }

  /**
   * Constructs a new Mediation test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MediationTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Mediation test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected Mediation getFixture()
  {
    return (Mediation)fixture;
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
    setFixture(PrimeOntoUMLFactory.eINSTANCE.createMediation());
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

} //MediationTest
