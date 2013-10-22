/**
 */
package br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl;

import br.ufes.inf.nemo.ontouml.PrimeOntoUML.DataType;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLPackage;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.QualityUniversal;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quality Universal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.QualityUniversalImpl#getDatatypes <em>Datatypes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QualityUniversalImpl extends IntrinsicMomentUniversalImpl implements QualityUniversal
{
  /**
   * The cached value of the '{@link #getDatatypes() <em>Datatypes</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDatatypes()
   * @generated
   * @ordered
   */
  protected EList<DataType> datatypes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected QualityUniversalImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return PrimeOntoUMLPackage.Literals.QUALITY_UNIVERSAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DataType> getDatatypes()
  {
    if (datatypes == null)
    {
      datatypes = new EObjectResolvingEList<DataType>(DataType.class, this, PrimeOntoUMLPackage.QUALITY_UNIVERSAL__DATATYPES);
    }
    return datatypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case PrimeOntoUMLPackage.QUALITY_UNIVERSAL__DATATYPES:
        return getDatatypes();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PrimeOntoUMLPackage.QUALITY_UNIVERSAL__DATATYPES:
        getDatatypes().clear();
        getDatatypes().addAll((Collection<? extends DataType>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case PrimeOntoUMLPackage.QUALITY_UNIVERSAL__DATATYPES:
        getDatatypes().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case PrimeOntoUMLPackage.QUALITY_UNIVERSAL__DATATYPES:
        return datatypes != null && !datatypes.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //QualityUniversalImpl
