import java.util.ArrayList;
import java.util.Scanner;

public class GestioneFabbricaPannaCotta {

    public static void main(String[] args) {

        Scanner scannerN = new Scanner(System.in);
        Scanner scannerS = new Scanner(System.in);

        boolean running = true;
        int scelta;

        FabbricaPannaCotta fabbricaPannaCotta = new FabbricaPannaCotta();

        while (running) {

            menu();

            scelta = scannerN.nextInt();
            
            switch (scelta) {
                case 1:
                    ArrayList<String> ingredienti = new ArrayList<>();
                    System.out.println("Inserisci il nome del prodotto: ");
                    String nome = scannerS.nextLine();
                    System.out.println("Inserisci il prezzo del prodotto: ");
                    double prezzo = scannerN.nextDouble();
                    System.out.println("Scegli il tipo: 1. Frutta, 2. Cioccolato): ");
                    int tipo = scannerN.nextInt();
                    
                    if (tipo == 1) {
                        System.out.print("Tipo di Frutta: ");
                        String tipoFrutta = scannerS.nextLine();
                        fabbricaPannaCotta.aggiungiVariante(new PannaCottaFrutta(nome, ingredienti, prezzo, tipoFrutta));
                    } else if (tipo == 2) {
                        System.out.print("Percentuale di Cioccolato: ");
                        double percentualeCioccolato = scannerN.nextDouble();                       
                        fabbricaPannaCotta.aggiungiVariante(new PannaCottaCioccolato(nome, ingredienti, prezzo, percentualeCioccolato));
                    }
                    break;

                case 2:
                    fabbricaPannaCotta.stampa();
                    break;

                case 3:
                    System.out.print("\nNome della panna cotta: ");
                    String nomeCerca = scannerS.nextLine();
                    PannaCotta pannaCotta = fabbricaPannaCotta.cerca(nomeCerca);
                    if (pannaCotta != null) {
                        System.out.println("\nTrovata!" + pannaCotta.getName() + " al prezzo di " + pannaCotta.getPrezzo() + " euro");
                    } else {
                        System.out.println("\nPanna Cotta non trovata.");
                    }
                    break;

                case 4:
                    System.out.println("**********    Ciao!   ***********");
                    running = false;
                    break;
            
                default:
                    System.out.println("Inserisci un valore valido");
                    waitInput(scannerS);
                    clearDisplay();
                    break;
            }


            
        }

        scannerN.close();
        scannerS.close();         
    }

    static void clearDisplay() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    static void waitInput(Scanner scanner) {
        System.out.print("\n\nPress Any Key To Continue...");
        scanner.nextLine();
    }

    // Funzione di stampa menù
    static void menu() {
        System.out.println("\nScegli un'opzione: \n");
        System.out.println("1. Aggiungi panna cotta");
        System.out.println("2. Visualizza il catalogo");
        System.out.println("3. Cerca panna cotta");
        System.out.println("4. Quit");
        System.out.print("\n ");
    }
}