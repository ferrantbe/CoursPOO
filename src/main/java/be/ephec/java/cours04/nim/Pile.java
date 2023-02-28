package be.ephec.java.cours04.nim;

/**
 *  Une pile d'allumettes du jeu de Nim
 *
 * @author fredericferrant
 *
 */
public class Pile {
    private int numberOfMatches;

    /**
     * Construit une pile contenant un nombre donné d'allumettes
     * @param initialNumberOfMatches le nombre initial de la pile
     */
    public Pile(int initialNumberOfMatches) {
        this.numberOfMatches = initialNumberOfMatches;
    }

    /**
     * Renvoie le nombre d'allumettes restantes
     * @return int le nombre d'allumettes restantes
     */
    public int remainingNumberOfMatches() {
        return this.numberOfMatches;
    }

    /**
     * Retire le nombre d'allumettes de la pile
     * @param numberOfMatches le nombre d'allumettes à retirer
     */
    public void remove(int numberOfMatches) {
        this.numberOfMatches -= numberOfMatches;
    }


}
