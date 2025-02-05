package OOP.switchDays;


import java.util.Scanner;

public class ThisCalcMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Skriv in ett tal");
        int a = Integer.parseInt(scan.nextLine());
        System.out.println("Skriv in ett till tal");
        int b = Integer.parseInt(scan.nextLine());
        while (true){
            System.out.println("Välj hur du vill räkna");
            String calculator = scan.nextLine();
            switch (calculator){
                case "addition":
                    System.out.println(ThisCalculator1.addition(a,b));
                    break;
                case "subtraction":
                    System.out.println(ThisCalculator1.subtraction(a,b));
                    break;
                case "multiplication":
                    System.out.println(ThisCalculator1.multiplication(a,b));
                    break;
                case "division":
                    System.out.println(ThisCalculator1.division(a,b));
                    break;
            }
        }
    }
}
