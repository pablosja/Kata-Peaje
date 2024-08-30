package kata_java_peaje;

public class Truck extends Vehicle {
    private int numberOfAxles;

    public Truck(String licensePlate, int numberOfAxles) {
        super(licensePlate);
        this.numberOfAxles = numberOfAxles;
    }

    @Override
    public double calculateToll() {
        return 50.0 * numberOfAxles;
    }
}
