import java.util.ArrayList;
import java.util.Scanner;

/* Dobbiamo creare un piccolo Social network ad una persona 
MINIMO  ci saranno 4 sistemi che saranno creati come metodi: 
Loggin ( password e nome)
Salvataggio di valori String nell array dell’utente
Stampa dei dati nell’array
Modifica dei dati password e nome
L’unico che potrà usarli sarà l’oggetto utente che dovrà essere sempre composto da un nome e una password, il nome dev’essere univoco 
 */

public class UtenteSocial {

    // definisco gli attributi della classe
    String nomeUtente;
    String passwordUtente;
    
    // definisco il costruttore
    public UtenteSocial(String password, String nome) {
        nomeUtente=nome;
        passwordUtente=password;
    }

    // definisco il metodo per creare l'ArrayList utente
    static void Utente(String password, String nome){

        ArrayList<String> utente = new ArrayList<String>();
        utente.add(nome);
        utente.add(password);    
        StampaUtente(utente);
    }

    // definismo il metodo per stampare l'ArrayList
    static void StampaUtente(ArrayList utente) {
        System.out.println(utente);
    }

    public static void main(String[] args) {

        boolean verifica=true;
        do{
            Scanner scannerS = new Scanner(System.in);
            Scanner scannerN = new Scanner(System.in);
            System.out.println("Inserisci nome utente:");
            String nome = scannerS.nextLine();
            System.out.println("Inserisci password:");
            String password = scannerS.nextLine();
            UtenteSocial myUtente = new UtenteSocial(password,nome);
            System.out.println(myUtente.nomeUtente+" "+myUtente.passwordUtente);

            Utente(password, nome);
         
            System.out.println("Digita:\n [1] per MODIFICARE i dati inseriti; \n [0] per USCIRE. ");
            int scelta = scannerN.nextInt();

            while ((scelta!=1 && scelta!=0)) {
                System.out.println("Numero inserito non corretto!");
                System.out.println("Digita:\n [1] per MODIFICARE i dati inseriti; \n [0] per USCIRE. ");
                scelta = scannerN.nextInt();   
            }
                
            if (scelta==1) {
                verifica=true;
            } else {
                verifica=false;
                System.out.println("Ciao!");
            }  
            scannerN.close();
            scannerS.close();          
        } while (verifica); 
            
    }
}
