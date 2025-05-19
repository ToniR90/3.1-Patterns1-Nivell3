package model;

public class Bicycle implements Vehicle{
    @Override
    public void start() {
        System.out.println("The bicycle is starting");
    }

    @Override
    public void accelerate() {
        System.out.println("The bicycle is accelerating");
    }

    @Override
    public void brake() {
        System.out.println("The bicycle is braking");
    }
}
