package factories;

import vehicle.Vehicle;
import vehicle.Car;

public class CarFactory extends VehicleFactory {

    @Override
    public Vehicle getVehicle(String vehicleName) {
        return new Car(vehicleName);
    }
}
