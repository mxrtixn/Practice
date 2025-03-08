public class Main {
    public static void main(String[] args) {
        // Création d'un compte bancaire avec un solde de 100 MAD
        CompteBancaire compte = new CompteBancaire(100);

        // Affichage du solde :
        System.out.println("Solde initial : " + compte.getSolde() + "MAD");

        // Déposer 50 MAD :
        compte.deposer(50);

        // Retirer 30 MAD :
        compte.retirer(30);

        // Essayer de retirer 150 MAD :
        compte.retirer(150);

        // Affichage du solde final :
        System.out.println("Solde final : " + compte.getSolde() + "MAD");
    }
}
