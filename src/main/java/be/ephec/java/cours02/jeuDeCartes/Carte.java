package be.ephec.java.cours02.jeuDeCartes;

public class Carte {
    private Couleur couleur;
    private Valeur valeur;

    public Carte(Couleur couleur, Valeur valeur) {
        this.couleur = couleur;
        this.valeur = valeur;
    }

    @Override
    public String toString() {
        return valeur + " de " + couleur;
    }
}
