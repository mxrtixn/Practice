import java.util.ArrayList;


public class Stock {
    private ArrayList<Produit> produits;

    public Stock() {
        this.produits = new ArrayList<>();
    }

    public void ajouterProduit(Produit produit) {
        produits.add(produit);
    }

    public void afficherProduits() {
        for (Produit produit : produits) {
            produit.afficher();
        }
    }

    public Produit rechercherProduit(String nom) {
        for (Produit produit : produits) {
            if (produit.getNom().equals(nom)) {
                return produit;
            }
        }
        return null;
    }

    public void supprimerProduit(String nom) {
        Produit produit = rechercherProduit(nom);
        if (produit != null) {
            produits.remove(produit);
        }
    }
}

