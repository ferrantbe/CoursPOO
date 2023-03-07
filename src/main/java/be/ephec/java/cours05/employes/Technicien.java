package be.ephec.java.cours05.employes;

public class Technicien extends Employe{
    private int unitesProduites;
    public Technicien(String prenom, String nom, int age, String entreeEnService, int unitesProduites) {
        super(nom, prenom, age, entreeEnService);
        this.unitesProduites = unitesProduites;
    }

    @Override
    public double calculerSalaire() {
        return 5 * unitesProduites;
    }
}
