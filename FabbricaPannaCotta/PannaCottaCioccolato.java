import java.util.ArrayList;

public class PannaCottaCioccolato extends PannaCotta {

    double chocoPerc;

    public PannaCottaCioccolato(String nome, ArrayList<String> ingredienti, double prezzo, double chocoPerc) {
        super(nome, ingredienti, prezzo);
        this.chocoPerc = chocoPerc;
    }

    public double getPercent() {
        return chocoPerc;
    }

    public void setPercent(double chocoPerc) {
        this.chocoPerc = chocoPerc;
    }
}
