package examen;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.jupiter.api.Test;

public class ShippingCostCalculatorTest {
    @Test
    void importeNegativo() {
        try {
            ShippingCostCalculator.calculateShipping(-0.01, false);
            fail();
        } catch (Exception e){}
        try {
            ShippingCostCalculator.calculateShipping(-0.01, true);
            fail();
        } catch (Exception e){}
    }

    @Test
    void mayor100() {
        assertEquals(0, ShippingCostCalculator.calculateShipping(100, false), 0.01);
        assertEquals(0, ShippingCostCalculator.calculateShipping(100.1, false), 0.01);
        assertEquals(0, ShippingCostCalculator.calculateShipping(100, true), 0.01);
        assertEquals(0, ShippingCostCalculator.calculateShipping(100.1, false), 0.01);
    }

    @Test
    void entre100_20() {
        assertEquals(5, ShippingCostCalculator.calculateShipping(99.9, false), 0.01);
        assertEquals(10, ShippingCostCalculator.calculateShipping(99.9, true), 0.01);
        assertEquals(5, ShippingCostCalculator.calculateShipping(20, false), 0.01);
        assertEquals(10, ShippingCostCalculator.calculateShipping(20, true), 0.01);
        
    }

    @Test
    void menos20() {
        assertEquals(7, ShippingCostCalculator.calculateShipping(19.9, false), 0.01);
        assertEquals(12, ShippingCostCalculator.calculateShipping(19.9, true), 0.01);
        assertEquals(7, ShippingCostCalculator.calculateShipping(0, false), 0.01);
        assertEquals(12, ShippingCostCalculator.calculateShipping(0, true), 0.01);
    }
}
