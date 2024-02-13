package be.ephec.java.cours04.nim02.players;

import be.ephec.java.cours04.nim02.Pile;
import java.util.Scanner;

public class HumanPlayer extends AbstractPlayer  {

    public HumanPlayer(String name) {
        super(name);
    }

    public void play(Pile pile, int max) {

        Scanner in = new Scanner(System.in);

        System.out.printf("Il reste %d allumettes... \n", pile.remainingNumberOfMatches());
        System.out.printf("Combien d'allumettes faut-il retirer (max %d)? ", max);
        numberOfRemovedMatches = in.nextInt();

        pile.remove(numberOfRemovedMatches);
        // in.close();
    }

}
