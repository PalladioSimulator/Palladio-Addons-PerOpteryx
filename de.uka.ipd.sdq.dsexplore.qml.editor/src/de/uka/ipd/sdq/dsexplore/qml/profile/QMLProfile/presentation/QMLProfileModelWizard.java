/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.dsexplore.qml.profile.QMLProfile.presentation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.StringTokenizer;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.ISetSelectionTarget;

import de.uka.ipd.sdq.dsexplore.qml.profile.QMLProfile.QMLProfileFactory;
import de.uka.ipd.sdq.dsexplore.qml.profile.QMLProfile.QMLProfilePackage;
import de.uka.ipd.sdq.dsexplore.qml.profile.QMLProfile.provider.QMLProfileEditPlugin;

/**
 * This is a simple wizard for creating a new model file. <!-- begin-user-doc --> <!-- end-user-doc
 * -->
 * 
 * @generated
 */
public class QMLProfileModelWizard extends Wizard implements INewWizard {
    /**
     * The supported extensions for created files. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final List<String> FILE_EXTENSIONS =
            Collections.unmodifiableList(Arrays.asList(QMLProfileEditorPlugin.INSTANCE.getString(
                    "_UI_QMLProfileEditorFilenameExtensions").split("\\s*,\\s*")));

    /**
     * A formatted list of supported file extensions, suitable for display. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final String FORMATTED_FILE_EXTENSIONS =
            QMLProfileEditorPlugin.INSTANCE.getString("_UI_QMLProfileEditorFilenameExtensions").replaceAll("\\s*,\\s*",
                    ", ");

    /**
     * This caches an instance of the model package. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected QMLProfilePackage qmlProfilePackage = QMLProfilePackage.eINSTANCE;

    /**
     * This caches an instance of the model factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected QMLProfileFactory qmlProfileFactory = this.qmlProfilePackage.getQMLProfileFactory();

    /**
     * This is the file creation page. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected QMLProfileModelWizardNewFileCreationPage newFileCreationPage;

    /**
     * This is the initial object creation page. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected QMLProfileModelWizardInitialObjectCreationPage initialObjectCreationPage;

    /**
     * Remember the selection during initialization for populating the default container. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected IStructuredSelection selection;

    /**
     * Remember the workbench during initialization. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected IWorkbench workbench;

    /**
     * Caches the names of the types that can be created as the root object. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    protected List<String> initialObjectNames;

    /**
     * This just records the information. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void init(final IWorkbench workbench, final IStructuredSelection selection) {
        this.workbench = workbench;
        this.selection = selection;
        this.setWindowTitle(QMLProfileEditorPlugin.INSTANCE.getString("_UI_Wizard_label"));
        this.setDefaultPageImageDescriptor(ExtendedImageRegistry.INSTANCE
                .getImageDescriptor(QMLProfileEditorPlugin.INSTANCE
                        .getImage("full/wizban/NewQMLProfile")));
    }

    /**
     * Returns the names of the types that can be created as the root object. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected Collection<String> getInitialObjectNames() {
        if (this.initialObjectNames == null)
        {
            this.initialObjectNames = new ArrayList<String>();
            for (final EClassifier eClassifier : this.qmlProfilePackage.getEClassifiers())
            {
                if (eClassifier instanceof EClass)
                {
                    final EClass eClass = (EClass) eClassifier;
                    if (!eClass.isAbstract())
                    {
                        this.initialObjectNames.add(eClass.getName());
                    }
                }
            }
            Collections.sort(this.initialObjectNames, CommonPlugin.INSTANCE.getComparator());
        }
        return this.initialObjectNames;
    }

    /**
     * Create a new model. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected EObject createInitialModel() {
        final EClass eClass = (EClass) this.qmlProfilePackage.getEClassifier(this.initialObjectCreationPage
                .getInitialObjectName());
        final EObject rootObject = this.qmlProfileFactory.create(eClass);
        return rootObject;
    }

    /**
     * Do the work after everything is specified. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public boolean performFinish() {
        try
        {
            // Remember the file.
            //
            final IFile modelFile = this.getModelFile();

            // Do the work within an operation.
            //
            final WorkspaceModifyOperation operation =
                    new WorkspaceModifyOperation()
            {
                @Override
                protected void execute(final IProgressMonitor progressMonitor)
                {
                    try
                    {
                        // Create a resource set
                        //
                        final ResourceSet resourceSet = new ResourceSetImpl();

                        // Get the URI of the model file.
                        //
                        final URI fileURI = URI.createPlatformResourceURI(modelFile.getFullPath().toString(),
                                        true);

                        // Create a resource for this file.
                        //
                        final Resource resource = resourceSet.createResource(fileURI);

                        // Add the initial model object to the contents.
                        //
                        final EObject rootObject = QMLProfileModelWizard.this.createInitialModel();
                        if (rootObject != null)
                        {
                            resource.getContents().add(rootObject);
                        }

                        // Save the contents of the resource to the file system.
                        //
                        final Map<Object, Object> options = new HashMap<Object, Object>();
                        options.put(XMLResource.OPTION_ENCODING,
                                        QMLProfileModelWizard.this.initialObjectCreationPage.getEncoding());
                        resource.save(options);
                    }
                    catch (final Exception exception)
                    {
                        QMLProfileEditorPlugin.INSTANCE.log(exception);
                    }
                    finally
                    {
                        progressMonitor.done();
                    }
                }
            };

            this.getContainer().run(false, false, operation);

            // Select the new file resource in the current view.
            //
            final IWorkbenchWindow workbenchWindow = this.workbench.getActiveWorkbenchWindow();
            final IWorkbenchPage page = workbenchWindow.getActivePage();
            final IWorkbenchPart activePart = page.getActivePart();
            if (activePart instanceof ISetSelectionTarget)
            {
                final ISelection targetSelection = new StructuredSelection(modelFile);
                this.getShell().getDisplay().asyncExec
                (new Runnable()
                {
                    @Override
                    public void run()
                    {
                        ((ISetSelectionTarget) activePart).selectReveal(targetSelection);
                    }
                });
            }

            // Open an editor on the new file.
            //
            try
            {
                page.openEditor
                (new FileEditorInput(modelFile),
                        this.workbench.getEditorRegistry().getDefaultEditor(modelFile.getFullPath().toString())
                        .getId());
            } catch (final PartInitException exception)
            {
                MessageDialog.openError(workbenchWindow.getShell(),
                        QMLProfileEditorPlugin.INSTANCE.getString("_UI_OpenEditorError_label"), exception.getMessage());
                return false;
            }

            return true;
        } catch (final Exception exception)
        {
            QMLProfileEditorPlugin.INSTANCE.log(exception);
            return false;
        }
    }

    /**
     * This is the one page of the wizard. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public class QMLProfileModelWizardNewFileCreationPage extends WizardNewFileCreationPage {
        /**
         * Pass in the selection. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        public QMLProfileModelWizardNewFileCreationPage(final String pageId, final IStructuredSelection selection) {
            super(pageId, selection);
        }

        /**
         * The framework calls this to see if the file is correct. <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * 
         * @generated
         */
        @Override
        protected boolean validatePage() {
            if (super.validatePage())
            {
                final String extension = new Path(this.getFileName()).getFileExtension();
                if (extension == null || !FILE_EXTENSIONS.contains(extension))
                {
                    final String key = FILE_EXTENSIONS.size() > 1 ? "_WARN_FilenameExtensions"
                            : "_WARN_FilenameExtension";
                    this.setErrorMessage(QMLProfileEditorPlugin.INSTANCE.getString(key,
                            new Object[] { FORMATTED_FILE_EXTENSIONS }));
                    return false;
                }
                return true;
            }
            return false;
        }

        /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        public IFile getModelFile() {
            return ResourcesPlugin.getWorkspace().getRoot()
                    .getFile(this.getContainerFullPath().append(this.getFileName()));
        }
    }

    /**
     * This is the page where the type of object to create is selected. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    public class QMLProfileModelWizardInitialObjectCreationPage extends WizardPage {
        /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        protected Combo initialObjectField;

        /**
         * @generated <!-- begin-user-doc --> <!-- end-user-doc -->
         */
        protected List<String> encodings;

        /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        protected Combo encodingField;

        /**
         * Pass in the selection. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        public QMLProfileModelWizardInitialObjectCreationPage(final String pageId) {
            super(pageId);
        }

        /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        @Override
        public void createControl(final Composite parent) {
            final Composite composite = new Composite(parent, SWT.NONE);
            {
                final GridLayout layout = new GridLayout();
                layout.numColumns = 1;
                layout.verticalSpacing = 12;
                composite.setLayout(layout);

                final GridData data = new GridData();
                data.verticalAlignment = GridData.FILL;
                data.grabExcessVerticalSpace = true;
                data.horizontalAlignment = GridData.FILL;
                composite.setLayoutData(data);
            }

            final Label containerLabel = new Label(composite, SWT.LEFT);
            {
                containerLabel.setText(QMLProfileEditorPlugin.INSTANCE.getString("_UI_ModelObject"));

                final GridData data = new GridData();
                data.horizontalAlignment = GridData.FILL;
                containerLabel.setLayoutData(data);
            }

            this.initialObjectField = new Combo(composite, SWT.BORDER);
            {
                final GridData data = new GridData();
                data.horizontalAlignment = GridData.FILL;
                data.grabExcessHorizontalSpace = true;
                this.initialObjectField.setLayoutData(data);
            }

            for (final String objectName : QMLProfileModelWizard.this.getInitialObjectNames())
            {
                this.initialObjectField.add(this.getLabel(objectName));
            }

            if (this.initialObjectField.getItemCount() == 1)
            {
                this.initialObjectField.select(0);
            }
            this.initialObjectField.addModifyListener(this.validator);

            final Label encodingLabel = new Label(composite, SWT.LEFT);
            {
                encodingLabel.setText(QMLProfileEditorPlugin.INSTANCE.getString("_UI_XMLEncoding"));

                final GridData data = new GridData();
                data.horizontalAlignment = GridData.FILL;
                encodingLabel.setLayoutData(data);
            }
            this.encodingField = new Combo(composite, SWT.BORDER);
            {
                final GridData data = new GridData();
                data.horizontalAlignment = GridData.FILL;
                data.grabExcessHorizontalSpace = true;
                this.encodingField.setLayoutData(data);
            }

            for (final String encoding : this.getEncodings())
            {
                this.encodingField.add(encoding);
            }

            this.encodingField.select(0);
            this.encodingField.addModifyListener(this.validator);

            this.setPageComplete(this.validatePage());
            this.setControl(composite);
        }

        /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        protected ModifyListener validator =
                new ModifyListener()
        {
            @Override
            public void modifyText(final ModifyEvent e)
            {
                QMLProfileModelWizardInitialObjectCreationPage.this
                                .setPageComplete(QMLProfileModelWizardInitialObjectCreationPage.this.validatePage());
            }
        };

        /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        protected boolean validatePage() {
            return this.getInitialObjectName() != null && this.getEncodings().contains(this.encodingField.getText());
        }

        /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        @Override
        public void setVisible(final boolean visible) {
            super.setVisible(visible);
            if (visible)
            {
                if (this.initialObjectField.getItemCount() == 1)
                {
                    this.initialObjectField.clearSelection();
                    this.encodingField.setFocus();
                }
                else
                {
                    this.encodingField.clearSelection();
                    this.initialObjectField.setFocus();
                }
            }
        }

        /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        public String getInitialObjectName() {
            final String label = this.initialObjectField.getText();

            for (final String name : QMLProfileModelWizard.this.getInitialObjectNames())
            {
                if (this.getLabel(name).equals(label))
                {
                    return name;
                }
            }
            return null;
        }

        /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        public String getEncoding() {
            return this.encodingField.getText();
        }

        /**
         * Returns the label for the specified type name. <!-- begin-user-doc --> <!-- end-user-doc
         * -->
         * 
         * @generated
         */
        protected String getLabel(final String typeName) {
            try
            {
                return QMLProfileEditPlugin.INSTANCE.getString("_UI_" + typeName + "_type");
            } catch (final MissingResourceException mre)
            {
                QMLProfileEditorPlugin.INSTANCE.log(mre);
            }
            return typeName;
        }

        /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        protected Collection<String> getEncodings() {
            if (this.encodings == null)
            {
                this.encodings = new ArrayList<String>();
                for (final StringTokenizer stringTokenizer = new StringTokenizer(
                        QMLProfileEditorPlugin.INSTANCE.getString("_UI_XMLEncodingChoices")); stringTokenizer
                        .hasMoreTokens();)
                {
                    this.encodings.add(stringTokenizer.nextToken());
                }
            }
            return this.encodings;
        }
    }

    /**
     * The framework calls this to create the contents of the wizard. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void addPages() {
        // Create a page, set the title, and the initial model file name.
        //
        this.newFileCreationPage = new QMLProfileModelWizardNewFileCreationPage("Whatever", this.selection);
        this.newFileCreationPage.setTitle(QMLProfileEditorPlugin.INSTANCE.getString("_UI_QMLProfileModelWizard_label"));
        this.newFileCreationPage.setDescription(QMLProfileEditorPlugin.INSTANCE
                .getString("_UI_QMLProfileModelWizard_description"));
        this.newFileCreationPage.setFileName(QMLProfileEditorPlugin.INSTANCE
                .getString("_UI_QMLProfileEditorFilenameDefaultBase") + "." + FILE_EXTENSIONS.get(0));
        this.addPage(this.newFileCreationPage);

        // Try and get the resource selection to determine a current directory for the file dialog.
        //
        if (this.selection != null && !this.selection.isEmpty())
        {
            // Get the resource...
            //
            final Object selectedElement = this.selection.iterator().next();
            if (selectedElement instanceof IResource)
            {
                // Get the resource parent, if its a file.
                //
                IResource selectedResource = (IResource) selectedElement;
                if (selectedResource.getType() == IResource.FILE)
                {
                    selectedResource = selectedResource.getParent();
                }

                // This gives us a directory...
                //
                if (selectedResource instanceof IFolder || selectedResource instanceof IProject)
                {
                    // Set this for the container.
                    //
                    this.newFileCreationPage.setContainerFullPath(selectedResource.getFullPath());

                    // Make up a unique new name here.
                    //
                    final String defaultModelBaseFilename = QMLProfileEditorPlugin.INSTANCE
                            .getString("_UI_QMLProfileEditorFilenameDefaultBase");
                    final String defaultModelFilenameExtension = FILE_EXTENSIONS.get(0);
                    String modelFilename = defaultModelBaseFilename + "." + defaultModelFilenameExtension;
                    for (int i = 1; ((IContainer) selectedResource).findMember(modelFilename) != null; ++i)
                    {
                        modelFilename = defaultModelBaseFilename + i + "." + defaultModelFilenameExtension;
                    }
                    this.newFileCreationPage.setFileName(modelFilename);
                }
            }
        }
        this.initialObjectCreationPage = new QMLProfileModelWizardInitialObjectCreationPage("Whatever2");
        this.initialObjectCreationPage
        .setTitle(QMLProfileEditorPlugin.INSTANCE.getString("_UI_QMLProfileModelWizard_label"));
        this.initialObjectCreationPage.setDescription(QMLProfileEditorPlugin.INSTANCE
                .getString("_UI_Wizard_initial_object_description"));
        this.addPage(this.initialObjectCreationPage);
    }

    /**
     * Get the file from the page. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public IFile getModelFile() {
        return this.newFileCreationPage.getModelFile();
    }

}
