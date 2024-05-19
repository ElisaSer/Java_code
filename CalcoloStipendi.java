import java.util.ArrayList;
import java.util.Scanner;

public class CalcoloStipendi {

    public static void main(String[] args) {
        
        Scanner scannerN = new Scanner(System.in);
        Scanner scannerS = new Scanner(System.in);

        System.out.println("Inserisci il numero dei mesi: ");
        int mesi =scannerN.nextInt();

        System.out.println("Inserisci la percentuale delle tasse: ");
        //float percTasse=scannerN.nextFloat();
        //percTasse = percTasse/100;
        String percTasse = scannerS.nextLine();
        percTasse = percTasse.replace("%","");
        float percTasseN = Float.parseFloat(percTasse)/100;

        ArrayList<Float> stipendiLordi = new ArrayList<Float>();
        ArrayList<Float> stipendiNetti = new ArrayList<Float>();

        float stipendioLordo;
        float stipendioNetto;
        float somma1=0;
        float somma2=0;

        for (int i = 0; i < mesi ; i++) {

            System.out.println("Inserisci lo stipendio ricevuto il mese "+ (i+1) + " : ");
            stipendioLordo = scannerN.nextInt();
            stipendiLordi.add(stipendioLordo);
            somma1 += stipendioLordo;

            stipendioNetto = stipendioLordo - stipendioLordo*percTasseN;
            stipendiNetti.add(stipendioNetto);
            somma2 += stipendioNetto;
                     
        }

        System.out.println("I tuoi stipendi lordi mensili sono:");
        System.out.println(stipendiLordi);

        System.out.println("I tuoi stipendi netti mensili sono:");
        System.out.println(stipendiNetti);

        System.out.println("Stipendio lordo totale: " + somma1);
        float media1=somma1/mesi;
        System.out.println("La media mensile lorda è: " + media1);

        System.out.println("Stipendio netto totale: " + somma2);
        float media2=somma2/mesi;
        System.out.println("La media mensile netta è: " + media2);

        scannerN.close();
        scannerS.close();

    }
}
