import utils.RandomCarAlgorithm;
import vehicle.Vehicle;

public class App {
    public static void main(String[] args) throws Exception {
         Vehicle randomVehicle = RandomCarAlgorithm.randomCarAlgorithm();
        
        // Exibe o resultado
        if (randomVehicle != null) {
            randomVehicle.pickUp("Bruno");
            randomVehicle.stop();
        }
    }
}
