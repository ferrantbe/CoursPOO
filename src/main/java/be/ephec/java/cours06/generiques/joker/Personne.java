package be.ephec.java.cours06.generiques.joker;

public class Personne {
    private String nom;

    public Personne(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer(this.getClass().getSimpleName()).append(" ").append(nom);
        return sb.toString();
    }
}
