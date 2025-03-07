package CompteBancaire;
public class CompteBancaire {
    private double solde;

    
    public CompteBancaire(double montantInitial) {
        this.solde = montantInitial;
    }

    
    public double getSolde() {
        return solde;
    }

    
    public void deposer(double montant) {
        solde += montant;
    }

    
    public void retirer(double montant) {
        if (solde >= montant) {
            solde -= montant;
        } else {
            System.out.println("Solde insuffisant !");
        }
    }
}

