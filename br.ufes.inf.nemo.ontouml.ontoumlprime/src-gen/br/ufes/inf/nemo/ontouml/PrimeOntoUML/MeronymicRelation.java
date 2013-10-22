/**
 */
package br.ufes.inf.nemo.ontouml.PrimeOntoUML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Meronymic Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.MeronymicRelation#getWhole <em>Whole</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.MeronymicRelation#getPart <em>Part</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.MeronymicRelation#isPartIsEssential <em>Part Is Essential</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.MeronymicRelation#isPartIsInseparable <em>Part Is Inseparable</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.MeronymicRelation#isPartIsShareable <em>Part Is Shareable</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.MeronymicRelation#isPartIsImmutable <em>Part Is Immutable</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLPackage#getMeronymicRelation()
 * @model abstract="true"
 * @generated
 */
public interface MeronymicRelation extends PackageableElement, BinaryDirectedRelationship
{
  /**
   * Returns the value of the '<em><b>Whole</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Whole</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Whole</em>' reference.
   * @see #setWhole(SubstantialUniversal)
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLPackage#getMeronymicRelation_Whole()
   * @model required="true"
   * @generated
   */
  SubstantialUniversal getWhole();

  /**
   * Sets the value of the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.MeronymicRelation#getWhole <em>Whole</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Whole</em>' reference.
   * @see #getWhole()
   * @generated
   */
  void setWhole(SubstantialUniversal value);

  /**
   * Returns the value of the '<em><b>Part</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Part</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Part</em>' reference.
   * @see #setPart(SubstantialUniversal)
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLPackage#getMeronymicRelation_Part()
   * @model required="true"
   * @generated
   */
  SubstantialUniversal getPart();

  /**
   * Sets the value of the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.MeronymicRelation#getPart <em>Part</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Part</em>' reference.
   * @see #getPart()
   * @generated
   */
  void setPart(SubstantialUniversal value);

  /**
   * Returns the value of the '<em><b>Part Is Essential</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Part Is Essential</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Part Is Essential</em>' attribute.
   * @see #setPartIsEssential(boolean)
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLPackage#getMeronymicRelation_PartIsEssential()
   * @model unique="false" required="true"
   * @generated
   */
  boolean isPartIsEssential();

  /**
   * Sets the value of the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.MeronymicRelation#isPartIsEssential <em>Part Is Essential</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Part Is Essential</em>' attribute.
   * @see #isPartIsEssential()
   * @generated
   */
  void setPartIsEssential(boolean value);

  /**
   * Returns the value of the '<em><b>Part Is Inseparable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Part Is Inseparable</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Part Is Inseparable</em>' attribute.
   * @see #setPartIsInseparable(boolean)
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLPackage#getMeronymicRelation_PartIsInseparable()
   * @model unique="false" required="true"
   * @generated
   */
  boolean isPartIsInseparable();

  /**
   * Sets the value of the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.MeronymicRelation#isPartIsInseparable <em>Part Is Inseparable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Part Is Inseparable</em>' attribute.
   * @see #isPartIsInseparable()
   * @generated
   */
  void setPartIsInseparable(boolean value);

  /**
   * Returns the value of the '<em><b>Part Is Shareable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Part Is Shareable</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Part Is Shareable</em>' attribute.
   * @see #setPartIsShareable(boolean)
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLPackage#getMeronymicRelation_PartIsShareable()
   * @model unique="false" required="true"
   * @generated
   */
  boolean isPartIsShareable();

  /**
   * Sets the value of the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.MeronymicRelation#isPartIsShareable <em>Part Is Shareable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Part Is Shareable</em>' attribute.
   * @see #isPartIsShareable()
   * @generated
   */
  void setPartIsShareable(boolean value);

  /**
   * Returns the value of the '<em><b>Part Is Immutable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Part Is Immutable</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Part Is Immutable</em>' attribute.
   * @see #setPartIsImmutable(boolean)
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLPackage#getMeronymicRelation_PartIsImmutable()
   * @model unique="false" required="true"
   * @generated
   */
  boolean isPartIsImmutable();

  /**
   * Sets the value of the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.MeronymicRelation#isPartIsImmutable <em>Part Is Immutable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Part Is Immutable</em>' attribute.
   * @see #isPartIsImmutable()
   * @generated
   */
  void setPartIsImmutable(boolean value);

} // MeronymicRelation
