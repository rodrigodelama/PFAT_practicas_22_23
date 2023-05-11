import org.w3c.dom.bootstrap.DOMImplementationRegistry;
import org.w3c.dom.*;
import org.w3c.dom.ls.DOMImplementationLS; 
import org.w3c.dom.ls.LSParser; 
import org.w3c.dom.ls.LSInput; 
import org.w3c.dom.ls.LSException;
import org.w3c.dom.ls.LSOutput;
import org.w3c.dom.ls.LSSerializer; 
import java.io.*;

/**
 *
 * @author jaf@it.uc3m.es
 * @author luiss@it.uc3m.es
 *
 */
public class Films {

    /* Este metodo lee un fichero XML y devuelve el objeto DOM
     Document que lo representa. */

    private Document loadDocument(String fileName) 
	throws IOException, DOMException, LSException, 
	       java.lang.ClassNotFoundException, 
	       java.lang.InstantiationException, 
	       java.lang.IllegalAccessException {

	DOMImplementationRegistry registry;
	DOMImplementation domImp;
	DOMImplementationLS domImpLS;
        LSParser parser;
        LSInput lsInp;

	registry=DOMImplementationRegistry.newInstance();
	domImp= registry.getDOMImplementation("LS 3.0");

        if (domImp==null) {
	    System.out.println("No se encuentra el modulo LS v3.0");
	    return null;
	}

        domImpLS= (DOMImplementationLS) domImp;
        parser= 
	    domImpLS.createLSParser(DOMImplementationLS.MODE_SYNCHRONOUS, 
				    "http://www.w3.org/TR/REC-xml");
                
	lsInp= domImpLS.createLSInput();
	lsInp.setByteStream(new FileInputStream(fileName));
	return parser.parse(lsInp);
    }

    private String readInput(String prompt) throws IOException {
	System.out.print(prompt);
	BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
	return stdin.readLine();
    }


    /* Metodo para volcar a un fichero el documento XML representado
       por un objeto Document */

    private void serialize(Document doc, File file) 
	throws IOException, java.lang.ClassNotFoundException, 
	       java.lang.InstantiationException, 
	       java.lang.IllegalAccessException {

	DOMImplementationRegistry registry;
	DOMImplementation domImp;
	DOMImplementationLS domls;

	registry=DOMImplementationRegistry.newInstance();
	domImp= registry.getDOMImplementation("LS 3.0");

        if (domImp==null) {
	    System.out.println("No se encuentra el modulo LS v3.0");
	    return;
	}

        domls= (DOMImplementationLS) domImp;

	LSOutput output = domls.createLSOutput();
	FileOutputStream outStream = new FileOutputStream(file);
	output.setByteStream(outStream);
        output.setEncoding("UTF-8");
	LSSerializer serializer = domls.createLSSerializer();
	serializer.write(doc, output);
	outStream.close();
    }

    public static void main(String[] args)
	throws Exception {
	Films films = new Films();
	if (args.length != 2) {
	    printHelp();
	    System.exit(1);
	}
	if ("-l".equals(args[0])) {
	    
	}
    }

    private static void printHelp() {
	System.err.println("Error: wrong command-line arguments");
	System.err.println("java Films [-l|-L|-a] file");
    }
}
