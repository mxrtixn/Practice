abstract class Produit {
    String nom;
    double prix;
    String categorie;

    public Produit(String nom, double prix, String categorie){
        this.nom = nom;
        this.prix = prix;
        this.categorie = categorie;
    }

    public abstract void afficherDetails();
}
