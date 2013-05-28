/**
 */
package br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl;

import br.ufes.inf.nemo.ontouml.PrimeOntoUML.ComplexDataType;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.DataType;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.DataTypeAttribute;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Type Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.DataTypeAttributeImpl#getIsOfType <em>Is Of Type</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.DataTypeAttributeImpl#getComplexDataType <em>Complex Data Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataTypeAttributeImpl extends NamedElementImpl implements DataTypeAttribute
{
  /**
   * The cached value of the '{@link #getIsOfType() <em>Is Of Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIsOfType()
   * @generated
   * @ordered
   */
  protected DataType isOfType;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DataTypeAttributeImpl()
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
    return PrimeOntoUMLPackage.Literals.DATA_TYPE_ATTRIBUTE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataType getIsOfType()
  {
    if (isOfType != null && isOfType.eIsProxy())
    {
      InternalEObject oldIsOfType = (InternalEObject)isOfType;
      isOfType = (DataType)eResolveProxy(oldIsOfType);
      if (isOfType != oldIsOfType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PrimeOntoUMLPackage.DATA_TYPE_ATTRIBUTE__IS_OF_TYPE, oldIsOfType, isOfType));
      }
    }
    return isOfType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataType basicGetIsOfType()
  {
    return isOfType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsOfType(DataType newIsOfType)
  {
    DataType oldIsOfType = isOfType;
    isOfType = newIsOfType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PrimeOntoUMLPackage.DATA_TYPE_ATTRIBUTE__IS_OF_TYPE, oldIsOfType, isOfType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComplexDataType getComplexDataType()
  {
    if (eContainerFeatureID() != PrimeOntoUMLPackage.DATA_TYPE_ATTRIBUTE__COMPLEX_DATA_TYPE) return null;
    return (ComplexDataType)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetComplexDataType(ComplexDataType newComplexDataType, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newComplexDataType, PrimeOntoUMLPackage.DATA_TYPE_ATTRIBUTE__COMPLEX_DATA_TYPE, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setComplexDataType(ComplexDataType newComplexDataType)
  {
    if (newComplexDataType != eInternalContainer() || (eContainerFeatureID() != PrimeOntoUMLPackage.DATA_TYPE_ATTRIBUTE__COMPLEX_DATA_TYPE && newComplexDataType != null))
    {
      if (EcoreUtil.isAncestor(this, newComplexDataType))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newComplexDataType != null)
        msgs = ((InternalEObject)newComplexDataType).eInverseAdd(this, PrimeOntoUMLPackage.COMPLEX_DATA_TYPE__ATTRIBUTES, ComplexDataType.class, msgs);
      msgs = basicSetComplexDataType(newComplexDataType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PrimeOntoUMLPackage.DATA_TYPE_ATTRIBUTE__COMPLEX_DATA_TYPE, newComplexDataType, newComplexDataType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case PrimeOntoUMLPackage.DATA_TYPE_ATTRIBUTE__COMPLEX_DATA_TYPE:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetComplexDataType((ComplexDataType)otherEnd, msgs);
    }
    return super.eInverseAdd(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case PrimeOntoUMLPackage.DATA_TYPE_ATTRIBUTE__COMPLEX_DATA_TYPE:
        return basicSetComplexDataType(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
  {
    switch (eContainerFeatureID())
    {
      case PrimeOntoUMLPackage.DATA_TYPE_ATTRIBUTE__COMPLEX_DATA_TYPE:
        return eInternalContainer().eInverseRemove(this, PrimeOntoUMLPackage.COMPLEX_DATA_TYPE__ATTRIBUTES, ComplexDataType.class, msgs);
    }
    return super.eBasicRemoveFromContainerFeature(msgs);
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
      case PrimeOntoUMLPackage.DATA_TYPE_ATTRIBUTE__IS_OF_TYPE:
        if (resolve) return getIsOfType();
        return basicGetIsOfType();
      case PrimeOntoUMLPackage.DATA_TYPE_ATTRIBUTE__COMPLEX_DATA_TYPE:
        return getComplexDataType();
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
      case PrimeOntoUMLPackage.DATA_TYPE_ATTRIBUTE__IS_OF_TYPE:
        setIsOfType((DataType)newValue);
        return;
      case PrimeOntoUMLPackage.DATA_TYPE_ATTRIBUTE__COMPLEX_DATA_TYPE:
        setComplexDataType((ComplexDataType)newValue);
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
      case PrimeOntoUMLPackage.DATA_TYPE_ATTRIBUTE__IS_OF_TYPE:
        setIsOfType((DataType)null);
        return;
      case PrimeOntoUMLPackage.DATA_TYPE_ATTRIBUTE__COMPLEX_DATA_TYPE:
        setComplexDataType((ComplexDataType)null);
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
      case PrimeOntoUMLPackage.DATA_TYPE_ATTRIBUTE__IS_OF_TYPE:
        return isOfType != null;
      case PrimeOntoUMLPackage.DATA_TYPE_ATTRIBUTE__COMPLEX_DATA_TYPE:
        return getComplexDataType() != null;
    }
    return super.eIsSet(featureID);
  }

} //DataTypeAttributeImpl
