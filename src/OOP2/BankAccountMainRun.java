package OOP2;

import java.util.Scanner;

public class BankAccountMainRun {
    public static void main(String[] args) {
 /* Skapa ett program BankAccount som kan hålla koll på hur stort saldo man har (pengar på sitt konto)
     11. 	Utöka programmet så att man kan skriva ut saldot
     12. 	Utöka programmet så att man kan bestämma ett nytt värde för saldo
     13. 	Utöka programmet så att man kan lägga till och ta bort en viss summa ifrån saldot
     14. 	Utöka programmet så att man aldrig kan få ett saldo som är mindre än 0 kronor
     Överkursuppgifter:

     15.Utöka programmet så att man i programmet som anropar BankAccount får reda på vad
         saldot är (så att man kan skriva ut det ifrån 	main-programmet istället för direkt i 	BankAccount).
         Metoden borde se ut ungefär 	såhär:
     public int getAmount() {
     return amount;}*/
    BankAccount BankAcc = new BankAccount(10000);
        BankAcc.printSaldo();

        Scanner Scan = new Scanner(System.in);
        BankAcc.deposit((double)Scan.nextInt());



    }
}
