package br.ufes.inf.nemo.ontouml.ontoumlprime.converter;

import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.nodemodel.INode;

public class CardinalityUpperBoundConverter implements IValueConverter<Integer> {

	@Override
	public Integer toValue(String cardinality, INode node)
			throws ValueConverterException {
		if (cardinality == "*") {
			return -1;
		} else {
			try {
				return Integer.parseInt(cardinality);
			} catch (Exception e) {
				throw new ValueConverterException(String.format(
						"Invalid cardinality: %s", cardinality), node, e);
			}
		}
	}

	@Override
	public String toString(Integer value) throws ValueConverterException {
		if (value == -1) {
			return "*";
		} else {
			return value.toString();
		}
	}

}
