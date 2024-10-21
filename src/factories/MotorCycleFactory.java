package factories;

import vehicle.Vehicle;
import vehicle.MotorCycle;
public class MotorCycleFactory extends VehicleFactory {

    @Override
    public Vehicle getVehicle(String vehicleName) {
        return new MotorCycle(vehicleName);
    }
}