package contornos.pruebas;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.jupiter.api.Test;

public class DiscountSystemTest {

    @Test
    void CheckMenos0() {
        try {
            assertEquals(0, DiscountSystem.applyDiscount(-0.1, false), 0.01);
            fail();
        } catch (Exception e) {}

        try {
            assertEquals(0, DiscountSystem.applyDiscount(-0.1, true), 0.01);
            fail();
        } catch (Exception e) {} 
    }
    
    @Test
    void CheckMenos50() {
        assertEquals(0, DiscountSystem.applyDiscount(0, false), 0.01);
        assertEquals(0, DiscountSystem.applyDiscount(0, true), 0.01);
        assertEquals(49.9, DiscountSystem.applyDiscount(49.9, false), 0.01);
        assertEquals(49.9, DiscountSystem.applyDiscount(49.9, true), 0.01);
    }

    @Test
    void CheckEntre50_100() {
        assertEquals(50*0.95, DiscountSystem.applyDiscount(50, false), 0.01);
        assertEquals(50*0.95, DiscountSystem.applyDiscount(50, true), 0.01);
        assertEquals(99.9*0.95, DiscountSystem.applyDiscount(99.9, false), 0.01);
        assertEquals(99.9*0.95, DiscountSystem.applyDiscount(99.9, true), 0.01);
    }

    @Test
    void CheckEntre100_200() {
        assertEquals(100*0.9, DiscountSystem.applyDiscount(100, false), 0.01);
        assertEquals(100*0.9, DiscountSystem.applyDiscount(100, true), 0.01);
        assertEquals(199.9*0.9, DiscountSystem.applyDiscount(199.9, false), 0.01);
        assertEquals(199.9*0.9, DiscountSystem.applyDiscount(199.9, true), 0.01);
    }

    @Test
    void CheckMas200() {
        assertEquals(200*0.9, DiscountSystem.applyDiscount(200, false), 0.01);
        assertEquals(200*0.85, DiscountSystem.applyDiscount(200, true), 0.01);
        assertEquals(200.1*0.9, DiscountSystem.applyDiscount(200.1, false), 0.01);
        assertEquals(200.1*0.85, DiscountSystem.applyDiscount(200.1, true), 0.01);
    }
}
