public class CompteMobile {
    private double solde;

    public CompteMobile(double soldeInital){
        this.solde = soldeInital;
    }

    public double getSolde(){
        return solde;
    }

    public recharger(double montant){
        solde += montant;
    }

    public appeler(double montant){

    }
}
