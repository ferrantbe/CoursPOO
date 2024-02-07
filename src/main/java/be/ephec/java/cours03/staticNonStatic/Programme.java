package be.ephec.java.cours03.staticNonStatic;

public class Programme {
    public static void main(String[] args) {
        Truc.methodeStatique();

        Truc truc = new Truc();
        truc.methodeNonStatique();
    }
}
