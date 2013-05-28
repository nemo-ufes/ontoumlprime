/**
 */
package br.ufes.inf.nemo.ontouml.PrimeOntoUML.tests;

import br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLFactory;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.SubCollectionRelation;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Sub Collection Relation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SubCollectionRelationTest extends MeronymicRelationTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(SubCollectionRelationTest.class);
  }

  /**
   * Constructs a new Sub Collection Relation test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubCollectionRelationTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Sub Collection Relation test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected SubCollectionRelation getFixture()
  {
    return (SubCollectionRelation)fixture;
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
    setFixture(PrimeOntoUMLFactory.eINSTANCE.createSubCollectionRelation());
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

} //SubCollectionRelationTest
