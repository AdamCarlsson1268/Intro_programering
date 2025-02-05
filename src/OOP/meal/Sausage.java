package OOP.meal;

public class Sausage extends Meal {



    public Sausage() {
        price = 15;
    }

    public void serve() {
        System.out.println("It is served in a bun");
    }

    public void kindOfFood() {
        System.out.println();
        System.out.println("Sausage");
    }

    public void addKetchup() {
        System.out.println();
        System.out.println("spray on the sausage");
        price += 2;
    }
}
