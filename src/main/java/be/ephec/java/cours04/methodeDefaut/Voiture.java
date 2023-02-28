package be.ephec.java.cours04.methodeDefaut;

public class Voiture implements Vehicule {
    @Override
    public void start() {
        System.out.println("La voiture démarre");
    }

    @Override
    public void stop() {
        System.out.println("La voiture s'arrête");
    }
}
