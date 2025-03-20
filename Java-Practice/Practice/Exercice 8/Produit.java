public class Produit {
    private String nom;
    private double prix;

    public Produit(String nom, double prix) {
        this.nom = nom;
        this.prix = prix;
    }

    public String getNom() {
        return nom;
    }

    public void afficher() {
        System.out.println("Produit : " + nom + ", Prix : " + prix + " DH");
    }
}
