package OOP.vehicle;


import java.util.Scanner;

public class VehicleRaceMain {
    public static void main(String[] args) {
        VehicleCar vCar = new VehicleCar();
        Bicycle bicycle = new Bicycle();
        Scanner scan = new Scanner(System.in);


        bicycle.increaseSpeed(10);
        bicycle.showSpeed();
        bicycle.nbrOfGears(7);
        bicycle.increaseSpeed(10);
        bicycle.showSpeed();
        vCar.increaseSpeed(30);
        vCar.showSpeed();
    }
}
