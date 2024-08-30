package kata_java_peaje;

import java.util.ArrayList;
import java.util.List;

public class TollBooth {
    private String name;
    private String city;
    private double totalCollected;
    private List<Vehicle> vehicles;

    // Constructor con nombre y ciudad
    public TollBooth(String name, String city) {
        this.name = name;
        this.city = city;
        this.totalCollected = 0.0;
        this.vehicles = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public void registerVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
        totalCollected += vehicle.calculateToll();
    }

    public double getTotalCollected() {
        return totalCollected;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }
}
