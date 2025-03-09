class Boutique {
    private Produit[] produits;
    private int nombreProduits;

    public Boutique(int capaciteInitiale) {
        this.produits = new Produit[capaciteInitiale];
        this.nombreProduits = 0;
    }

    public void ajouterProduit(Produit p) {
        if (nombreProduits < produits.length) {
            produits[nombreProduits] = p;
            nombreProduits++;
            System.out.println(p.nom + " ajouté à la boutique.");
        } else {
            System.out.println("La boutique est pleine, impossible d'ajouter plus de produits.");
        }
    }

    // Afficher la liste des produits disponibles avec leurs détails
    public void afficherProduits() {
        if (nombreProduits == 0) {
            System.out.println("Aucun produit disponible dans la boutique.");
        } else {
            System.out.println("Produits disponibles dans la boutique :");
            for (int i = 0; i < nombreProduits; i++) {
                produits[i].afficherDetails();
            }
        }
    }
}