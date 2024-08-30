package kata_java_peaje;

public class Car extends Vehicle {
    public Car(String licensePlate) {
        super(licensePlate);
    }

    @Override
    public double calculateToll() {
        return 100.0;
    }
}
