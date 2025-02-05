package OOP.practice;

public class PracticeAlltraining {
    public int[] arrayRandomer() {
        int[] randomArray = new int[10];

        int min = 1;
        int max = 100;
        int range = min - max + 1;

        for (int i = 0; i < 10; i++) {
            int rand = (int) (Math.random() * range) + max;
            randomArray[i] = rand;
        }
        return randomArray;


    }
}