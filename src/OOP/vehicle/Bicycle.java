package OOP.vehicle;

public class Bicycle extends Vehicle{
    public int nbrgr = 1;

    public void nbrOfGears(int nbr){
        nbrgr=nbr;
    }

    public void increaseSpeed(int force){
        speed+=force*nbrgr;
    }
}
