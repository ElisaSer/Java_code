
import java.util.Scanner;

public class UserImput {



    public static User createUser(){
     
        Scanner scannerN = new Scanner(System.in);
        Scanner scannerS = new Scanner(System.in);

        System.out.print("\nInserisci il nome: ");
        String nome = scannerS.nextLine();

        while (nome.isEmpty()) {
            System.out.print("\nCampo vuoto! Inserisci nome: ");
            nome = scannerS.nextLine();
        }

        System.out.print("\nInserisci il cognome: ");
        String cognome = scannerS.nextLine();

        while (cognome.isEmpty()) {
            System.out.print("\nCampo vuoto! Inserisci cognome: ");
            cognome = scannerS.nextLine();
        }

        System.out.print("\nInserisci la tua email: ");
        String email = scannerS.nextLine();

        while (email.isEmpty()) {
            System.out.print("\nCampo vuoto! Inserisci email: ");
            email = scannerS.nextLine();
        }
      
        System.out.print("\nInserisci età: ");
        int age = scannerN.nextInt();
            
        while (age<=0) {
            System.out.print("\nCampo vuoto o non valido! Inserisci età: ");
            age = scannerN.nextInt();
        }

        // scannerN.close();
        // scannerS.close();

        User newUser = new User(nome, cognome, email, age);

        return newUser;
    }

}
