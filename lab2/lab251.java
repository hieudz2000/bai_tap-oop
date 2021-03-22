package lab2;

import java.util.Scanner;

public class lab251 {
    public static void main(String args[]) {
        Scanner key = new Scanner(System.in);
        System.out.println("What 's name?");
        String name = key.nextLine();
        System.out.println("how old are you?? ");
        int age = key.nextInt();
        System.out.println("How tall ??");
        double heght = key.nextDouble();
        System.out.println(name+ "\n" + age+"tuoi\nhieu" +heght +" m");

    }
}
