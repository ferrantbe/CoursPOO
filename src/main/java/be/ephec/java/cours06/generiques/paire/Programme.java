package be.ephec.java.cours06.generiques.paire;

import java.util.Scanner;

public class Programme {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choix;
        do {
            System.out.print("(1) Identiques ou (2) Différents ou (0) arrêt?");
            choix = sc.nextInt();
            if (choix == 1)
                pairesIdentiques();
            else if (choix == 2)
                pairesDifferents();
        } while (choix != 0);
    }

    private static void pairesIdentiques() {
        Paire<Integer> pi = new Paire<>(2, 7);
        Paire<Double> pd = new Paire<>(3.7, 3.1415926535);

        System.out.println("Paire d'Integer");
        System.out.println(pi.getPremier());
        System.out.println(pi.getSecond());
        System.out.println(pi);

        System.out.println("Paire de Double");
        System.out.println(pd.getPremier());
        System.out.println(pd.getSecond());
        System.out.println(pd);

        System.out.println("Paire de Paire");
        Paire<Paire> pp = new Paire<>(pi, pd);
        System.out.println(pp.getPremier());
        System.out.println(pp.getSecond());
        System.out.println(pp);

    }

    private static void pairesDifferents() {
        PaireD<Integer, Integer> pi = new PaireD<>(2, 7);
        PaireD<Integer, Double> pd = new PaireD<>(4, 3.1415926535);

        System.out.println("PaireD d'Integer et Integer");
        System.out.println(pi.getPremier());
        System.out.println(pi.getSecond());
        System.out.println(pi);

        System.out.println("Paire d'Integer et Double");
        System.out.println(pd.getPremier());
        System.out.println(pd.getSecond());
        System.out.println(pd);

        System.out.println("Paire de Paire et String");
        PaireD<PaireD, String> pp = new PaireD<>(pi, "Hello");
        System.out.println(pp.getPremier());
        System.out.println(pp.getSecond());
        System.out.println(pp);
    }
}
