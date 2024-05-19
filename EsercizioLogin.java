import java.util.Scanner;

public class EsercizioLogin {

    public static void main(String[] args) {
        
        Scanner scannerN = new Scanner(System.in);
        Scanner scannerS = new Scanner(System.in);

        System.out.println("Inserisci il tuo nome:");
        String nome = scannerS.nextLine();
        String NOME = nome.toUpperCase();

        System.out.println("Benvenuto " + NOME + ".");
        System.out.println("Se desideri registrarti digita 0, per effettuare il login digita 1: ");
        int sceltaMenu = scannerN.nextInt();


        if (sceltaMenu==0) {
            System.out.println( NOME + ", per procedere con la registrazione digita un unsername di almeno 4 caratteri");
            String userNameNuovo = scannerS.nextLine();

            while (userNameNuovo.length()<4) {
                System.out.println("Username non valido! Inserirne uno accettabile:");
                userNameNuovo = scannerS.nextLine();
            }

            System.out.println("Inserisci una password valida di almeno 8 caratteri" + //
                                " tra lettere, numeri e almeno uno tra i seguenti caratteri speciali: !, #, @, *, %.");
            String passwordNuova = scannerS.nextLine();

            while (!(passwordNuova.length()>=8 && (passwordNuova.contains("!")==true || passwordNuova.contains("#")==true || passwordNuova.contains("@")==true || passwordNuova.contains("*")==true || passwordNuova.contains("%")==true))) {
                System.out.println("Attenzione! Password non valida!");
                System.out.println("Inserisci una password valida di almeno 8 caratteri" + //
                                " tra lettere, numeri e almeno uno tra i seguenti caratteri speciali: !, #, @, *, %.");
                passwordNuova = scannerS.nextLine();
            }

            System.out.println("Dati inseriti correttamente! "+ NOME + ", il tuo account è stato creato!");

        } else if (sceltaMenu==1) {

            System.out.println("Benatornato, "+ NOME +" !");

            String userNameUtente;
            String passwordUtente;

            do {
                System.out.println("Inserisci username:");
                userNameUtente = scannerS.nextLine();
            
                System.out.println("Inserisci password:");
                passwordUtente = scannerS.nextLine();

                if (!((userNameUtente.equals("Elisabetta") && passwordUtente.equals("carbonara!")))) {
                    System.out.println("Credenziali non valide!");
                }
            } while (!((userNameUtente.equals("Elisabetta") && passwordUtente.equals("carbonara!"))));           
            

            int scelta;
            int numero;

            do {
                    System.out.println( NOME + ", inserisci un numero di cui vuoi calcolare il quadrato:");
                    numero = scannerN.nextInt();
                    System.out.println("Il quadrato di "+ numero + " è " + numero*numero);

                    System.out.println( NOME + ", digita 0 per effettuare il logout, 1 per ripetere l'operazione matematica.");
                    scelta = scannerN.nextInt();

                    if (scelta==0) {
                        System.out.println("Ciao, "+ NOME +" !");
                    }

            } while (scelta==1);
                          
            
        } else {
            System.out.println("Qualcosa è andato storto!");
        }

        scannerN.close();
        scannerS.close();

    }

}
