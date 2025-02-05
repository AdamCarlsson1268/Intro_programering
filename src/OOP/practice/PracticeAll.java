package OOP.practice;

public class PracticeAll {

    public static void main(String[] args) {
        int[] randomArray = new int[10];

        int min = 1;
        int max = 100;
        int range = min - max + 1;

        for (int i=0;i<10;i++){
            int rand = (int) (Math.random()*range)+max;
            randomArray[i] = rand;
        }
        for (int i=0;i<10;i++){
            System.out.println(randomArray[i]);
        }

        /*RandomGenerator generator = new RandomGenerator();
        int[] newArray = generator.randomArray();
        for (int i=0;i<10;i++){
            System.out.println(newArray[i]);*/



        }

    }






