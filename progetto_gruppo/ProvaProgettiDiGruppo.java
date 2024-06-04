
import java.util.ArrayList;
import java.util.Scanner;

public class ProvaProgettiDiGruppo {

    public static void main(String[] args) {
        
        Scanner scannerS = new Scanner(System.in);
        Scanner scannerN = new Scanner(System.in);

        
        boolean running = true;
        int choice;
        int numeroUtenti = 0, numeroDolci=0;

        Negozio negozio = new Negozio();
        
        while (running) {
            
            menu();
            
            choice = scannerN.nextInt();
            switch (choice) {
                case 1:
                    String id, nome;
                    System.out.print("\nQuanti utenti vuoi inserire? ");
                    numeroUtenti = scannerN.nextInt();

                    for (int i = 0; i < numeroUtenti; i++) {
                        System.out.print("\nInserisci il tuo nome: ");
                        nome = scannerS.nextLine();

                        System.out.print("\nInserisci il tuo id: ");
                        id = scannerS.nextLine();

                        Cliente newCliente = new Cliente(id,nome);

                        negozio.aggiungiCliente(newCliente);
                    }


                    for(Cliente cliente: negozio.listaClienti){
                        System.out.println("\n nome: " +  cliente.nome + "\t id: "+ cliente.id);
                    }

                    break;
            
                case 2:
                    String nomeDolce;
                    double prezzo;

                    System.out.print("\nQuanti dolci vuoi inserire? ");
                    numeroDolci = scannerN.nextInt();

                    for (int i = 0; i < numeroDolci; i++) {
                        System.out.print("\nInserisci il nome del dolce: ");
                        nomeDolce = scannerS.nextLine();

                        System.out.print("\nInserisci il prezzo del dolce: ");
                        prezzo = scannerN.nextInt();

                        Dolce newDolce= new Dolce(nomeDolce, prezzo);

                        negozio.aggiungiDolce(newDolce);
                    }


                    for(Dolce dolce: negozio.listaDolciDisponibili){
                        System.out.println("\n Nome dolce: " +  dolce.nome + "\t Prezzo: "+ dolce.prezzo);
                    }
                    break;

                case 3:
                String eliminaDolce;

                System.out.println("Quale dolce vuoi eliminare? ");
                eliminaDolce = scannerN.nextLine();

                
                    
                    break;
                
                case 4:
                    
                    break;
                    
                case 5:
                    System.out.println("\t \t Ciao!");
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
        System.out.println("Select an option: \n");
        System.out.println("1. Aggiungi Cliente");
        System.out.println("2. Aggiungi dolce");
        System.out.println("3. Rimuovi dolce");
        System.out.println("4. Gestisci acquisto");
        System.out.println("5. Quit");

        System.out.print("\nChoise: ");
    }
}

class Negozio {
    ArrayList<Dolce>  listaDolciDisponibili;
    ArrayList<Cliente>  listaClienti;

    public Negozio() {

        listaDolciDisponibili= new ArrayList<>();
        listaClienti = new ArrayList<>();
    }

    public void aggiungiDolce(Dolce dolce) {
        listaDolciDisponibili.add(dolce);
        System.out.println("Hai aggiunto un "+ dolce.nome);
    }

    public void rimuoviDolce(Dolce dolce) {

        boolean verifica = listaDolciDisponibili.contains(dolce);

        if (verifica) {
            System.out.println("\nHai eliminato un " + dolce.nome);
            listaDolciDisponibili.remove(dolce);
        } else {
            System.out.println("\nDolce non trovato");
        }
    }

    public void aggiungiCliente(Cliente cliente) {
        listaClienti.add(cliente);
        System.out.println("Hai aggiunto il cliente " +  cliente.nome);
    }

    public void gestisciAcquisto(String idCliente, Dolce dolce) {

        boolean trovatoDolce = listaDolciDisponibili.contains(dolce);

        if(trovatoDolce ){
            for( Cliente cliente: listaClienti){
                if(cliente.id.equals(idCliente)){
                    cliente.acquistaDolce(dolce);
                    break;
                }
            }
        }       
    }
}

class Dolce {
    String nome;
    double prezzo;

    public Dolce(String nomeDolce, double prezzoDolce) {
        nome = nomeDolce;
        prezzo = prezzoDolce;
    }
}

class Cliente {
    String id, nome;
    ArrayList<Dolce>  listaDolci;

    public Cliente(String idCliente, String nomeCliente){
        id = idCliente;
        nome = nomeCliente;
        listaDolci = new ArrayList<>();
    }

    public void acquistaDolce(Dolce dolce) {
        listaDolci.add(dolce);
        System.out.println("Hai acquistato il dolce " + dolce.nome);
    }

    public void elencoAcquisti() {

        System.out.println("Lista dei dolci acquistati: ");
        for(Dolce dolcetto: listaDolci) {
            System.out.println(dolcetto.nome + ", " + dolcetto.prezzo);
        }
        
    }
}
