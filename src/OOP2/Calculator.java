package OOP2;

public class Calculator {
    //exempel för   att lära

    int x, y;

    Calculator (int inputA, int inputB) {

        x = inputA;
        y = inputB;
    }


    public int add() {
        return x + y;
    }

    public int sub (){
        return x-y;
    }
    public int mult(){
        return x*y;
    }
    public double div(){
        return (double) x/y;
    }
}
