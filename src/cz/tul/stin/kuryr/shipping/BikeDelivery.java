public class BikeDelivery implements ShippingMethod {
    private static double FIXED_PRICE = 80;
    private static double MAX_KG = 5;
    
    @Override
    public double calculateCost(double weight) {
        if (weight > MAX_KG) {
            throw new IllegalArgumentException("Váha přesahuje maximální povolenou hmotnost (" + MAX_KG + " KG) pro doručení na kole.");
        }
        return FIXED_PRICE;
    }
}
