/**
 */
package br.ufes.inf.nemo.ontouml.PrimeOntoUML.tests;

import br.ufes.inf.nemo.ontouml.PrimeOntoUML.BinaryMaterialRelation;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Binary Material Relation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BinaryMaterialRelationTest extends BinaryDirectedRelationshipTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(BinaryMaterialRelationTest.class);
  }

  /**
   * Constructs a new Binary Material Relation test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BinaryMaterialRelationTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Binary Material Relation test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected BinaryMaterialRelation getFixture()
  {
    return (BinaryMaterialRelation)fixture;
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
    setFixture(PrimeOntoUMLFactory.eINSTANCE.createBinaryMaterialRelation());
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

} //BinaryMaterialRelationTest
