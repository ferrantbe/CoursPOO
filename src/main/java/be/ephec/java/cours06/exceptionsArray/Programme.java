package be.ephec.java.cours06.exceptionsArray;
import java.util.Scanner;

public class Programme {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] t;
        int cellule = 0;
        do {
            System.out.print("Quelle est la taille du tableau? ");
            int taille = sc.nextInt();
            t = new int[taille];

            System.out.print("Dans quelle case faut-il mettre la valeur 12? ");
            cellule = sc.nextInt();
            t[cellule] = 12;
            System.out.println();
        } while (cellule != 0);
    }
}
