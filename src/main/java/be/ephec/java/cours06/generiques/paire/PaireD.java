package be.ephec.java.cours06.generiques.paire;

public class PaireD<U, V>{
    private U premier;
    private V second;

    public PaireD(U premier, V second) {
        this.premier = premier;
        this.second = second;
    }

    public U getPremier() {
        return premier;
    }

    public V getSecond() {
        return second;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("premiere valeur : ").append(premier);
        sb.append(" - deuxieme valeur : ").append(second);
        return sb.toString();
    }
}
