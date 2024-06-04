import java.util.ArrayList;

public class PannaCottaFrutta extends PannaCotta {
    private String frutta;

    public PannaCottaFrutta(String nome, ArrayList<String> ingredienti, double prezzo, String frutta) {
        super(nome, ingredienti, prezzo);
        this.frutta = frutta;
    }

    public String getFrutta() {
        return frutta;
    }

    public void setFrutta(String frutta) {
        this.frutta = frutta;
    }
}