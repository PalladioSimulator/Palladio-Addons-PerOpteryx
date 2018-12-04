package de.uka.ipd.sdq.dsexplore.analysis.qes;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.palladiosimulator.qes.qualityEffectSpecification.Model;
import org.palladiosimulator.qes.qualityEffectSpecification.NQA;
import org.palladiosimulator.qes.qualityEffectSpecification.NumericValue;
import org.palladiosimulator.qes.qualityEffectSpecification.QualityEffectSpecification;
import org.palladiosimulator.qes.qualityEffectSpecification.Reasoning;
import org.palladiosimulator.qes.qualityEffectSpecification.TransformationSpecification;

public class QesParser {

    private final boolean isEmpty;
    private final Model model;
    private final Set<QualityEffectSpecification> nqas;
    private final Set<QualityEffectSpecification> reasonings;
    private final Map<String, Set<QualityEffectSpecification>> values;

    public QesParser(final String string) throws ParseException {
        this(QesHelper.createUri(string));
    }

    public QesParser(final URI uri) throws ParseException {
        try {
            model = (Model) new XtextResourceSet().getResource(uri, true).getContents().get(0);
        } catch (final Exception e) {
            throw new ParseException(e);
        }

        assert isValid();

        isEmpty = (model.getSpecifications() == null) || model.getSpecifications().isEmpty();

        final Set<QualityEffectSpecification> n = new HashSet<>();
        final Set<QualityEffectSpecification> r = new HashSet<>();
        final Map<String, Set<QualityEffectSpecification>> v = new HashMap<>();

        for (final QualityEffectSpecification specification : model.getSpecifications()) {
            for (final TransformationSpecification transformation : specification
                    .getTransformations()) {
                if (transformation instanceof NQA) {
                    n.add(specification);
                } else if (transformation instanceof Reasoning) {
                    r.add(specification);
                } else if (transformation instanceof NumericValue) {
                    final String type = ((NumericValue) transformation).getValueType();
                    if (v.containsKey(type)) {
                        v.get(type).add(specification);
                    } else {
                        final Set<QualityEffectSpecification> specifications = new HashSet<>();
                        specifications.add(specification);
                        v.put(type, specifications);
                    }
                }
            }
        }

        nqas = Collections.unmodifiableSet(n);
        reasonings = Collections.unmodifiableSet(r);
        values = Collections.unmodifiableMap(v);
    }

    @Override
    public boolean equals(final Object obj) {
        if ((obj == null) || (getClass() != obj.getClass())) {
            return false;
        }

        return model.equals(((QesParser) obj).model);
    }

    public Set<QualityEffectSpecification> getNqaSpecifications() {
        return nqas;
    }

    public Set<QualityEffectSpecification> getReasoningSpecifications() {
        return reasonings;
    }

    public Set<QualityEffectSpecification> getSpecifications(final String key) {
        if ((key != null) && values.containsKey(key)) {
            return Collections.unmodifiableSet(values.get(key));
        }
        return Collections.unmodifiableSet(new HashSet<>());
    }

    @Override
    public int hashCode() {
        return model.hashCode();
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public boolean isValid() {
        try {
            return Diagnostician.INSTANCE.validate(model).getSeverity() <= Diagnostic.WARNING;
        } catch (final Exception e) {
            return false;
        }
    }

    @Override
    public String toString() {
        return "QesParser [" + model + "]";
    }

}
