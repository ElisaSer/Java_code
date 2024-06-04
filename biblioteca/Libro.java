public class Libro {

    String nome;
    int copieDisp;
    int copiePres;

    public Libro(int copieDisp, int copiePres, String nome) {
        this.copieDisp = copieDisp;
        this.copiePres = copiePres;
        this.nome = nome;
    }

    public void prestaLibro(){
        if ( copieDisp == 0) {
            System.out.println("\nLibro " + nome + " non disponibile!");
        } else {
            System.out.println("\nLibro disponile. Presitito approvato.");
            // System.out.println("Copie disponibili: " + copieDisp);
            // System.out.println("Copie in prestito: " + copiePres);
            copieDisp--;
            copiePres++;
        }
    }

    public void restituisciLibro() {
        if (copiePres == 0) {
            System.out.println("\nLibro " + nome + " non in prestito!");
        } else {
            System.out.println("\nLibro restituito.");
            copieDisp++;
            copiePres--;
            
        }
    }
}
