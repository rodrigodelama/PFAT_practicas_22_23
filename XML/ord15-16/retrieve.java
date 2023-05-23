import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.IOException;
import org.xml.sax.SAXException;

class retrieve {
    public static void main(String[] args) {
        Document doc;
        String s;

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

    private static String ordinaria(Document doc) {
        Element docEl;
        NodeList nl1, nl2;//nl1 = hijos del nodo raíz, nl2 = hijos de los hijos del nodo raíz
        int i1, s1, i2, s2;
        Node n1, n2;

        docEl = doc.getDocumentElement();
        nl1 = docEl.getChildNodes();//hijos del nodo raíz
        s1 = nl1.getLength();

        for (i1 = 0; i1 < s1; i1++) {
            n1 = nl1.item(i1);//iteramos sobre cada hijo de la lista de hijos del nodo raíz

            if (n1.getNodeType() == Node.ELEMENT_NODE) {
                nl2 = n1.getChildNodes();
                s2 = nl2.getLength();

                for (i2 = 0; i2 < s2; i2++) {
                    n2 = nl2.item(i2); //return the 1st element's text content
                    //n2 = nl2.item(i2+1); //return the 2nd element's text content

                    if (n2.getNodeType() == Node.ELEMENT_NODE) {
                        return n2.getFirstChild().getNodeValue();
                    }
                }
            }
        }
        return "";  //so JAVA does not complain
    }
}


/*
 * import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.IOException;
import org.xml.sax.SAXException;

class retrieve {
    public static void main(String[] args) {
        Document doc;
        String s;

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

    private static String ordinaria(Document doc) {
        Element docEl;
        Node nl1 = null;
        Node nl2 = null; //nl1 = hijos del nodo raíz, nl2 = hijos de los hijos del nodo raíz
        int i1, s1, i2, s2;
        Node n1, n2;

        docEl = doc.getDocumentElement();
        nl1 = docEl.getFirstChild(); //hijos del nodo raíz
        s1 = 0;
        s2 = 0;

        // for (i1 = 0; i1 < s1; i1++) {
            do {
                nl1 = nl1.getNextSibling();
                System.out.println(nl1.getFirstChild().getNodeValue());
                s1++;
            } while(nl1 != null);
            //n1 = nl1.item(i1); //iteramos sobre cada hijo de la lista de hijos del nodo raíz

            if (nl1.getNodeType() == Node.ELEMENT_NODE) {
                //nl2 = n1.getFirstChild();
                //s2 = nl2.getLength();

                do {
                    nl2 = nl2.getNextSibling();
                    System.out.println(nl2.getFirstChild().getNodeValue());
                    s2++;
                } while(nl2 != null);
                
                // for (int j = 0; j < s2; j++) {
                //     System.out.println(nl2.item(j).getFirstChild().getNodeValue());
                // }

                // for (i2 = 0; i2 < s2; i2++) {
                    //n2 = nl2.item(i2); //return the 1st element's text content
                    //n2 = nl2.item(i2+1); //return the 2nd element's text content

                    if (nl2.getNodeType() == Node.ELEMENT_NODE) {
                        return nl2.getFirstChild().getNodeValue();
                        // return the next element after the 1st element's text content like this
                    }
                // }
            }
        //}
        return "";  //so JAVA does not complain
    }
}

 */