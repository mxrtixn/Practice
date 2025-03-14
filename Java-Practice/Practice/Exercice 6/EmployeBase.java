public abstract class EmployeBase implements Employe {
    protected String nom;
    protected String prenom;
    protected String identifiant;
    protected int heuresTravaillees;

    public EmployeBase(String nom, String prenom, String identifiant, int heuresTravaillees) {
        this.nom = nom;
        this.prenom = prenom;
        this.identifiant = identifiant;
        this.heuresTravaillees = heuresTravaillees;
    }

    public abstract double calculerSalaire();

    public double calculerCoutTotal() {
        return calculerSalaire() * 1.15; // Ajout de 15% de charges sociales
    }
}
