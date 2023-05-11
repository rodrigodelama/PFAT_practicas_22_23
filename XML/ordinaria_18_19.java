package XML;

public class ordinaria_18_19 {
	int ordinaria(Document doc) {
		Element docEl;
		int contador, i1, sl1, i1, s2;
		NodeList nl1,
		
		contador = 0;
		
		docEl = doc.getDocumentElement();
		nl1 = docEl.getChildNodes();
		
		s1 = nl1.getLength();
		
		for(i1 = 0; i1 < s1; i1++) {
			n1 = nl1.item(i1);
			
			if(n1.getNodeType() == Node.ELEMENT_NODE) {
				nl2 = n1.getChildNodes();
				s1 = nl2.getLength();
				
				for(i2 = 0; i2 < s2; i2++) {
					n2 = nl2.item(i2);
					
					if(n2.getNodetype() == Node.ELEMENT_NODE) {
						if(n2.getNodeName().equals("transmision")) {
							el = (Element) n2;
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