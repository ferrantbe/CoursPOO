package be.ephec.java.cours04.nim01;

public class Player {
    private String name;
    protected int numberOfMatches;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfMatchesRemoved() {
        return numberOfMatches;
    }

    public void play(Pile pile, int max) {
        int n;

        n = 1;
        pile.remove(n);
        numberOfMatches = n;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer(name).append(" a pris ");
        sb.append(numberOfMatches).append(" allumettes");
        return sb.toString();
    }
}
