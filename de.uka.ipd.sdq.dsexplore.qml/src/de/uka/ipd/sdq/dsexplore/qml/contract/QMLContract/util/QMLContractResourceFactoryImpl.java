/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;

/**
 * <!-- begin-user-doc --> The <b>Resource Factory</b> associated with the package. <!--
 * end-user-doc -->
 * @see de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.util.QMLContractResourceImpl
 * @generated
 */
public class QMLContractResourceFactoryImpl extends ResourceFactoryImpl {
	/**
	 * Creates an instance of the resource factory.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public QMLContractResourceFactoryImpl() {
		super();
	}

	/**
	 * Creates an instance of the resource.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Resource createResource(URI uri) {
		XMLResource result = new QMLContractResourceImpl(uri);
		return result;
	}

} // QMLContractResourceFactoryImpl
