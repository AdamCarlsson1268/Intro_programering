package Training;

import javax.swing.plaf.PanelUI;

public class petZoo {

    private String pet; //attribut

    public petZoo(String petName) { //kontruktor
        pet = petName;
    }

    public void printName() { //inget att skicka tillbaka
        System.out.println("the name is " + pet);
    }

    public String getPet(){
        return pet;
    }
}