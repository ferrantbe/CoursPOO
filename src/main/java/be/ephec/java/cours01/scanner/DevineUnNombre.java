package be.ephec.java.cours01.scanner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DevineUnNombre {
    public static void main(String[] args) {
        int aDeviner;
        try {
            // on essaye de transformer le premier argument en entier...
            aDeviner = Integer.parseInt(args[0]);
            System.out.println("Vous avez entré un chiffre à deviner...");
        } catch (Exception e) {
            // ... et si ça ne marche pas on calcule un nombre aléatoire

            aDeviner = (int) (100 * Math.random()) + 1;
        }

        int reponse = 0;
        int nbEssais = 0;
        Scanner s = new Scanner(System.in);

        System.out.println("Devinez un nombre (entre 1 et 100 inclus)");
        do {
            boolean afficherMessage = true;
            nbEssais++;

            System.out.print("Votre proposition ? ");
            try {
                reponse = s.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Veuillez proposer uniquement un nombre entier.");
                afficherMessage = false;
                nbEssais--;
                s.next();
            }
            if (afficherMessage && reponse < aDeviner)
                System.out.println(reponse + ", est trop petit... Ré-esssayez!");
            else if (afficherMessage && reponse > aDeviner)
                System.out.println(reponse + " est trop grand... Ré-essayez!");
        } while (reponse != aDeviner);

        System.out.println();
        System.out.println("Bravo, le nombre était " + aDeviner + ".");
        System.out.println("Vous l'avez trouvé en " + nbEssais + " essais.");
    }
}
