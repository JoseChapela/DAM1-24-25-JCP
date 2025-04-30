package examen;
public class ShippingCostCalculator {
    public static double calculateShipping(double amount, boolean expressDelivery) {
        if (amount < 0)
            throw new IllegalArgumentException("O importe non pode ser negativo");

        if (amount >= 100)
            return 0.0;

        double shippingCost = expressDelivery ? 10.0 : 5.0;

        if (amount < 20) {
            shippingCost += 2.0;
        }

        return shippingCost;
    }
}
