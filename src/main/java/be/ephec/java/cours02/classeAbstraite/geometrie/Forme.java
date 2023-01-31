package be.ephec.java.cours02.classeAbstraite.geometrie;

public abstract class Forme {
    // (position, rotation, ainsi que deux méthodes deplace(dx,dy) et tourne(angle)).
    private Point positionCentre;
    private double alpha;

    public void deplace (double dx, double dy) {
        positionCentre.move(dx, dy);
    }

    public void tourne (double angle) {
        this.alpha += angle;
        this.alpha = this.alpha % 360;
    }

    public abstract void affiche();

    public abstract void efface();


}
