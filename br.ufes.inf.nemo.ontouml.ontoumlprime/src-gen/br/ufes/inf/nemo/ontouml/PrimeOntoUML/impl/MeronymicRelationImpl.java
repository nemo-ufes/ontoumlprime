/**
 */
package br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl;

import br.ufes.inf.nemo.ontouml.PrimeOntoUML.BinaryDirectedRelationship;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.MeronymicRelation;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLPackage;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.SubstantialUniversal;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Meronymic Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.MeronymicRelationImpl#getSourceEndName <em>Source End Name</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.MeronymicRelationImpl#getSourceLowerBound <em>Source Lower Bound</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.MeronymicRelationImpl#getSourceUpperBound <em>Source Upper Bound</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.MeronymicRelationImpl#getTargetEndName <em>Target End Name</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.MeronymicRelationImpl#getTargetLowerBound <em>Target Lower Bound</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.MeronymicRelationImpl#getTargetUpperBound <em>Target Upper Bound</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.MeronymicRelationImpl#getWhole <em>Whole</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.MeronymicRelationImpl#getPart <em>Part</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.MeronymicRelationImpl#isPartIsEssential <em>Part Is Essential</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.MeronymicRelationImpl#isPartIsInseparable <em>Part Is Inseparable</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.MeronymicRelationImpl#isPartIsShareable <em>Part Is Shareable</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.MeronymicRelationImpl#isPartIsImmutable <em>Part Is Immutable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class MeronymicRelationImpl extends PackageableElementImpl implements MeronymicRelation
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
   * The cached value of the '{@link #getWhole() <em>Whole</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWhole()
   * @generated
   * @ordered
   */
  protected SubstantialUniversal whole;

  /**
   * The cached value of the '{@link #getPart() <em>Part</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPart()
   * @generated
   * @ordered
   */
  protected SubstantialUniversal part;

  /**
   * The default value of the '{@link #isPartIsEssential() <em>Part Is Essential</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPartIsEssential()
   * @generated
   * @ordered
   */
  protected static final boolean PART_IS_ESSENTIAL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isPartIsEssential() <em>Part Is Essential</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPartIsEssential()
   * @generated
   * @ordered
   */
  protected boolean partIsEssential = PART_IS_ESSENTIAL_EDEFAULT;

  /**
   * The default value of the '{@link #isPartIsInseparable() <em>Part Is Inseparable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPartIsInseparable()
   * @generated
   * @ordered
   */
  protected static final boolean PART_IS_INSEPARABLE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isPartIsInseparable() <em>Part Is Inseparable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPartIsInseparable()
   * @generated
   * @ordered
   */
  protected boolean partIsInseparable = PART_IS_INSEPARABLE_EDEFAULT;

  /**
   * The default value of the '{@link #isPartIsShareable() <em>Part Is Shareable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPartIsShareable()
   * @generated
   * @ordered
   */
  protected static final boolean PART_IS_SHAREABLE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isPartIsShareable() <em>Part Is Shareable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPartIsShareable()
   * @generated
   * @ordered
   */
  protected boolean partIsShareable = PART_IS_SHAREABLE_EDEFAULT;

  /**
   * The default value of the '{@link #isPartIsImmutable() <em>Part Is Immutable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPartIsImmutable()
   * @generated
   * @ordered
   */
  protected static final boolean PART_IS_IMMUTABLE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isPartIsImmutable() <em>Part Is Immutable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPartIsImmutable()
   * @generated
   * @ordered
   */
  protected boolean partIsImmutable = PART_IS_IMMUTABLE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MeronymicRelationImpl()
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
    return PrimeOntoUMLPackage.Literals.MERONYMIC_RELATION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, PrimeOntoUMLPackage.MERONYMIC_RELATION__SOURCE_END_NAME, oldSourceEndName, sourceEndName));
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
      eNotify(new ENotificationImpl(this, Notification.SET, PrimeOntoUMLPackage.MERONYMIC_RELATION__SOURCE_LOWER_BOUND, oldSourceLowerBound, sourceLowerBound));
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
      eNotify(new ENotificationImpl(this, Notification.SET, PrimeOntoUMLPackage.MERONYMIC_RELATION__SOURCE_UPPER_BOUND, oldSourceUpperBound, sourceUpperBound));
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
      eNotify(new ENotificationImpl(this, Notification.SET, PrimeOntoUMLPackage.MERONYMIC_RELATION__TARGET_END_NAME, oldTargetEndName, targetEndName));
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
      eNotify(new ENotificationImpl(this, Notification.SET, PrimeOntoUMLPackage.MERONYMIC_RELATION__TARGET_LOWER_BOUND, oldTargetLowerBound, targetLowerBound));
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
      eNotify(new ENotificationImpl(this, Notification.SET, PrimeOntoUMLPackage.MERONYMIC_RELATION__TARGET_UPPER_BOUND, oldTargetUpperBound, targetUpperBound));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubstantialUniversal getWhole()
  {
    if (whole != null && whole.eIsProxy())
    {
      InternalEObject oldWhole = (InternalEObject)whole;
      whole = (SubstantialUniversal)eResolveProxy(oldWhole);
      if (whole != oldWhole)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PrimeOntoUMLPackage.MERONYMIC_RELATION__WHOLE, oldWhole, whole));
      }
    }
    return whole;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubstantialUniversal basicGetWhole()
  {
    return whole;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWhole(SubstantialUniversal newWhole)
  {
    SubstantialUniversal oldWhole = whole;
    whole = newWhole;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PrimeOntoUMLPackage.MERONYMIC_RELATION__WHOLE, oldWhole, whole));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubstantialUniversal getPart()
  {
    if (part != null && part.eIsProxy())
    {
      InternalEObject oldPart = (InternalEObject)part;
      part = (SubstantialUniversal)eResolveProxy(oldPart);
      if (part != oldPart)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PrimeOntoUMLPackage.MERONYMIC_RELATION__PART, oldPart, part));
      }
    }
    return part;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubstantialUniversal basicGetPart()
  {
    return part;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPart(SubstantialUniversal newPart)
  {
    SubstantialUniversal oldPart = part;
    part = newPart;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PrimeOntoUMLPackage.MERONYMIC_RELATION__PART, oldPart, part));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isPartIsEssential()
  {
    return partIsEssential;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPartIsEssential(boolean newPartIsEssential)
  {
    boolean oldPartIsEssential = partIsEssential;
    partIsEssential = newPartIsEssential;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PrimeOntoUMLPackage.MERONYMIC_RELATION__PART_IS_ESSENTIAL, oldPartIsEssential, partIsEssential));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isPartIsInseparable()
  {
    return partIsInseparable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPartIsInseparable(boolean newPartIsInseparable)
  {
    boolean oldPartIsInseparable = partIsInseparable;
    partIsInseparable = newPartIsInseparable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PrimeOntoUMLPackage.MERONYMIC_RELATION__PART_IS_INSEPARABLE, oldPartIsInseparable, partIsInseparable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isPartIsShareable()
  {
    return partIsShareable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPartIsShareable(boolean newPartIsShareable)
  {
    boolean oldPartIsShareable = partIsShareable;
    partIsShareable = newPartIsShareable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PrimeOntoUMLPackage.MERONYMIC_RELATION__PART_IS_SHAREABLE, oldPartIsShareable, partIsShareable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isPartIsImmutable()
  {
    return partIsImmutable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPartIsImmutable(boolean newPartIsImmutable)
  {
    boolean oldPartIsImmutable = partIsImmutable;
    partIsImmutable = newPartIsImmutable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PrimeOntoUMLPackage.MERONYMIC_RELATION__PART_IS_IMMUTABLE, oldPartIsImmutable, partIsImmutable));
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
      case PrimeOntoUMLPackage.MERONYMIC_RELATION__SOURCE_END_NAME:
        return getSourceEndName();
      case PrimeOntoUMLPackage.MERONYMIC_RELATION__SOURCE_LOWER_BOUND:
        return getSourceLowerBound();
      case PrimeOntoUMLPackage.MERONYMIC_RELATION__SOURCE_UPPER_BOUND:
        return getSourceUpperBound();
      case PrimeOntoUMLPackage.MERONYMIC_RELATION__TARGET_END_NAME:
        return getTargetEndName();
      case PrimeOntoUMLPackage.MERONYMIC_RELATION__TARGET_LOWER_BOUND:
        return getTargetLowerBound();
      case PrimeOntoUMLPackage.MERONYMIC_RELATION__TARGET_UPPER_BOUND:
        return getTargetUpperBound();
      case PrimeOntoUMLPackage.MERONYMIC_RELATION__WHOLE:
        if (resolve) return getWhole();
        return basicGetWhole();
      case PrimeOntoUMLPackage.MERONYMIC_RELATION__PART:
        if (resolve) return getPart();
        return basicGetPart();
      case PrimeOntoUMLPackage.MERONYMIC_RELATION__PART_IS_ESSENTIAL:
        return isPartIsEssential();
      case PrimeOntoUMLPackage.MERONYMIC_RELATION__PART_IS_INSEPARABLE:
        return isPartIsInseparable();
      case PrimeOntoUMLPackage.MERONYMIC_RELATION__PART_IS_SHAREABLE:
        return isPartIsShareable();
      case PrimeOntoUMLPackage.MERONYMIC_RELATION__PART_IS_IMMUTABLE:
        return isPartIsImmutable();
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
      case PrimeOntoUMLPackage.MERONYMIC_RELATION__SOURCE_END_NAME:
        setSourceEndName((String)newValue);
        return;
      case PrimeOntoUMLPackage.MERONYMIC_RELATION__SOURCE_LOWER_BOUND:
        setSourceLowerBound((Integer)newValue);
        return;
      case PrimeOntoUMLPackage.MERONYMIC_RELATION__SOURCE_UPPER_BOUND:
        setSourceUpperBound((Integer)newValue);
        return;
      case PrimeOntoUMLPackage.MERONYMIC_RELATION__TARGET_END_NAME:
        setTargetEndName((String)newValue);
        return;
      case PrimeOntoUMLPackage.MERONYMIC_RELATION__TARGET_LOWER_BOUND:
        setTargetLowerBound((Integer)newValue);
        return;
      case PrimeOntoUMLPackage.MERONYMIC_RELATION__TARGET_UPPER_BOUND:
        setTargetUpperBound((Integer)newValue);
        return;
      case PrimeOntoUMLPackage.MERONYMIC_RELATION__WHOLE:
        setWhole((SubstantialUniversal)newValue);
        return;
      case PrimeOntoUMLPackage.MERONYMIC_RELATION__PART:
        setPart((SubstantialUniversal)newValue);
        return;
      case PrimeOntoUMLPackage.MERONYMIC_RELATION__PART_IS_ESSENTIAL:
        setPartIsEssential((Boolean)newValue);
        return;
      case PrimeOntoUMLPackage.MERONYMIC_RELATION__PART_IS_INSEPARABLE:
        setPartIsInseparable((Boolean)newValue);
        return;
      case PrimeOntoUMLPackage.MERONYMIC_RELATION__PART_IS_SHAREABLE:
        setPartIsShareable((Boolean)newValue);
        return;
      case PrimeOntoUMLPackage.MERONYMIC_RELATION__PART_IS_IMMUTABLE:
        setPartIsImmutable((Boolean)newValue);
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
      case PrimeOntoUMLPackage.MERONYMIC_RELATION__SOURCE_END_NAME:
        setSourceEndName(SOURCE_END_NAME_EDEFAULT);
        return;
      case PrimeOntoUMLPackage.MERONYMIC_RELATION__SOURCE_LOWER_BOUND:
        setSourceLowerBound(SOURCE_LOWER_BOUND_EDEFAULT);
        return;
      case PrimeOntoUMLPackage.MERONYMIC_RELATION__SOURCE_UPPER_BOUND:
        setSourceUpperBound(SOURCE_UPPER_BOUND_EDEFAULT);
        return;
      case PrimeOntoUMLPackage.MERONYMIC_RELATION__TARGET_END_NAME:
        setTargetEndName(TARGET_END_NAME_EDEFAULT);
        return;
      case PrimeOntoUMLPackage.MERONYMIC_RELATION__TARGET_LOWER_BOUND:
        setTargetLowerBound(TARGET_LOWER_BOUND_EDEFAULT);
        return;
      case PrimeOntoUMLPackage.MERONYMIC_RELATION__TARGET_UPPER_BOUND:
        setTargetUpperBound(TARGET_UPPER_BOUND_EDEFAULT);
        return;
      case PrimeOntoUMLPackage.MERONYMIC_RELATION__WHOLE:
        setWhole((SubstantialUniversal)null);
        return;
      case PrimeOntoUMLPackage.MERONYMIC_RELATION__PART:
        setPart((SubstantialUniversal)null);
        return;
      case PrimeOntoUMLPackage.MERONYMIC_RELATION__PART_IS_ESSENTIAL:
        setPartIsEssential(PART_IS_ESSENTIAL_EDEFAULT);
        return;
      case PrimeOntoUMLPackage.MERONYMIC_RELATION__PART_IS_INSEPARABLE:
        setPartIsInseparable(PART_IS_INSEPARABLE_EDEFAULT);
        return;
      case PrimeOntoUMLPackage.MERONYMIC_RELATION__PART_IS_SHAREABLE:
        setPartIsShareable(PART_IS_SHAREABLE_EDEFAULT);
        return;
      case PrimeOntoUMLPackage.MERONYMIC_RELATION__PART_IS_IMMUTABLE:
        setPartIsImmutable(PART_IS_IMMUTABLE_EDEFAULT);
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
      case PrimeOntoUMLPackage.MERONYMIC_RELATION__SOURCE_END_NAME:
        return SOURCE_END_NAME_EDEFAULT == null ? sourceEndName != null : !SOURCE_END_NAME_EDEFAULT.equals(sourceEndName);
      case PrimeOntoUMLPackage.MERONYMIC_RELATION__SOURCE_LOWER_BOUND:
        return sourceLowerBound != SOURCE_LOWER_BOUND_EDEFAULT;
      case PrimeOntoUMLPackage.MERONYMIC_RELATION__SOURCE_UPPER_BOUND:
        return sourceUpperBound != SOURCE_UPPER_BOUND_EDEFAULT;
      case PrimeOntoUMLPackage.MERONYMIC_RELATION__TARGET_END_NAME:
        return TARGET_END_NAME_EDEFAULT == null ? targetEndName != null : !TARGET_END_NAME_EDEFAULT.equals(targetEndName);
      case PrimeOntoUMLPackage.MERONYMIC_RELATION__TARGET_LOWER_BOUND:
        return targetLowerBound != TARGET_LOWER_BOUND_EDEFAULT;
      case PrimeOntoUMLPackage.MERONYMIC_RELATION__TARGET_UPPER_BOUND:
        return targetUpperBound != TARGET_UPPER_BOUND_EDEFAULT;
      case PrimeOntoUMLPackage.MERONYMIC_RELATION__WHOLE:
        return whole != null;
      case PrimeOntoUMLPackage.MERONYMIC_RELATION__PART:
        return part != null;
      case PrimeOntoUMLPackage.MERONYMIC_RELATION__PART_IS_ESSENTIAL:
        return partIsEssential != PART_IS_ESSENTIAL_EDEFAULT;
      case PrimeOntoUMLPackage.MERONYMIC_RELATION__PART_IS_INSEPARABLE:
        return partIsInseparable != PART_IS_INSEPARABLE_EDEFAULT;
      case PrimeOntoUMLPackage.MERONYMIC_RELATION__PART_IS_SHAREABLE:
        return partIsShareable != PART_IS_SHAREABLE_EDEFAULT;
      case PrimeOntoUMLPackage.MERONYMIC_RELATION__PART_IS_IMMUTABLE:
        return partIsImmutable != PART_IS_IMMUTABLE_EDEFAULT;
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
    if (baseClass == BinaryDirectedRelationship.class)
    {
      switch (derivedFeatureID)
      {
        case PrimeOntoUMLPackage.MERONYMIC_RELATION__SOURCE_END_NAME: return PrimeOntoUMLPackage.BINARY_DIRECTED_RELATIONSHIP__SOURCE_END_NAME;
        case PrimeOntoUMLPackage.MERONYMIC_RELATION__SOURCE_LOWER_BOUND: return PrimeOntoUMLPackage.BINARY_DIRECTED_RELATIONSHIP__SOURCE_LOWER_BOUND;
        case PrimeOntoUMLPackage.MERONYMIC_RELATION__SOURCE_UPPER_BOUND: return PrimeOntoUMLPackage.BINARY_DIRECTED_RELATIONSHIP__SOURCE_UPPER_BOUND;
        case PrimeOntoUMLPackage.MERONYMIC_RELATION__TARGET_END_NAME: return PrimeOntoUMLPackage.BINARY_DIRECTED_RELATIONSHIP__TARGET_END_NAME;
        case PrimeOntoUMLPackage.MERONYMIC_RELATION__TARGET_LOWER_BOUND: return PrimeOntoUMLPackage.BINARY_DIRECTED_RELATIONSHIP__TARGET_LOWER_BOUND;
        case PrimeOntoUMLPackage.MERONYMIC_RELATION__TARGET_UPPER_BOUND: return PrimeOntoUMLPackage.BINARY_DIRECTED_RELATIONSHIP__TARGET_UPPER_BOUND;
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
    if (baseClass == BinaryDirectedRelationship.class)
    {
      switch (baseFeatureID)
      {
        case PrimeOntoUMLPackage.BINARY_DIRECTED_RELATIONSHIP__SOURCE_END_NAME: return PrimeOntoUMLPackage.MERONYMIC_RELATION__SOURCE_END_NAME;
        case PrimeOntoUMLPackage.BINARY_DIRECTED_RELATIONSHIP__SOURCE_LOWER_BOUND: return PrimeOntoUMLPackage.MERONYMIC_RELATION__SOURCE_LOWER_BOUND;
        case PrimeOntoUMLPackage.BINARY_DIRECTED_RELATIONSHIP__SOURCE_UPPER_BOUND: return PrimeOntoUMLPackage.MERONYMIC_RELATION__SOURCE_UPPER_BOUND;
        case PrimeOntoUMLPackage.BINARY_DIRECTED_RELATIONSHIP__TARGET_END_NAME: return PrimeOntoUMLPackage.MERONYMIC_RELATION__TARGET_END_NAME;
        case PrimeOntoUMLPackage.BINARY_DIRECTED_RELATIONSHIP__TARGET_LOWER_BOUND: return PrimeOntoUMLPackage.MERONYMIC_RELATION__TARGET_LOWER_BOUND;
        case PrimeOntoUMLPackage.BINARY_DIRECTED_RELATIONSHIP__TARGET_UPPER_BOUND: return PrimeOntoUMLPackage.MERONYMIC_RELATION__TARGET_UPPER_BOUND;
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
    result.append(" (sourceEndName: ");
    result.append(sourceEndName);
    result.append(", sourceLowerBound: ");
    result.append(sourceLowerBound);
    result.append(", sourceUpperBound: ");
    result.append(sourceUpperBound);
    result.append(", targetEndName: ");
    result.append(targetEndName);
    result.append(", targetLowerBound: ");
    result.append(targetLowerBound);
    result.append(", targetUpperBound: ");
    result.append(targetUpperBound);
    result.append(", partIsEssential: ");
    result.append(partIsEssential);
    result.append(", partIsInseparable: ");
    result.append(partIsInseparable);
    result.append(", partIsShareable: ");
    result.append(partIsShareable);
    result.append(", partIsImmutable: ");
    result.append(partIsImmutable);
    result.append(')');
    return result.toString();
  }

} //MeronymicRelationImpl
