package be.ephec.java.cours06.generiques.paire;

public class Paire<T>{
    private T premier;
    private T second;

    public Paire(T premier, T second) {
        this.premier = premier;
        this.second = second;
    }

    public T getPremier() {
        return premier;
    }

    public T getSecond() {
        return second;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("premiere valeur : ").append(premier);
        sb.append(" - deuxieme valeur : ").append(second);
        return sb.toString();
    }
}
