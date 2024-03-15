package be.ephec.java.cours06.collection;

import be.ephec.java.cours06.constructeur.Bidule;
import be.ephec.java.cours06.constructeur.Truc;

import java.util.*;

public class Programme {
    public static void main(String[] args) {
        List<Bidule> liste = new ArrayList();
        // liste.add("Hello");
        liste.add(new Bidule());
        liste.add(new Truc());

        Bidule b1 = new Bidule(10);
        Bidule b2 = new Bidule(20);
        Bidule b3 = new Bidule(30);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b1.equals(b2));

        // test de Queue: quel élément est récupéré en premier (dépend de l'ordre)
        Queue<Bidule> bidules = new LinkedList<>();

        bidules.add(b1);
        bidules.add(b2);
        bidules.add(b3);
        System.out.println(bidules.element().getI());


        // test du Set: que se passe-t-il si on insère 2x le même objet?

        Set<Bidule> biduleSet = new HashSet<>();
        biduleSet.add(b1);
        System.out.println(biduleSet);
        biduleSet.add(b2);
        System.out.println(biduleSet);
        biduleSet.add(b3);
        System.out.println(biduleSet);
        biduleSet.add(b1);
        System.out.println(biduleSet);

        biduleSet.add(new Bidule(12));
        System.out.println(biduleSet);

        SortedSet<Bidule> sortedBidules = new TreeSet<>(biduleSet);
        System.out.println(sortedBidules);



    }
}
