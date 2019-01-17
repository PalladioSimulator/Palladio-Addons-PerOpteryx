/**
 * generated by Xtext 2.10.0
 */
package org.palladiosimulator.qes.qualityEffectSpecification.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.palladiosimulator.qes.qualityEffectSpecification.Assembly;
import org.palladiosimulator.qes.qualityEffectSpecification.AssemblyType;
import org.palladiosimulator.qes.qualityEffectSpecification.ComponentSpecification;
import org.palladiosimulator.qes.qualityEffectSpecification.QualityEffectSpecificationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assembly</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.qes.qualityEffectSpecification.impl.AssemblyImpl#isNot <em>Not</em>}</li>
 *   <li>{@link org.palladiosimulator.qes.qualityEffectSpecification.impl.AssemblyImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.palladiosimulator.qes.qualityEffectSpecification.impl.AssemblyImpl#getComponent <em>Component</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssemblyImpl extends ComponentPropertyImpl implements Assembly
{
  /**
   * The default value of the '{@link #isNot() <em>Not</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNot()
   * @generated
   * @ordered
   */
  protected static final boolean NOT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isNot() <em>Not</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNot()
   * @generated
   * @ordered
   */
  protected boolean not = NOT_EDEFAULT;

  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final AssemblyType TYPE_EDEFAULT = AssemblyType.ANY;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected AssemblyType type = TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getComponent() <em>Component</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComponent()
   * @generated
   * @ordered
   */
  protected ComponentSpecification component;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AssemblyImpl()
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
    return QualityEffectSpecificationPackage.Literals.ASSEMBLY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isNot()
  {
    return not;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNot(boolean newNot)
  {
    boolean oldNot = not;
    not = newNot;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QualityEffectSpecificationPackage.ASSEMBLY__NOT, oldNot, not));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssemblyType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(AssemblyType newType)
  {
    AssemblyType oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QualityEffectSpecificationPackage.ASSEMBLY__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentSpecification getComponent()
  {
    return component;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetComponent(ComponentSpecification newComponent, NotificationChain msgs)
  {
    ComponentSpecification oldComponent = component;
    component = newComponent;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QualityEffectSpecificationPackage.ASSEMBLY__COMPONENT, oldComponent, newComponent);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setComponent(ComponentSpecification newComponent)
  {
    if (newComponent != component)
    {
      NotificationChain msgs = null;
      if (component != null)
        msgs = ((InternalEObject)component).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QualityEffectSpecificationPackage.ASSEMBLY__COMPONENT, null, msgs);
      if (newComponent != null)
        msgs = ((InternalEObject)newComponent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QualityEffectSpecificationPackage.ASSEMBLY__COMPONENT, null, msgs);
      msgs = basicSetComponent(newComponent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QualityEffectSpecificationPackage.ASSEMBLY__COMPONENT, newComponent, newComponent));
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
      case QualityEffectSpecificationPackage.ASSEMBLY__COMPONENT:
        return basicSetComponent(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case QualityEffectSpecificationPackage.ASSEMBLY__NOT:
        return isNot();
      case QualityEffectSpecificationPackage.ASSEMBLY__TYPE:
        return getType();
      case QualityEffectSpecificationPackage.ASSEMBLY__COMPONENT:
        return getComponent();
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
      case QualityEffectSpecificationPackage.ASSEMBLY__NOT:
        setNot((Boolean)newValue);
        return;
      case QualityEffectSpecificationPackage.ASSEMBLY__TYPE:
        setType((AssemblyType)newValue);
        return;
      case QualityEffectSpecificationPackage.ASSEMBLY__COMPONENT:
        setComponent((ComponentSpecification)newValue);
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
      case QualityEffectSpecificationPackage.ASSEMBLY__NOT:
        setNot(NOT_EDEFAULT);
        return;
      case QualityEffectSpecificationPackage.ASSEMBLY__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case QualityEffectSpecificationPackage.ASSEMBLY__COMPONENT:
        setComponent((ComponentSpecification)null);
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
      case QualityEffectSpecificationPackage.ASSEMBLY__NOT:
        return not != NOT_EDEFAULT;
      case QualityEffectSpecificationPackage.ASSEMBLY__TYPE:
        return type != TYPE_EDEFAULT;
      case QualityEffectSpecificationPackage.ASSEMBLY__COMPONENT:
        return component != null;
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
    result.append(" (not: ");
    result.append(not);
    result.append(", type: ");
    result.append(type);
    result.append(')');
    return result.toString();
  }

} //AssemblyImpl