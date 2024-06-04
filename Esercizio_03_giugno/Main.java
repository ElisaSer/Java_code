import Annotazioni.DeprecatedCustom;
import Annotazioni.Info;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

public class Main {
    static int counter = 0;

    public static void main(String[] args) {
        Person person1 = new Person("Eli", 2);
        Person person2 = new Person("Rob", 3);


        if (Person.class.isAnnotationPresent(Info.class)) {
            Info info = Person.class.getAnnotation(Info.class);
            System.out.println(info.author() + " " + info.version());
        }

        Method[] metodi=Person.class.getMethods();
        for (Method metodo : metodi) {
            if (metodo.isAnnotationPresent(DeprecatedCustom.class)){
                DeprecatedCustom custom=metodo.getAnnotation(DeprecatedCustom.class);
                System.out.println(custom.messaggio());
            }

        }

        serializeToXML(person1);
        serializeToXML(person2);
    }

    public static void serializeToXML(Person person) {

        try {

            //////////////////// BLOCCO DI PREPARAZIONE //////////////////////
            // Creare una fabbrica di costruttori di documenti // che crea una nuova istanza
            DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
            // Creare un costruttore di documenti // adesso si può creare il bean
            DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();
            // Definire un nuovo documento 
            Document document;

            // Creare l'elemento radice
            Element root;
            
            File file = new File("Persona.xml");
            if (file.exists()) {
                // Se il file esiste, carica il documento esistente
                document = documentBuilder.parse(file);
                root = document.getDocumentElement();
            } else {
                // Se il file non esiste, crea un nuovo documento
                document = documentBuilder.newDocument();
                root = document.createElement("Users");
                document.appendChild(root);
            }

            // Creare un elemento figlio
            Element employee = document.createElement("Person");

            root.appendChild(employee);

            // Aggiungere un attributo all'elemento employee
            employee.setAttribute("id", String.valueOf(++counter));

            // Creare e aggiungere i sotto-elementi a employee
            Element firstName = document.createElement("firstname");
            firstName.appendChild(document.createTextNode(person.getName()));
            employee.appendChild(firstName);

            Element eta = document.createElement("age");
            eta.appendChild(document.createTextNode(""+person.getAge()));
            employee.appendChild(eta);


            // Creare l'istanza di TransformerFactory
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource domSource = new DOMSource(document);

            // Creare il file XML
            StreamResult streamResult = new StreamResult(new File("Persona.xml"));

            // Trasformare il DOM in un file XML
            transformer.transform(domSource, streamResult);

            System.out.println("\nFile XML creato con successo!");

        } catch (ParserConfigurationException pce) {
            pce.printStackTrace();
        } catch (TransformerException tfe) {
            tfe.printStackTrace();
        } catch (SAXException err){
            err.printStackTrace();
        } catch (IOException err){
            err.printStackTrace();
        }
    }
}

