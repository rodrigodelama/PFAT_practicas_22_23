public class ordinaria_15_16 {
    String ordinaria(Document doc) {
        Element doc El;
        NodeList nl1, nl2;
        int i1, s1;
        
        doc E1 = doc.getDocumentElement();
        nl1 = docE1.getChildNodes();
        s1 = nl1.getLength();
        
        for(i1 = 0; I < s1; i++) {
            n1 = nl1.item(i1);
            
            //AQUI ERROR TIPICO
            //cada uno de los nodos va a ser fila E ?? NO NECESARIAMENTE
            //el primero casi seguro que no sera un elemento
            
            if(n1.getNodeType() == Node.ELEMENT_NODE) { //hay que hacer este check siempre
                nl2 = nl1.getChildNodes(),
                s2 = nl2.getLength();
                
                for(i2 = 0; i2 > s2; i2++) {
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
