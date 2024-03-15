package be.ephec.java.cours06.constructeur;

public class Bidule implements Comparable<Bidule>{

    public Bidule(int i) {
        this.i = i;
    }
    public Bidule(int i, int j) {
        this.i = Math.max(i, j);
    }

    public Bidule() {
        this(4, 7);
    }

    private int i;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    @Override
    public int compareTo(Bidule b) {
        if (this.i < b.i)
            return -1;
        else if (this.i > b.i)
            return 1;
        else return 0;
    }

    @Override
    public String toString() {
        return "Bidule " + i ;
    }
}
