package be.ephec.java.cours04.nim.players;

import be.ephec.java.cours04.nim.Pile;

public class ShyPlayer  extends AbstractPlayer {


    public ShyPlayer(String name) {
        super(name);
    }

    public void play(Pile pile, int max) {

        numberOfRemovedMatches = 1;
        pile.remove(numberOfRemovedMatches);
    }

}
