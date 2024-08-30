package kata_java_peaje;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TruckTest {

    @Test
    void testCalculateToll() {
        Truck truckWith2Axles = new Truck("TRK123", 2);
        Truck truckWith4Axles = new Truck("TRK456", 4);
        assertEquals(100.0, truckWith2Axles.calculateToll(), "The toll for a truck with 2 axles should be 100.0");
        assertEquals(200.0, truckWith4Axles.calculateToll(), "The toll for a truck with 4 axles should be 200.0");
    }
}
