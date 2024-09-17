package DesignPatterns.Factory;

public class VehicleFactory {
    public Vehicle getVehicle(String vehicleType){
        if(vehicleType==null){
            return null;
        }
        if(vehicleType.equalsIgnoreCase("car")){
            return  new Car();
        } else if (vehicleType.equalsIgnoreCase("bike")) {
            return  new Bike();
        }
        else{
            return null;
        }
    }
}
