package ud6.ejercicios;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class DiscountSystemTest {
    
    @Test
    void testApplyDiscount() {

        assertEquals(10, DiscountSystem.applyDiscount(10, false));
        assertEquals(10, DiscountSystem.applyDiscount(10, true));
        assertEquals(60 - (60.0*0.05), DiscountSystem.applyDiscount(60, false));
        assertEquals(60 - (60.0*0.05), DiscountSystem.applyDiscount(60, true));
        assertEquals(120 - (120.0*0.1), DiscountSystem.applyDiscount(120, false));
        assertEquals(120 - (120.0*0.1), DiscountSystem.applyDiscount(120, true));
        assertEquals(220 - (220.0*0.1), DiscountSystem.applyDiscount(220, false));
        assertEquals(200 - (220.0*0.15), DiscountSystem.applyDiscount(220, true));
    }
}
