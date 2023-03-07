package be.ephec.java.cours05.employes;

public class Manutentionnaire extends Employe {
    private double heuresPrestees;
    public Manutentionnaire(String prenom, String nom, int age, String entreeEnService, double heuresPrestees) {
        super(nom, prenom, age, entreeEnService);
        this.heuresPrestees = heuresPrestees;
    }

    @Override
    public double calculerSalaire() {
        return 65 * heuresPrestees;
    }
}
