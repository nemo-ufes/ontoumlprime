/**
 */
package br.ufes.inf.nemo.ontouml.PrimeOntoUML.provider;


import br.ufes.inf.nemo.ontouml.PrimeOntoUML.MeronymicRelation;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.MeronymicRelation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MeronymicRelationItemProvider
  extends PackageableElementItemProvider
  implements
    IEditingDomainItemProvider,
    IStructuredItemContentProvider,
    ITreeItemContentProvider,
    IItemLabelProvider,
    IItemPropertySource
{
  /**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MeronymicRelationItemProvider(AdapterFactory adapterFactory)
  {
    super(adapterFactory);
  }

  /**
   * This returns the property descriptors for the adapted class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object)
  {
    if (itemPropertyDescriptors == null)
    {
      super.getPropertyDescriptors(object);

      addSourceEndNamePropertyDescriptor(object);
      addTargetEndNamePropertyDescriptor(object);
      addSourceLowerBoundPropertyDescriptor(object);
      addSourceUpperBoundPropertyDescriptor(object);
      addTargetLowerBoundPropertyDescriptor(object);
      addTargetUpperBoundPropertyDescriptor(object);
      addWholePropertyDescriptor(object);
      addPartPropertyDescriptor(object);
      addPartIsEssentialPropertyDescriptor(object);
      addPartIsInseparablePropertyDescriptor(object);
      addPartIsShareablePropertyDescriptor(object);
      addPartIsImmutablePropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

  /**
   * This adds a property descriptor for the Source End Name feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addSourceEndNamePropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_BinaryDirectedRelationship_sourceEndName_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_BinaryDirectedRelationship_sourceEndName_feature", "_UI_BinaryDirectedRelationship_type"),
         PrimeOntoUMLPackage.Literals.BINARY_DIRECTED_RELATIONSHIP__SOURCE_END_NAME,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Target End Name feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addTargetEndNamePropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_BinaryDirectedRelationship_targetEndName_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_BinaryDirectedRelationship_targetEndName_feature", "_UI_BinaryDirectedRelationship_type"),
         PrimeOntoUMLPackage.Literals.BINARY_DIRECTED_RELATIONSHIP__TARGET_END_NAME,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Source Lower Bound feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addSourceLowerBoundPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_BinaryDirectedRelationship_sourceLowerBound_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_BinaryDirectedRelationship_sourceLowerBound_feature", "_UI_BinaryDirectedRelationship_type"),
         PrimeOntoUMLPackage.Literals.BINARY_DIRECTED_RELATIONSHIP__SOURCE_LOWER_BOUND,
         true,
         false,
         false,
         ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Source Upper Bound feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addSourceUpperBoundPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_BinaryDirectedRelationship_sourceUpperBound_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_BinaryDirectedRelationship_sourceUpperBound_feature", "_UI_BinaryDirectedRelationship_type"),
         PrimeOntoUMLPackage.Literals.BINARY_DIRECTED_RELATIONSHIP__SOURCE_UPPER_BOUND,
         true,
         false,
         false,
         ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Target Lower Bound feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addTargetLowerBoundPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_BinaryDirectedRelationship_targetLowerBound_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_BinaryDirectedRelationship_targetLowerBound_feature", "_UI_BinaryDirectedRelationship_type"),
         PrimeOntoUMLPackage.Literals.BINARY_DIRECTED_RELATIONSHIP__TARGET_LOWER_BOUND,
         true,
         false,
         false,
         ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Target Upper Bound feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addTargetUpperBoundPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_BinaryDirectedRelationship_targetUpperBound_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_BinaryDirectedRelationship_targetUpperBound_feature", "_UI_BinaryDirectedRelationship_type"),
         PrimeOntoUMLPackage.Literals.BINARY_DIRECTED_RELATIONSHIP__TARGET_UPPER_BOUND,
         true,
         false,
         false,
         ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Whole feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addWholePropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_MeronymicRelation_whole_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_MeronymicRelation_whole_feature", "_UI_MeronymicRelation_type"),
         PrimeOntoUMLPackage.Literals.MERONYMIC_RELATION__WHOLE,
         true,
         false,
         true,
         null,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Part feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addPartPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_MeronymicRelation_part_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_MeronymicRelation_part_feature", "_UI_MeronymicRelation_type"),
         PrimeOntoUMLPackage.Literals.MERONYMIC_RELATION__PART,
         true,
         false,
         true,
         null,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Part Is Essential feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addPartIsEssentialPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_MeronymicRelation_partIsEssential_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_MeronymicRelation_partIsEssential_feature", "_UI_MeronymicRelation_type"),
         PrimeOntoUMLPackage.Literals.MERONYMIC_RELATION__PART_IS_ESSENTIAL,
         true,
         false,
         false,
         ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Part Is Inseparable feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addPartIsInseparablePropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_MeronymicRelation_partIsInseparable_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_MeronymicRelation_partIsInseparable_feature", "_UI_MeronymicRelation_type"),
         PrimeOntoUMLPackage.Literals.MERONYMIC_RELATION__PART_IS_INSEPARABLE,
         true,
         false,
         false,
         ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Part Is Shareable feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addPartIsShareablePropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_MeronymicRelation_partIsShareable_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_MeronymicRelation_partIsShareable_feature", "_UI_MeronymicRelation_type"),
         PrimeOntoUMLPackage.Literals.MERONYMIC_RELATION__PART_IS_SHAREABLE,
         true,
         false,
         false,
         ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Part Is Immutable feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addPartIsImmutablePropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_MeronymicRelation_partIsImmutable_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_MeronymicRelation_partIsImmutable_feature", "_UI_MeronymicRelation_type"),
         PrimeOntoUMLPackage.Literals.MERONYMIC_RELATION__PART_IS_IMMUTABLE,
         true,
         false,
         false,
         ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This returns the label text for the adapted class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getText(Object object)
  {
    String label = ((MeronymicRelation)object).getSourceEndName();
    return label == null || label.length() == 0 ?
      getString("_UI_MeronymicRelation_type") :
      getString("_UI_MeronymicRelation_type") + " " + label;
  }

  /**
   * This handles model notifications by calling {@link #updateChildren} to update any cached
   * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void notifyChanged(Notification notification)
  {
    updateChildren(notification);

    switch (notification.getFeatureID(MeronymicRelation.class))
    {
      case PrimeOntoUMLPackage.MERONYMIC_RELATION__SOURCE_END_NAME:
      case PrimeOntoUMLPackage.MERONYMIC_RELATION__TARGET_END_NAME:
      case PrimeOntoUMLPackage.MERONYMIC_RELATION__SOURCE_LOWER_BOUND:
      case PrimeOntoUMLPackage.MERONYMIC_RELATION__SOURCE_UPPER_BOUND:
      case PrimeOntoUMLPackage.MERONYMIC_RELATION__TARGET_LOWER_BOUND:
      case PrimeOntoUMLPackage.MERONYMIC_RELATION__TARGET_UPPER_BOUND:
      case PrimeOntoUMLPackage.MERONYMIC_RELATION__PART_IS_ESSENTIAL:
      case PrimeOntoUMLPackage.MERONYMIC_RELATION__PART_IS_INSEPARABLE:
      case PrimeOntoUMLPackage.MERONYMIC_RELATION__PART_IS_SHAREABLE:
      case PrimeOntoUMLPackage.MERONYMIC_RELATION__PART_IS_IMMUTABLE:
        fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
        return;
    }
    super.notifyChanged(notification);
  }

  /**
   * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
   * that can be created under this object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object)
  {
    super.collectNewChildDescriptors(newChildDescriptors, object);
  }

}
