public class Estintore implements DispositivoDiSicurezza {

    private boolean stato;

    @Override
    public void attivato(){
        System.out.println("Estintore attivato");
        stato=true;
    }
    @Override
    public void disattivato(){
        System.out.println("Estintore disattivato");
        stato=false;
    }

    @Override
    public void controllo(){
        if (stato) {
            System.out.println("Estintore attivo");
        } else {
            System.out.println("Estintore non attivo");
        }

    }

    public void controlloPressione(){

    }
}
