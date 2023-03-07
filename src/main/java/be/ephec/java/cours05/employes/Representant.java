package be.ephec.java.cours05.employes;

public class Representant extends Vendeur {
    public Representant(String prenom, String nom, int age, String entreeEnService, double chiffreAffaire) {
        super(prenom, nom, age, entreeEnService, chiffreAffaire);
    }


    @Override
    public double calculerSalaire() {
        return chiffreAffaire * .2 + 800;
    }

}
