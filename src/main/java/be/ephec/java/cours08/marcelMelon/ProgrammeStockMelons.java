package be.ephec.java.cours08.marcelMelon;

import java.util.ArrayList;
import java.util.List;

public class ProgrammeStockMelons {

    public static void main(String[] args) {

        List<Melon> stock = new ArrayList<>();
        stock.add(new Melon("Cavaillon", 1200, "Europe"));
        stock.add(new Melon("Gaia", 1000, "Asie"));
        stock.add(new Melon("Cantaloupe", 6000, "Europe"));
        stock.add(new Melon("Cantaloupe", 1200, "Asie"));
        stock.add(new Melon("CAVAILLON", 1300, "Europe"));

        System.out.println("Filtre par type: ");
        System.out.println(Filtre.filtreParType(stock, "cavaillon"));

        System.out.println("Filtre par poids: ");
        System.out.println(Filtre.filtreParPoids(stock, 1200));

        System.out.println("Melons énormes");
        System.out.println(Filtre.filtreParPredicat(stock, new PredicatMelonEnorme()));

        System.out.println("Melons européens");
        System.out.println(Filtre.filtreParPredicat(stock, new PredicatMelonEuropeen()));

        System.out.println("Melons asiatique classe anonyme");
        System.out.println(Filtre.filtreParPredicat(stock, new PredicatMelon() {
            @Override
            public boolean test(Melon melon) {
                return melon != null && "Asie".equalsIgnoreCase(melon.getOrigine());
            }
        }));

        System.out.println("Melons asiatique lambda");
        System.out.println(Filtre.filtreParPredicat(stock,
                melon -> melon != null && "Asie".equalsIgnoreCase(melon.getOrigine())));



    }
}
