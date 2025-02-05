package morse;

import java.util.Scanner;

public class morseMain {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // Testa med en exempel-morsekod
        //String morseCode = "... --- ... / .... . .-.. .-.. ---";
        String input = scan.nextLine();

        String translatedText = morseLogic.translateInput(input);

        System.out.println("Översatt text: " + translatedText);


    }
}
