package Training;

public class PetZooMain {
    public static void main(String[] args) {


        petZoo dog = new petZoo("Pelle");
        petZoo cat = new petZoo("Lusse");
        petZoo rabbit = new petZoo("Holly");

        /*dog.printName();
        cat.printName();
        rabbit.printName();*/

        String dogName = dog.getPet();
        String catName = cat.getPet();
        String rabbitName = rabbit.getPet();
        for(int i=0;i<2;i++){
            System.out.println(dogName);
            System.out.println(catName);
            System.out.println(rabbitName);
        }


    }
}
