package factoryMethod;

public class Main {
    public static void main(String[] args) {

        ShipmentApp roadShipmentApp=new RoadShipmentApp();
        ShipmentApp seaShipmentApp=new SeaShipmentApp();

        // i have now different types of shipment app

        // the first is road shipment
        roadShipmentApp.planDelivery();

        //the second is sea shipment
        seaShipmentApp.planDelivery();

        // now if i want to deliver with new type of transportation i will just add a new transportation type (plane,bike,...)
        // and create a new shipment app that extend the shipment app and implement the createTransport fun
        // so , now i added a new delivery app without modifying any of my classes
    }
}
