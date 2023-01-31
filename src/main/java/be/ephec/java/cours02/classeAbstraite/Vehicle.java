package be.ephec.java.cours02.classeAbstraite;

public abstract class Vehicle {
    private final String brand = "";
    protected float speed;
    public void accelerate(float deltaSpeed) {
        this.speed += deltaSpeed;
    }
    public void decelerate(float deltaVitesse) {
        this.speed = Math.max(this.speed - deltaVitesse, 0f);
    }
    public abstract int getNbWheels();
}