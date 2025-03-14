public class Technicien extends EmployeBase {
    private static final double SALAIRE_FIXE = 3500;
    private static final double PRIME = 2000;
    private static final int SEUIL_HEURES = 200;
    private static final double TARIF_HEURE_SUPP = 100;

    public Technicien(String nom, String prenom, String identifiant, int heuresTravaillees) {
        super(nom, prenom, identifiant, heuresTravaillees);
    }

    @Override
    public double calculerSalaire() {
        int heuresSupp = Math.max(0, heuresTravaillees - SEUIL_HEURES);
        return SALAIRE_FIXE + PRIME + (heuresSupp * TARIF_HEURE_SUPP);
    }
}
