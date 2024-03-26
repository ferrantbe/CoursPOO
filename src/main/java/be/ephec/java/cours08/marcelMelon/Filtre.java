package be.ephec.java.cours08.marcelMelon;

import java.util.ArrayList;
import java.util.List;

public class Filtre {
    public static List<Melon> filtreParType(List<Melon> listeDeMelons, String type) {
        List<Melon> reponse = new ArrayList<>();

     /* for (int i = 0; i < listeDeMelons.size(); i++) {
            System.out.println(listeDeMelons.get(i).getType());
        }

        // foreach
        for (Melon m : listeDeMelons) {
            System.out.println(m.getType());
        }
        */

        for (Melon melon: listeDeMelons)
            if (melon != null && type.equalsIgnoreCase(melon.getType()))
                reponse.add(melon);
        return reponse;
    }

    public static List<Melon> filtreParPoids(List<Melon> listeDeMelons, int poids) {
        List<Melon> reponse = new ArrayList<>();

        for (Melon melon: listeDeMelons)
            if (melon != null && poids == melon.getPoids())
                reponse.add(melon);
        return reponse;
    }

    public static List<Melon> filtreParPredicat(List<Melon> listeDeMelons, PredicatMelon predicat) {
        List<Melon> reponse = new ArrayList<>();

        for (Melon melon: listeDeMelons)
            if (melon != null && predicat.test(melon))
                reponse.add(melon);
        return reponse;
    }

}

