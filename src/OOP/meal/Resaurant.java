package OOP.meal;

import java.util.Scanner;

public class Resaurant {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Meal[] meals = new Meal[5];

        for (int i = 0; i < meals.length; i++) {
            System.out.println("What is you order? ");
            String food = scan.nextLine();
            if (food.equals("icecream")) {
                meals[i] = new IceCream();
                System.out.println("sprinkles? Y/N");
                if (scan.nextLine().equals("y")) {
                    ((IceCream) meals[i]).addSprinkles();
                }
            } else {
                meals[i] = new Sausage();
                System.out.println("ketchup? Y/N");
                if (scan.nextLine().equals("y")) {
                    ((Sausage) meals[i]).addKetchup();
                }
            }
        }

        /*meals[0] = new Sausage();
        meals[1] = new IceCream();
        meals[2] = new Sausage();
        meals[3] = new IceCream();
        meals[4] = new Sausage();*/

        for (int i = 0; i < meals.length; i++) {
            meals[i].kindOfFood();
            meals[i].serve();
        }
        int totalPrice = 0;
        for (int i = 0; i < meals.length; i++) {
            totalPrice += meals[i].getPrice();
        }
        System.out.println("The total price is: " + totalPrice);
    }
}

