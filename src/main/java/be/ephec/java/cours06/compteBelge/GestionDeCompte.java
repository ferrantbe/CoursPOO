package be.ephec.java.cours06.compteBelge;

import be.ephec.java.cours06.compteBelge.exceptions.InvalidIBANException;
import be.ephec.java.cours06.compteBelge.exceptions.NoBEStartException;
import be.ephec.java.cours06.compteBelge.exceptions.Not16CharsException;

public class GestionDeCompte {
    public static void main(String[] args) {

        try {
            Compte c1 = new Compte("UT32433312345667");
        } catch (Not16CharsException | NoBEStartException | InvalidIBANException e) {
            System.out.println(e.getMessage());
        }

        try {
            Compte c2 = new Compte("12345678901234");
        } catch (Not16CharsException | NoBEStartException | InvalidIBANException e) {
            System.out.println(e.toString());
        }

        try {
            Compte c3 = new Compte("BE12345678901234");
        } catch (Not16CharsException | NoBEStartException | InvalidIBANException e) {
            System.out.println(e.toString());
        }

        try {
            Compte c = new Compte("be42 6792 0000 0054");

            p(c);

            System.out.println("Ajoute 1000");
            c.ajoute(1000);
            p(c);

            System.out.print("Retrait de 100 : ");
            System.out.println(c.retire(100));
            p(c);

            System.out.print("Retrait de 1200 : ");
            System.out.println(c.retire(1200));
            p(c);
        } catch (Not16CharsException | NoBEStartException | InvalidIBANException e) {
            System.out.println("Exception " + e.getClass().getSimpleName());
        }
    }

    private static void p(Compte c) {
        System.out.println(c.getSolde());
    }
}
