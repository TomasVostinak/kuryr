import cz.tul.stin.kuryr.shipping.ShippingMethod;

public class Delivery {
    private String trackingNumber;
    private double weight;
    private ShippingMethod shippingMethod;

    public Delivery(String trackingNumber, double weight, ShippingMethod shippingMethod) {
        this.trackingNumber = trackingNumber;
        this.weight = weight;
        this.shippingMethod = shippingMethod;
    }

    public double calculatePrice() {
        return shippingMethod.calculateCost(weight);
    }
}
