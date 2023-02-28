package be.ephec.java.cours04.methodeDefaut;

public class Camion implements Vehicule {

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void klaxonne() {
        System.out.println("Pouet");
    }
}
