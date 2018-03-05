package de.uka.ipd.sdq.dsexplore.analysis.nqr.solver;

import static org.eclipse.core.runtime.IStatus.ERROR;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.log4j.Logger;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.qualitymodel.Mapping;
import org.palladiosimulator.qualitymodel.MappingEntry;
import org.palladiosimulator.qualitymodel.Nqr;
import org.palladiosimulator.qualitymodel.QualityModelPackage;
import org.palladiosimulator.qualitymodel.QuantityReduction;
import org.palladiosimulator.qualitymodel.Reasoning;
import org.palladiosimulator.qualitymodel.ReasoningComponent;
import org.palladiosimulator.qualitymodel.ReasoningSystem;
import org.palladiosimulator.qualitymodel.Reduction;
import org.palladiosimulator.qualitymodel.Transformation;
import de.uka.ipd.sdq.dsexplore.helper.EMFHelper;
import de.uka.ipd.sdq.dsexplore.launch.DSEConstantsContainer;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.QMLContractPackage;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.SetLiteral;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.Dimension;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.DimensionTypeSet;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.Element;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.EnumRelationSemantics;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.Order;

public class NqrFactory {

    private static final Logger LOG = Logger.getLogger("de.uka.ipd.sdq.dsexplore.analysis.nqr");

    private static <T> T requireNonNull(final T object) {
        if (object == null) {
            throw new NullPointerException();
        }
        return object;
    }

    public static void collectionToString(final StringBuilder builder, final Collection<?> collection,
            final String delimiter, final String prefix, final String suffix) {
        if (builder == null) {
            return;
        }
        if (prefix != null) {
            builder.append(prefix);
        }
        if ((collection != null) && (collection.isEmpty() == false)) {
            String tmpDelimiter = "";
            for (final Object object : collection) {
                builder.append(tmpDelimiter);
                tmpDelimiter = delimiter;
                builder.append(object);
            }
        }
        if (suffix != null) {
            builder.append(suffix);
        }
    }


    private static <T> T error(final Object message) {
        LOG.warn(message);
        return null;
    }


    private static Map<String, String> loadDimensionIdNameMap(final DimensionTypeSet dimensionTypeSet) {
        final Map<String, String> idNameMap = new HashMap<String, String>();
        for (final Element element : requireNonNull(dimensionTypeSet).getElements()) {
            idNameMap.put(element.getId(), element.getEntityName());
        }
        return Collections.unmodifiableMap(idNameMap);
    }

    private static List<String> loadDimensionIdOrderList(final DimensionTypeSet dimensionTypeSet) {
        final int size = requireNonNull(dimensionTypeSet).getElements().size();
        final List<String> resultOrder = new ArrayList<String>(size);
        final Iterator<Order> iterator = dimensionTypeSet.getOrder().iterator();

        if (iterator.hasNext()) {
            final Order next = iterator.next();
            resultOrder.add(next.getBiggerElement().getId());
            resultOrder.add(next.getSmallerElement().getId());
        }
        while (iterator.hasNext()) {
            final Order next = iterator.next();
            final String biggerElement = next.getBiggerElement().getId();
            final String smallerElement = next.getSmallerElement().getId();
            if (!resultOrder.contains(biggerElement)) {
                resultOrder.add(0, biggerElement);
            }
            if (!resultOrder.contains(smallerElement)) {
                resultOrder.add(resultOrder.indexOf(biggerElement) + 1, smallerElement);
            }
        }

        if (dimensionTypeSet.getRelationSemantics().getRelSem().equals(EnumRelationSemantics.INCREASING)) {
            Collections.reverse(resultOrder);
        }
        return Collections.unmodifiableList(resultOrder);
    }

    private static Map<String, Integer> loadDimensionIdOrderMap(final List<String> loadDimensionIdOrderList) {
        final Map<String, Integer> idOrderMap = new HashMap<String, Integer>();
        int i = 0;
        for (final String element : requireNonNull(loadDimensionIdOrderList)) {
            idOrderMap.put(element, i++);
        }
        return Collections.unmodifiableMap(idOrderMap);
    }

    private static Map<Integer, String> loadDimensionOrderIdMap(final List<String> loadDimensionIdOrderList) {
        final Map<Integer, String> idOrderMap = new HashMap<Integer, String>();
        int i = 0;
        for (final String element : requireNonNull(loadDimensionIdOrderList)) {
            idOrderMap.put(i++, element);
        }
        return Collections.unmodifiableMap(idOrderMap);
    }

    private static DimensionTypeSet loadDimensionTypeSet(final String uri) throws CoreException {
        final String extension = DSEConstantsContainer.QML_CONTRACT_EXTENSION[0].substring(1);
        if ((uri != null) && uri.endsWith(extension)) {
            URI loadFrom = URI.createURI(uri);
            if (!loadFrom.isPlatform()) {
                loadFrom = URI.createFileURI(uri);
            }
            final EObject object = EMFHelper.loadFromXMIFile(loadFrom, QMLContractPackage.eINSTANCE);

            if ((object != null) && (object instanceof DimensionTypeSet)) {
                return (DimensionTypeSet) object;
            }
        }
        throw new CoreException(new Status(ERROR, "de.uka.ipd.sdq.dsexplore.analysis.nqr", 0,
                "Dimension Type Set " + String.valueOf(uri) + " could not be loaded.", null));
    }

    private static List<ReasoningComponent> loadReasoningComponents(final String uri) throws CoreException {
        final String extension = DSEConstantsContainer.REASONING_MODEL_EXTENSION[0].substring(1);
        if ((uri != null) && uri.endsWith(extension)) {
            URI loadFrom = URI.createURI(uri);
            if (!loadFrom.isPlatform()) {
                loadFrom = URI.createFileURI(uri);
            }
            final EObject object = EMFHelper.loadFromXMIFile(loadFrom, QualityModelPackage.eINSTANCE);

            if ((object != null) && (object instanceof ReasoningSystem)) {
                final List<ReasoningComponent> components = new ArrayList<ReasoningComponent>();
                final ReasoningSystem system = (ReasoningSystem) object;
                for (final Object reasoningComponent : system.getComponents()) {
                    if ((reasoningComponent != null) && (reasoningComponent instanceof ReasoningComponent)) {
                        components.add((ReasoningComponent) reasoningComponent);
                    }
                }
                return components;
            }
        }
        throw new CoreException(new Status(ERROR, "de.uka.ipd.sdq.dsexplore.analysis.nqr", 0,
                "ReductionProxy NqrFactory " + String.valueOf(uri) + " could not be loaded.", null));
    }

    private static Reduction loadReduction(final String uri) throws CoreException {
        final String extension = DSEConstantsContainer.REASONING_MODEL_EXTENSION[0].substring(1);
        if ((uri != null) && uri.endsWith(extension)) {
            URI loadFrom = URI.createURI(uri);
            if (!loadFrom.isPlatform()) {
                loadFrom = URI.createFileURI(uri);
            }
            final EObject object = EMFHelper.loadFromXMIFile(loadFrom, QualityModelPackage.eINSTANCE);

            if ((object != null) && (object instanceof Reduction)) {
                return (Reduction) object;
            }
        }
        throw new CoreException(new Status(ERROR, "de.uka.ipd.sdq.dsexplore.analysis.nqr", 0,
                "ReductionProxy NqrFactory " + String.valueOf(uri) + " could not be loaded.", null));
    }

    private static Set<Dimension> loadDimensions(final Collection<List<NqrProxy>> nqrs,
            final Collection<List<ReasoningProxy>> reasonings) {
        final Set<Dimension> dimensions = new HashSet<Dimension>();
        if (nqrs == null || reasonings == null || (nqrs.isEmpty() && reasonings == null)) {
            return Collections.unmodifiableSet(dimensions);
        }

        for (final List<NqrProxy> nqrList : nqrs) {
            if (nqrList == null || nqrList.isEmpty()) {
                continue;
            }
            for (final NqrProxy nqr : nqrList) {
                if (nqr != null && !dimensions.contains(nqr.getDimension())) {
                    dimensions.add(nqr.getDimension());
                }
            }
        }

        for (final List<ReasoningProxy> reasoningList : reasonings) {
            if (reasoningList == null || reasoningList.isEmpty()) {
                continue;
            }
            for (final ReasoningProxy reasoning : reasoningList) {
                if (reasoning != null && !dimensions.contains(reasoning.getOutput())) {
                    dimensions.add(reasoning.getOutput());
                }
            }
        }

        return Collections.unmodifiableSet(dimensions);
    }

    private Map<String, RepositoryComponent> componentIdMap;
    private Map<String, List<NqrProxy>> componentIdNqrMap;
    private Map<String, List<ReasoningProxy>> componentIdReasoningsMap;
    private final List<String> dimensionIdOrderList;
    private final Map<String, Integer> dimensionIdOrderMap;
    private final Map<Integer, String> dimensionOrderIdMap;
    protected final Map<String, String> dimensionsIdNameMap;
    private final DimensionTypeSet dimensionTypeSet;
    private String reductionIdentity;
    private Map<List<String>, String> reductionMapping;
    private final Set<Dimension> dimensions;

    public NqrFactory(final String reasoningComponentUri, final String reductionUri, final String dimensionTypeSetUri)
            throws CoreException {
        dimensionTypeSet = loadDimensionTypeSet(dimensionTypeSetUri);
        dimensionsIdNameMap = loadDimensionIdNameMap(dimensionTypeSet);
        dimensionIdOrderList = loadDimensionIdOrderList(dimensionTypeSet);
        dimensionIdOrderMap = loadDimensionIdOrderMap(dimensionIdOrderList);
        dimensionOrderIdMap = loadDimensionOrderIdMap(dimensionIdOrderList);

        setReduction(loadReduction(reductionUri));
        setReasoningComponents(loadReasoningComponents(reasoningComponentUri));

        dimensions = loadDimensions(componentIdNqrMap.values(), componentIdReasoningsMap.values());
    }

    public Element createElement(final Object object) {
        if ((object == null) || ((object instanceof SetLiteral) == false)) {
            return error("No SetLiteral");
        }

        final List<Element> values = ((SetLiteral) object).getValues();
        if ((values == null) || values.isEmpty()) {
            return error("No Element");
        }

        assert values.size() == 1;

        final Element element = values.get(0);
        if ((element == null) || (dimensionsIdNameMap.containsKey(element.getId()) == false)) {
            return error("No Element in Dimension");
        }

        return element;
    }

    public Map<List<String>, String> createMapping(final Mapping mapping, final int size) {
        if (mapping == null) {
            return null;
        }

        final Map<List<String>, String> map = new HashMap<List<String>, String>();
        for (final Object entry : mapping.getMappingEntries()) {
            if ((entry == null) || ((entry instanceof MappingEntry) == false)) {
                return null;
            }
            final MappingEntry mappingEntry = (MappingEntry) entry;

            final Element element = createElement(mappingEntry.getValue());
            if (element == null) {
                break;
            }

            final List<String> keys = new ArrayList<String>();
            for (final Object key : mappingEntry.getKey()) {
                final Element elementKey = createElement(key);
                if (elementKey == null) {
                    break;
                }
                keys.add(elementKey.getId());
            }

            if (keys.size() == size) {
                map.put(Collections.unmodifiableList(keys), element.getId());
            }
        }
        return Collections.unmodifiableMap(map);
    }

    public NqrProxy createNqrProxy(final Dimension dimension, final String element) {
        if ((dimension == null) || (element == null) || !(dimensionsIdNameMap.containsKey(element))) {
            return null;
        }
        return new NqrProxy(dimension, getElementById(element), dimensionsIdNameMap.get(element));
    }

    public NqrProxy createNqrProxy(final Object object) {
        if ((object == null) || ((object instanceof Nqr) == false)) {
            return null;
        }
        final Nqr nqr = (Nqr) object;

        final Dimension dimension = nqr.getDimension();
        if (dimension == null) {
            return null;
        }

        final Element element = createElement(nqr.getValue());
        if (element == null) {
            return null;
        }

        return new NqrProxy(dimension, element, dimensionsIdNameMap.get(element.getId()));
    }

    public NqrReductionProxy createNqrReductionProxy() {
        return new NqrReductionProxy(this);
    }


    public ReasoningProxy createReasoningProxy(final Object object) {
        if ((object == null) || ((object instanceof Reasoning) == false)) {
            return null;
        }
        final Reasoning reasoning = (Reasoning) object;

        final Dimension output = reasoning.getOutput();
        if (output == null) {
            return null;
        }

        final List<TransformationProxy> transformations = new ArrayList<TransformationProxy>();
        for (final Object transformation : reasoning.getTransformations()) {
            final TransformationProxy transformationProxy = createTransformationProxy(transformation);
            if (transformationProxy != null) {
                transformations.add(transformationProxy);
            }
        }

        if (transformations.isEmpty()) {
            return null;
        }

        return new ReasoningProxy(output, Collections.unmodifiableList(transformations), this);
    }

    public ReductionProxy createReductionProxy() {
        return (reductionMapping != null) && (reductionIdentity != null)
                ? new QuantityReductionProxy(reductionIdentity, reductionMapping, dimensionsIdNameMap)
                : new StatisticReductionProxy(dimensionsIdNameMap, dimensionOrderIdMap);
    }

    public TransformationProxy createTransformationProxy(final Object object) {
        if ((object == null) || ((object instanceof Transformation) == false)) {
            return null;
        }
        final Transformation transformation = (Transformation) object;

        final List<Dimension> input = new ArrayList<Dimension>();
        for (final Object dimension : transformation.getInput()) {
            if ((dimension == null) || input.contains(dimension) || ((dimension instanceof Dimension) == false)) {
                return null;
            }
            input.add((Dimension) dimension);
        }

        final int size = input.size();
        if (size <= 0) {
            return null;
        }

        final Map<List<String>, String> map = createMapping(transformation.getMapping(), size);

        if ((map == null) || map.isEmpty()) {
            return null;
        }

        return new TransformationProxy(Collections.unmodifiableList(input), Collections.unmodifiableMap(map),
                dimensionsIdNameMap);
    }


    public String getComponentName(final String componentId) {
        return componentIdMap.containsKey(componentId) ? String.valueOf(componentIdMap.get(componentId).getEntityName())
                : String.valueOf(componentId);
    }

    public String getDimensionId(final int dimensionOrder) {
        if (dimensionOrder <= 0) {
            return dimensionOrderIdMap.get(0);
        }
        final int max = dimensionIdOrderList.size() - 1;
        if (dimensionOrder >= max) {
            return dimensionOrderIdMap.get(max);
        }
        return dimensionOrderIdMap.get(dimensionOrder);
    }

    public String getDimensionId(final int dimensionOrder1, final int dimensionOrder2) {
        return getDimensionId((int) Math.round((dimensionOrder1 + dimensionOrder2) / 2.0));
    }

    public Map<String, Integer> getDimensionIdOrderMap() {
        return dimensionIdOrderMap;
    }

    public String getDimensionName(final String dimensionId) {
        return dimensionsIdNameMap.containsKey(dimensionId) ? String.valueOf(dimensionsIdNameMap.get(dimensionId))
                : String.valueOf(dimensionId);
    }

    public int getDimensionOrder(final String dimensionId) {
        return dimensionIdOrderMap.containsKey(dimensionId) ? dimensionIdOrderMap.get(dimensionId) : -1;
    }

    protected Element getElementById(final String id) {
        if (id != null && !id.isEmpty()) {
            for (final Element element : dimensionTypeSet.getElements()) {
                if (id.equals(element.getId())) {
                    return element;
                }
            }
        }
        return null;
    }

    protected Element getElementByName(final String name) {
        if (name != null && !name.isEmpty()) {
            for (final Element element : dimensionTypeSet.getElements()) {
                if (name.equalsIgnoreCase(element.getEntityName())) {
                    return element;
                }
            }
        }
        return null;
    }

    public List<NqrProxy> getNqrList(final String componentId) {
        if (componentIdNqrMap.containsKey(componentId)) {
            return componentIdNqrMap.get(componentId);
        }
        return Collections.unmodifiableList(new ArrayList<NqrProxy>());
    }


    public List<ReasoningProxy> getReasoningList(final String componentId) {
        if (componentIdReasoningsMap.containsKey(componentId)) {
            return componentIdReasoningsMap.get(componentId);
        }
        return Collections.unmodifiableList(new ArrayList<ReasoningProxy>());
    }


    private void setReasoningComponents(final List<ReasoningComponent> loadReasoningComponents) {
        componentIdMap = new HashMap<String, RepositoryComponent>();
        componentIdNqrMap = new HashMap<String, List<NqrProxy>>();
        componentIdReasoningsMap = new HashMap<String, List<ReasoningProxy>>();

        for (final ReasoningComponent component : loadReasoningComponents) {
            final RepositoryComponent repositoryComponent = component.getComponent();
            if (repositoryComponent != null) {
                final String id = repositoryComponent.getId();
                componentIdMap.put(id, repositoryComponent);
                final List<NqrProxy> nqrlist = new ArrayList<NqrProxy>();
                for (final Object nqr : component.getNqrs()) {
                    final NqrProxy nqrProxy = createNqrProxy(nqr);
                    if (nqrProxy != null) {
                        nqrlist.add(nqrProxy);
                    }
                }
                if (!nqrlist.isEmpty()) {
                    componentIdNqrMap.put(id, Collections.unmodifiableList(nqrlist));
                }

                final List<ReasoningProxy> reasoninglist = new ArrayList<ReasoningProxy>();
                for (final Object reasoning : component.getReasonings()) {
                    final ReasoningProxy reasoningProxy = createReasoningProxy(reasoning);
                    if (reasoningProxy != null) {
                        reasoninglist.add(reasoningProxy);
                    }
                }
                if (!reasoninglist.isEmpty()) {
                    componentIdReasoningsMap.put(id, Collections.unmodifiableList(reasoninglist));
                }
            }
        }
    }


    private void setReduction(final Reduction reduction) {
        if (reduction instanceof QuantityReduction) {
            final QuantityReduction quantityReduction = (QuantityReduction) reduction;
            reductionMapping = createMapping(quantityReduction.getMapping(), 2);
            final Element element = createElement(quantityReduction.getMapping().getIdentity());
            if ((element != null) && (reductionMapping != null)) {
                reductionIdentity = element.getId();
            } else {
                reductionIdentity = null;
            }
        } else {
            reductionMapping = null;
            reductionIdentity = null;
        }
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("Dimension [");
        String prefix = "";
        for (int i = 0; i < dimensionIdOrderList.size(); i++) {
            final String id = dimensionOrderIdMap.get(i);
            final int order = dimensionIdOrderMap.get(id);
            final String name = dimensionsIdNameMap.get(id);
            builder.append(prefix);
            prefix = ", ";
            builder.append(order).append(":").append(name);
        }
        builder.append("]").append(System.lineSeparator());
        final ReductionProxy reduction = createReductionProxy();
        builder.append(reduction.getClass().getSimpleName()).append(" ").append(reduction.toString());
        builder.append(System.lineSeparator());
        for (final String id : componentIdMap.keySet()) {
            builder.append(componentIdMap.get(id).getEntityName());
            if (componentIdNqrMap.containsKey(id)) {
                for (final NqrProxy nqr : componentIdNqrMap.get(id)) {
                    builder.append(System.lineSeparator());
                    builder.append("\t");
                    builder.append(nqr.toString());
                }
            }
            if (componentIdReasoningsMap.containsKey(id)) {
                for (final ReasoningProxy reasoning : componentIdReasoningsMap.get(id)) {
                    builder.append(System.lineSeparator());
                    builder.append("\t");
                    builder.append(reasoning.toString());
                }
            }
            builder.append(System.lineSeparator());
        }

        return builder.toString();
    }


    // public List<Dimension> getAllDimensions() {
    // return Collections.unmodifiableList(dimensions);
    // }

    protected Dimension getDimensionById(final String id) {
        if (id != null && !id.isEmpty()) {
            for (final Dimension dimension : dimensions) {
                if (id.equals(dimension.getId())) {
                    return dimension;
                }
            }
        }
        return null;
    }

    protected Dimension getDimensionByName(final String name) {
        if (name != null && !name.isEmpty()) {
            for (final Dimension dimension : dimensions) {
                if (name.equalsIgnoreCase(dimension.getEntityName())) {
                    return dimension;
                }
            }
        }
        return null;
    }

}
