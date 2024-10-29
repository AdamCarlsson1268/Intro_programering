package Rectangle;

import java.util.Scanner;

public class RectangleMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("skriv höjd: ");
        int height = scan.nextInt();
        System.out.print("Skriv bred: ");
        int widht = scan.nextInt();
        Rectangle rectangle = new Rectangle(height, widht);
        System.out.println("Area är: "+ rectangle.calculateArea());
        System.out.println("Omkrests är: "+ rectangle.calculatePerimeter());
        System.out.println("kvadrat: "+rectangle.isSquare());
        /*int height = scan.nextInt();
        if (height!=widht){
            System.out.println(rectangle.isSquare());
        if else  (height!=widht)
                System.out.println();}*/

    }
}
