
import java.util.ArrayList;

public class Main {

    static ArrayList<DispositivoDiSicurezza> dispositivi = new ArrayList<>();

    public static void aggiungiDispositivo(DispositivoDiSicurezza dispositivo){
        dispositivi.add(dispositivo);
    }

    public static void controlloDispositivi(){
        int i=1;
        for (DispositivoDiSicurezza dispositivo : dispositivi) {
            System.out.print(i+". ");
            dispositivo.controllo();
            i++;
            
        }
    }

    public static void main(String[] args) {
        
        
        Estintore estintore = new Estintore();
        AllarmeAntincendio allarme = new AllarmeAntincendio();
        KitPronto kit =new KitPronto();
        SistemaDiventilazione ventilazione = new SistemaDiventilazione();


        aggiungiDispositivo(estintore);
        aggiungiDispositivo(allarme);
        aggiungiDispositivo(kit);
        aggiungiDispositivo(ventilazione);

        System.out.println("\n");
        System.out.println("Stato dei dispositivi:\n");
        controlloDispositivi();
        System.out.println("\n");

        estintore.attivato();
        kit.attivato();

        System.out.println("\n");
        System.out.println("Stato dei dispositivi:\n");
        controlloDispositivi();
        System.out.println("\n");


    }

}
