/* Chiedere all'utente di inserire 5 nomi e aggiungerli all'ArrayList.
Stampare tutti i nomi presenti nell'ArrayList.
Chiedere all'utente un nome da cercare nell'ArrayList e indicare se il nome è presente o meno.
Chiedere all'utente un nome da rimuovere dall'ArrayList e rimuoverlo, se presente.
Stampare la lista aggiornata dei nomi. */

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayNomi {
    public static void main(String[] args) {
        
        ArrayList<String> nomi = new ArrayList<String>();

        Scanner scannerS = new Scanner(System.in);
        

        String nome;

        for (int i = 0; i < 5; i++) {
            System.out.println("Digita il nome da inserire in ArrayList:");
            nome = scannerS.nextLine();
            nomi.add(nome);
        }

        System.out.println(nomi);

        System.out.println("Digita il nome da ricercare:");
        String ricercaNome = scannerS.nextLine();

        boolean presenza = nomi.contains(ricercaNome);

        if (presenza) {
            int indice = nomi.indexOf(ricercaNome);
            System.out.println("Il nome è presente alla posizione: " + indice);
            
        } else {
            System.out.println("Il nome digitato non è presente!");
        }
        
        System.out.println("Digita il nome che vuoi eliminare:");
        ricercaNome = scannerS.nextLine();
        presenza = nomi.contains(ricercaNome);

        if (presenza) {
            int indice = nomi.indexOf(ricercaNome);
            nomi.remove(indice);
            
        } else {
            System.out.println("Il nome digitato non è presente!");
        }

        System.out.println(nomi);


        

    }

}
