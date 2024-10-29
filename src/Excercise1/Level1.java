package Excercise1;

import java.util.Scanner;

public class Level1 {
    public static void main(String[] args) {

        int plus = 1;
        int minus = 9;

        System.out.println(plus - minus);


        /*for (int i = 0; i<100;i+=2){
            System.out.println((i+2) + " bananer");
        }

        int first = 1;
        System.out.println(first + " ");

        int second = 1;


        for(int i=0; i<10;i++){
            System.out.println(second + " ");
            int third = first + second;
            first = second;
            second = third;

        }

        28.Skapa ett program som läser in en temperatur. Om temperaturen är mellan 18 och
        25 grader ska meddelandet “Lagom temp“ skrivas ut. Om det är varmare än 25grader ska
        “För varmt“ skrivas ut och om det är kallare än 18grader ska “För kallt“ skrivas ut
        int temp =23;
        if(temp>=18 && temp<=25)
            System.out.println("lagom");
        else if (temp<=18) System.out.println("för kallt");
        else if (temp>=25) System.out.println("för varmt");



        int sal = 8000;
        double sale = 10000;
        double prov = sale/100*9;
        System.out.println(sal+prov);

        int tal1 = 4;
        int tal2  = 8;
        int tal3  = 9;
        System.out.println((tal1+tal2+tal3)/3 );

        System.out.println();

        double sek = 1;
        double usd = 0.16;
        double gbp = 0.10;
        System.out.println(sek*569*usd);
        System.out.println(sek*732*gbp);

        System.out.println();

        double a = 4;
        double x = 5;
        System.out.println((a+x)*3+7);

        System.out.println();

        double gas = 50;
        double price = 17.44;
        double discount = 0.25;
        System.out.println((price-discount)*gas);

        System.out.println();

        int height = 3;
        int lenght = 6;

        System.out.println("arean är: "+ height*lenght);
        System.out.println("omkretsen är: " );

        System.out.println();

        int radie = 8;
        int diameter = radie*2;
        double pi = 3.14;
        System.out.println(diameter*pi);
        System.out.println(radie*radie*pi);

        System.out.println();

        int tal1 = 17;
        int tal2 = 7;

        if (tal1>tal2) {
            System.out.println("tal 1 är störst");}
        if (tal1<tal2){
            System.out.println("tal 2 är störst");
        }

        if (tal1>=tal2*2) {
            System.out.println("för stort");
        }

        if (tal1%2==0);
        System.out.println("no");

        int varapris = 1995;
        int antal = 8;
        int total = varapris*antal;
        double rabatt = 0.9;


        if (total>=1000){
        System.out.println("pris: "+total*rabatt);
        } else {
            System.out.println("pris: "+total);
        }


        int time = 20;
        if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }

        int tal1 = 7;
        double tal2 = 3;

        if (tal2==0){
            System.out.println("går ej att dela");
        } else {
            System.out.println(tal1/tal2);
        }

        int x = 13;
        int y = 7;
        if (x>y+5){
            System.out.println("a är: "+2);
        } else {
            System.out.println("a är: "+5 );
        }

        int hours = 40;
        int kr = 142;
        int weeklysalary = hours*kr;
        int hoursalary = weeklysalary/40;
        System.out.println("din timlön är: "+hoursalary);
        System.out.println("och din veckolön är: "+weeklysalary);

        int nummer1 = 65;
        if (nummer1>=0 && nummer1<=9)
            System.out.println(nummer1*nummer1);
        else if (nummer1<0 || nummer1>9) System.out.println("fel tal" );

        3.Skapa ett program som testar om ett inläst tal är jämnt delbart med 3 men inte med 30. I
så fall ska talet divideras med 3.

        int a = 367;
        if (a%3==0) {
            System.out.println("talet är delbart med 3");
        } else if (a%30!=0){
            System.out.println(a/3);
        }
        .Skapa ett program som läser in kroppstemperaturen och skriver ut ett lämpligt meddelande
om temperaturen är mindre än 35 grader eller större än 42 grader.


        double temp = 43;
        if (temp>=35 && temp<=42)
            System.out.println("det här bra ");
        else if (temp<35)
            System.out.println("nu är du lite kall");
        else if (temp>42)
            System.out.println("nu har du feber");

        double nummer1 = -12;
        if (nummer1<0) System.out.println("detta är negatvit");
        else if (nummer1>0) System.out.println("detta är positivt");

        double a = 1;
        double b = 13;
        if (a==b) System.out.println("talen är lika stora");
        else if (a>b) System.out.println(a+" är det största");
        else if (a<b) System.out.println(b+" är det största");



        int a = 14;
        int b = 23;
        int c = 9;

        if (a<b && a<c)
            System.out.println("a är minst");
            if (b<a && b<c)
                System.out.println("b är minst");
            if (c<b && c<a)
                System.out.println("c är minst");*/

        int number1 = 123;

        if (number1<10)
            System.out.println("det är mindre än 10");
        else if (number1<100) System.out.println("det är mindre än 100");
        else if (number1>100) System.out.println("det är större än 100");


        System.out.println();

        int n = 3;

        int produkt = 1;
        for (int i= 1; i <=3 ; i++){
            produkt = produkt * i;
            if (i != n) System.out.print(i + " * " );
            else System.out.print(i);
        }
        System.out.println(" = " + produkt);

        System.out.println();

        Scanner newScan;
        newScan = new Scanner(System.in);
        System.out.println("hur många tal vill du läsa in?");
        int antalTal = newScan.nextInt();
        //System.out.println(antalTal);
        int sum = 0;
        for(int i=0; i<antalTal; i++){
            System.out.println("skriv in ett tal");
            int tal = newScan.nextInt();
            sum = sum + tal;
            System.out.println();

        }
        System.out.println("Summan av alla " + antalTal + " är " + sum);





    }
}
