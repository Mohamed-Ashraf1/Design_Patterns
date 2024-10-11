package factoryMethod;

public class RoadShipmentApp extends ShipmentApp {
    //this class consider as concrete creator class
    @Override
    Transport createTransport() {
        return new Truck();
    }
}
