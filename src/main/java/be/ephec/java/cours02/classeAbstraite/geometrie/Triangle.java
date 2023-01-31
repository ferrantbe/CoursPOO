package be.ephec.java.cours02.classeAbstraite.geometrie;

public class Triangle extends Forme{
    @Override
    public void affiche() {
        System.out.println("Je suis un triangle!");
    }

    @Override
    public void efface() {
        System.out.println("Je suis un triangle, et je m'efface!");
    }
}
