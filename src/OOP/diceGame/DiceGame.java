package OOP.diceGame;

import java.util.Random;
import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {


        Random rand = new Random();

        Scanner scan = new Scanner(System.in);

        System.out.println("Ange namn för Player 1: ");
        String name1 = scan.nextLine();
        System.out.println("Ange namn för Player 2: ");
        String name2 = scan.nextLine();

        DicePlayer player1 = new DicePlayer(name1);
        DicePlayer player2 = new DicePlayer(name2);

        boolean isPlayer1 = true;


        while (player1.getScore() < 50 && player2.getScore() < 50) {
            int totalScore = 0;
            int result;
            boolean kastaEn = false;
            System.out.println((isPlayer1 ? player1.getName() : player2.getName()) + "tur");

            while (true) {
                result = rand.nextInt(6) + 1;
                System.out.println("Du kastade en: " + result);

                if (result == 1) {
                    System.out.println("Du slog en 1, din tur är slut");
                    kastaEn = true;
                    break;
                }
                totalScore += result;
                System.out.println("Din score efter denna omgång är: " + totalScore);

                System.out.println("Vill du kasta igen? (Ja/Nej ");
                String svar = scan.nextLine();
                if (svar.equalsIgnoreCase("nej")) ;
                {
                    break;
                }
            }
            if (!kastaEn) {
                if (isPlayer1) {
                    player1.addScore(totalScore);
                    System.out.println(player1.getName() + " har nu " + player1.getScore() + " score");
                } else player2.addScore(totalScore);
                System.out.println(player2.getName() + " har nu " + player2.getScore() + " score");
            }
        }

//        if (player1.getScore() >= 50) {
//            System.out.println("Grattis " + player1.getName() + "! Du har vunnit över " + player2.getName());
//            break;
//        } else if (player2.getScore() >= 50) {
//            System.out.println("Grattis " + player2.getName() + "! Du har vunnit över " + player1.getName());
//            break;
//        }
//        isPlayer1 = !isPlayer1;

    }



}
