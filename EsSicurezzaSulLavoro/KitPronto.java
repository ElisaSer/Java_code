public class KitPronto implements DispositivoDiSicurezza{
    private boolean stato;

    @Override
    public void attivato() {
        System.out.println("Kit di pronto soccorso disponibile");
        stato=true;
    }

    @Override
    public void disattivato() {
    
        System.out.println("Kit di pronto soccorso non disponibile");
        stato=true;
    }

    @Override
    public void controllo() {
        if (stato) {
            System.out.println("Kit di pronto soccorso disponibile");
        } else {
            System.out.println("Kit di pronto soccorso non disponibile");
        }
   
    }

}
