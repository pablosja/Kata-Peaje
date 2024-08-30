package kata_java_peaje;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {

    @Test
    void testCalculateToll() {
        Car car = new Car("ABC123");
        assertEquals(100.0, car.calculateToll(), "The toll for a car should be 100.0");
    }
}
