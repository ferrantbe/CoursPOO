package be.ephec.java.cours02.accessibilite.autrePackage;

import be.ephec.java.cours02.accessibilite.monPackage.MaClasse;

public class AutreSousClasse extends MaClasse {

    public static void main(String[] args) {
        MaClasse o = new MaClasse();
        AutreSousClasse asc = new AutreSousClasse();
        appelleMethodePublique(o);
        appelleMethodeProtected(o);
        asc.appelleProtectedHeritage(o);
        appelleMethodeDefaut(o);
        appelleMethodePrivee(o);
    }

    private static void appelleMethodePublique(MaClasse o) {
        o.methodePublique();
    }
    private static void appelleMethodeProtected(MaClasse o) {
        // o.methodeProtected(); // Méthode non visible
    }
    private static void appelleMethodeDefaut(MaClasse o) {
        // o.methodeDefaut(); // Méthode non visible
    }
    private static void appelleMethodePrivee(MaClasse o) {
        // o.methodePrivee(); // Méthode non visible
    }

    public void appelleProtectedHeritage(MaClasse o) {
        // o.methodeProtected(); // Méthode non visible
        super.methodeProtected(); // possible dans le cadre de l'héritage
    }
}
