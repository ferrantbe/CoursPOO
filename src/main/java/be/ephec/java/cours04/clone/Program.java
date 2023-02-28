package be.ephec.java.cours04.clone;

public class Program {
    public static void main(String[] args) {
        Prof ferrant = new Prof("Ferrant");
        Prof desmet = new Prof("Desmet");

        Cours java2 = new Cours("Java 2", ferrant);
        Cours java1 = new Cours("Java 1", ferrant);

        Cours math = new Cours("Math", desmet);
        Cours compta = new Cours("Compta", desmet);

        Etudiant alice = new Etudiant("Alice");
        Etudiant bob = new Etudiant("Bob");
        Etudiant charlie = new Etudiant("Charlie");

        alice.addCours(java2);
        alice.addCours(math);
        bob.addCours(java2);
        bob.addCours(compta);
        charlie.addCours(java1);

        Classe classe = new Classe("INFO1");

        classe.addEtudiant(alice);
        classe.addEtudiant(bob);
        classe.addEtudiant(charlie);

        System.out.println(classe);

        for (Etudiant etudiant : classe.getEtudiants())
            System.out.println(etudiant);
    }
}
