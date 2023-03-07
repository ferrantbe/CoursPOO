package be.ephec.java.cours05.employes;

public class TechnARisque extends Technicien implements EmployeARisque {
    public TechnARisque(String prenom, String nom, int age, String entreeEnService, int unitesProduites) {
        super(prenom, nom, age, entreeEnService, unitesProduites);
    }

    @Override
    public double calculerSalaire() {
        return super.calculerSalaire() + this.PRIME_DE_RISQUE;
    }
}
