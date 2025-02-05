package OOP.animal;
//subklass
public class Frog extends Animal {

    Frog(String name,int age) {
        super(name, age);
    }
    @Override
    public void behavior() {
        System.out.println("jumping");
    }
    public void behavior(int lenght, int nmbrOfJumps){
        System.out.println(lenght*nmbrOfJumps);
    }
}
