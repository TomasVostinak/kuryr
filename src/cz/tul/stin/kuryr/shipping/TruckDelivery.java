public class TruckDelivery implements ShippingMethod {
    private static double BASE_PRICE = 100;
    private static double PRICE_PER_KG = 10;
    
    @Override
    public double calculateCost(double weight) {
        return BASE_PRICE + (PRICE_PER_KG * weight);
    }
}
