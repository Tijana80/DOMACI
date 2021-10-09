package Nedelja1;

import java.util.Scanner;

public class Zadatak3 {

    public static void main(String[] args) {
   
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite cetvorocifren broj:");
        int broj = sc.nextInt();
        int hiljade = (broj / 1000);
        int stotine = (broj / 100) % 10; 
        int desetice = (broj % 100) / 10; 
        int jedinice = broj % 10; 
        System.out.println("Rezultat operacija je: "  + rez);
    }
}
