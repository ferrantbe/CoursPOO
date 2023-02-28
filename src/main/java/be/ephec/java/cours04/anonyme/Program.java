package be.ephec.java.cours04.anonyme;

public class Program {
    public static void main(String[] args) {
        Speaker english = new EnglishSpeaker();
        english.speak();

        Speaker french = new Speaker() {
            @Override
            public void speak() {
                System.out.println("Bonsoir!");
            }
        };
        french.speak();
    }
}
