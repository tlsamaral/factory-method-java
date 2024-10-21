package utils;

import java.util.Random;

import factories.CarFactory;
import factories.MotorCycleFactory;
import vehicle.Vehicle;

public class RandomCarAlgorithm {
    public static Vehicle randomCarAlgorithm() {
        CarFactory carFactory = new CarFactory();
        MotorCycleFactory motorCycleFactory = new MotorCycleFactory();

        Vehicle car1 = carFactory.getVehicle("Onix Preto");
        Vehicle car2 = carFactory.getVehicle("HB20 Branco");
        Vehicle motorCycle = motorCycleFactory.getVehicle("Titan Azul");

        Vehicle[] vehicles = {car1, car2, motorCycle};

        return vehicles[randomNumber(vehicles.length)];
    }

    // Método utilitário para gerar um número aleatório
    public static int randomNumber(int bound) {
        Random random = new Random();
        return random.nextInt(bound);
    }
}
