import cz.tul.stin.kuryr.delivery.Delivery;

public class Main {
    public static void main(String[] args) {
        Delivery d1 = new Delivery("A123", 10, new TruckDelivery());
        
        Delivery d2 = new Delivery("B456", 5, new AirDelivery());

        Delivery d3 = new Delivery("C789", 5, new BikeDelivery());

        System.out.println("Delivery 1 cost: " + d1.calculatePrice());
        System.out.println("Delivery 2 cost: " + d2.calculatePrice());
        System.out.println("Delivery 3 cost: " + d3.calculatePrice());
    }
}
