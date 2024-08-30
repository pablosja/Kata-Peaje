package kata_java_peaje;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MotorcycleTest {

    @Test
    void testCalculateToll() {
        Motorcycle motorcycle = new Motorcycle("XYZ987");
        assertEquals(50.0, motorcycle.calculateToll(), "The toll for a motorcycle should be 50.0");
    }
}
