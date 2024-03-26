package be.ephec.java.cours08.premierTest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompteTest {

    @Test
    void testSolde0PourNouveauCompte() {
        Compte c = new Compte();
        assertEquals(0, c.getSolde(), "Le solde devrait être 0 pour un nouveau compte.");
    }

    @Test
    void testAjouteMontantPositif() {
        Compte c = new Compte();
        int montantInitial = c.getSolde();
        c.ajoute(50);
        assertEquals(montantInitial + 50, c.getSolde(), "Un ajoute de montant positif doit augmenter le solde.");
    }
}