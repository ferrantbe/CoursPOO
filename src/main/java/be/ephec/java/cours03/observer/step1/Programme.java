package be.ephec.java.cours03.observer.step1;

public class Programme {
    public static void main(String[] args) {
        Fournisseur fournisseur = new Fournisseur();
        Client jean = new Client("Jean");
        Client marc = new Client("Marc");

        System.out.println("*** Ajout d'un produit chez le fournisseur");
        fournisseur.addProduct();

        System.out.println("\n*** Le client Jean s'abonne");
        jean.jeMAbonne(fournisseur);

        System.out.println("\n*** Ajout d'un produit chez le fournisseur");
        fournisseur.addProduct();

        System.out.println("\n*** Le client Marc s'abonne");
        marc.jeMAbonne(fournisseur);

        System.out.println("\n*** Ajout d'un produit chez le fournisseur");
        fournisseur.addProduct();

        System.out.println("\n*** Le client Jean se désabonne");
        jean.jeMeDesabonne(fournisseur);

        System.out.println("\n*** Ajout d'un produit chez le fournisseur");
        fournisseur.addProduct();


    }
}
