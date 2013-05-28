/**
 */
package br.ufes.inf.nemo.ontouml.PrimeOntoUML.tests;

import br.ufes.inf.nemo.ontouml.PrimeOntoUML.MeronymicRelation;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Meronymic Relation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MeronymicRelationTest extends PackageableElementTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(MeronymicRelationTest.class);
  }

  /**
   * Constructs a new Meronymic Relation test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MeronymicRelationTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Meronymic Relation test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected MeronymicRelation getFixture()
  {
    return (MeronymicRelation)fixture;
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
    setFixture(PrimeOntoUMLFactory.eINSTANCE.createMeronymicRelation());
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

} //MeronymicRelationTest
