import java.util.Scanner;

public class GestioneAzienda {

public static void main(String[] args) {

    boolean running=true;
    int scelta;

    Scanner scannerN = new Scanner(System.in);
    Scanner scannerS = new Scanner(System.in);
    String nome;
    double stipendio;

    while (running) {

        menu();
        scelta = scannerN.nextInt();

        switch (scelta) {
            case 1:
                System.out.print("\nInserisci il nome del Tecnico: ");
                nome = scannerS.nextLine();
                System.out.print("\nInserisci stipendio di " + nome + ": ");
                stipendio = scannerN.nextDouble();
                Tecnico tecnico = new Tecnico(nome,stipendio);
                tecnico.calcolabonus();
                break;
        
            case 2:
                System.out.print("\nInserisci il nome dell'Amministratore: ");
                nome = scannerS.nextLine();
                System.out.print("\nInserisci stipendio di " + nome + ": ");
                stipendio = scannerN.nextDouble();
                Amministrativo amministrativo = new Amministrativo(nome,stipendio);
                amministrativo.calcolabonus();
                break;

            case 3:
                System.out.print("\nInserisci il nome del Manager: ");
                nome = scannerS.nextLine();
                System.out.print("\nInserisci stipendio di " + nome + ": ");
                stipendio = scannerN.nextDouble();
                Manager manager = new Manager(nome,stipendio);
                manager.calcolabonus();
                break;

            case 4:
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
        System.out.println("1. Calcolo bonus Tecnico");
        System.out.println("2. Calcolo bonus Amministrativo");
        System.out.println("3. Calcolo bonus Manager");
        System.out.println("4. Esci");
        System.out.print("\n ");
}

}
