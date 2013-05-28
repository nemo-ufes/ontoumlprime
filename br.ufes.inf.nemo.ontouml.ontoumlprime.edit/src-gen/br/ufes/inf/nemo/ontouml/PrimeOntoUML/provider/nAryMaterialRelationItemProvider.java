/**
 */
package br.ufes.inf.nemo.ontouml.PrimeOntoUML.provider;


import br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLPackage;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.nAryMaterialRelation;

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
 * This is the item provider adapter for a {@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.nAryMaterialRelation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class nAryMaterialRelationItemProvider
  extends NamedElementItemProvider
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
  public nAryMaterialRelationItemProvider(AdapterFactory adapterFactory)
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

      addDerivedFromPropertyDescriptor(object);
      addTargetRelataPropertyDescriptor(object);
      addTargetEndNamesPropertyDescriptor(object);
      addSourceLowerBoundPropertyDescriptor(object);
      addSourceUpperBoundPropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

  /**
   * This adds a property descriptor for the Derived From feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addDerivedFromPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_nAryMaterialRelation_derivedFrom_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_nAryMaterialRelation_derivedFrom_feature", "_UI_nAryMaterialRelation_type"),
         PrimeOntoUMLPackage.Literals.NARY_MATERIAL_RELATION__DERIVED_FROM,
         true,
         false,
         true,
         null,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Target Relata feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addTargetRelataPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_nAryMaterialRelation_targetRelata_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_nAryMaterialRelation_targetRelata_feature", "_UI_nAryMaterialRelation_type"),
         PrimeOntoUMLPackage.Literals.NARY_MATERIAL_RELATION__TARGET_RELATA,
         true,
         false,
         true,
         null,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Target End Names feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addTargetEndNamesPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_nAryMaterialRelation_targetEndNames_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_nAryMaterialRelation_targetEndNames_feature", "_UI_nAryMaterialRelation_type"),
         PrimeOntoUMLPackage.Literals.NARY_MATERIAL_RELATION__TARGET_END_NAMES,
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
         getString("_UI_nAryMaterialRelation_sourceLowerBound_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_nAryMaterialRelation_sourceLowerBound_feature", "_UI_nAryMaterialRelation_type"),
         PrimeOntoUMLPackage.Literals.NARY_MATERIAL_RELATION__SOURCE_LOWER_BOUND,
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
         getString("_UI_nAryMaterialRelation_sourceUpperBound_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_nAryMaterialRelation_sourceUpperBound_feature", "_UI_nAryMaterialRelation_type"),
         PrimeOntoUMLPackage.Literals.NARY_MATERIAL_RELATION__SOURCE_UPPER_BOUND,
         true,
         false,
         false,
         ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This returns nAryMaterialRelation.gif.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object getImage(Object object)
  {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/nAryMaterialRelation"));
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
    String label = ((nAryMaterialRelation)object).getName();
    return label == null || label.length() == 0 ?
      getString("_UI_nAryMaterialRelation_type") :
      getString("_UI_nAryMaterialRelation_type") + " " + label;
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

    switch (notification.getFeatureID(nAryMaterialRelation.class))
    {
      case PrimeOntoUMLPackage.NARY_MATERIAL_RELATION__TARGET_END_NAMES:
      case PrimeOntoUMLPackage.NARY_MATERIAL_RELATION__SOURCE_LOWER_BOUND:
      case PrimeOntoUMLPackage.NARY_MATERIAL_RELATION__SOURCE_UPPER_BOUND:
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
