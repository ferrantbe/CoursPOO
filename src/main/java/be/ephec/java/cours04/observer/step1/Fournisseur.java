package be.ephec.java.cours04.observer.step1;

import java.util.HashSet;
import java.util.Set;

public class Fournisseur {
    Set<Client> subscribers = new HashSet<>();

    public void addSubscriber(Client client) {
        subscribers.add(client);
    }

    public void removeSubscriber(Client client) {
        subscribers.remove(client);
    }

    private void informSubscribers() {
        System.out.println("Fournisseur - J'informe mes subscribers");
        for (Client client : subscribers) {
            client.update();
        }
    }

    public void addProduct() {
        System.out.println("Fournisseur - Nouveau Produit est arrivé...");
        informSubscribers();
    }
}
