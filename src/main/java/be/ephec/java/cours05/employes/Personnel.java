package be.ephec.java.cours05.employes;

import java.util.ArrayList;
import java.util.List;

public class Personnel {
    List<Employe> employes = new ArrayList<>();

    public void ajouterEmploye(Employe employe) {
        employes.add(employe);
    }


    public void afficherSalaires() {
        for (Employe e : employes)
            System.out.println(new StringBuffer(e.getNom())
                    .append(" gagne ")
                    .append(e.calculerSalaire()));
    }

    public double salaireMoyen() {
        int nbEmployes = employes.size();
        double salaireTotal = 0;
        for (Employe e : employes)
            salaireTotal += e.calculerSalaire();
        return salaireTotal / nbEmployes;

    }
}
