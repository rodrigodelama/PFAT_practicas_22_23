import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.IOException;
import org.xml.sax.SAXException;

class retrieve {
    public static void main(String[] args) {
        Document doc;
        int s;

        if (args.length != 1) {
            System.err.println("Usage: java retrieve <file>");
            System.exit(1);
        }

        try {
            doc = parse(args[0]);
            s = ordinaria(doc);
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

    private static int ordinaria(Document doc) {
        Element docEl, el;
        int contador, i1, s1, i2, s2;
        NodeList nl1, nl2;
        Node n1, n2;

        contador = 0;
        
        docEl = doc.getDocumentElement();
        nl1 = docEl.getChildNodes();
        s1 = nl1.getLength();
        
        for(i1 = 0; i1 < s1; i1++) {
            n1 = nl1.item(i1);
            
            if(n1.getNodeType() == Node.ELEMENT_NODE) {
                nl2 = n1.getChildNodes();
                s2 = nl2.getLength();
                
                for(i2 = 0; i2 < s2; i2++) {
                    n2 = nl2.item(i2);
                    
                    if(n2.getNodeType() == Node.ELEMENT_NODE) {
                        if(n2.getNodeName().equals("transmision")) {
                            el = (Element) n2; //hace falta castearlo para poder usar getAttribute.
                            //si lo dejasemos sin castear, sería de tipo Node y no aceptaria getAttribute.
                            if(el.getAttribute("tipo").equals("automatica")) {
                                contador++;
                            }
                        }
                    }
                }
            }
        }
        return contador;
    }
}
