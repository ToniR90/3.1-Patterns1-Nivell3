package model;

public class Plane implements Vehicle{
    @Override
    public void start() {
        System.out.println("The plane is starting");
    }

    @Override
    public void accelerate() {
        System.out.println("The plane is accelerating");
    }

    @Override
    public void brake() {
        System.out.println("The plane is braking");
    }
}
