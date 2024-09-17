package DesignPatterns.Factory;

public class FactoryDemo {
    public static void main(String[] args) {
        VehicleFactory vFac =new VehicleFactory();
        Vehicle v1= vFac.getVehicle("car");
        v1.drive();
        Vehicle v2= vFac.getVehicle("bike");
        v2.drive();
    }

}
