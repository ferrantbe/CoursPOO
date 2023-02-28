package be.ephec.java.cours04.nim;

import be.ephec.java.cours04.nim.players.GreedyPlayer;
import be.ephec.java.cours04.nim.players.HumanPlayer;
import be.ephec.java.cours04.nim.players.RandomPlayer;
import be.ephec.java.cours04.nim.players.SmartPlayer;

public class UI {
    private Player player1;
    private Player player2;
    private Game game;

    public UI() {

        this.player1 = new HumanPlayer("Igor");
        this.player2 =  new RandomPlayer("Alice");

        /*
        Générer les deux joueurs
        ========================

        this.player1 = new Player("Bob");
        this.player2 = new Player("Alice");

         */
    }

    public void start() {
        System.out.println();
        int nbMatches = 21;
        playTheGame(nbMatches);
        System.out.println("Au revoir!");
    }

    private void playTheGame(int initialNumber) {
        game = new Game(player1, player2, initialNumber);
        while (!game.gameOver()) {
            game.play();
            gameReport(game.getPreviousPlayer());
        }
        theWinnerIs(game.getNextPlayer());
    }

    private void theWinnerIs(Player player) {
        System.out.println();
        System.out.println(player.getName() + " a gagné!");
        System.out.println();
    }

    private void gameReport(Player player) {
        System.out.println(player.toString() + ", il reste donc " + game.pile.remainingNumberOfMatches() + " allumettes");
    }
}
