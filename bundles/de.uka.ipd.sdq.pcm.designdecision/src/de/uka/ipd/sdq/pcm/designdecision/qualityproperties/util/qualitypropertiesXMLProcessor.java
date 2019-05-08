/**
 */
package de.uka.ipd.sdq.pcm.designdecision.qualityproperties.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import de.uka.ipd.sdq.pcm.designdecision.qualityproperties.qualitypropertiesPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc
 * --> <!-- end-user-doc -->
 * @generated
 */
public class qualitypropertiesXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public qualitypropertiesXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		qualitypropertiesPackage.eINSTANCE.eClass();
	}

	/**
	 * Register for "*" and "xml" file extensions the qualitypropertiesResourceFactoryImpl factory.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new qualitypropertiesResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new qualitypropertiesResourceFactoryImpl());
		}
		return registrations;
	}

} // qualitypropertiesXMLProcessor
