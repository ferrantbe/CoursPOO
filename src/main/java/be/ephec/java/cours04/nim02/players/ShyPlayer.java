package be.ephec.java.cours04.nim02.players;

import be.ephec.java.cours04.nim02.Pile;

public class ShyPlayer  extends AbstractPlayer {


    public ShyPlayer(String name) {
        super(name);
    }

    public void play(Pile pile, int max) {

        numberOfRemovedMatches = 1;
        pile.remove(numberOfRemovedMatches);
    }

}
