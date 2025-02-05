package assignment;

import java.util.Scanner;

public class WriteOutMain {
    public static void main(String[] args) {
        System.out.println("Hej Användare!");
        Scanner scan = new Scanner(System.in);
        WriteOutLogic logic = new WriteOutLogic();
        String input;

        while (true) {
            input = scan.nextLine();
            if (logic.stopProgram(input)) {
                break;
            }
            int amountOfCharacters = input.length();
            logic.addRow();
            logic.addCharacters(amountOfCharacters);
        }

        System.out.println(logic.getAmountOfRows());
        System.out.println(logic.getAmountOfCharacters());

    }
}
