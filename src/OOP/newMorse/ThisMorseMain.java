package OOP.newMorse;

import java.util.Scanner;

public class ThisMorseMain {
    public static void main(String[] args) {
        // Skapa en instans av MorseTranslator
        MorseTranslator translator = new MorseTranslator();

        // Skapa en Scanner för att ta emot användarinmatning
        Scanner scanner = new Scanner(System.in);

        System.out.println("Välj en operation:");
        System.out.println("1: Text till Morse");
        System.out.println("2: Morse till Text");
        System.out.print("Ange ditt val (1 eller 2): ");
        int choice = scanner.nextInt();
        scanner.nextLine();  // Konsumerar den extra newline-tecknet efter nextInt()

        if (choice == 1) {
            // Text till Morse
            System.out.print("Ange text att översätta till morse: ");
            String text = scanner.nextLine();
            String morse = translator.textToMorse(text);
            System.out.println("Morse kod: " + morse);
        } else if (choice == 2) {
            // Morse till Text
            System.out.print("Ange morse kod att översätta till text: ");
            String morse = scanner.nextLine();
            String translatedText = translator.morseToText(morse);
            System.out.println("Översatt text: " + translatedText);
        } else {
            System.out.println("Felaktigt val.");
        }

        scanner.close();
    }
}
