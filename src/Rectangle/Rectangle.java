package Rectangle;


public class Rectangle {

    private int height, widht;

    public Rectangle(int heightinput, int widhtinput) {
        height = heightinput;
        widht = widhtinput;
    }

    public int calculateArea() {
        return height * widht;
    }

    public int calculatePerimeter() {
        return height + height + widht + widht;
    }

    public boolean isSquare() {
        return height==widht;
    }
    public boolean isNotSquare(){
        return height!=widht;
    }



}
