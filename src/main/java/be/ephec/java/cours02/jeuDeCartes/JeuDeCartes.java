package be.ephec.java.cours02.jeuDeCartes;

import java.util.Arrays;
import java.util.Random;

public class JeuDeCartes {

    Carte[] cartes;

    public JeuDeCartes() {
        cartes = new Carte[52];
        int i = 0;
        for (Couleur c : Couleur.values())
            for (Valeur v : Valeur.values()) {
                cartes[i++] = new Carte(c, v);
            }
    }

    public void melange() {
        Random r = new Random();
        for (int i = 0; i < 52; i++) {
            int j;
            do {
                j = r.nextInt(52);
            } while (i == j);
            swapCartes(i, j);
        }
    }

    private void swapCartes(int i, int j) {
        Carte temp = cartes[i];
        cartes[i] = cartes[j];
        cartes[j] = temp;
    }

    @Override
    public String toString() {
        return "JeuDeCartes{" +
                "cartes=" + Arrays.toString(cartes) +
                '}';
    }
}
