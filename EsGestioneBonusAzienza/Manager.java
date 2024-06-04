class Manager extends Dipendente {

    public Manager (String nome, double stipendio) {
        super(nome,stipendio);
    }

    @Override
    public void calcolabonus() {
        double bonus;
        bonus = stipendio*0.2;
        System.out.println("\nBonus Manager: " + bonus);
        
    }
}
