package be.ephec.java.cours02.accessibilite.dates;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class ProgrammeLocalDate {
    public static void main(String[] args) {
        LocalDate aujourdhui = LocalDate.now();

        LocalDate demain = aujourdhui.plusDays(1);
        LocalDate anniversire = LocalDate.of(aujourdhui.getYear(), 05, 01);

        LocalDate naissance = LocalDate.parse("1971-05-01");
        long ageEnJours = ChronoUnit.DAYS.between(naissance, aujourdhui);

        boolean anniversaireAVenir = anniversire.isAfter(aujourdhui);
        boolean estAnneeBissextile = aujourdhui.isLeapYear();
        int nombreDeJoursDansAnnee = aujourdhui.lengthOfYear();
        int nombreDeJoursDansMois = aujourdhui.lengthOfMonth();
        LocalDate dansDeuxAns = aujourdhui.plus(2, ChronoUnit.YEARS);
        DayOfWeek jourDeSemaineDansDeuxAns = dansDeuxAns.getDayOfWeek();

        System.out.printf("Nous sommes le %s\n", aujourdhui.toString());
        System.out.printf("Demain, nous serons le %s\n", demain.toString());
        System.out.printf("Mon anniversaire étant le %s, il %s\n", anniversire,
                (anniversaireAVenir ? "doit encore se produire." : "est déjà passé."));
        System.out.printf(
                "Nous sommes en %d, l'année est %s et elle compte %d jours.\n",
                aujourdhui.getYear(),
                (estAnneeBissextile ? "bissextile" : "non bissextile"),
                nombreDeJoursDansAnnee);
        System.out.printf("Nous sommes au mois de %s qui compte %d jours.\n",
                aujourdhui.getMonth(), nombreDeJoursDansMois);
        System.out.printf(
                "Aujourd'hui nous sommes un %s, dans 2 ans nous serons le %s qui sera un %s\n",
                aujourdhui.getDayOfWeek(), dansDeuxAns,
                jourDeSemaineDansDeuxAns);
        System.out.printf("Je suis né le %s, soit il y a %d jours.\n", naissance, ageEnJours);
        System.out.println();

        Scanner sc = new Scanner(System.in);

        System.out.print("Quel est votre année de naissance? ");
        int annee = sc.nextInt();
        System.out.print("Quel est votre mois de naissance? ");
        int mois = sc.nextInt();
        System.out.print("Quel est votre jour de naissance? ");
        int jour = sc.nextInt();
        naissance = LocalDate.of(annee, mois, jour);
        System.out.println();
        System.out.printf("Vous êtes né depuis %d années.\n", ChronoUnit.YEARS.between(naissance, aujourdhui));
        System.out.printf("Vous êtes né depuis %d mois.\n", ChronoUnit.MONTHS.between(naissance, aujourdhui));
        System.out.printf("Vous êtes né depuis %d semaines.\n", ChronoUnit.WEEKS.between(naissance, aujourdhui));
        System.out.printf("Vous êtes né depuis %d jours.\n", ChronoUnit.DAYS.between(naissance, aujourdhui));
    }
}
