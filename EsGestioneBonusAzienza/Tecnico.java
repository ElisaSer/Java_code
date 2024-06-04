class Tecnico extends Dipendente{


    public Tecnico (String nome, double stipendio) {
        super(nome,stipendio);
    }

    @Override
    public void calcolabonus() {
        double bonus;
        bonus = stipendio*0.15;
        System.out.println("\nBonus Tecnico: " + bonus);
        
    }

}
