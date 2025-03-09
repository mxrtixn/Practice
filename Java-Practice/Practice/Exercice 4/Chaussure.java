class Chaussure extends Produit {
    private int pointure;

    public Chaussure(String nom, double prix, int pointure){
        super(nom, prix, "Chaussure");
        this.pointure = pointure;
    }

    @Override
    public void afficherDetails(){
        System.out.println("Vetement - Nom: " + nom + "Prix: " + prix + "MAD, Pointure: " + pointure);
    }
}
