package de.uka.ipd.sdq.dsexplore.facade;

public interface IModule {

	void reset();

	IProblemExtension getProblemExtension();

	ICreateExtension getCreateExtension();

	IDecodeExtension getDecodeExtension();
}
