package de.uka.ipd.sdq.pcm.cost.editor.customisation;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.ui.views.properties.IPropertySource;
import org.palladiosimulator.editors.propertytabs.PalladioAdapterFactoryContentProvider;

import de.uka.ipd.sdq.pcm.cost.ScalarFunction;

public class CostPalladioAdapterFactoryContentProvider extends
PalladioAdapterFactoryContentProvider {

    public CostPalladioAdapterFactoryContentProvider(
            final AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

    @Override
    protected IPropertySource createPropertySource(final Object object, final IItemPropertySource itemPropertySource) {
        if (object instanceof ScalarFunction)
        {
            return getRandomVariablePropertySheet(object, itemPropertySource);
        } else {
            return super.createPropertySource(object, itemPropertySource);
        }
    }


}
