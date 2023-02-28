package be.ephec.java.cours04.clone;

import java.util.ArrayList;
import java.util.List;

public class Etudiant {
    private String nom;
    private final int noma;
    private static int nextNoma = 1;

    private List<Cours> cours = new ArrayList();

    public Etudiant(String nom) {
        this.nom = nom;
        this.noma = nextNoma++;
    }

    public void addCours(Cours cours) {
        this.cours.add(cours);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer().append(noma).append(" - ");
        sb.append(nom);
        return sb.toString();
    }

    public List<Cours> getCours() {
        return this.cours;
    }
}
