package be.ephec.java.cours02;

import java.util.Locale;

public class ExemplesPrintF {

    public static void main(String[] args) {
        System.out.printf("Hello %s!%n", "World");
        System.out.printf("'%S' %n", "ephec");
        System.out.printf("i = %d%n", 10000L);
        System.out.printf(Locale.US, "%,d %n", 10000);
        System.out.printf("%f%n", 3.1473);
        System.out.printf("'%5.2f'%n", 3.1473);
        System.out.printf("%s : %d%n", "Prix:", 10);

    }
}
