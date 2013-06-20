package br.ufes.inf.nemo.ontouml.ontoumlprime.converter;

import static org.junit.Assert.*;

import org.eclipse.xtext.nodemodel.impl.LeafNode;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;

public class CardinalityUpperBoundConverterTest {

	private CardinalityUpperBoundConverter converter;
	private LeafNode node;

	@Before
	public void setUp() throws Exception {
		converter = new CardinalityUpperBoundConverter();
		node = new LeafNode();
	}

	@After
	public void tearDown() throws Exception {
		converter = null;
		node = null;
	}

	@Test
	public void toValueCanHandleUnlimitedCardinality() {
		Integer value = converter.toValue("*", node);
		assertThat(value, is(-1));
	}

	@Test
	public void toValueFromIntegerLiteral() {
		Integer value = converter.toValue("13", node);
		assertThat(value, is(13));
	}

	@Test
	public void toStringCanHandleUnlimitedCardinality() {
		String token = converter.toString(-1);
		assertThat(token, is("*"));
	}

	@Test
	public void toStringForIntegerLiteral() {
		String token = converter.toString(31);
		assertThat(token, is("31"));
	}
	
}
