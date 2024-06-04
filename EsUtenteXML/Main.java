import java.io.File;
import java.util.Scanner;
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

public class Main {

    public static void main(String[] args) {
       
        User user = UserImput.createUser();

        System.out.println("\n"+user.toString());

        System.out.println("\nVuoi salvare su un file XML?\n 1. SI\n 2. NO"); 
        System.out.print("\nInserisci la tua scelta: ");
        Scanner scanner = new Scanner(System.in);
        int scelta;
        scelta = scanner.nextInt(); 

        switch (scelta) {
            case 1:
                serializeToXML(user);
                break;

            case 2:
                System.out.println("Ciao!");
                break;
        
            default:
                System.out.println("Scelta non valida!");
                break;
        }

        scanner.close();
    }

    public static void serializeToXML(User user) {

        try {

            //////////////////// BLOCCO DI PREPARAZIONE //////////////////////
            // Creare una fabbrica di costruttori di documenti // che crea una nuova istanza
            DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
            // Creare un costruttore di documenti // adesso si può creare il bean
            DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();
            // Definire un nuovo documento 
            Document document = documentBuilder.newDocument();

            // Creare l'elemento radice
            Element root = document.createElement("company");
            document.appendChild(root);

            // Creare un elemento figlio
            Element employee = document.createElement("Utente");

            root.appendChild(employee);

            // Aggiungere un attributo all'elemento employee
            employee.setAttribute("id", "1");

            // Creare e aggiungere i sotto-elementi a employee
            Element firstName = document.createElement("firstname");
            firstName.appendChild(document.createTextNode(user.getFirstName()));
            employee.appendChild(firstName);

            Element lastName = document.createElement("lastname");
            lastName.appendChild(document.createTextNode(user.getLastName()));
            employee.appendChild(lastName);

            Element email = document.createElement("email");
            email.appendChild(document.createTextNode(user.getEmail()));
            employee.appendChild(email);

            Element eta = document.createElement("age");
            eta.appendChild(document.createTextNode(""+user.getAge()));
            employee.appendChild(eta);

            // Creare l'istanza di TransformerFactory
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource domSource = new DOMSource(document);

            // Creare il file XML
            StreamResult streamResult = new StreamResult(new File("Utente.xml"));

            // Trasformare il DOM in un file XML
            transformer.transform(domSource, streamResult);

            System.out.println("\nFile XML creato con successo!");

        } catch (ParserConfigurationException pce) {
            pce.printStackTrace();
        } catch (TransformerException tfe) {
            tfe.printStackTrace();
        }
    }

    
}
