public class Main {
    public static void main(String[] args) {
        Employe ing = new Ingenieur("Hamza", "ELma", "ING001", 190);
        Employe tech = new Technicien("Ayman", "ELke", "TECH001", 210);
        Employe sous = new SousEmploye("Rida", "ELanta", "SOU001", 120);

        System.out.println("Salaire Ingenieur: " + ing.calculerSalaire() + " MAD");
        System.out.println("Coût total Ingenieur: " + ((EmployeBase) ing).calculerCoutTotal() + " MAD");

        System.out.println("Salaire Technicien: " + tech.calculerSalaire() + " MAD");
        System.out.println("Coût total Technicien: " + ((EmployeBase) tech).calculerCoutTotal() + " MAD");

        System.out.println("Salaire Sous-employé: " + sous.calculerSalaire() + " MAD");
        System.out.println("Coût total Sous-employé: " + ((EmployeBase) sous).calculerCoutTotal() + " MAD");
    }
}

