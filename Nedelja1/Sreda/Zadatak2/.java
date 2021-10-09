package Nedelja1;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);

     
        System.out.println("Unesite dva cela broj:");
        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x * y > 0){
            System.out.println("Brojevi " + x + " i " + y + " su istog znaka");
        }
        else{
            System.out.println("Brojevi " + x + " i " + y + " su razlicitog znaka");
        }

    }
}
