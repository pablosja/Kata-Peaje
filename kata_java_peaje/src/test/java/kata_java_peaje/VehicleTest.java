package kata_java_peaje;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VehicleTest {

    @Test
    void testCalculateToll() {
        Vehicle car = new Car("ABC123");
        assertEquals(100.0, car.calculateToll(), "The toll for a car should be 100.0");
        
        Vehicle motorcycle = new Motorcycle("XYZ987");
        assertEquals(50.0, motorcycle.calculateToll(), "The toll for a motorcycle should be 50.0");
        
        Vehicle truck = new Truck("TRK456", 4);
        assertEquals(200.0, truck.calculateToll(), "The toll for a truck with 4 axles should be 200.0");
    }

    @Test
    void testGetLicensePlate() {
        Vehicle car = new Car("ABC123");
        assertEquals("ABC123", car.getLicensePlate(), "The license plate should be 'ABC123'");

        Vehicle motorcycle = new Motorcycle("XYZ987");
        assertEquals("XYZ987", motorcycle.getLicensePlate(), "The license plate should be 'XYZ987'");

        Vehicle truck = new Truck("TRK456", 4);
        assertEquals("TRK456", truck.getLicensePlate(), "The license plate should be 'TRK456'");
    }
}
