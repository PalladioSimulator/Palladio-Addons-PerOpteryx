package de.uka.ipd.sdq.pcm.nqr.helper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.Criterion;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.DimensionType;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.DimensionTypeEnum;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.DimensionTypeNumeric;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.DimensionTypeSet;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.Element;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.EnumRelationSemantics;
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
			ArrayList<Element> rankedElements = rankElements(elems, order, relSem);
			HashMap<Element, Double> smoothedElements = smoothElements(rankedElements, scale);
		}
		else if (type instanceof DimensionTypeEnum)
		{
			DimensionTypeEnum dte = (DimensionTypeEnum)type;
			List<Element> elems = dte.getElements();
			List<Order> order = dte.getOrder();
			ArrayList<Element> rankedElements = rankElements(elems, order, relSem);
			HashMap<Element, Double> smoothedElements = smoothElements(rankedElements, scale);
		}
		else if (type instanceof DimensionTypeNumeric)
		{
			DimensionTypeNumeric dtn = (DimensionTypeNumeric)type;
			NumericRange range = dtn.getRange();
		}
		throw new RuntimeException("Wrong DimensionType!");
	}
	
	public static HashMap<Element, Double> smoothElements(List<Element> elems, ScaleOfMeasure scale)
	{
		HashMap<Element, Double> resultMap = new HashMap<Element, Double>();
		return resultMap;
	}
	
	public static ArrayList<Element> rankElements(List<Element> elems, List<Order> order, RelationSemantics relSem)
	{
		assert(order.size() > 0);
		ArrayList<Element> resultOrder = new ArrayList<Element>();
		
		resultOrder.add(order.get(0).getBiggerElement());
		resultOrder.add(order.get(0).getSmallerElement());
		
		for (int i = 1; i < order.size(); ++i)
		{
			Order ord = order.get(i);
			if (!resultOrder.contains(ord.getBiggerElement()))
				resultOrder.add(0, ord.getBiggerElement());
			if (!resultOrder.contains(ord.getSmallerElement()))
				resultOrder.add(resultOrder.indexOf(ord.getBiggerElement()) + 1, ord.getSmallerElement());
					
		}
		
		if (relSem.getRelSem() == EnumRelationSemantics.INCREASING)
			Collections.reverse(resultOrder);
		return resultOrder;
	}
}
