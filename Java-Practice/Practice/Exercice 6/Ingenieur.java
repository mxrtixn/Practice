public class Ingenieur extends EmployeBase {
    private static  double SALAIRE_FIXE = 9000;
    private static int SEUIL_HEURES = 180;
    private static  double TARIF_HEURE_SUPP = 200;

    public Ingenieur(String nom, String prenom, String identifiant, int heuresTravaillees) {
        super(nom, prenom, identifiant, heuresTravaillees);
    }

    @Override
    public double calculerSalaire() {
        int heuresSupp = Math.max(0, heuresTravaillees - SEUIL_HEURES);
        return SALAIRE_FIXE + (heuresSupp * TARIF_HEURE_SUPP);
    }
}
