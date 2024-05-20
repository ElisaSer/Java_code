import java.util.ArrayList;
import java.util.Scanner;

public class ArrayNomiOttim {

    public static void main(String[] args) {
        
        ArrayList<String> nomi = new ArrayList<String>();

        Scanner scannerS = new Scanner(System.in);
        Scanner scannerN = new Scanner(System.in);

        System.out.println("Quanti nomi vuoi inserire nell'ArraList?");
        int numero = scannerN.nextInt();

        String nome;

        for (int i = 0; i < numero; i++) {
            System.out.println("Digita il nome:");
            nome = scannerS.nextLine();
            nomi.add(nome);
        }

        System.out.println(nomi);

        int scelta=1;
        int sceltaMenu;

        do{
            System.out.println("Digita:\n [1] per ricercare un nome; \n [2] per eliminare un nome. ");
            sceltaMenu = scannerN.nextInt();

            while ((sceltaMenu!=1 && sceltaMenu!=2)) {
                System.out.println("Numero inserito non corretto!");
                System.out.println("Digita:\\n" + //
                                " [1] per ricercare un nome; \\n" + //
                                " [2] per eliminare un nome. ");
                sceltaMenu = scannerN.nextInt();   
            }
            String ricercaNome;
            boolean presenza;

            if (sceltaMenu==1) {
                System.out.println("Digita il nome da ricercare:");
                ricercaNome = scannerS.nextLine();

                presenza = nomi.contains(ricercaNome);

                if (presenza) {
                    int indice = nomi.indexOf(ricercaNome);
                    System.out.println("Il nome è presente alla posizione: " + indice);
            
                } else {
                    System.out.println("Il nome digitato non è presente!");
                }  
            } else {
                System.out.println("Digita il nome che vuoi eliminare:");
                ricercaNome = scannerS.nextLine();
                presenza = nomi.contains(ricercaNome);

                if (presenza) {
                    int indice = nomi.indexOf(ricercaNome);
                    nomi.remove(indice);
            
                } else {
                    System.out.println("Il nome digitato non è presente!");
                }
            } 
            System.out.println("Digita:\n [1] per CONTINUARE; \n [0] per TERMINARE. ");
            scelta = scannerN.nextInt();

        } while (scelta==1);

        System.out.println(nomi);

        scannerN.close();
        scannerS.close();
    }


}
