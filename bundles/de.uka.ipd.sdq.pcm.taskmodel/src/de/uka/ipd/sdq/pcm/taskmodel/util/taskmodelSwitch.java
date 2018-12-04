/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.taskmodel.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import de.uka.ipd.sdq.pcm.taskmodel.Alternative;
import de.uka.ipd.sdq.pcm.taskmodel.AlternativeTask;
import de.uka.ipd.sdq.pcm.taskmodel.Edge;
import de.uka.ipd.sdq.pcm.taskmodel.Task;
import de.uka.ipd.sdq.pcm.taskmodel.TaskList;
import de.uka.ipd.sdq.pcm.taskmodel.taskmodelPackage;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the
 * call {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for
 * each class of the model, starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the result of the switch.
 * <!-- end-user-doc -->
 *
 * @see de.uka.ipd.sdq.pcm.taskmodel.taskmodelPackage
 * @generated
 */
public class taskmodelSwitch<T> extends Switch<T> {
    /**
     * The cached model package <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected static taskmodelPackage modelPackage;

    /**
     * Creates an instance of the switch. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public taskmodelSwitch() {
        if (modelPackage == null)
        {
            modelPackage = taskmodelPackage.eINSTANCE;
        }
    }

    /**
     * Checks whether this is a switch for the given package. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @parameter ePackage the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
    @Override
    protected boolean isSwitchFor(final EPackage ePackage)
    {
        return ePackage == modelPackage;
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result;
     * it yields that result. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    @Override
    protected T doSwitch(final int classifierID, final EObject theEObject) {
        switch (classifierID)
        {
        case taskmodelPackage.TASK: {
            final Task task = (Task) theEObject;
            T result = this.caseTask(task);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case taskmodelPackage.EDGE: {
            final Edge edge = (Edge) theEObject;
            T result = this.caseEdge(edge);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case taskmodelPackage.TASK_LIST: {
            final TaskList taskList = (TaskList) theEObject;
            T result = this.caseTaskList(taskList);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case taskmodelPackage.ALTERNATIVE: {
            final Alternative alternative = (Alternative) theEObject;
            T result = this.caseAlternative(alternative);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case taskmodelPackage.ALTERNATIVE_TASK: {
            final AlternativeTask alternativeTask = (AlternativeTask) theEObject;
            T result = this.caseAlternativeTask(alternativeTask);
            if (result == null) {
                result = this.caseTask(alternativeTask);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        default:
            return this.defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Task</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Task</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTask(final Task object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Edge</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Edge</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEdge(final Edge object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Task List</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Task List</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTaskList(final TaskList object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Alternative</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Alternative</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAlternative(final Alternative object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Alternative Task</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Alternative Task</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAlternativeTask(final AlternativeTask object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch, but this is the last case anyway. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    @Override
    public T defaultCase(final EObject object) {
        return null;
    }

} // taskmodelSwitch
