package be.ephec.java.cours07.voitureSansPermis;

import java.util.*;

public class Programme {

    public static void main(String[] args) {
        List<Voiture> listVoit = new ArrayList<>();
        List<VoitureSansPermis> listVoitSP = new ArrayList<>();

        // C<T'> n'hérite pas de C<T> si T' hérite de T
        // List<VSP> n'hérite pas de List<V>, même si VSP hérite de V
        listVoit = listVoitSP;


        List<? extends Voiture> listeDeVoitures = new ArrayList<>();
        listeDeVoitures = listVoitSP;

        List<? super VoitureSansPermis> listeDeVoituresSP = new ArrayList<>();
        listeDeVoituresSP = listVoitSP;
        listeDeVoituresSP = listVoit;


    }

    }
