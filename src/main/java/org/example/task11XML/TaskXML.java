package org.example.task11XML;

import javax.xml.parsers.SAXParser;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TaskXML {
    public static void main(String[] args) {

        try {
            XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
            XMLStreamReader reader = xmlInputFactory.createXMLStreamReader(
           new FileInputStream("src/main/java/org/example/task11XML/pointList.xml"));

            String x = null;
            String y = null;

            while (reader.hasNext()) {
                int event = reader.next();

                switch (event) {
                    case XMLStreamConstants.START_ELEMENT:
                        String elementName = reader.getLocalName();

                        if (elementName.equals("x")) {
                            x = reader.getElementText();
                        } else if (elementName.equals("y")) {
                            y = reader.getElementText();
                        }
                        break;

                    case XMLStreamConstants.END_ELEMENT:
                        if (reader.getLocalName().equals("point")) {

                            System.out.println(x + "px, " + y + "px");
                        }
                        break;
                }
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (XMLStreamException e) {
            e.printStackTrace();
        }
    }
}
