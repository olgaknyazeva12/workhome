package pack;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;

import org.junit.Assert;
import org.junit.Test;
import org.xml.sax.SAXException;

public class AppTest {

	@Test
	public void testForParser() throws ParserConfigurationException, SAXException, IOException, XMLStreamException {
		Run2 run2 = new Run2();

		String expectedName = "Россия";

		Assert.assertEquals(expectedName, run2.parserSax());
	}
}
