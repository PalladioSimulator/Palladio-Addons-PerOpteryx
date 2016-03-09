/**
 */
package dmlsupport.helper.impl;

import dmlsupport.helper.DMLPhenotype;
import dmlsupport.helper.HelperPackage;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DML Phenotype</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DMLPhenotypeImpl extends MinimalEObjectImpl.Container implements DMLPhenotype {
	
	private String genotypeID;
	private long numericId;
	
	
	protected DMLPhenotypeImpl(String genotypeID, long numericId) {
		this.genotypeID = genotypeID;
		this.numericId = numericId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HelperPackage.Literals.DML_PHENOTYPE;
	}

	@Override
	public long getNumericID() {
		return numericId;
	}

} //DMLPhenotypeImpl
