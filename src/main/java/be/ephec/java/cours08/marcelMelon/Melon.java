package be.ephec.java.cours08.marcelMelon;

public class Melon {
    private final String type;
    private final int poids;
    private final String origine;

    public Melon(String type, int poids, String origine) {
        this.type = type;
        this.poids = poids;
        this.origine = origine;
    }

    public String getType() {
        return type;
    }

    public int getPoids() {
        return poids;
    }

    public String getOrigine() {
        return origine;
    }

    @Override
    public String toString() {
        return "Melon " +
 type + " de " + poids +
                "g origine " + origine;
    }
}
