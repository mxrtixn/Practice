public class Main {
    public static void main(String[] args) {
        Boutique boutique = new Boutique(10);

        boutique.ajouterProduit(new Vetement("T-shirt", 40.50, "M"));
        boutique.ajouterProduit(new Chaussure("Baskets", 100.50, 40));
        boutique.ajouterProduit(new Accessoire("Casquette", 10.99, "Sport"));

        boutique.afficherProduits();
    }
}