package accessibilite.monPackage;

public class MonAutreClasse {
    public static void main(String[] args) {
        MaClasse o = new MaClasse();
        appelleMethodePublique(o);
        appelleMethodeProtected(o);
        appelleMethodeDefaut(o);
        appelleMethodePrivee(o);
    }

    private static void appelleMethodePublique(MaClasse o) {
        o.methodePublique();
    }
    private static void appelleMethodeProtected(MaClasse o) {
        o.methodeProtected();
    }
    private static void appelleMethodeDefaut(MaClasse o) {
        o.methodeDefaut();
    }
    private static void appelleMethodePrivee(MaClasse o) {
        // o.methodePrivee(); // Méthode non visible
    }
}
