import java.util.ArrayList;


public class Biblioteca {
    
    ArrayList<Libro> libri;
    
    public Biblioteca() {
        libri = new ArrayList<>();
    }

    public void aggiungiLibro(Libro libro){
        libri.add(libro);
    }

    public void stampaLibri(){
        int i = 1;
        for (Libro libro : libri) {
            System.out.println(" "+ i + ". " + libro.nome + ", copie diponibili: " + libro.copieDisp + ", copie in prestito: " + libro.copiePres);
            i++;
        }
    }

    public void rimuoviLibro(int indice){
        libri.remove(libri.get(indice-1));
        System.out.println("\nLibro rimosso dal catalogo.");
        
    }
}
