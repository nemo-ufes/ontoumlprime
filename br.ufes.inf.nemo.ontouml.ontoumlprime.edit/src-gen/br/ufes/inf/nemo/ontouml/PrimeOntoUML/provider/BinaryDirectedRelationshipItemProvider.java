/**
 */
package br.ufes.inf.nemo.ontouml.PrimeOntoUML.provider;


import br.ufes.inf.nemo.ontouml.PrimeOntoUML.BinaryDirectedRelationship;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.BinaryDirectedRelationship} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BinaryDirectedRelationshipItemProvider
  extends ItemProviderAdapter
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
  public BinaryDirectedRelationshipItemProvider(AdapterFactory adapterFactory)
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
      addSourceLowerBoundPropertyDescriptor(object);
      addSourceUpperBoundPropertyDescriptor(object);
      addTargetEndNamePropertyDescriptor(object);
      addTargetLowerBoundPropertyDescriptor(object);
      addTargetUpperBoundPropertyDescriptor(object);
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
   * This returns the label text for the adapted class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getText(Object object)
  {
    String label = ((BinaryDirectedRelationship)object).getSourceEndName();
    return label == null || label.length() == 0 ?
      getString("_UI_BinaryDirectedRelationship_type") :
      getString("_UI_BinaryDirectedRelationship_type") + " " + label;
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

    switch (notification.getFeatureID(BinaryDirectedRelationship.class))
    {
      case PrimeOntoUMLPackage.BINARY_DIRECTED_RELATIONSHIP__SOURCE_END_NAME:
      case PrimeOntoUMLPackage.BINARY_DIRECTED_RELATIONSHIP__SOURCE_LOWER_BOUND:
      case PrimeOntoUMLPackage.BINARY_DIRECTED_RELATIONSHIP__SOURCE_UPPER_BOUND:
      case PrimeOntoUMLPackage.BINARY_DIRECTED_RELATIONSHIP__TARGET_END_NAME:
      case PrimeOntoUMLPackage.BINARY_DIRECTED_RELATIONSHIP__TARGET_LOWER_BOUND:
      case PrimeOntoUMLPackage.BINARY_DIRECTED_RELATIONSHIP__TARGET_UPPER_BOUND:
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

  /**
   * Return the resource locator for this item provider's resources.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ResourceLocator getResourceLocator()
  {
    return PrimeOntoUMLEditPlugin.INSTANCE;
  }

}
