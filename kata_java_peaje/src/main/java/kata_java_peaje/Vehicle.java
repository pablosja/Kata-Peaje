package kata_java_peaje;

public abstract class Vehicle {
    protected String licensePlate;

    public Vehicle(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public abstract double calculateToll();
}
