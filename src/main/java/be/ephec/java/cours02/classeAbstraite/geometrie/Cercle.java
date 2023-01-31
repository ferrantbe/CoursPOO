package be.ephec.java.cours02.classeAbstraite.geometrie;

public class Cercle extends Forme{
    @Override
    public void affiche() {
        System.out.println("Je suis un cercle!");
    }

    @Override
    public void efface() {
        System.out.println("Je suis un cercle, et je m'efface!");
    }
}
