package pack;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DomParser {
	public List<Country> parse(Document document) throws FileNotFoundException, XMLStreamException {
		NodeList nodeList = document.getElementsByTagName("Country");
		List<Country> countries = new ArrayList<Country>();
		for (int i = 0; i < nodeList.getLength(); i++) {
			countries.add(getCountry(nodeList.item(i)));
		}
		return countries;
	}

	private static Country getCountry(Node node) {
		Country employee = new Country();
		Element element = (Element) node;
		employee.setId(Integer.parseInt(element.getAttribute("id")));
		employee.setCode(getTagValue("Code", element));
		employee.setName(getTagValue("Name", element));
		employee.setDescription(getTagValue("Description", element));
		return employee;
	}

	private static String getTagValue(String tag, Element element) {
		NodeList nodeList = element.getElementsByTagName(tag).item(0).getChildNodes();
		Node node = nodeList.item(0);
		return node.getNodeValue();
	}
}
