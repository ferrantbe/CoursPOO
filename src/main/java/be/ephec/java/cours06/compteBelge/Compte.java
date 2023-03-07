package be.ephec.java.cours06.compteBelge;

import be.ephec.java.cours06.compteBelge.exceptions.InvalidIBANException;
import be.ephec.java.cours06.compteBelge.exceptions.NoBEStartException;
import be.ephec.java.cours06.compteBelge.exceptions.Not16CharsException;

public class Compte {
    private double solde = 0;
    private String numero;

    public Compte(String numero) throws Not16CharsException, NoBEStartException, InvalidIBANException {

        String ibanSansEspaces = numero.replaceAll("[^a-zA-Z0-9]", "");
        if (ibanSansEspaces.length() != 16)
            throw new Not16CharsException("L'Iban fait " + ibanSansEspaces.length() + " caractères (16)");
        if (! numero.substring(0, 2).equalsIgnoreCase("BE"))
            throw new NoBEStartException("L'iban commence par " + numero.substring(0, 2));
        if (! TestModuloIban.isValidIban(numero))
            throw new InvalidIBANException("Le calcul du modulo n'est pas valide sur l'IBAN");
        this.numero = numero;
    }

    public double getSolde() {
        return solde;
    }

    public void ajoute(double montant) {
        if (montant > 0)
            solde += montant;
    }

    public double retire(double montant) {
        if (montant > 0)
            if (solde > montant) {
                solde -= montant;
                return montant;
            } else {
                montant = solde;
                solde = 0;
                return montant;
            }
        else
            return 0;
    }

}
