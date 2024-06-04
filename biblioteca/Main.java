
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Libro libro1 = new Libro(6, 4, "Calcolo delle probabilità");
        Libro libro2 = new Libro(3, 7, "Analisi matematica vol.1");
        Libro libro3 = new Libro(0, 10, "Analisi matematica vol.2");
        Libro libro4 = new Libro(1, 9, "Meccanica Razionale");

        Biblioteca biblioteca = new Biblioteca();

        biblioteca.aggiungiLibro(libro1);
        biblioteca.aggiungiLibro(libro2);
        biblioteca.aggiungiLibro(libro3);
        biblioteca.aggiungiLibro(libro4);

        boolean running=true;
        int scelta;
        Scanner scannerN = new Scanner(System.in);
        Scanner scannerS = new Scanner(System.in);

        int indice;
        String nome;
        int copieDisp;
        int copiePrest;

        while (running) {

            menu();
            scelta = scannerN.nextInt();

    
            switch (scelta) {
                case 1:
                    System.out.println("\nCatalogo della biblioteca: ");
                    biblioteca.stampaLibri();
                    System.out.print("\nDammi l'indice del libro che vuoi richiedere in prestito: ");
                    indice = scannerN.nextInt();
                    biblioteca.libri.get(indice-1).prestaLibro();
                    break;
            
                case 2:
                    System.out.println("\nCatalogo della biblioteca: ");
                    biblioteca.stampaLibri();
                    System.out.print("\nDammi l'indice del libro che vuoi restituire: ");
                    indice = scannerN.nextInt();
                    biblioteca.libri.get(indice-1).restituisciLibro();
                    break;
    
                case 3:
                    System.out.println("\nCatalogo della biblioteca: ");
                    biblioteca.stampaLibri();
                    break;
                
                case 4:
                    System.out.print("\nInserisci il titolo del libro: ");
                    nome = scannerS.nextLine();
                    System.out.print("Inserisci il numero delle copie disponibili del libro: ");
                    copieDisp = scannerS.nextInt();
                    System.out.print("Inserisci il numero delle copie in prestito del libro: ");
                    copiePrest = scannerS.nextInt();
                    Libro libro = new Libro(copieDisp, copiePrest, nome);
                    biblioteca.aggiungiLibro(libro);
                    break;

                case 5:
                    System.out.println("\nCatalogo della biblioteca: ");
                    biblioteca.stampaLibri();
                    System.out.print("\nDammi l'indice del libro che vuoi eliminare dal catalogo: ");
                    indice = scannerN.nextInt();       
                    biblioteca.rimuoviLibro(indice);
                    break;
    
                case 6:
                    System.out.println("********* Ciao! **********");
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
        System.out.println("1. Richiedi in prestito un libro");
        System.out.println("2. Restituisci un libro");
        System.out.println("3. Visualizza catalogo biblioteca");
        System.out.println("4. Aggiungi libro al catalogo");
        System.out.println("5. Rimuovi libro dal catalogo");
        System.out.println("6. Esci");
        System.out.print("\n ");
}
}
