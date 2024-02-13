package be.ephec.java.cours04.heapStack;

public class Programme {
    public static void main(String[] args) {
        int i = 3;
        methode1();
    }

    private static void methode1() {
        int i = 4;
        Objet o = new Objet();
        o.setValeur(5);

        methode2(o);
    }

    private static void methode2(Objet o) {
        int j = 7;
        System.out.println(o.getValeur());
        methode3();
    }

    private static void methode3() {
        throw new RuntimeException();
    }
}
