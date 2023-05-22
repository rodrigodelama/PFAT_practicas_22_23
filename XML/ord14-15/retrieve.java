import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.IOException;
import org.xml.sax.SAXException;

class retrieve {
    public static void main(String[] args) {
        Document doc;
        String referencia;
        int s;

        if (args.length != 1) {
            System.err.println("Usage: java retrieve <file>");
            System.exit(1);
        }

        try {
            doc = parse(args[0]);
            referencia = parse(args[1]);
            s = ordinaria(doc, referencia);
            System.out.println("Ordinaria: " + s);
        } catch (ParserConfigurationException | IOException | SAXException e) {
            e.printStackTrace();
        }
    }

    private static Document parse(String filePath) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        return builder.parse(filePath);
    }

    private static String ordinaria(Document doc, String referencia) {
        Element el1, el2, docEl;
        NodeList nl1, nl2;
        int i1, len1, i2, len2;
        Node n1, n2;
        
        docEl = doc.getDocumentElement();
        nl1 = docEl.getChildNodes();
        len1 = nl1.getLength();

        if (len1 > 0) {
            for(i1 = 0; i1 < len1; i1++) {
                n1 = nl1.item(i1);
                if (n1.getNodeType() == Node.ELEMENT_NODE) {
                    el1 = (Element) n1;
                    if (el1.getAttribute("id").equals(referencia)) {
                        nl2 = el1.getChildNodes();
                        len2 = nl2.getLength();

                        for(i2 = 0; i2 < len2; i2++) {
                            n2 = nl2.item(i2);

                            if (n2.getNodeType() == Node.ELEMENT_NODE) {
                                el2 = (Element) n2;
                                if (el2.getNodeName().equals("nombre")) {
                                    System.out.println("Nombre encontrado: ");
                                    return el2.getFirstChild().getNodeValue();
                                }
                            }
                        }
                    }
                }
            }
        }
        return "";
    }
}
