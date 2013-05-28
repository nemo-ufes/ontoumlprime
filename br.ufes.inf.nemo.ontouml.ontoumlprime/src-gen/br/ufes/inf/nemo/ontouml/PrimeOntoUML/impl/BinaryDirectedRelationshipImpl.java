/**
 */
package br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl;

import br.ufes.inf.nemo.ontouml.PrimeOntoUML.BinaryDirectedRelationship;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binary Directed Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.BinaryDirectedRelationshipImpl#getSourceEndName <em>Source End Name</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.BinaryDirectedRelationshipImpl#getTargetEndName <em>Target End Name</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.BinaryDirectedRelationshipImpl#getSourceLowerBound <em>Source Lower Bound</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.BinaryDirectedRelationshipImpl#getSourceUpperBound <em>Source Upper Bound</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.BinaryDirectedRelationshipImpl#getTargetLowerBound <em>Target Lower Bound</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.BinaryDirectedRelationshipImpl#getTargetUpperBound <em>Target Upper Bound</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class BinaryDirectedRelationshipImpl extends MinimalEObjectImpl.Container implements BinaryDirectedRelationship
{
  /**
   * The default value of the '{@link #getSourceEndName() <em>Source End Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourceEndName()
   * @generated
   * @ordered
   */
  protected static final String SOURCE_END_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSourceEndName() <em>Source End Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourceEndName()
   * @generated
   * @ordered
   */
  protected String sourceEndName = SOURCE_END_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getTargetEndName() <em>Target End Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetEndName()
   * @generated
   * @ordered
   */
  protected static final String TARGET_END_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTargetEndName() <em>Target End Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetEndName()
   * @generated
   * @ordered
   */
  protected String targetEndName = TARGET_END_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getSourceLowerBound() <em>Source Lower Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourceLowerBound()
   * @generated
   * @ordered
   */
  protected static final int SOURCE_LOWER_BOUND_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getSourceLowerBound() <em>Source Lower Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourceLowerBound()
   * @generated
   * @ordered
   */
  protected int sourceLowerBound = SOURCE_LOWER_BOUND_EDEFAULT;

  /**
   * The default value of the '{@link #getSourceUpperBound() <em>Source Upper Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourceUpperBound()
   * @generated
   * @ordered
   */
  protected static final int SOURCE_UPPER_BOUND_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getSourceUpperBound() <em>Source Upper Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourceUpperBound()
   * @generated
   * @ordered
   */
  protected int sourceUpperBound = SOURCE_UPPER_BOUND_EDEFAULT;

  /**
   * The default value of the '{@link #getTargetLowerBound() <em>Target Lower Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetLowerBound()
   * @generated
   * @ordered
   */
  protected static final int TARGET_LOWER_BOUND_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getTargetLowerBound() <em>Target Lower Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetLowerBound()
   * @generated
   * @ordered
   */
  protected int targetLowerBound = TARGET_LOWER_BOUND_EDEFAULT;

  /**
   * The default value of the '{@link #getTargetUpperBound() <em>Target Upper Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetUpperBound()
   * @generated
   * @ordered
   */
  protected static final int TARGET_UPPER_BOUND_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getTargetUpperBound() <em>Target Upper Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetUpperBound()
   * @generated
   * @ordered
   */
  protected int targetUpperBound = TARGET_UPPER_BOUND_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BinaryDirectedRelationshipImpl()
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
    return PrimeOntoUMLPackage.Literals.BINARY_DIRECTED_RELATIONSHIP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSourceEndName()
  {
    return sourceEndName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSourceEndName(String newSourceEndName)
  {
    String oldSourceEndName = sourceEndName;
    sourceEndName = newSourceEndName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PrimeOntoUMLPackage.BINARY_DIRECTED_RELATIONSHIP__SOURCE_END_NAME, oldSourceEndName, sourceEndName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTargetEndName()
  {
    return targetEndName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTargetEndName(String newTargetEndName)
  {
    String oldTargetEndName = targetEndName;
    targetEndName = newTargetEndName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PrimeOntoUMLPackage.BINARY_DIRECTED_RELATIONSHIP__TARGET_END_NAME, oldTargetEndName, targetEndName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getSourceLowerBound()
  {
    return sourceLowerBound;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSourceLowerBound(int newSourceLowerBound)
  {
    int oldSourceLowerBound = sourceLowerBound;
    sourceLowerBound = newSourceLowerBound;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PrimeOntoUMLPackage.BINARY_DIRECTED_RELATIONSHIP__SOURCE_LOWER_BOUND, oldSourceLowerBound, sourceLowerBound));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getSourceUpperBound()
  {
    return sourceUpperBound;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSourceUpperBound(int newSourceUpperBound)
  {
    int oldSourceUpperBound = sourceUpperBound;
    sourceUpperBound = newSourceUpperBound;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PrimeOntoUMLPackage.BINARY_DIRECTED_RELATIONSHIP__SOURCE_UPPER_BOUND, oldSourceUpperBound, sourceUpperBound));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getTargetLowerBound()
  {
    return targetLowerBound;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTargetLowerBound(int newTargetLowerBound)
  {
    int oldTargetLowerBound = targetLowerBound;
    targetLowerBound = newTargetLowerBound;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PrimeOntoUMLPackage.BINARY_DIRECTED_RELATIONSHIP__TARGET_LOWER_BOUND, oldTargetLowerBound, targetLowerBound));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getTargetUpperBound()
  {
    return targetUpperBound;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTargetUpperBound(int newTargetUpperBound)
  {
    int oldTargetUpperBound = targetUpperBound;
    targetUpperBound = newTargetUpperBound;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PrimeOntoUMLPackage.BINARY_DIRECTED_RELATIONSHIP__TARGET_UPPER_BOUND, oldTargetUpperBound, targetUpperBound));
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
      case PrimeOntoUMLPackage.BINARY_DIRECTED_RELATIONSHIP__SOURCE_END_NAME:
        return getSourceEndName();
      case PrimeOntoUMLPackage.BINARY_DIRECTED_RELATIONSHIP__TARGET_END_NAME:
        return getTargetEndName();
      case PrimeOntoUMLPackage.BINARY_DIRECTED_RELATIONSHIP__SOURCE_LOWER_BOUND:
        return getSourceLowerBound();
      case PrimeOntoUMLPackage.BINARY_DIRECTED_RELATIONSHIP__SOURCE_UPPER_BOUND:
        return getSourceUpperBound();
      case PrimeOntoUMLPackage.BINARY_DIRECTED_RELATIONSHIP__TARGET_LOWER_BOUND:
        return getTargetLowerBound();
      case PrimeOntoUMLPackage.BINARY_DIRECTED_RELATIONSHIP__TARGET_UPPER_BOUND:
        return getTargetUpperBound();
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
      case PrimeOntoUMLPackage.BINARY_DIRECTED_RELATIONSHIP__SOURCE_END_NAME:
        setSourceEndName((String)newValue);
        return;
      case PrimeOntoUMLPackage.BINARY_DIRECTED_RELATIONSHIP__TARGET_END_NAME:
        setTargetEndName((String)newValue);
        return;
      case PrimeOntoUMLPackage.BINARY_DIRECTED_RELATIONSHIP__SOURCE_LOWER_BOUND:
        setSourceLowerBound((Integer)newValue);
        return;
      case PrimeOntoUMLPackage.BINARY_DIRECTED_RELATIONSHIP__SOURCE_UPPER_BOUND:
        setSourceUpperBound((Integer)newValue);
        return;
      case PrimeOntoUMLPackage.BINARY_DIRECTED_RELATIONSHIP__TARGET_LOWER_BOUND:
        setTargetLowerBound((Integer)newValue);
        return;
      case PrimeOntoUMLPackage.BINARY_DIRECTED_RELATIONSHIP__TARGET_UPPER_BOUND:
        setTargetUpperBound((Integer)newValue);
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
      case PrimeOntoUMLPackage.BINARY_DIRECTED_RELATIONSHIP__SOURCE_END_NAME:
        setSourceEndName(SOURCE_END_NAME_EDEFAULT);
        return;
      case PrimeOntoUMLPackage.BINARY_DIRECTED_RELATIONSHIP__TARGET_END_NAME:
        setTargetEndName(TARGET_END_NAME_EDEFAULT);
        return;
      case PrimeOntoUMLPackage.BINARY_DIRECTED_RELATIONSHIP__SOURCE_LOWER_BOUND:
        setSourceLowerBound(SOURCE_LOWER_BOUND_EDEFAULT);
        return;
      case PrimeOntoUMLPackage.BINARY_DIRECTED_RELATIONSHIP__SOURCE_UPPER_BOUND:
        setSourceUpperBound(SOURCE_UPPER_BOUND_EDEFAULT);
        return;
      case PrimeOntoUMLPackage.BINARY_DIRECTED_RELATIONSHIP__TARGET_LOWER_BOUND:
        setTargetLowerBound(TARGET_LOWER_BOUND_EDEFAULT);
        return;
      case PrimeOntoUMLPackage.BINARY_DIRECTED_RELATIONSHIP__TARGET_UPPER_BOUND:
        setTargetUpperBound(TARGET_UPPER_BOUND_EDEFAULT);
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
      case PrimeOntoUMLPackage.BINARY_DIRECTED_RELATIONSHIP__SOURCE_END_NAME:
        return SOURCE_END_NAME_EDEFAULT == null ? sourceEndName != null : !SOURCE_END_NAME_EDEFAULT.equals(sourceEndName);
      case PrimeOntoUMLPackage.BINARY_DIRECTED_RELATIONSHIP__TARGET_END_NAME:
        return TARGET_END_NAME_EDEFAULT == null ? targetEndName != null : !TARGET_END_NAME_EDEFAULT.equals(targetEndName);
      case PrimeOntoUMLPackage.BINARY_DIRECTED_RELATIONSHIP__SOURCE_LOWER_BOUND:
        return sourceLowerBound != SOURCE_LOWER_BOUND_EDEFAULT;
      case PrimeOntoUMLPackage.BINARY_DIRECTED_RELATIONSHIP__SOURCE_UPPER_BOUND:
        return sourceUpperBound != SOURCE_UPPER_BOUND_EDEFAULT;
      case PrimeOntoUMLPackage.BINARY_DIRECTED_RELATIONSHIP__TARGET_LOWER_BOUND:
        return targetLowerBound != TARGET_LOWER_BOUND_EDEFAULT;
      case PrimeOntoUMLPackage.BINARY_DIRECTED_RELATIONSHIP__TARGET_UPPER_BOUND:
        return targetUpperBound != TARGET_UPPER_BOUND_EDEFAULT;
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
    result.append(" (sourceEndName: ");
    result.append(sourceEndName);
    result.append(", targetEndName: ");
    result.append(targetEndName);
    result.append(", sourceLowerBound: ");
    result.append(sourceLowerBound);
    result.append(", sourceUpperBound: ");
    result.append(sourceUpperBound);
    result.append(", targetLowerBound: ");
    result.append(targetLowerBound);
    result.append(", targetUpperBound: ");
    result.append(targetUpperBound);
    result.append(')');
    return result.toString();
  }

} //BinaryDirectedRelationshipImpl
