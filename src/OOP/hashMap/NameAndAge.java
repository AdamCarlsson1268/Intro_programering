package OOP.hashMap;

import java.util.HashMap;
import java.util.Scanner;


public class NameAndAge {
    public static void main(String[] args) {
        HashMap<String, Integer> nameAndAge = new HashMap<>();
        nameAndAge.put("adam",29);
        nameAndAge.put("emma", 29);
        nameAndAge.put("jenny", 62);
        nameAndAge.put("thomas", 58);
        nameAndAge.put("ludwig", 26);
        Scanner scan = new Scanner(System.in);
        System.out.println(nameAndAge);
        System.out.println("Skriv det namn du vill veta ålder på: ");
        String name = scan.nextLine();
        System.out.println(name +" är " + nameAndAge.get(name)+" år. ");





    }

}
