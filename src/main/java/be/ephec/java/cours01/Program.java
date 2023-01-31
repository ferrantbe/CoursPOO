package be.ephec.java.cours01;

import java.util.*;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Comment vous appelez-vous? ");
        String name = sc.nextLine();

        System.out.print("Quel âge avez-vous? ");
        int age = sc.nextInt();

        System.out.println("Dans 1 ans, vous aurez " + ++age + " ans, " + name + ".");


    }

}
