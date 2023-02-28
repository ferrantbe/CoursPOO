package be.ephec.java.cours02.enums;

public class Programme {
    public static void main(String[] args) {
        DayOfWeek currentDay = DayOfWeek.TUESDAY;
        DayOfWeek a = DayOfWeek.FRIDAY;
        int n = currentDay.ordinal();      // n vaut 1
        System.out.println("Ordinal d'un jour = position");
        System.out.println(DayOfWeek.TUESDAY + " -> " + n);
        System.out.println();

        System.out.println("Parcourir les valeurs");
        DayOfWeek[] days = DayOfWeek.values();     // retourne toutes les valeurs de l’enum
        for (DayOfWeek day : days)
            System.out.println(day.ordinal() + " " + day);
        System.out.println();

        System.out.print("Comparer MONDAY et TUESDAY: ");
        System.out.println(DayOfWeek.MONDAY.compareTo(DayOfWeek.TUESDAY)); // si le 1er est avant le 2eme, négatif,...

        System.out.print("Comparer MONDAY et MONDAY: ");
        System.out.println(DayOfWeek.MONDAY.compareTo(DayOfWeek.MONDAY)); // si le 1er est avant le 2eme, nul,...

        System.out.print("Comparer SUNDAY et TUESDAY: ");
        System.out.println(DayOfWeek.SUNDAY.compareTo(DayOfWeek.TUESDAY)); // si le 1er est avant le 2eme, positif,...

        System.out.println();
        System.out.println("L'instruction switch...");
        for (DayOfWeek day : days) {
            System.out.print(day + " ");
            onFaitQuoi(day);
        }
    }

    public static void onFaitQuoi(DayOfWeek today) {

        switch (today) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY -> System.out.println("On bosse");
            case FRIDAY -> System.out.println("Presque...");
            case SATURDAY, SUNDAY -> System.out.println("On se repose.");
        }

    }
}
