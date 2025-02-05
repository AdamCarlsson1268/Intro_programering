package OOP.practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RandomNumber {

    //Skapa ett program som genererar och skriver ut ett slumpmässigt
    // heltal mellan två av användaren angivna tal n.

    public static void main(String[] args) {
        /*
        System.out.println("skriv in ett tal");
        int tal1 = Integer.parseInt(scan.nextLine());
        System.out.println("skriv in ett tal till");
        int tal2 = Integer.parseInt(scan.nextLine());

        for (int i=0;i<10; i++) System.out.println((int)(Math.random()*(tal2-tal1+1))+tal1);*/

        int korrektTal = (int) (Math.random() * 100) + 1;

        Scanner scan = new Scanner(System.in);

        int gissning = 0;
        int antalFörsök = 0;
        int felhanteringAntal = 0;

        System.out.println("Gissa ett tal mellan 1-100");

        while (gissning != korrektTal) {
            antalFörsök++;
            System.out.println("ange en gissning");
            try {


                gissning = scan.nextInt();
                if (gissning > 100) {
                    throw new IllegalArgumentException();
                }
                if (gissning < korrektTal) {
                    System.out.println("för lågt, försök igen, antalet försök: " + antalFörsök);
                } else if (gissning > korrektTal) {
                    System.out.println("för högt, försök igen, antalet försök: " + antalFörsök);
                }

            } catch (InputMismatchException e) {
                felhanteringAntal++;
                System.out.println("inte ett gilltigt tal, försök igen");
                scan.nextLine();
            } catch (IllegalArgumentException e) {
                System.out.println("talet kan inte vara över 100");
                felhanteringAntal++;
            }
        }
        System.out.println("Grattis, du gissade rätt nummer: " + korrektTal);
        System.out.println("På " + antalFörsök +" försök");
        System.out.println("Antal felkoder "+ felhanteringAntal);
    }


}



