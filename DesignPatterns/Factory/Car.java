package DesignPatterns.Factory;

public class Car implements Vehicle{
    @Override
    public void drive() {
        System.out.println("Car drive");
    }
}
