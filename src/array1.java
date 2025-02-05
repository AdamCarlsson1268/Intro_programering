import java.util.InputMismatchException;
import java.util.Scanner;

public class array1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*System.out.println("Skriv två tal:");

        try {
            int number1 = Integer.parseInt(scan.nextLine());
            int number2 = Integer.parseInt(scan.nextLine());

            if (number1%number2==0){
                System.out.println(number1 / number2);
            }
        } catch (InputMismatchException e){
            System.out.println(e);
        }
        double tal1 = 0, tal2 = 0;

        while (true) {
            try {
                // Läs in det första talet
                System.out.print("Ange det första talet: ");
                tal1 = Double.parseDouble(scan.nextLine());

                // Läs in det andra talet
                System.out.print("Ange det andra talet: ");
                tal2 = Double.parseDouble(scan.nextLine());

                // Kontrollera om division med noll
                if (tal2 == 0) {
                    throw new ArithmeticException("Division med noll är inte tillåten.");
                }

                // Utför divisionen och skriv ut resultatet
                double resultat = tal1 / tal2;
                System.out.println("Kvoten är: " + resultat);
                break; // Avsluta loopen om allt gick bra
            } catch (NumberFormatException e) {
                // Om inmatningen inte går att omvandla till ett tal
                System.out.println("Felaktig inmatning. Försök igen. " + e.getMessage());
            } catch (ArithmeticException e) {
                // Om vi försöker dela med noll
                System.out.println("Fel: " + e.getMessage());
            } catch (Exception e) {
                // Om något annat fel inträffar
                System.out.println("Ett oväntat fel inträffade: " + e.getMessage());
            }
        }*/
        int[] numberArray = new int[5];
        int i = 0;
        int inputMismatchCount = 0;
        int arrayIndexOutOfBoundsCount = 0;

        while (i < 5) {
            System.out.print("skriv ett tal:(" + (i + 1) + "/5): ");

            try {
                int number = scan.nextInt();
                numberArray[i] = number;
                i++;
            } catch (InputMismatchException e) {
                System.out.println("Inget heltal, prova igen :)");
                inputMismatchCount++;
                scan.nextLine();
            }
        }
        while (true) {
            System.out.println("välj index 0-4");
            String input = scan.nextLine();

            if (input.contains("stop")) {
                System.out.println("stoppar program");
                break;
            }
            try {
                int index = Integer.parseInt(input);
                System.out.println("Värdet på index " + index + " är " + numberArray[index]);
            } catch (NumberFormatException e) {
                System.out.println(inputMismatchCount + "Ajdå nu blev det fel. Skriv ett gilltigt index");
                inputMismatchCount++;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(arrayIndexOutOfBoundsCount+" Ajdå nu blev det fel, skriv ett tal mellan 0-1" );
                arrayIndexOutOfBoundsCount++;
            }
            System.out.println(arrayIndexOutOfBoundsCount);
        }
    }
}








