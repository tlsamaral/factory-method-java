package vehicle;

public class Car implements Vehicle {
    private String name;

    public Car(String name) {
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
