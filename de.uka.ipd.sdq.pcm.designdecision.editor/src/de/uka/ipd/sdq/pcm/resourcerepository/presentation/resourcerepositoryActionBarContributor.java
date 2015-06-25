/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.resourcerepository.presentation;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.ui.viewer.IViewerProvider;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.edit.ui.action.ControlAction;
import org.eclipse.emf.edit.ui.action.CreateChildAction;
import org.eclipse.emf.edit.ui.action.CreateSiblingAction;
import org.eclipse.emf.edit.ui.action.EditingDomainActionBarContributor;
import org.eclipse.emf.edit.ui.action.LoadResourceAction;
import org.eclipse.emf.edit.ui.action.ValidateAction;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.ActionContributionItem;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.action.IContributionManager;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.action.SubContributionItem;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PartInitException;

import de.uka.ipd.sdq.pcm.designdecision.presentation.DesignDecisionEditorPlugin;

/**
 * This is the action bar contributor for the resourcerepository model editor. <!-- begin-user-doc
 * --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class resourcerepositoryActionBarContributor
extends EditingDomainActionBarContributor
implements ISelectionChangedListener {
    /**
     * This keeps track of the active editor. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected IEditorPart activeEditorPart;

    /**
     * This keeps track of the current selection provider. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated
     */
    protected ISelectionProvider selectionProvider;

    /**
     * This action opens the Properties view. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected IAction showPropertiesViewAction =
            new Action(DesignDecisionEditorPlugin.INSTANCE.getString("_UI_ShowPropertiesView_menu_item"))
    {
        @Override
        public void run()
        {
            try
            {
                resourcerepositoryActionBarContributor.this.getPage().showView(
                                "org.eclipse.ui.views.PropertySheet");
            }
            catch (final PartInitException exception)
            {
                DesignDecisionEditorPlugin.INSTANCE.log(exception);
            }
        }
    };

    /**
     * This action refreshes the viewer of the current editor if the editor implements
     * {@link org.eclipse.emf.common.ui.viewer.IViewerProvider}. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    protected IAction refreshViewerAction =
            new Action(DesignDecisionEditorPlugin.INSTANCE.getString("_UI_RefreshViewer_menu_item"))
    {
        @Override
        public boolean isEnabled()
        {
            return resourcerepositoryActionBarContributor.this.activeEditorPart instanceof IViewerProvider;
        }

        @Override
        public void run()
        {
            if (resourcerepositoryActionBarContributor.this.activeEditorPart instanceof IViewerProvider)
            {
                final Viewer viewer = ((IViewerProvider) resourcerepositoryActionBarContributor.this.activeEditorPart)
                                .getViewer();
                if (viewer != null)
                {
                    viewer.refresh();
                }
            }
        }
    };

    /**
     * This will contain one {@link org.eclipse.emf.edit.ui.action.CreateChildAction} corresponding
     * to each descriptor generated for the current selection by the item provider. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected Collection<IAction> createChildActions;

    /**
     * This is the menu manager into which menu contribution items should be added for CreateChild
     * actions. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected IMenuManager createChildMenuManager;

    /**
     * This will contain one {@link org.eclipse.emf.edit.ui.action.CreateSiblingAction}
     * corresponding to each descriptor generated for the current selection by the item provider.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected Collection<IAction> createSiblingActions;

    /**
     * This is the menu manager into which menu contribution items should be added for CreateSibling
     * actions. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected IMenuManager createSiblingMenuManager;

    /**
     * This creates an instance of the contributor. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public resourcerepositoryActionBarContributor() {
        super(ADDITIONS_LAST_STYLE);
        this.loadResourceAction = new LoadResourceAction();
        this.validateAction = new ValidateAction();
        this.controlAction = new ControlAction();
    }

    /**
     * This adds Separators for editor additions to the tool bar. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void contributeToToolBar(final IToolBarManager toolBarManager) {
        toolBarManager.add(new Separator("resourcerepository-settings"));
        toolBarManager.add(new Separator("resourcerepository-additions"));
    }

    /**
     * This adds to the menu bar a menu and some separators for editor additions, as well as the
     * sub-menus for object creation items. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void contributeToMenu(final IMenuManager menuManager) {
        super.contributeToMenu(menuManager);

        final IMenuManager submenuManager = new MenuManager(
                DesignDecisionEditorPlugin.INSTANCE.getString("_UI_resourcerepositoryEditor_menu"),
                "de.uka.ipd.sdq.pcm.resourcerepositoryMenuID");
        menuManager.insertAfter("additions", submenuManager);
        submenuManager.add(new Separator("settings"));
        submenuManager.add(new Separator("actions"));
        submenuManager.add(new Separator("additions"));
        submenuManager.add(new Separator("additions-end"));

        // Prepare for CreateChild item addition or removal.
        //
        this.createChildMenuManager = new MenuManager(
                DesignDecisionEditorPlugin.INSTANCE.getString("_UI_CreateChild_menu_item"));
        submenuManager.insertBefore("additions", this.createChildMenuManager);

        // Prepare for CreateSibling item addition or removal.
        //
        this.createSiblingMenuManager = new MenuManager(
                DesignDecisionEditorPlugin.INSTANCE.getString("_UI_CreateSibling_menu_item"));
        submenuManager.insertBefore("additions", this.createSiblingMenuManager);

        // Force an update because Eclipse hides empty menus now.
        //
        submenuManager.addMenuListener
        (new IMenuListener()
        {
            @Override
            public void menuAboutToShow(final IMenuManager menuManager)
            {
                menuManager.updateAll(true);
            }
        });

        this.addGlobalActions(submenuManager);
    }

    /**
     * When the active editor changes, this remembers the change and registers with it as a
     * selection provider. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setActiveEditor(final IEditorPart part) {
        super.setActiveEditor(part);
        this.activeEditorPart = part;

        // Switch to the new selection provider.
        //
        if (this.selectionProvider != null)
        {
            this.selectionProvider.removeSelectionChangedListener(this);
        }
        if (part == null)
        {
            this.selectionProvider = null;
        }
        else
        {
            this.selectionProvider = part.getSite().getSelectionProvider();
            this.selectionProvider.addSelectionChangedListener(this);

            // Fake a selection changed event to update the menus.
            //
            if (this.selectionProvider.getSelection() != null)
            {
                this.selectionChanged(new SelectionChangedEvent(this.selectionProvider, this.selectionProvider
                        .getSelection()));
            }
        }
    }

    /**
     * This implements {@link org.eclipse.jface.viewers.ISelectionChangedListener}, handling
     * {@link org.eclipse.jface.viewers.SelectionChangedEvent}s by querying for the children and
     * siblings that can be added to the selected object and updating the menus accordingly. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void selectionChanged(final SelectionChangedEvent event) {
        // Remove any menu items for old selection.
        //
        if (this.createChildMenuManager != null)
        {
            this.depopulateManager(this.createChildMenuManager, this.createChildActions);
        }
        if (this.createSiblingMenuManager != null)
        {
            this.depopulateManager(this.createSiblingMenuManager, this.createSiblingActions);
        }

        // Query the new selection for appropriate new child/sibling descriptors
        //
        Collection<?> newChildDescriptors = null;
        Collection<?> newSiblingDescriptors = null;

        final ISelection selection = event.getSelection();
        if (selection instanceof IStructuredSelection && ((IStructuredSelection) selection).size() == 1)
        {
            final Object object = ((IStructuredSelection) selection).getFirstElement();

            final EditingDomain domain = ((IEditingDomainProvider) this.activeEditorPart).getEditingDomain();

            newChildDescriptors = domain.getNewChildDescriptors(object, null);
            newSiblingDescriptors = domain.getNewChildDescriptors(null, object);
        }

        // Generate actions for selection; populate and redraw the menus.
        //
        this.createChildActions = this.generateCreateChildActions(newChildDescriptors, selection);
        this.createSiblingActions = this.generateCreateSiblingActions(newSiblingDescriptors, selection);

        if (this.createChildMenuManager != null)
        {
            this.populateManager(this.createChildMenuManager, this.createChildActions, null);
            this.createChildMenuManager.update(true);
        }
        if (this.createSiblingMenuManager != null)
        {
            this.populateManager(this.createSiblingMenuManager, this.createSiblingActions, null);
            this.createSiblingMenuManager.update(true);
        }
    }

    /**
     * This generates a {@link org.eclipse.emf.edit.ui.action.CreateChildAction} for each object in
     * <code>descriptors</code>, and returns the collection of these actions. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected Collection<IAction> generateCreateChildActions(final Collection<?> descriptors, final ISelection selection) {
        final Collection<IAction> actions = new ArrayList<IAction>();
        if (descriptors != null)
        {
            for (final Object descriptor : descriptors)
            {
                actions.add(new CreateChildAction(this.activeEditorPart, selection, descriptor));
            }
        }
        return actions;
    }

    /**
     * This generates a {@link org.eclipse.emf.edit.ui.action.CreateSiblingAction} for each object
     * in <code>descriptors</code>, and returns the collection of these actions. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected Collection<IAction> generateCreateSiblingActions(final Collection<?> descriptors,
            final ISelection selection) {
        final Collection<IAction> actions = new ArrayList<IAction>();
        if (descriptors != null)
        {
            for (final Object descriptor : descriptors)
            {
                actions.add(new CreateSiblingAction(this.activeEditorPart, selection, descriptor));
            }
        }
        return actions;
    }

    /**
     * This populates the specified <code>manager</code> with
     * {@link org.eclipse.jface.action.ActionContributionItem}s based on the
     * {@link org.eclipse.jface.action.IAction}s contained in the <code>actions</code> collection,
     * by inserting them before the specified contribution item <code>contributionID</code>. If
     * <code>contributionID</code> is <code>null</code>, they are simply added. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void populateManager(final IContributionManager manager, final Collection<? extends IAction> actions,
            final String contributionID) {
        if (actions != null)
        {
            for (final IAction action : actions)
            {
                if (contributionID != null)
                {
                    manager.insertBefore(contributionID, action);
                }
                else
                {
                    manager.add(action);
                }
            }
        }
    }

    /**
     * This removes from the specified <code>manager</code> all
     * {@link org.eclipse.jface.action.ActionContributionItem}s based on the
     * {@link org.eclipse.jface.action.IAction}s contained in the <code>actions</code> collection.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void depopulateManager(final IContributionManager manager, final Collection<? extends IAction> actions) {
        if (actions != null)
        {
            final IContributionItem[] items = manager.getItems();
            for (final IContributionItem item : items) {
                // Look into SubContributionItems
                //
                IContributionItem contributionItem = item;
                while (contributionItem instanceof SubContributionItem)
                {
                    contributionItem = ((SubContributionItem) contributionItem).getInnerItem();
                }

                // Delete the ActionContributionItems with matching action.
                //
                if (contributionItem instanceof ActionContributionItem)
                {
                    final IAction action = ((ActionContributionItem) contributionItem).getAction();
                    if (actions.contains(action))
                    {
                        manager.remove(contributionItem);
                    }
                }
            }
        }
    }

    /**
     * This populates the pop-up menu before it appears. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated
     */
    @Override
    public void menuAboutToShow(final IMenuManager menuManager) {
        super.menuAboutToShow(menuManager);
        MenuManager submenuManager = null;

        submenuManager = new MenuManager(DesignDecisionEditorPlugin.INSTANCE.getString("_UI_CreateChild_menu_item"));
        this.populateManager(submenuManager, this.createChildActions, null);
        menuManager.insertBefore("edit", submenuManager);

        submenuManager = new MenuManager(DesignDecisionEditorPlugin.INSTANCE.getString("_UI_CreateSibling_menu_item"));
        this.populateManager(submenuManager, this.createSiblingActions, null);
        menuManager.insertBefore("edit", submenuManager);
    }

    /**
     * This inserts global actions before the "additions-end" separator. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected void addGlobalActions(final IMenuManager menuManager) {
        menuManager.insertAfter("additions-end", new Separator("ui-actions"));
        menuManager.insertAfter("ui-actions", this.showPropertiesViewAction);

        this.refreshViewerAction.setEnabled(this.refreshViewerAction.isEnabled());
        menuManager.insertAfter("ui-actions", this.refreshViewerAction);

        super.addGlobalActions(menuManager);
    }

    /**
     * This ensures that a delete action will clean up all references to deleted objects. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected boolean removeAllReferencesOnDelete() {
        return true;
    }

}