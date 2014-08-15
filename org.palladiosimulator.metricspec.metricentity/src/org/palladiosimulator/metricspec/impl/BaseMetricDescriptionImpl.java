/**
 */
package org.palladiosimulator.metricspec.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.palladiosimulator.metricspec.BaseMetricDescription;
import org.palladiosimulator.metricspec.CaptureType;
import org.palladiosimulator.metricspec.DataType;
import org.palladiosimulator.metricspec.MetricSpecPackage;
import org.palladiosimulator.metricspec.Scale;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Base Metric Description</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.palladiosimulator.metricspec.impl.BaseMetricDescriptionImpl#getCaptureType <em>
 * Capture Type</em>}</li>
 * <li>{@link org.palladiosimulator.metricspec.impl.BaseMetricDescriptionImpl#getDataType <em>Data
 * Type</em>}</li>
 * <li>{@link org.palladiosimulator.metricspec.impl.BaseMetricDescriptionImpl#getScale <em>Scale
 * </em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public abstract class BaseMetricDescriptionImpl extends MetricDescriptionImpl implements BaseMetricDescription {
    /**
     * The default value of the '{@link #getCaptureType() <em>Capture Type</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getCaptureType()
     * @generated
     * @ordered
     */
    protected static final CaptureType CAPTURE_TYPE_EDEFAULT = CaptureType.IDENTIFIER;

    /**
     * The cached value of the '{@link #getCaptureType() <em>Capture Type</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getCaptureType()
     * @generated
     * @ordered
     */
    protected CaptureType captureType = CAPTURE_TYPE_EDEFAULT;

    /**
     * The default value of the '{@link #getDataType() <em>Data Type</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getDataType()
     * @generated
     * @ordered
     */
    protected static final DataType DATA_TYPE_EDEFAULT = DataType.QUANTITATIVE;

    /**
     * The cached value of the '{@link #getDataType() <em>Data Type</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getDataType()
     * @generated
     * @ordered
     */
    protected DataType dataType = DATA_TYPE_EDEFAULT;

    /**
     * The default value of the '{@link #getScale() <em>Scale</em>}' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @see #getScale()
     * @generated
     * @ordered
     */
    protected static final Scale SCALE_EDEFAULT = Scale.NOMINAL;

    /**
     * The cached value of the '{@link #getScale() <em>Scale</em>}' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @see #getScale()
     * @generated
     * @ordered
     */
    protected Scale scale = SCALE_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected BaseMetricDescriptionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return MetricSpecPackage.Literals.BASE_METRIC_DESCRIPTION;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public CaptureType getCaptureType() {
        return captureType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setCaptureType(CaptureType newCaptureType) {
        CaptureType oldCaptureType = captureType;
        captureType = newCaptureType == null ? CAPTURE_TYPE_EDEFAULT : newCaptureType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    MetricSpecPackage.BASE_METRIC_DESCRIPTION__CAPTURE_TYPE, oldCaptureType, captureType));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public DataType getDataType() {
        return dataType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setDataType(DataType newDataType) {
        DataType oldDataType = dataType;
        dataType = newDataType == null ? DATA_TYPE_EDEFAULT : newDataType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MetricSpecPackage.BASE_METRIC_DESCRIPTION__DATA_TYPE,
                    oldDataType, dataType));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public Scale getScale() {
        return scale;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setScale(Scale newScale) {
        Scale oldScale = scale;
        scale = newScale == null ? SCALE_EDEFAULT : newScale;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MetricSpecPackage.BASE_METRIC_DESCRIPTION__SCALE,
                    oldScale, scale));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case MetricSpecPackage.BASE_METRIC_DESCRIPTION__CAPTURE_TYPE:
            return getCaptureType();
        case MetricSpecPackage.BASE_METRIC_DESCRIPTION__DATA_TYPE:
            return getDataType();
        case MetricSpecPackage.BASE_METRIC_DESCRIPTION__SCALE:
            return getScale();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
        case MetricSpecPackage.BASE_METRIC_DESCRIPTION__CAPTURE_TYPE:
            setCaptureType((CaptureType) newValue);
            return;
        case MetricSpecPackage.BASE_METRIC_DESCRIPTION__DATA_TYPE:
            setDataType((DataType) newValue);
            return;
        case MetricSpecPackage.BASE_METRIC_DESCRIPTION__SCALE:
            setScale((Scale) newValue);
            return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
        case MetricSpecPackage.BASE_METRIC_DESCRIPTION__CAPTURE_TYPE:
            setCaptureType(CAPTURE_TYPE_EDEFAULT);
            return;
        case MetricSpecPackage.BASE_METRIC_DESCRIPTION__DATA_TYPE:
            setDataType(DATA_TYPE_EDEFAULT);
            return;
        case MetricSpecPackage.BASE_METRIC_DESCRIPTION__SCALE:
            setScale(SCALE_EDEFAULT);
            return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
        case MetricSpecPackage.BASE_METRIC_DESCRIPTION__CAPTURE_TYPE:
            return captureType != CAPTURE_TYPE_EDEFAULT;
        case MetricSpecPackage.BASE_METRIC_DESCRIPTION__DATA_TYPE:
            return dataType != DATA_TYPE_EDEFAULT;
        case MetricSpecPackage.BASE_METRIC_DESCRIPTION__SCALE:
            return scale != SCALE_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy())
            return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (captureType: ");
        result.append(captureType);
        result.append(", dataType: ");
        result.append(dataType);
        result.append(", scale: ");
        result.append(scale);
        result.append(')');
        return result.toString();
    }

} // BaseMetricDescriptionImpl
