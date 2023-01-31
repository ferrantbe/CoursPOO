package be.ephec.java.cours02.classeAbstraite.geometrie;

public class ProgrammeGeo {
    public static void main(String[] args) {
        Forme f;
        // f = new Forme();
        f = new Cercle();
        f.affiche();
        System.out.println();

        Forme[] formes = new Forme[5];
        formes[0] = new Cercle();
        formes[1] = new Triangle();
        formes[2] = new Cercle();
        formes[3] = new Rectangle();
        formes[4] = new Triangle();

        for (Forme forme : formes)
            forme.affiche();
    }
}
