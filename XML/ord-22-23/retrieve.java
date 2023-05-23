import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.IOException;
import org.xml.sax.SAXException;

public class retrieve {
    
    public static void main(String[] args) {
        Document doc;
        String s;
        String provincia = "Madrid";
        String municipio = "Leganés";

        if (args.length != 1) {
            System.err.println("Usage: java retrieve <file>");
            System.exit(1);
        }

        try {
            doc = parse(args[0]);
            s = ordinaria(doc, provincia, municipio);
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

    private static String ordinaria(Document doc, String provincia, String municipio) {
        Element docEl, el1, el2, el3;
        NodeList nl1, nl2, nl3;
        int i1, len1, i2, len2, i3, len3;
        Node n1, n2, n3;
        String codigo;

        docEl = doc.getDocumentElement();
        nl1 = docEl.getChildNodes(); //hijos del nodo raíz
        len1 = nl1.getLength();

        for (i1 = 0; i1 < len1; i1++) {
            n1 = nl1.item(i1);//iteramos sobre cada hijo de la lista de hijos del nodo raíz

            if (n1.getNodeType() == Node.ELEMENT_NODE) {
                el1 = (Element) n1;
                codigo = el1.getAttribute("codigo");
                    //System.out.println(codigo);
                nl2 = n1.getChildNodes();
                len2 = nl2.getLength();

                for (i2 = 0; i2 < len2; i2++) {
                    n2 = nl2.item(i2);

                    if (n2.getNodeType() == Node.ELEMENT_NODE) {
                        if(n2.getNodeName().equals("Ubicacion")) {
                            el2 = (Element) n2;
                            if(el2.getAttribute("provincia").equals(provincia)) {
                                nl3 = n2.getChildNodes();
                                len3 = nl3.getLength();
                                
                                for (i3 = 0; i3 < len3; i3++) {
                                    n3 = nl3.item(i3);
                                    if (n3.getNodeType() == Node.ELEMENT_NODE) {
                                        el3 = (Element) n3;
                                        if (el3.getNodeName().equals("Municipio")) {
                                            if(el3.getFirstChild().getNodeValue().equals(municipio))
                                            return codigo;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return "";  //so JAVA does not complain
    }
}
