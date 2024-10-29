package circle;

public class Circle {


    double radie;      //klassvariabel, attribut

    public Circle(double r) {
        radie = r;
    }


    public double calculateArea() {
        return radie*radie*3.14;
    }
}
