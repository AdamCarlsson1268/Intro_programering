package oopC;

public class CMain {
    public static void main(String[] args) {
        CSub csc = new CSub("invärde");
        System.out.println(csc.getcText());
        //System.out.println(csc.setcText("ny text för klass"));
    }
}
