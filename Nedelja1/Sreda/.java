package Nedelja1;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite dva cela broj:");
        int x = sc.nextInt();
        int y = sc.nextInt();

      
        System.out.println("Rezultati aritmetickih operacija su:");
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);
        System.out.println(x % y);
    }
}

