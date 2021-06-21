package Folders;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collection;

public class Folders {
    public static Collection<String> folderNames(String xml, char startingLetter) throws Exception {
//        throw new UnsupportedOperationException("Waiting to be implemented.");
        Collection<String> collection = new ArrayList<>();
        DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        InputSource src = new InputSource(new StringReader(xml));

        Document document = builder.parse(src);
        NodeList nodeList = document.getElementsByTagName("folder");
        for (int i = 0; i < nodeList.getLength(); i++){
            String foldName = nodeList.item(i).getAttributes().getNamedItem("name").getNodeValue();
            if (foldName.toCharArray()[0]==startingLetter) collection.add(foldName);
        }
        return collection;
    }

    public static void main(String[] args) throws Exception {
        String xml =
                "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
                        "<folder name=\"c\">" +
                        "<folder name=\"program files\">" +
                        "<folder name=\"uninstall information\" />" +
                        "</folder>" +
                        "<folder name=\"users\" />" +
                        "</folder>";

        Collection<String> names = folderNames(xml, 'u');
        for(String name: names)
            System.out.println(name);
    }
}
