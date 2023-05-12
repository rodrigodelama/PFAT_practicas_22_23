import org.w3c.dom.*;

public class ordinaria_18_19 {
	int ordinaria(Document doc) {
		Element docEl, el;//primero elem raiz.
		int contador, i1, s1, i2, s2;
		NodeList nl1,nl2;
		Node n1,n2;
		contador = 0;

		docEl = doc.getDocumentElement();//Nos guardamos nodo raiz.
		nl1 = docEl.getChildNodes();//nos guardamos los hijos de ese nodo raíz.
		//nodo (atributos, todo el documento XML también, comentarios, ) != elemento (todo entre las etiquetas de inicio y final).
		//hay nodos de texto al final de cada 
		
		//todos los elementos son nodos, pero no todos los nodos son elementos.
		//los atributos son nodos  que pertenecen  un elemento pero no son parte del átbol.
		s1 = nl1.getLength();//iteramos por cada hijo hasta abajo.
		
		for(i1 = 0; i1 < s1; i1++) {
			n1 = nl1.item(i1);//devuelve un node, no un elemento.
		
			if(n1.getNodeType() == Node.ELEMENT_NODE) {
				nl2 = n1.getChildNodes();
				s1 = nl2.getLength();
				
				for(i2 = 0; i2 < s1; i2++) {
					n2 = nl2.item(i2);
					
					if(n2.getNodeType() == Node.ELEMENT_NODE) {
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