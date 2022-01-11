package de.uka.ipd.sdq.dsexplore.launch;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.palladiosimulator.pcm.usagemodel.UsageModel;

import de.uka.ipd.sdq.dsexplore.analysis.IAnalysisQualityAttributeDeclaration;
import de.uka.ipd.sdq.dsexplore.helper.ExtensionHelper;
import de.uka.ipd.sdq.dsexplore.launch.DSEConstantsContainer.QualityAttribute;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.QMLContractType;
import de.uka.ipd.sdq.dsexplore.qml.handling.QMLConstantsContainer;
import de.uka.ipd.sdq.dsexplore.qml.pcm.datastructures.EvaluationAspectWithContext;
import de.uka.ipd.sdq.dsexplore.qml.pcm.reader.PCMDeclarationsReader;
import de.uka.ipd.sdq.dsexplore.qml.reader.QMLDimensionReader;

/**
 * The QMLManager component can be queried for getting the currently activated QML criteria.
 * Based on the activated criteria, it de-/activates evaluators in the launch configuration
 * tabs.
 *
 * TODO: this class seems to slow-down the opening of the launch configuration tab tremendously and needs to be profiled.
 * TODO: this class and the QML plugin have their own methods to access files based on the filename Strings in the launch config. It would be better to add an abstraction layer (maybe use DSEWriter).
 *
 * @author martens, noorshams
 *
 */
/*
 * Probably it will be useful to create a default contract (not only contract
 * type and declaration) that optimises performance, reliability and costs that
 * can be referenced as a default. Put that one in PCMMODELS
 * (cf. glassfish.repository, it is in
 * https://sdqweb.ipd.uka.de/svn/code/Palladio.EMFComponentModel/trunk/de.uka.ipd.sdq.pcm.resources/defaultModels)
 * ->
 * noorshams: Not possible since you need one profile for *every* UsageModel. See
 * https://sdqweb.ipd.uka.de/svn/code/Palladio.DesignSpaceExploration/trunk/de.uka.ipd.sdq.dsexplore.constrainthandling.qmldeclarations
 * for examples and default declarations
 */

public class QMLManager {

    /** Logger for log4j. */
    private static Logger logger =
            Logger.getLogger("de.uka.ipd.sdq.dsexplore");

    protected List<DSEAnalysisMethodTab> tabs = new ArrayList<>();

    /**
     * Indicates if {@code processQMLFile(String, String)} was successful.
     */
    protected boolean qmlLoaded = false;
    protected String diagnosis = null;
    protected PCMDeclarationsReader pcmReader;
    protected QMLDimensionReader dimensionReader = new QMLDimensionReader();
    protected String currentQMLPath = "";
    protected String currentUsageModelPath = "";


    protected DSEAnalysisMethodTab costTab = null;
    protected DSEAnalysisMethodTab pofodTab = null;
    protected DSEAnalysisMethodTab performanceTab = null;
    protected DSEAnalysisMethodTab securityTab = null;
    protected DSEAnalysisMethodTab nqrTab = null;
    protected DSEAnalysisMethodTab reasoningTab = null;
    protected DSEAnalysisMethodTab confidentialityTab = null;

    //Set to ensure uniqueness of entries
    protected Set<EvaluationAspectWithContext> objectives = Collections.synchronizedSet(new HashSet<EvaluationAspectWithContext>(5));

    public List<EvaluationAspectWithContext> getActivatedObjectives(){
        List<EvaluationAspectWithContext> returnList = new ArrayList<>(this.objectives);
        return returnList;
    }

    public boolean hasActivatedObjectives(){
        return this.objectives.size() > 0;
    }

    /**
     * Add tabs to be de-/activates here.
     *
     * @param tabs
     */
    public void addTabs(DSEAnalysisMethodTab... tabs) {
        for(DSEAnalysisMethodTab tab : tabs) {
            this.tabs.add(tab);
            if(tab.getId().equals(QualityAttribute.PERFORMANCE_QUALITY.getName())) {
                this.performanceTab = tab;
            } else if(tab.getId().equals(QualityAttribute.COST_QUALITY.getName())) {
                this.costTab = tab;
            } else if(tab.getId().equals(QualityAttribute.RELIABILITY_QUALITY.getName())) {
                this.pofodTab = tab;
            } else if(tab.getId().equals(QualityAttribute.SECURITY_QUALITY.getName())) {
                this.securityTab = tab;
            } else if(tab.getId().equals(QualityAttribute.NQR_QUALITY.getName())) {
                this.nqrTab = tab;
            } else if (tab.getId().equals(QualityAttribute.REASONING_QUALITY.getName())) {
                this.reasoningTab = tab;
            } else if (tab.getId()
                .equals(QualityAttribute.Confidentiality.getName())) {
                this.confidentialityTab = tab;
            }
        }
    }

    /**
     * Reads QML definitions and activates or deactivates extensions in the tabs
     * based on the definitions. If processing is successful,
     * {@code isQMLLoaded()} returns {@code true}.
     *
     * @param qmlFilePath
     * @param usageModelFilePath
     */
    public void processQMLFile(String qmlFilePath, String usageModelFilePath){

        if (this.currentQMLPath.equals(qmlFilePath) && this.currentUsageModelPath.equals(usageModelFilePath)) {
            return;
        }

        this.currentQMLPath = qmlFilePath;
        this.currentUsageModelPath = usageModelFilePath;

        this.qmlLoaded = false;
        this.objectives.clear();
        deactivateAllTabs();

        ResourceSet rs = new ResourceSetImpl();

        UsageModel usageModel = null;
        try {
            URI uri = URI.createURI(usageModelFilePath);
            if (!uri.isPlatform() && !(usageModelFilePath.indexOf("://") >= 0)) {
                uri = URI.createFileURI(usageModelFilePath);
            }
            Resource r = rs.getResource(uri, true);
            List<?> contents = r.getContents();
            //Supposed to be exactly one element
            for (Iterator<?> iterator = contents.iterator(); iterator.hasNext();) {
                Object object = iterator.next();
                if (object instanceof UsageModel) {
                    usageModel = (UsageModel) object;
                    break;
                }
            }
        } catch (Exception e) {
            logger.error("Could not load usage model from " + usageModelFilePath + ". Error was: " + e.getClass() + " " + e.getMessage());
            e.printStackTrace();
        }
        if (usageModel == null) {
            this.diagnosis = "Could not load usage model from " + usageModelFilePath + "! Please check the UsageModel file and path!";
            return;
        }

        if (!fileExists(qmlFilePath)
                || !qmlFilePath.endsWith(DSEConstantsContainer.QML_DEFINITION_EXTENSION.substring(
                        DSEConstantsContainer.QML_DEFINITION_EXTENSION.lastIndexOf('.'),
                        DSEConstantsContainer.QML_DEFINITION_EXTENSION.length()))) {
            this.diagnosis = "Could not load qml definition model! Please check the path!";
            return;
        }

        this.pcmReader = new PCMDeclarationsReader(qmlFilePath);
        List<IExtension> exts = new ArrayList<>();
        int init;

        //Activate or deactivate Evalutators depending on the qml definitions
        //COST
        {
            List<EvaluationAspectWithContext> costObjectives = this.pcmReader.getDimensionObjectiveContextsForUsageModel(usageModel, this.dimensionReader.getDimension(QMLConstantsContainer.QUALITY_ATTRIBUTE_DIMENSION_TOTAL_COST_DEFINITION_PATH).getId());
            costObjectives.addAll(this.pcmReader.getDimensionObjectiveContextsForUsageModel(usageModel, this.dimensionReader.getDimension(QMLConstantsContainer.QUALITY_ATTRIBUTE_DIMENSION_INITIAL_COST_DEFINITION_PATH).getId()));
            costObjectives.addAll(this.pcmReader.getDimensionObjectiveContextsForUsageModel(usageModel, this.dimensionReader.getDimension(QMLConstantsContainer.QUALITY_ATTRIBUTE_DIMENSION_OPERATING_COST_DEFINITION_PATH).getId()));
            List<EvaluationAspectWithContext> costConstraints = this.pcmReader.getDimensionConstraintContextsForUsageModel(usageModel, this.dimensionReader.getDimension(QMLConstantsContainer.QUALITY_ATTRIBUTE_DIMENSION_TOTAL_COST_DEFINITION_PATH).getId());
            costConstraints.addAll(this.pcmReader.getDimensionConstraintContextsForUsageModel(usageModel, this.dimensionReader.getDimension(QMLConstantsContainer.QUALITY_ATTRIBUTE_DIMENSION_INITIAL_COST_DEFINITION_PATH).getId()));
            costConstraints.addAll(this.pcmReader.getDimensionConstraintContextsForUsageModel(usageModel, this.dimensionReader.getDimension(QMLConstantsContainer.QUALITY_ATTRIBUTE_DIMENSION_OPERATING_COST_DEFINITION_PATH).getId()));
            List<EvaluationAspectWithContext> costCriteria = new ArrayList<>();
            costCriteria.addAll(costObjectives);
            costCriteria.addAll(costConstraints);
            exts.clear();
            init = 0;
            findExtensionsForAspect(exts, init, costCriteria);
            activateTab(exts, costObjectives, this.costTab);
        }
        //POFOD
        {
            List<EvaluationAspectWithContext> pofodObjectives = this.pcmReader.getDimensionObjectiveContextsForUsageModel(usageModel, this.dimensionReader.getDimension(QMLConstantsContainer.QUALITY_ATTRIBUTE_DIMENSION_POFOD_DEFINITION_PATH).getId());
            List<EvaluationAspectWithContext> pofodConstraints = this.pcmReader.getDimensionConstraintContextsForUsageModel(usageModel, this.dimensionReader.getDimension(QMLConstantsContainer.QUALITY_ATTRIBUTE_DIMENSION_POFOD_DEFINITION_PATH).getId());
            List<EvaluationAspectWithContext> pofodCriteria = new ArrayList<>();
            pofodCriteria.addAll(pofodObjectives);
            pofodCriteria.addAll(pofodConstraints);
            exts.clear();
            init = 0;
            findExtensionsForAspect(exts, init, pofodCriteria);
            activateTab(exts, pofodObjectives, this.pofodTab);
        }
        //		Security
        {

            /* try to load security. Fail with only a log statement if the dimension file is not there for compatibility with PCM 3.4*/
            List<EvaluationAspectWithContext> securityObjectives = null;
            try {

                securityObjectives = this.pcmReader.getDimensionObjectiveContextsForUsageModel(usageModel, this.dimensionReader.getDimension(QMLConstantsContainer.QUALITY_ATTRIBUTE_DIMENSION_SECURITY_PATH).getId());
                List<EvaluationAspectWithContext> securityConstraints = this.pcmReader.getDimensionConstraintContextsForUsageModel(usageModel, this.dimensionReader.getDimension(QMLConstantsContainer.QUALITY_ATTRIBUTE_DIMENSION_SECURITY_PATH).getId());
                List<EvaluationAspectWithContext> securityCriteria = new ArrayList<>();
                securityCriteria.addAll(securityObjectives);
                securityCriteria.addAll(securityConstraints);
                exts.clear();
                init = 0;
                findExtensionsForAspect(exts, init, securityCriteria);
            } catch (Exception e){
                logger.warn("Security dimension file could not be loaded. Ignoring it.");
                e.printStackTrace();
                exts.clear();
            }
            activateTab(exts, securityObjectives, this.securityTab);
        }
        //NQR
        {

            List<EvaluationAspectWithContext> nqrObjectives = new ArrayList<>();
            List<EvaluationAspectWithContext> nqrConstraints = new ArrayList<>();
            try {
                QMLContractType contractTypeForUsageModel = this.pcmReader.getContractTypeForUsageModel(usageModel);
                for (de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.Dimension dim: contractTypeForUsageModel.getDimensions())
                {
                    nqrObjectives.addAll(this.pcmReader.getDimensionObjectiveContextsForUsageModel(usageModel, dim.getId()));
                    nqrConstraints.addAll(this.pcmReader.getDimensionConstraintContextsForUsageModel(usageModel, dim.getId()));
                }
                List<EvaluationAspectWithContext> nqrCriteria = new ArrayList<>();
                nqrCriteria.addAll(nqrObjectives);
                nqrCriteria.addAll(nqrConstraints);
                exts.clear();
                IExtension[] availExts = Platform.getExtensionRegistry().getExtensionPoint(
                        "de.uka.ipd.sdq.dsexplore.analysis").getExtensions();
                for (int i = 0; i < availExts.length; ++i)
                {
                    IConfigurationElement[] elements = availExts[i].getConfigurationElements();
                    for (IConfigurationElement element : elements) {
                        if (element.getName().equals("analysis")) {
                            //return element.getAttribute("qualityAttribute");
                            if (element.getAttribute("qualityAttribute").equals("de.uka.ipd.sdq.dsexplore.nqr")) {
                                exts.add(availExts[i]);
                            }
                        }
                    }
                }
                //exts.add(exti);
            } catch (Exception e){
                logger.warn("NQR dimension file could not be loaded. Ignoring it.");
                e.printStackTrace();
                exts.clear();
            }

            //Get evaluators that can evaluate every aspect
            boolean extentionIntersection = false;
            for(EvaluationAspectWithContext aspect : nqrObjectives) {
                List<IExtension> tmp_exts = getExtensionsThatEvaluateAspect(aspect);
                if(tmp_exts.size() > 0) {
                    extentionIntersection = true;
                    //break;
                }
                else
                {
                    extentionIntersection = false;
                    break;
                }
            }
            if(this.nqrTab != null) {
                if(exts.size() == 0 || extentionIntersection) {
                    this.nqrTab.deactivate();
                } else  {
                    this.nqrTab.activate(exts);
                    for (EvaluationAspectWithContext eawc: nqrObjectives) {
                        if (!this.objectives.contains(eawc)) {
                            this.objectives.add(eawc);
                        }
                    }
                }
            }
        }
        //RESPONSE TIME bzw. Performance in general
        {
            List<EvaluationAspectWithContext> performanceObjectives =
                    this.pcmReader.getDimensionObjectiveContextsForUsageModel(usageModel, this.dimensionReader.getDimension(QMLConstantsContainer.QUALITY_ATTRIBUTE_DIMENSION_RESPONSETIME_DEFINITION_PATH).getId());
            performanceObjectives.addAll(
                    this.pcmReader.getDimensionObjectiveContextsForUsageModel(usageModel, this.dimensionReader.getDimension(QMLConstantsContainer.QUALITY_ATTRIBUTE_DIMENSION_THROUGHPUT_DEFINITION_PATH).getId()));

            List<EvaluationAspectWithContext> performanceConstraints =
                    this.pcmReader.getDimensionConstraintContextsForUsageModel(usageModel, this.dimensionReader.getDimension(QMLConstantsContainer.QUALITY_ATTRIBUTE_DIMENSION_RESPONSETIME_DEFINITION_PATH).getId());
            performanceConstraints.addAll(
                    this.pcmReader.getDimensionObjectiveContextsForUsageModel(usageModel, this.dimensionReader.getDimension(QMLConstantsContainer.QUALITY_ATTRIBUTE_DIMENSION_THROUGHPUT_DEFINITION_PATH).getId()));

            List<EvaluationAspectWithContext> performanceCriteria = new ArrayList<>(performanceObjectives.size()+performanceConstraints.size());
            performanceCriteria.addAll(performanceObjectives);
            performanceCriteria.addAll(performanceConstraints);
            exts.clear();
            init = 0;
            //Get evaluators that can evaluate every aspect
            findExtensionsForAspect(exts, init, performanceCriteria);

            activateTab(exts, performanceObjectives, this.performanceTab);
        }

        confidentialityTab();

        this.qmlLoaded = true;
    }

    private void activateTab(List<IExtension> exts, List<EvaluationAspectWithContext> objectives,
            DSEAnalysisMethodTab tab) {
        if (tab != null) {
            if (exts.size() == 0) {
                tab.deactivate();
            } else {
                tab.activate(exts);
                this.objectives.addAll(objectives);
            }
        }
    }

    private void findExtensionsForAspect(List<IExtension> exts, int init, List<EvaluationAspectWithContext> criteria) {
        for (EvaluationAspectWithContext aspect : criteria) {
            List<IExtension> tmp_exts = getExtensionsThatEvaluateAspect(aspect);
            if (init == 0) {
                // initialize
                exts.addAll(tmp_exts);
                init++;
            } else {
                // calculate intersection
                List<IExtension> removeList = new ArrayList<>();
                for (IExtension e : exts) {
                    if (!tmp_exts.contains(e)) {
                        removeList.add(e);
                    }
                }
                exts.removeAll(removeList);
            }
        }
    }

    protected void deactivateAllTabs(){
        for (DSEAnalysisMethodTab tab : this.tabs) {
            tab.deactivate();
        }
    }


    protected boolean fileExists(String path) {
        // if this is a platform URL, first resolve it to an absolute path
        if (path.startsWith("platform:")){
            try {
                URL solvedURL = FileLocator.resolve(new URL(path));
                path =  solvedURL.getPath();
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }
        File f = new File(path);
        return f.exists();
    }


    protected List<IExtension> getExtensionsThatEvaluateAspect(EvaluationAspectWithContext aspect) {
        List<IExtension> exts = ExtensionHelper.loadAnalysisExtensions(aspect.getDimension().getId());
        List<IExtension> return_list = new ArrayList<>(exts);
        for(IExtension ex : exts) {
            IConfigurationElement[] elements = ex.getConfigurationElements();
            for(IConfigurationElement e : elements) {
                IAnalysisQualityAttributeDeclaration attribute;
                try {
                    attribute = (IAnalysisQualityAttributeDeclaration)ExtensionHelper.loadExecutableAttribute(e, "qualityAttributeHandler");
                } catch (CoreException e1) {
                    return_list.clear();
                    return return_list;
                }
                if(!attribute.canEvaluateAspectForDimension(aspect.getEvaluationAspect(), aspect.getDimension())){
                    return_list.remove(ex);
                }
            }
        }
        return return_list;
    }

    private void confidentialityTab() {

    }

    /**
     * Indicates if {@code processQMLFile(String, String)} was successful.
     *
     * @return the QMLLoaded
     */
    public boolean isQMLLoaded() {
        return this.qmlLoaded;
    }

    /**
     * @return the diagnosis
     */
    public String getDiagnosis() {
        return this.diagnosis;
    }


}


