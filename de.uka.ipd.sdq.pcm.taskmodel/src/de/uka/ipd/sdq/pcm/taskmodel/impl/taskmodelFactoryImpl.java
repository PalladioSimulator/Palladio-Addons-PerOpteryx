/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.taskmodel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import de.uka.ipd.sdq.pcm.taskmodel.Alternative;
import de.uka.ipd.sdq.pcm.taskmodel.AlternativeTask;
import de.uka.ipd.sdq.pcm.taskmodel.Edge;
import de.uka.ipd.sdq.pcm.taskmodel.Task;
import de.uka.ipd.sdq.pcm.taskmodel.TaskList;
import de.uka.ipd.sdq.pcm.taskmodel.taskmodelFactory;
import de.uka.ipd.sdq.pcm.taskmodel.taskmodelPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 *
 * @generated
 */
public class taskmodelFactoryImpl extends EFactoryImpl implements taskmodelFactory {
    /**
     * Creates the default factory implementation. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static taskmodelFactory init() {
        try
        {
            final taskmodelFactory thetaskmodelFactory = (taskmodelFactory) EPackage.Registry.INSTANCE
                    .getEFactory(taskmodelPackage.eNS_URI);
            if (thetaskmodelFactory != null)
            {
                return thetaskmodelFactory;
            }
        } catch (final Exception exception)
        {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new taskmodelFactoryImpl();
    }

    /**
     * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public taskmodelFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EObject create(final EClass eClass) {
        switch (eClass.getClassifierID())
        {
        case taskmodelPackage.TASK:
            return this.createTask();
        case taskmodelPackage.EDGE:
            return this.createEdge();
        case taskmodelPackage.TASK_LIST:
            return this.createTaskList();
        case taskmodelPackage.ALTERNATIVE:
            return this.createAlternative();
        case taskmodelPackage.ALTERNATIVE_TASK:
            return this.createAlternativeTask();
        default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Task createTask() {
        final TaskImpl task = new TaskImpl();
        return task;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Edge createEdge() {
        final EdgeImpl edge = new EdgeImpl();
        return edge;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public TaskList createTaskList() {
        final TaskListImpl taskList = new TaskListImpl();
        return taskList;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Alternative createAlternative() {
        final AlternativeImpl alternative = new AlternativeImpl();
        return alternative;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public AlternativeTask createAlternativeTask() {
        final AlternativeTaskImpl alternativeTask = new AlternativeTaskImpl();
        return alternativeTask;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public taskmodelPackage gettaskmodelPackage() {
        return (taskmodelPackage) this.getEPackage();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @deprecated
     * @generated
     */
    @Deprecated
    public static taskmodelPackage getPackage() {
        return taskmodelPackage.eINSTANCE;
    }

} // taskmodelFactoryImpl
