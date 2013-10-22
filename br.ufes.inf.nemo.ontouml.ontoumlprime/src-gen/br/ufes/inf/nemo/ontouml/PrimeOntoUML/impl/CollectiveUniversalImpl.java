/**
 */
package br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl;

import br.ufes.inf.nemo.ontouml.PrimeOntoUML.CollectiveUniversal;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collective Universal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.CollectiveUniversalImpl#isIsExtensional <em>Is Extensional</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CollectiveUniversalImpl extends SubstanceSortalUniversalImpl implements CollectiveUniversal
{
  /**
   * The default value of the '{@link #isIsExtensional() <em>Is Extensional</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsExtensional()
   * @generated
   * @ordered
   */
  protected static final boolean IS_EXTENSIONAL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsExtensional() <em>Is Extensional</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsExtensional()
   * @generated
   * @ordered
   */
  protected boolean isExtensional = IS_EXTENSIONAL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CollectiveUniversalImpl()
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
    return PrimeOntoUMLPackage.Literals.COLLECTIVE_UNIVERSAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsExtensional()
  {
    return isExtensional;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsExtensional(boolean newIsExtensional)
  {
    boolean oldIsExtensional = isExtensional;
    isExtensional = newIsExtensional;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PrimeOntoUMLPackage.COLLECTIVE_UNIVERSAL__IS_EXTENSIONAL, oldIsExtensional, isExtensional));
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
      case PrimeOntoUMLPackage.COLLECTIVE_UNIVERSAL__IS_EXTENSIONAL:
        return isIsExtensional();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PrimeOntoUMLPackage.COLLECTIVE_UNIVERSAL__IS_EXTENSIONAL:
        setIsExtensional((Boolean)newValue);
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
      case PrimeOntoUMLPackage.COLLECTIVE_UNIVERSAL__IS_EXTENSIONAL:
        setIsExtensional(IS_EXTENSIONAL_EDEFAULT);
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
      case PrimeOntoUMLPackage.COLLECTIVE_UNIVERSAL__IS_EXTENSIONAL:
        return isExtensional != IS_EXTENSIONAL_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (isExtensional: ");
    result.append(isExtensional);
    result.append(')');
    return result.toString();
  }

} //CollectiveUniversalImpl
