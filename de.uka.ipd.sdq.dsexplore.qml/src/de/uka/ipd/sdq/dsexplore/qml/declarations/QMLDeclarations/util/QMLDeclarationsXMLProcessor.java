/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.dsexplore.qml.declarations.QMLDeclarations.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import de.uka.ipd.sdq.dsexplore.qml.declarations.QMLDeclarations.QMLDeclarationsPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents <!-- begin-user-doc
 * --> <!-- end-user-doc -->
 *
 * @generated
 */
public class QMLDeclarationsXMLProcessor extends XMLProcessor {

    /**
     * Public constructor to instantiate the helper. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public QMLDeclarationsXMLProcessor() {
        super((EPackage.Registry.INSTANCE));
        QMLDeclarationsPackage.eINSTANCE.eClass();
    }

    /**
     * Register for "*" and "xml" file extensions the QMLDeclarationsResourceFactoryImpl factory.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected Map<String, Resource.Factory> getRegistrations() {
        if (this.registrations == null)
        {
            super.getRegistrations();
            this.registrations.put(XML_EXTENSION, new QMLDeclarationsResourceFactoryImpl());
            this.registrations.put(STAR_EXTENSION, new QMLDeclarationsResourceFactoryImpl());
        }
        return this.registrations;
    }

} // QMLDeclarationsXMLProcessor
