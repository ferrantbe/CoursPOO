package be.ephec.java.cours04.nim02;

public class Game {

    private Player player1;
    private Player player2;
    private Player nextPlayer;
    private Player previousPlayer;
    Pile pile;

    private static final int MAX_PER_ROUND = 3;

    public Game(Player player1, Player player2, int numberOfMatches) {
        this.player1 = player1;
        this.player2 = player2;
        nextPlayer = player1;
        this.pile = new Pile(numberOfMatches);
    }

    private Player otherPlayer(Player player) {
        if (player == player1)
            return player2;
        else
            return player1;
    }

    public void play() {
        if (!gameOver()) {
            nextPlayer.play(pile, MAX_PER_ROUND);
            previousPlayer = nextPlayer;
            nextPlayer = otherPlayer(nextPlayer);
        }
    }

    public boolean gameOver() {
        return pile.remainingNumberOfMatches() <= 0;
    }

    public Player getNextPlayer() {
        return nextPlayer;
    }

    public Player getPreviousPlayer() {
        return previousPlayer;
    }
}
