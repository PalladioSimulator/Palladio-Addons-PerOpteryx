package de.uka.ipd.sdq.dsexplore.analysis.nqr;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.ILaunchConfigurationTab;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.palladiosimulator.analyzer.workflow.runconfig.FileNamesInputTab;
import org.palladiosimulator.qualitymodel.QualityModelPackage;
import org.palladiosimulator.qualitymodel.ReasoningSystem;
import org.palladiosimulator.qualitymodel.Reduction;

import de.uka.ipd.sdq.dsexplore.analysis.qes.ParseException;
import de.uka.ipd.sdq.dsexplore.analysis.qes.QesParser;
import de.uka.ipd.sdq.dsexplore.analysis.qes.QesValidator;
import de.uka.ipd.sdq.dsexplore.helper.EMFHelper;
import de.uka.ipd.sdq.dsexplore.launch.DSEConstantsContainer;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.QMLContractPackage;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.DimensionTypeSet;
import de.uka.ipd.sdq.workflow.launchconfig.LaunchConfigPlugin;
import de.uka.ipd.sdq.workflow.launchconfig.tabs.TabHelper;

public class NqrAnalysisTab extends FileNamesInputTab implements ILaunchConfigurationTab {
	
    private Text dimension;
    private Text reduction;
    private Text system;
    private Text qualityEffectSpecification;

    @Override
    public void activated(final ILaunchConfigurationWorkingCopy workingCopy) {}

    @Override
    public void createControl(final Composite parent) {

        // Create a listener for GUI modification events:
        final ModifyListener modifyListener = new ModifyListener() {
            @Override
            public void modifyText(final ModifyEvent e) {
                NqrAnalysisTab.this.setDirty(true);
                NqrAnalysisTab.this.updateLaunchConfigurationDialog();
            }
        };

        // Create a new Composite to hold the page's controls:
        final Composite container = new Composite(parent, SWT.NONE);
        setControl(container);
        container.setLayout(new GridLayout());

        // Add Dimension Type Set input section
        dimension = new Text(container, SWT.SINGLE | SWT.BORDER);
        TabHelper.createFileInputSection(container, modifyListener, "Dimension Type Set File",
                DSEConstantsContainer.QML_CONTRACT_EXTENSION, dimension, getShell(), "");

        // Add ReductionProxy input section
        reduction = new Text(container, SWT.SINGLE | SWT.BORDER);
        TabHelper.createFileInputSection(container, modifyListener, "ReductionProxy ProxyFactory File",
                DSEConstantsContainer.REASONING_MODEL_EXTENSION, reduction, getShell(), "");

        // Add System input section
        system = new Text(container, SWT.SINGLE | SWT.BORDER);
        TabHelper.createFileInputSection(container, modifyListener, "Reasoning System File",
                DSEConstantsContainer.REASONING_MODEL_EXTENSION, system, getShell(), "");
        
        // Add Architecture Effect Specification input section
        qualityEffectSpecification = new Text(container, SWT.SINGLE | SWT.BORDER);
        TabHelper.createFileInputSection(container, modifyListener, "Quality Effect Specification File",
                DSEConstantsContainer.QUALITY_EFFECT_SPECIFICATION_EXTENSION, qualityEffectSpecification, getShell(), "");
    }

    @Override
    public void deactivated(final ILaunchConfigurationWorkingCopy workingCopy) {}

    private boolean error(final String message) {
        setErrorMessage(message);
        return message == null;
    }

    @Override
    public String getName() {
        return "NQR Analysis";
    }

    @Override
    public void initializeFrom(final ILaunchConfiguration configuration) {
        setText(configuration, dimension, DSEConstantsContainer.QML_CONTRACT_FILE);
        setText(configuration, reduction, DSEConstantsContainer.REASONING_REDUCTION_FILE);
        setText(configuration, system, DSEConstantsContainer.REASONING_SYSTEM_FILE);
        setText(configuration, qualityEffectSpecification, DSEConstantsContainer.QUALITY_EFFECT_SPECIFICATION_FILE);
    }

    @Override
    public boolean isValid(final ILaunchConfiguration launchConfig) {
        return isValidDimension(dimension.getText()) && isValidReduction(reduction.getText())
                && isValidSystem(system.getText()) && isValidQualityEffectSpecification(qualityEffectSpecification.getText());
    }

    private boolean isValidDimension(final String uri) {
        final String extension = DSEConstantsContainer.QML_CONTRACT_EXTENSION[0].substring(1);
        if ((uri == null) || !uri.endsWith(extension)) {
            return error("Dimension Type Set File is missing!");
        }

        URI loadFrom = URI.createURI(uri);
        if (!loadFrom.isPlatform()) {
            loadFrom = URI.createFileURI(uri);
        }

        final EObject object = EMFHelper.loadFromXMIFile(loadFrom, QMLContractPackage.eINSTANCE);

        if (!(object instanceof DimensionTypeSet)) {
            return error("Valid Dimension Type Set is missing!");
        }

        return error(null);
    }

    private boolean isValidReduction(final String uri) {
        final String extension = DSEConstantsContainer.REASONING_MODEL_EXTENSION[0].substring(1);
        if ((uri == null) || !uri.endsWith(extension)) {
            return error("ReductionProxy File is missing!");
        }

        URI loadFrom = URI.createURI(uri);
        if (!loadFrom.isPlatform()) {
            loadFrom = URI.createFileURI(uri);
        }

        final EObject object = EMFHelper.loadFromXMIFile(loadFrom, QualityModelPackage.eINSTANCE);

        if (!(object instanceof Reduction)) {
            return error("Valid ReductionProxy is missing!");
        }

        return error(null);
    }

    private boolean isValidSystem(final String uri) {
        final String extension = DSEConstantsContainer.REASONING_MODEL_EXTENSION[0].substring(1);
        if ((uri == null) || !uri.endsWith(extension)) {
            return error("Reasoning System File is missing!");
        }

        URI loadFrom = URI.createURI(uri);
        if (!loadFrom.isPlatform()) {
            loadFrom = URI.createFileURI(uri);
        }

        final EObject object = EMFHelper.loadFromXMIFile(loadFrom, QualityModelPackage.eINSTANCE);

        if (!(object instanceof ReasoningSystem)) {
            return error("Valid Reasoning System is missing!");
        }

        return error(null);
    }
    
    private boolean isValidQualityEffectSpecification(final String uri) {
        final String extension = DSEConstantsContainer.QUALITY_EFFECT_SPECIFICATION_EXTENSION[0].substring(1);
        if ((uri == null) || !uri.endsWith(extension)) {
            return error("Quality Effect Specification File is missing!");
        }

        URI loadFrom = URI.createURI(uri);
        if (!loadFrom.isPlatform()) {
            loadFrom = URI.createFileURI(uri);
        }
        
        try {
        		return error(new QesValidator().isValidModel(new QesParser().getModel(loadFrom)) ? null : "Valid Quality Effect Specification is missing!");
		} catch (ParseException e) {
			return error(e.getMessage());
		}
        
    }

    @Override
    public void performApply(final ILaunchConfigurationWorkingCopy configuration) {
        if (configuration == null) {
            error("LaunchConfiguration is null");
            return;
        }

        configuration.setAttribute(DSEConstantsContainer.QML_CONTRACT_FILE, dimension.getText());
        configuration.setAttribute(DSEConstantsContainer.REASONING_REDUCTION_FILE, reduction.getText());
        configuration.setAttribute(DSEConstantsContainer.REASONING_SYSTEM_FILE, system.getText());
        configuration.setAttribute(DSEConstantsContainer.QUALITY_EFFECT_SPECIFICATION_FILE, qualityEffectSpecification.getText());        
    }

    @Override
    public void setDefaults(final ILaunchConfigurationWorkingCopy configuration) {
        if (configuration == null) {
            error("LaunchConfiguration is null");
            return;
        }

        setText(dimension, "");
        configuration.setAttribute(DSEConstantsContainer.QML_CONTRACT_FILE, "");
        setText(reduction, "");
        configuration.setAttribute(DSEConstantsContainer.REASONING_REDUCTION_FILE, "");
        setText(system, "");
        configuration.setAttribute(DSEConstantsContainer.REASONING_SYSTEM_FILE, "");
        setText(qualityEffectSpecification, "");
        configuration.setAttribute(DSEConstantsContainer.QUALITY_EFFECT_SPECIFICATION_FILE, "");
    }

    private boolean setText(final ILaunchConfiguration configuration, final Text textWidget, final String attributeName) {
        try {
            textWidget.setText(configuration.getAttribute(attributeName, ""));
            return true;
        } catch (final CoreException e) {
            LaunchConfigPlugin.errorLogger(getName(), attributeName, e.getMessage());
            return error(e.getMessage());
        }
    }


    private void setText(final Text textWidget, final String attributeName) {
        try {
            if ((textWidget != null) && (attributeName != null)) {
                textWidget.setText(attributeName);
            }
        } catch (final Exception e) {
            error(e.getMessage());
        }
    }

}
