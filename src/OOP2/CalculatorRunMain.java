package OOP2;

import java.util.Scanner;
import java.util.SortedMap;

public class CalculatorRunMain {
   static Scanner scanner = new Scanner(System.in);
    static Calculator calc;

    public static void main(String[] args) {


        System.out.println("Vad vill du göra? ");
        System.out.println("1 addera ");
        System.out.println("2 subtrahera ");
        System.out.println("3 Multiplicera ");
        System.out.println("4 Dividera ");
        int choice = scanner.nextInt();

        if (choice == 1) System.out.println(calc.add());
        if (choice == 2) System.out.println(calc.sub());
        if (choice == 3) System.out.println(calc.mult());
        if (choice == 4) System.out.println(calc.div());

    }


    private static void updateNumbers(){
        System.out.println("Skriv in tal 1 ");
        int tal1 = scanner.nextInt();
        System.out.println("Skriv in tal 2 ");
        int tal2 = scanner.nextInt();
        Calculator calc = new Calculator(tal1, tal2);
    }
}
