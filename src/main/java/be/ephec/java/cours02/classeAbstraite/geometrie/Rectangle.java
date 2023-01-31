package be.ephec.java.cours02.classeAbstraite.geometrie;

public class Rectangle extends Forme{
    @Override
    public void affiche() {
        System.out.println("Je suis un rectangle!");
    }

    @Override
    public void efface() {
        System.out.println("Je suis un rectangle, et je m'efface!");
    }
}
