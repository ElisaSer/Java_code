class Amministrativo extends Dipendente{


    public Amministrativo (String nome, double stipendio) {
        super(nome,stipendio);
    }

    @Override
    public void calcolabonus() {
        double bonus;
        bonus = stipendio*0.1;
        System.out.println("\nBonus Amministrativo: " + bonus);
        
    }

}