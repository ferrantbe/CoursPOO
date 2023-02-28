package be.ephec.java.cours04.methodeDefaut;

public interface Vehicule {
    void start();
    void stop();
    default void klaxonne(){
        System.out.println("Tuut");
    }
}
