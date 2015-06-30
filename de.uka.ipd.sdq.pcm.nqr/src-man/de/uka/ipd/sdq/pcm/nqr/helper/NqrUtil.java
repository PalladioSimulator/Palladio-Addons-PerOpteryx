package de.uka.ipd.sdq.pcm.nqr.helper;

import java.util.ArrayList;
import java.util.List;

import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.Criterion;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.DimensionType;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.DimensionTypeEnum;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.DimensionTypeNumeric;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.DimensionTypeSet;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.Element;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.NumericRange;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.Order;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.RelationSemantics;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.ScaleOfMeasure;

public class NqrUtil {

	public static double getNqrValue(Criterion criterion)
	{
		DimensionType type = criterion.getDimension().getType();
		RelationSemantics relSem = type.getRelationSemantics();
		ScaleOfMeasure scale = type.getScaleOfMeasure();
		if (type instanceof DimensionTypeSet)
		{
			DimensionTypeSet dts = (DimensionTypeSet)type;
			List<Element> elems = dts.getElements();
			List<Order> order = dts.getOrder();
			foo(elems, order);
		}
		else if (type instanceof DimensionTypeEnum)
		{
			DimensionTypeEnum dte = (DimensionTypeEnum)type;
			List<Element> elems = dte.getElements();
			List<Order> order = dte.getOrder();
		}
		else if (type instanceof DimensionTypeNumeric)
		{
			DimensionTypeNumeric dtn = (DimensionTypeNumeric)type;
			NumericRange range = dtn.getRange();
		}
		throw new RuntimeException("Wrong DimensionType!");
	}
	
	public static double foo(List<Element> elems, List<Order> order)
	{
		Element[] rankedElements = rankElements(elems, order);
		
		return 0.0;
	}
	
	public static Element[] rankElements(List<Element> elems, List<Order> order)
	{
		Element[] resultOrder = new Element[order.size() - 1];
		for (Element elem: elems)
		{
			ArrayList<Order> tmpOrder = new ArrayList<Order>();
			for (Order ord: order)
			{
				tmpOrder.add(ord);
			}
			for (Order ord: tmpOrder)
			{
				if (ord.getSmallerElement().equals(elem))
						tmpOrder.remove(ord);
			}
			int elemNr = tmpOrder.size();
			for (Order ord: tmpOrder)
			{
				if (ord.getBiggerElement().equals(elem))
						resultOrder[elemNr] = elem;
			}
		}
		return resultOrder;
	}
}
