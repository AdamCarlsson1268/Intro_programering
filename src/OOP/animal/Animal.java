package OOP.animal;
//superklass
public abstract class Animal {
    public String name;
    public int age;
    public String behavior;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
        this.behavior ="jump";
    }

    public void wrtieName() {
        System.out.println(name);
    }

    public void behavior() {
        System.out.println("jumping");
    }

    public void setBehavior(String behavior) {
        this.behavior = behavior;
    }


    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}
