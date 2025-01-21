package be.ephec.cours01;

public class Personne {
    /*
    Créez une classe Personne.
    La classe présente quatre champs public:
        un nom, un prénom, une année de naissance et un age.
    La classe présente aussi deux méthodes public:
        Une méthode computeAge(int year) qui calcule l’âge de la personne à l’année year.
        Une méthode  display() qui affiche les propriétés de la personne.
    Vous écrivez un programme (main) dans lequel vous créez une Personne.
    Dans le programme, vous affichez le prénom, le nom et l’âge de la personne.


     */
    public String nom, prenom;
    public int dateNaissance;
    public int age;

    public int computeAge(int year) {
        return year - dateNaissance;

    }

    public void display() {
        System.out.printf("%s %s, né en %d.\nIl a %d ans.", nom, prenom,
                dateNaissance, age);
    }

    public static void main(String[] args) {
        Personne p = new Personne();
        p.nom = "Ferrant";
        p.prenom = "Frédéric";
        p.dateNaissance = 1971;
        p.age = p.computeAge(2025);
        p.display();
    }
}

