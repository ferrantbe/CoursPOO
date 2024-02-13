package be.ephec.java.cours04.classeAnonyme;

public class Programme {

    public static void main(String[] args) {
        AbstractClass objet = new AbstractClass() {
            @Override
            public void methodeAbstraite() {
                System.out.println("Ceci est la méthode abstraite, concrète.");
            }
        };

        MonInterface monObjet = new MonInterface() {
            @Override
            public void methodeDInterface() {
                System.out.println("Ceci est la méthode d'interface, concrète.");
            }
        };


        objet.methodeConcrete();
        objet.methodeAbstraite();

        monObjet.methodeDInterface();
    }
}
