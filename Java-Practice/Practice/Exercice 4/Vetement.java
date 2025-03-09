class Vetement extends Produit {
    private String taille;

    public Vetement(String nom, double prix, String taille)
    {
        super(nom, prix, "Vetement");
        this.taille = taille;
    }

    @Override
    public void afficherDetails() {
        System.out.println("Vetement - Nom: " + nom + ", Prix: " + prix + "MAD, Taille: " + taille);
    }
}

