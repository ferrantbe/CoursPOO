package be.ephec.java.cours02.jeuDeCartes;

public class Programme {
    public static void main(String[] args) {
        JeuDeCartes jeu = new JeuDeCartes();
        System.out.println(jeu);

        jeu.melange();
        System.out.println(jeu);
    }
}
