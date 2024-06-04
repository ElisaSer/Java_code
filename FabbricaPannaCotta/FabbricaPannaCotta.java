import java.util.ArrayList;

public class FabbricaPannaCotta {

    ArrayList<PannaCotta> listaPannaCotta;

    public FabbricaPannaCotta(){
        listaPannaCotta = new ArrayList<>();
    }

    public void aggiungiVariante(PannaCotta pannaCotta){
        this.listaPannaCotta.add(pannaCotta);
    }

    public void stampa() {
        int count=0;
        for (PannaCotta pannaCotta : listaPannaCotta) {
            System.out.println("Nome: " + pannaCotta.getName() + "\t Prezzo: " + pannaCotta.getPrezzo()); 
            count++;         
        }

        if (count==0) {
            System.out.println("\n******* Catalogo vuoto ********\n");            
        }
    }

   
    public PannaCotta cerca(String nomeCerca) {
        for (PannaCotta pannaCotta : listaPannaCotta) {
            if (pannaCotta.getName().equalsIgnoreCase(nomeCerca)) {
                return pannaCotta;              
            }           
        }
        return null;
    }

    
}






