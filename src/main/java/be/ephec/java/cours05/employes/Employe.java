 package be.ephec.java.cours05.employes;

public abstract class Employe {
    private String nom;
    private String prenom;
    private int age;
    private String anneeEntree;

    public abstract double calculerSalaire();
    public String getNom() {
        return new StringBuffer(this.getClass().getSimpleName())
                .append(" ")
                .append(this.prenom).append(" ")
                .append(this.nom).toString();
    }

    public Employe(String nom, String prenom, int age, String anneeEntree) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.anneeEntree = anneeEntree;
    }
}
