package de.uka.ipd.sdq.dsexplore.helper;

import java.util.Comparator;

import org.palladiosimulator.pcm.core.entity.Entity;

public class EntityComparator implements Comparator<Entity> {

    @Override
    public int compare(final Entity arg0, final Entity arg1) {
        return arg0.getId().compareTo(arg1.getId());
    }
}
