package com.design.pattern.structural.adapter.xmltojsonadapter;

import lombok.extern.slf4j.Slf4j;
import org.json.JSONObject;
import org.json.XML;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;

import org.w3c.dom.Document;

@Slf4j
public class XmlAdapterToJson {

    public static void main(String[] args) {
        try {
            // Input XML file
            var xmlFile = new File("input.xml");

            // Convert XML to JSON
            JSONObject json = xmlToJson(xmlFile);

            // Output JSON file
            FileWriter fileWriter = new FileWriter("output.json");
            fileWriter.write(json.toString(4)); // 4 is the number of spaces for indentation
            fileWriter.close();

            log.info("Successfully converted XML to JSON.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static JSONObject xmlToJson(File xmlFile) throws Exception {
        // Parse the XML file
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(new FileInputStream(xmlFile));
        doc.getDocumentElement().normalize();

        // Convert XML Document to String
        String xmlString = XML.toString(doc);

        // Convert XML String to JSON Object
        return XML.toJSONObject(xmlString);
    }
}
