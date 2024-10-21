package vehicle;

public class MotorCycle implements Vehicle {
    private String name;

    public MotorCycle(String name) {
        this.name = name;
    }

    @Override
    public void pickUp(String customerName) {
        System.out.println(this.name + " esta buscando " + customerName);
    }

    @Override
    public void stop() {
        System.out.println(this.name + " parou");
    }
}
