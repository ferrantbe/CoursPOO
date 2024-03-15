package be.ephec.java.cours06.constructeur;

public class Programme {
    public static void main(String[] args) {
        // Je peux appeler le constructeur de Truc...
        // Même si je n'en ai pas défini dans Truc.
        Truc t = new Truc();
        t.setI(5);

        // Le constructeur sans nom (par défaut) disparaît dès qu'on crée un constructeur avec paramètre
        // On doit donc créer un constructeur explicite
        Bidule b = new Bidule();


    }
}
