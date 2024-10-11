package factoryMethod;

public class SeaShipmentApp extends ShipmentApp {
    //this class consider as concrete creator class
    @Override
    Transport createTransport() {
        return new Ship();
    }
}
