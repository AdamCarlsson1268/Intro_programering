package OOP.hashMap;

import java.util.Scanner;

public class MainNamesAge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Vems ålder vill du veta");
        String name = scan.nextLine();
        NamesAge namesAge = new NamesAge();
        System.out.println(namesAge.getAge(name.trim()));
    }
}
