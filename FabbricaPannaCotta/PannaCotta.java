import java.util.ArrayList;

public class PannaCotta {

    String nome;
    ArrayList<String> ingredienti = new ArrayList<>();
    double prezzo;

    public PannaCotta(String nome, ArrayList<String> ingredienti, double prezzo){

        this.nome = nome;
        this.ingredienti = ingredienti;
        this.prezzo = prezzo;
    }

    // Getter
    public String getName() {
        return nome;
    }

    // Setter
    public void setName(String nome) {
        this.nome = nome;
    }

    // Getter
    public ArrayList<String> getIngredienti() {
        return ingredienti;
    }

    // Setter
    public void setIgredienti(ArrayList<String> ingredienti) {
        this.ingredienti= ingredienti;
    }

    // Getter
    public double getPrezzo() {
        return prezzo;
    }

    // Setter
    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public void aggiungiIngrediente(String ingrediente) {
        ingredienti.add(ingrediente);
    }
    
}
