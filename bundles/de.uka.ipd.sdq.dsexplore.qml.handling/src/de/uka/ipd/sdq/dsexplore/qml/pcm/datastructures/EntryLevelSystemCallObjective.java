package de.uka.ipd.sdq.dsexplore.qml.pcm.datastructures;

import org.opt4j.core.Objective;
import org.palladiosimulator.pcm.usagemodel.EntryLevelSystemCall;

public class EntryLevelSystemCallObjective extends Objective  implements EntryLevelSystemCallCriterion{

	private EntryLevelSystemCall entryLevelSystemCall;

	public EntryLevelSystemCallObjective(String name, Sign sign,
			EntryLevelSystemCall entryLevelSystemCall) {
		super(name, sign);
		this.entryLevelSystemCall = entryLevelSystemCall;
	}

	@Override
	public EntryLevelSystemCall getEntryLevelSystemCall() {
		return this.entryLevelSystemCall;
	}

}
