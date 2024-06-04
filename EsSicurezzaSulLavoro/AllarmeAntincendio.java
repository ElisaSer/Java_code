public class AllarmeAntincendio implements DispositivoDiSicurezza{
    private boolean stato;

    @Override
    public void attivato(){
        System.out.println("Allarme attivato");
        stato=true;
    }

    @Override
    public void disattivato(){
        System.out.println("Allarme disattivato");
        stato=false;
    }

    @Override
    public void controllo(){
        if (stato) {
            System.out.println("Allarme attivo");
        } else {
            System.out.println("Allarme non attivo");
        }

    }


}
