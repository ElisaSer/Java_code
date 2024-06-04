public class SistemaDiventilazione implements DispositivoDiSicurezza {
    
    private boolean stato;

    
    public void attivato(){
        System.out.println("Sistema di ventilazione attivato");
        stato=true;
    }
    public void disattivato(){
        System.out.println("Sistema di ventilazione disattivato");
        stato=false;
    }
    public void controllo(){
        if (stato) {
            System.out.println("Sistema di ventilazione attivo");
        } else {
            System.out.println("Sistema di ventilazione non attivo");
        }

    }

    public void controlloFiltri(){
        System.out.println("Controllo filtri");

    }

}
