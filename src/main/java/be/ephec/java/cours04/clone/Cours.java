package be.ephec.java.cours04.clone;

public class Cours {

    private String titre;
    private Prof prof;

    public Cours(String titre, Prof prof) {
        this.titre = titre;
        this.prof = prof;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cours de ");
        sb.append(titre).append(" par ").append(prof);
        return sb.toString();
    }
}
