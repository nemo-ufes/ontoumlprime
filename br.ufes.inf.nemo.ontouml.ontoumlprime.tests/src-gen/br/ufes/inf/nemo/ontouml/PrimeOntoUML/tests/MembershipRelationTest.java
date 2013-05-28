/**
 */
package br.ufes.inf.nemo.ontouml.PrimeOntoUML.tests;

import br.ufes.inf.nemo.ontouml.PrimeOntoUML.MembershipRelation;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Membership Relation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MembershipRelationTest extends MeronymicRelationTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(MembershipRelationTest.class);
  }

  /**
   * Constructs a new Membership Relation test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MembershipRelationTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Membership Relation test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected MembershipRelation getFixture()
  {
    return (MembershipRelation)fixture;
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
    setFixture(PrimeOntoUMLFactory.eINSTANCE.createMembershipRelation());
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

} //MembershipRelationTest
