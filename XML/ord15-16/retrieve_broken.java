import org.w3c.dom.*;

class retrieve {
    public static void main(String[] args) {
        Document doc;
        String s;
        
        if(args.length != 1) {
            System.err.println("Usage: java retrieve <file>");
            System.exit(1);
        }
        
        doc = DOMUtil.parse(args[0]);
        s = ordinaria(doc);
        System.out.println("Ordinaria: " + s);

    }

    private static String ordinaria(Document doc) {
            Element docEl;
            NodeList nl1, nl2;
            int i1, s1, i2, s2;
            Node n1, n2;
            
            docEl = doc.getDocumentElement();
            nl1 = docEl.getChildNodes();
            s1 = nl1.getLength();
            
            for(i1 = 0; i1 < s1; i1++) {
                n1 = nl1.item(i1);
                
                //AQUI ERROR TIPICO
                //cada uno de los nodos va a ser fila E ?? NO NECESARIAMENTE
                //el primero casi seguro que no sera un elemento
                
                if(n1.getNodeType() == Node.ELEMENT_NODE) {
                    nl2 = n1.getChildNodes();
                    s2 = nl2.getLength();
                    
                    for(i2 = 0; i2 < s2; i2++) {
                        n2 = nl2.item(i2);
                        
                        if(n2.getNodeType() == Node.ELEMENT_NODE) {
                            return n2.getFirstChild().getNodeValue();
                        }
                    }
                }
            }
            return "";  //so JAVA does not complain
    }
}