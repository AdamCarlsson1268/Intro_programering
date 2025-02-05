package OOP.animal;

import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {
        /*
        Frog frog = new Frog("Pelle", 5);
        frog.wrtieName();
        frog.behavior();
        frog.behavior(2, 3);*/
        Scanner scan = new Scanner(System.in);
        System.out.println("vad heter grodan? ");

        String frogName = scan.nextLine();
        System.out.println("grodan heter " +frogName);
        System.out.println();

        System.out.println("hur gammal är den? ");
        int frogAge = scan.nextInt();
        System.out.println("grodan är " +frogAge+" år gammal");
        System.out.println();

        String frogTotal = scan.next();
        System.out.println("grodan heter " +frogName+ " är " +frogAge+" år gammal" );






    }

}
