package OOP2;

public class BankAccount {


    private double saldo;

    BankAccount(double saldo) {
        this.saldo = saldo;
    }

    public void printSaldo() {
        System.out.println("Ditt saldo är: " + saldo + " kronor");
    }

    public void deposit(double summa) {
        if (summa > 0) {
            this.saldo += summa;
            System.out.println(summa + " kronor har lagts till på ditt konto.");
        } else {
            System.out.println("Summa måste vara större än 0.");
        }
    }

    public void withdraw(double summa) {
        if (summa > 0 && summa <= saldo) {
            this.saldo -= summa;
            System.out.println(summa + " kronor har tagits från ditt konto.");
        } else {
            System.out.println("Ogiltig summa. Kontrollera beloppet och försök igen.");
        }
    }
}