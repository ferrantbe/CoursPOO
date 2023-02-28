package be.ephec.java.cours04.clone;

import java.util.ArrayList;
import java.util.List;

public class Classe {
    String nom;
    private List<Etudiant> etudiants = new ArrayList();

    public Classe(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer(nom).append('\n');
        sb.append("etudiants=").append(etudiants);
        return sb.toString();
    }

    public void addEtudiant (Etudiant etudiant) {
        etudiants.add(etudiant);
    }

    public List<Etudiant> getEtudiants() {
        return etudiants;
    }

/*
    @Override
    public Classe clone() {
        return null;
    }
*/
}

