package oopC;

public class CSub extends C {
    private String cscText;

    CSub() {
        System.out.println("detta skrivs ut vid objekt");

    }

    CSub(String cscText) {
        System.out.println("detta skrivs bara om du har ett invärde");
        this.cscText = cscText;
    }
}
