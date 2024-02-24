package be.ephec.java.cours05.introException;

public class TestException {
    public static void main(String[] args) {
        int i = 0;
        System.out.println(5 / i);

        divideBy(i);

        Truc t = null;
        System.out.println(t.truc());
    }

    private static void divideBy(int i) {
        System.out.println(5 / i);
    }

}
