public class AirDelivery implements ShippingMethod {
    private static double BASE_PRICE = 300;
    private static double PRICE_PER_KG = 25;
    
    @Override
    public double calculateCost(double weight) {
        return BASE_PRICE + (PRICE_PER_KG * weight);
    }
}
