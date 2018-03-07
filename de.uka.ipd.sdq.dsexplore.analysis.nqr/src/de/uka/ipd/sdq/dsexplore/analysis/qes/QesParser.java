package de.uka.ipd.sdq.dsexplore.analysis.qes;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.palladiosimulator.qes.qualityEffectSpecification.Model;
import org.palladiosimulator.qes.qualityEffectSpecification.NQA;
import org.palladiosimulator.qes.qualityEffectSpecification.QES;
import org.palladiosimulator.qes.qualityEffectSpecification.Reasoning;
import org.palladiosimulator.qes.qualityEffectSpecification.TransformationSpecification;

public class QesParser {

    private static URI createURI(String string) {
        final URI loadFrom = URI.createURI(string);
        return loadFrom.isPlatform() ? loadFrom : URI.createFileURI(string);
    }

    private final boolean isEmpty;
    private final Model model;
    private final Set<QES> nqas;
    private final Set<QES> reasonings;

    public QesParser(String string) throws ParseException {
        this(createURI(string));
    }

    public QesParser(URI uri) throws ParseException {
        try {
            model = (Model) new XtextResourceSet().getResource(uri, true).getContents().get(0);
        } catch (final Exception e) {
            throw new ParseException(e);
        }

        assert isValid();

        final Set<QES> n = new HashSet<>();
        final Set<QES> r = new HashSet<>();
        isEmpty = (model.getSpecifications() == null) || model.getSpecifications().isEmpty();

        for (final QES specification : model.getSpecifications()) {
            for (final TransformationSpecification transformation : specification.getTransformations()) {
                if (transformation instanceof NQA) {
                    n.add(specification);
                } else if (transformation instanceof Reasoning) {
                    r.add(specification);
                }
            }
        }

        nqas = Collections.unmodifiableSet(n);
        reasonings = Collections.unmodifiableSet(r);
    }

    @Override
    public boolean equals(Object obj) {
        if ((obj == null) || (getClass() != obj.getClass())) {
            return false;
        }

        return model.equals(((QesParser) obj).model);
    }

    public Set<QES> getNqaSpecifications() {
        return nqas;
    }

    public Set<QES> getReasoningSpecifications() {
        return reasonings;
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
