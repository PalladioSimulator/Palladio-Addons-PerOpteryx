package de.uka.ipd.sdq.dsexplore.analysis.qes;

import org.eclipse.emf.common.util.URI;

public final class QesHelper {

    private QesHelper() {
        assert false;
    }

    private static final String WILDCARD = "_";

    public static boolean equalsIgnoreCase(final Object o1, final boolean isNot, final Object o2) {
        final String s1 = String.valueOf(o1);
        final String s2 = String.valueOf(o2);
        return s1.equalsIgnoreCase(WILDCARD) || s2.equalsIgnoreCase(WILDCARD)
                || (isNot != s1.equalsIgnoreCase(s2));
    }

    public static double doubleValue(final String s) {
        try {
            return Double.valueOf(s).doubleValue();
        } catch (final Exception e) {
            return 0.0;
        }
    }

    public static URI createUri(final String s) {
        final URI loadFrom = URI.createURI(s);
        return loadFrom.isPlatform() ? loadFrom : URI.createFileURI(s);
    }

    public static boolean isValidQesFileUri(final String uri) {
        if (uri == null || (uri.endsWith("qes") == false)) {
            return false;
        }

        try {
            return new QesParser(createUri(uri)).isValid();
        } catch (Exception e) {
            return false;
        }

    }
}
