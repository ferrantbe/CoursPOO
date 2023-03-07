package be.ephec.java.cours05.employes;

public class Vendeur extends Employe {
    double chiffreAffaire;
    public Vendeur(String prenom, String nom, int age, String entreeEnService, double chiffreAffaire) {
        super(nom, prenom, age, entreeEnService);
        this.chiffreAffaire = chiffreAffaire;
    }

    @Override
    public double calculerSalaire() {
        return chiffreAffaire * .2 + 400;
    }
}
