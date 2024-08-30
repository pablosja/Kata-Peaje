package kata_java_peaje;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TollBoothTest {

    @Test
    void testGetTotalCollected() {
        TollBooth tollBooth = new TollBooth("Central TollBooth", "City ABC");
        Vehicle car = new Car("ABC123");
        Vehicle motorcycle = new Motorcycle("XYZ987");
        Vehicle truck = new Truck("TRK456", 4);

        tollBooth.registerVehicle(car);
        tollBooth.registerVehicle(motorcycle);
        tollBooth.registerVehicle(truck);

        assertEquals(350.0, tollBooth.getTotalCollected(), "The total collected should be 350.0");
    }

    @Test
    void testGetVehicles() {

        TollBooth tollBooth = new TollBooth("Central TollBooth", "City ABC");

        Vehicle car = new Car("ABC123");
        Vehicle motorcycle = new Motorcycle("XYZ987");

        tollBooth.registerVehicle(car);
        tollBooth.registerVehicle(motorcycle);

        assertTrue(tollBooth.getVehicles().contains(car), "The vehicle list should contain the registered car");
        assertTrue(tollBooth.getVehicles().contains(motorcycle), "The vehicle list should contain the registered motorcycle");
    }

    @Test
    void testRegisterVehicle() {

        TollBooth tollBooth = new TollBooth("Central TollBooth", "City ABC");

        Truck truck = new Truck("TRK789", 3);
        tollBooth.registerVehicle(truck);

        assertEquals(150.0, tollBooth.getTotalCollected(), "The total collected should be 150.0 after registering the truck");
        assertTrue(tollBooth.getVehicles().contains(truck), "The vehicle list should contain the registered truck");
    }
}
