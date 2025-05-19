package model;

public class Ship implements Vehicle{
    @Override
    public void start() {
        System.out.println("The ship is starting");
    }

    @Override
    public void accelerate() {
        System.out.println("The ship is accelerating");
    }

    @Override
    public void brake() {
        System.out.println("The ship is braking");
    }
}
