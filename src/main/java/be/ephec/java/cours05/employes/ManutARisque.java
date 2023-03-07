package be.ephec.java.cours05.employes;

public class ManutARisque extends Manutentionnaire implements EmployeARisque {
    public ManutARisque(String prenom, String nom, int age, String entreeEnService, double heuresPrestees) {
        super(prenom, nom, age, entreeEnService, heuresPrestees);
    }

    @Override
    public double calculerSalaire() {
        return super.calculerSalaire() + this.PRIME_DE_RISQUE;
    }
}
