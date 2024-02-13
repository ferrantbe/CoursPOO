package be.ephec.java.cours04.observer.step1;


public class Client {
    private String name;

    public Client(String name) {
        this.name = name;
    }

    public void update() {
        System.out.printf("Client (%s) - Enfin, je vais acheter le produit\n", this.name);
    }

    public void jeMAbonne(Fournisseur fournisseur) {
        fournisseur.addSubscriber(this);
    }

    public void jeMeDesabonne(Fournisseur fournisseur) {

        fournisseur.removeSubscriber(this);
    }
}
