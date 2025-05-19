package app;

import command.AccelerateCommand;
import command.BrakeCommand;
import command.StartCommand;
import controller.ParkingController;
import model.Bicycle;
import model.Car;
import model.Plane;
import model.Ship;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        Plane plane =  new Plane();
        Ship ship = new Ship();

        ParkingController controller = new ParkingController();

        controller.executeCommand(new StartCommand(car));
        controller.executeCommand(new AccelerateCommand(car));
        controller.executeCommand(new BrakeCommand(car));
        System.out.println();
        controller.executeCommand(new StartCommand(bicycle));
        controller.executeCommand(new AccelerateCommand(bicycle));
        controller.executeCommand(new BrakeCommand(bicycle));
        System.out.println();
        controller.executeCommand(new StartCommand(plane));
        controller.executeCommand(new AccelerateCommand(plane));
        controller.executeCommand(new BrakeCommand(plane));
        System.out.println();
        controller.executeCommand(new StartCommand(ship));
        controller.executeCommand(new AccelerateCommand(ship));
        controller.executeCommand(new BrakeCommand(ship));
    }
}