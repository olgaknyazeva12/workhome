package pack;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Document;

import org.xml.sax.SAXException;

public class Run2 {

	private static final String COUNTRIES_XML = "countries.xml";

	public String parserSax()
			throws ParserConfigurationException, SAXException, IOException, XMLStreamException {
		System.out.println(" ========================= SAX parser ==============================");
		SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
		SAXParser saxParser = saxParserFactory.newSAXParser();
		CountryHandler countryHandler = new CountryHandler();
		saxParser.parse(new File(COUNTRIES_XML), countryHandler);
		List<Country> countries = countryHandler.getCountries();
		return countries.get(0).getName();
//		countries.forEach(country -> System.out.println(country));
	}
	
	public static void parserStax(String[] args)
			throws ParserConfigurationException, IOException, XMLStreamException {

		System.out.println(" ============================== STAX parser =========================");
		XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
		XMLEventReader xmlEventReader = xmlInputFactory.createXMLEventReader(new FileInputStream(COUNTRIES_XML));
		CountryHandler countryHandler = new CountryHandler();
		List<Country> countries = countryHandler.getCountries();
		countries = new StaxParser().parse(xmlEventReader);
		countries.forEach(country -> System.out.println(country));
	}
	
	public static void parserDom(String[] args)
			throws ParserConfigurationException, IOException, XMLStreamException, SAXException {

		System.out.println(" ============================== DOM parser =========================");
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document document = dBuilder.parse(COUNTRIES_XML);
		CountryHandler countryHandler = new CountryHandler();
		List<Country> countries = countryHandler.getCountries();
		countries = new DomParser().parse(document);
		countries.forEach(country -> System.out.println(country));
		
	}

}
