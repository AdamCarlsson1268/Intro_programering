package OOP.newMorse;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThisMorseMain {
    public static void main(String[] args) {

        MorseTranslator translator = new MorseTranslator();

        Scanner scan = new Scanner(System.in);


        while (true) {
            System.out.println("Vill du översätta text eller morse?:");
            System.out.println("1: Skriv in bokstäver");
            System.out.println("2: Skriv in specialtecken");
            System.out.println("0: Avsluta program");
            System.out.print("Ange ditt val (1/2/0): ");


            int choice = -1;
            boolean validChoice = false;

            while (!validChoice) {
                try {
                    choice = scan.nextInt();
                    scan.nextLine();
                    if (choice == 1 || choice == 2 || choice == 0) {
                        validChoice = true;
                    } else {
                        throw new IndexOutOfBoundsException();

                    }
                } catch (InputMismatchException e) {
                    System.out.println("Du kan inte välja en bokstav, skriv en siffra ");
                    scan.nextLine();
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("Ogiltig inmatning, välj 1,2 eller 0 ");
                }
            }

            try {
                if (choice == 1) {
                    // text till morseöversättning
                    System.out.print("Vad ska översättas till morse: ");
                    String text = scan.nextLine();

                    if (text.trim().isEmpty()) {
                        System.out.println("Du har inte skrivit något, vänligen försök igen. ");
                    } else {
                        String morse = translator.textToMorse(text);
                        System.out.println("Morse kod: " + morse);
                    }
                } else if (choice == 2) {
                    // Morse till Textöversättning
                    System.out.print("Vad ska översättas till text: ");
                    String morse = scan.nextLine();
                    if (morse.trim().isEmpty()) {
                        System.out.println("Du har inte skrivit något, vänligen försök igen. ");
                    } else {
                        String translatedText = translator.morseToText(morse);
                        System.out.println("Översatt text: " + translatedText);
                    }
                } else if (choice == 0) {
                    System.out.println("Avslutar programmet nu. ");
                    break;
                } else {
                    System.out.println("Fel val, försök igen. ");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Översättning misslyckades");
            }
        }

        scan.close();
    }
}
