package be.ephec.java.cours06.generiques.joker;

import be.ephec.java.cours06.generiques.paire.Paire;

public class Programme {
    public static void main(String[] args) {
        Paire<Etudiant> pe = new Paire<>(new Etudiant("Marc"), new Etudiant("William"));
        Paire<Personne> pp = new Paire<>(new Personne("Alice"), new Personne("Bob"));
        Paire<? extends Personne> pm = new Paire<>(new Personne("Charlie"), new Etudiant("Radouane"));

        System.out.println("Affichage de la paire d'étudiants");
        affichePaire(pe);
        System.out.println("Affichage de la paire de personnes");
        affichePaire(pp);
        System.out.println("Affichage de la paire mixte");
        affichePaire(pm);
    }

    private static void affichePaire(Paire<? extends Personne> paire) {

        System.out.println(paire.getPremier());
        System.out.println(paire.getSecond());
    }
}
