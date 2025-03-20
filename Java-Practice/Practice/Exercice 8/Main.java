public class Main {
    public static void main(String[] args) {
        Stock stock = new Stock();

        Produit p1 = new Produit("Ordinateur",  4000);
        Produit p2 = new Produit("Clavier", 140);
        Produit p3 = new Produit("Souris", 80);

        stock.ajouterProduit(p1);
        stock.ajouterProduit(p2);
        stock.ajouterProduit(p3);

        System.out.println("Liste des produits dans le stock :");
        stock.afficherProduits();

        System.out.println("\nSuppression du produit 'Clavier'");
        stock.supprimerProduit("Clavier");

        System.out.println("\nListe des produits après suppression :");
        stock.afficherProduits();
    }
}


