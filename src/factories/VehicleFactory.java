package factories;

import vehicle.Vehicle;

public abstract class VehicleFactory {
    // Factory Method
    public abstract Vehicle getVehicle(String vehicleName);

    public Vehicle pickUp(String customerName, String vehicleName) {
        Vehicle vehicle = getVehicle(vehicleName);
        vehicle.pickUp(customerName);
        return vehicle;
    }
}
