package be.ephec.java.cours01.scanner;

import java.util.Scanner;

public class ProgrammeLecture {
    public static void main(String[] args) {
        System.out.println("Quel nombre (base 16) ? ");
        Scanner sc = new Scanner(System.in);

        int val = sc.nextInt(16);


        System.out.println("Le nombre était: " + val);

    }
}
