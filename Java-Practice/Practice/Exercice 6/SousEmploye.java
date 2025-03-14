public class SousEmploye extends EmployeBase {
    private static double TARIF_HORAIRE = 150;

    public SousEmploye(String nom, String prenom, String identifiant, int heuresTravaillees) {
        super(nom, prenom, identifiant, heuresTravaillees);
    }

    @Override
    public double calculerSalaire() {
        return heuresTravaillees * TARIF_HORAIRE;
    }
}
