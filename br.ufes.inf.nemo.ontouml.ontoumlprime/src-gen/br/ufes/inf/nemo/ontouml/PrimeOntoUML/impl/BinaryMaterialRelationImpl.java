/**
 */
package br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl;

import br.ufes.inf.nemo.ontouml.PrimeOntoUML.BinaryMaterialRelation;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Element;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.ExternallyDependentUniversal;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.NamedElement;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.PackageableElement;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLPackage;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.RelatorUniversal;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binary Material Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.BinaryMaterialRelationImpl#getName <em>Name</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.BinaryMaterialRelationImpl#getDerivedFrom <em>Derived From</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.BinaryMaterialRelationImpl#getSource <em>Source</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.BinaryMaterialRelationImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BinaryMaterialRelationImpl extends BinaryDirectedRelationshipImpl implements BinaryMaterialRelation
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getDerivedFrom() <em>Derived From</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDerivedFrom()
   * @generated
   * @ordered
   */
  protected RelatorUniversal derivedFrom;

  /**
   * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSource()
   * @generated
   * @ordered
   */
  protected ExternallyDependentUniversal source;

  /**
   * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected ExternallyDependentUniversal target;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BinaryMaterialRelationImpl()
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
    return PrimeOntoUMLPackage.Literals.BINARY_MATERIAL_RELATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PrimeOntoUMLPackage.BINARY_MATERIAL_RELATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelatorUniversal getDerivedFrom()
  {
    if (derivedFrom != null && derivedFrom.eIsProxy())
    {
      InternalEObject oldDerivedFrom = (InternalEObject)derivedFrom;
      derivedFrom = (RelatorUniversal)eResolveProxy(oldDerivedFrom);
      if (derivedFrom != oldDerivedFrom)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PrimeOntoUMLPackage.BINARY_MATERIAL_RELATION__DERIVED_FROM, oldDerivedFrom, derivedFrom));
      }
    }
    return derivedFrom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelatorUniversal basicGetDerivedFrom()
  {
    return derivedFrom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDerivedFrom(RelatorUniversal newDerivedFrom)
  {
    RelatorUniversal oldDerivedFrom = derivedFrom;
    derivedFrom = newDerivedFrom;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PrimeOntoUMLPackage.BINARY_MATERIAL_RELATION__DERIVED_FROM, oldDerivedFrom, derivedFrom));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExternallyDependentUniversal getSource()
  {
    if (source != null && source.eIsProxy())
    {
      InternalEObject oldSource = (InternalEObject)source;
      source = (ExternallyDependentUniversal)eResolveProxy(oldSource);
      if (source != oldSource)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PrimeOntoUMLPackage.BINARY_MATERIAL_RELATION__SOURCE, oldSource, source));
      }
    }
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExternallyDependentUniversal basicGetSource()
  {
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSource(ExternallyDependentUniversal newSource)
  {
    ExternallyDependentUniversal oldSource = source;
    source = newSource;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PrimeOntoUMLPackage.BINARY_MATERIAL_RELATION__SOURCE, oldSource, source));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExternallyDependentUniversal getTarget()
  {
    if (target != null && target.eIsProxy())
    {
      InternalEObject oldTarget = (InternalEObject)target;
      target = (ExternallyDependentUniversal)eResolveProxy(oldTarget);
      if (target != oldTarget)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PrimeOntoUMLPackage.BINARY_MATERIAL_RELATION__TARGET, oldTarget, target));
      }
    }
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExternallyDependentUniversal basicGetTarget()
  {
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTarget(ExternallyDependentUniversal newTarget)
  {
    ExternallyDependentUniversal oldTarget = target;
    target = newTarget;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PrimeOntoUMLPackage.BINARY_MATERIAL_RELATION__TARGET, oldTarget, target));
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
      case PrimeOntoUMLPackage.BINARY_MATERIAL_RELATION__NAME:
        return getName();
      case PrimeOntoUMLPackage.BINARY_MATERIAL_RELATION__DERIVED_FROM:
        if (resolve) return getDerivedFrom();
        return basicGetDerivedFrom();
      case PrimeOntoUMLPackage.BINARY_MATERIAL_RELATION__SOURCE:
        if (resolve) return getSource();
        return basicGetSource();
      case PrimeOntoUMLPackage.BINARY_MATERIAL_RELATION__TARGET:
        if (resolve) return getTarget();
        return basicGetTarget();
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
      case PrimeOntoUMLPackage.BINARY_MATERIAL_RELATION__NAME:
        setName((String)newValue);
        return;
      case PrimeOntoUMLPackage.BINARY_MATERIAL_RELATION__DERIVED_FROM:
        setDerivedFrom((RelatorUniversal)newValue);
        return;
      case PrimeOntoUMLPackage.BINARY_MATERIAL_RELATION__SOURCE:
        setSource((ExternallyDependentUniversal)newValue);
        return;
      case PrimeOntoUMLPackage.BINARY_MATERIAL_RELATION__TARGET:
        setTarget((ExternallyDependentUniversal)newValue);
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
      case PrimeOntoUMLPackage.BINARY_MATERIAL_RELATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case PrimeOntoUMLPackage.BINARY_MATERIAL_RELATION__DERIVED_FROM:
        setDerivedFrom((RelatorUniversal)null);
        return;
      case PrimeOntoUMLPackage.BINARY_MATERIAL_RELATION__SOURCE:
        setSource((ExternallyDependentUniversal)null);
        return;
      case PrimeOntoUMLPackage.BINARY_MATERIAL_RELATION__TARGET:
        setTarget((ExternallyDependentUniversal)null);
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
      case PrimeOntoUMLPackage.BINARY_MATERIAL_RELATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case PrimeOntoUMLPackage.BINARY_MATERIAL_RELATION__DERIVED_FROM:
        return derivedFrom != null;
      case PrimeOntoUMLPackage.BINARY_MATERIAL_RELATION__SOURCE:
        return source != null;
      case PrimeOntoUMLPackage.BINARY_MATERIAL_RELATION__TARGET:
        return target != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == Element.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == NamedElement.class)
    {
      switch (derivedFeatureID)
      {
        case PrimeOntoUMLPackage.BINARY_MATERIAL_RELATION__NAME: return PrimeOntoUMLPackage.NAMED_ELEMENT__NAME;
        default: return -1;
      }
    }
    if (baseClass == PackageableElement.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == Element.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == NamedElement.class)
    {
      switch (baseFeatureID)
      {
        case PrimeOntoUMLPackage.NAMED_ELEMENT__NAME: return PrimeOntoUMLPackage.BINARY_MATERIAL_RELATION__NAME;
        default: return -1;
      }
    }
    if (baseClass == PackageableElement.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //BinaryMaterialRelationImpl
