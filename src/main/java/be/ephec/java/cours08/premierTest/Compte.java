package be.ephec.java.cours08.premierTest;

public class Compte {
    private int solde;

    public int getSolde() {
        return solde;
    }

    public void ajoute(int montant) {
        if (montant > 0) solde += montant;
    }
}
