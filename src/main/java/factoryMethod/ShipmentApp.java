package factoryMethod;

public abstract class ShipmentApp {
    // the factory method pattern is a creational design pattern that decouple a given code
    // by separating the creation or construction code from the class that uses it
    // we have a shipment app that offer a shipping for products by several kind of transportation
    // so at first we were having just shipment by truck what if we want to add another transportation
    // should we open the class and modify ?

    //Use the Factory Method when you don’t know beforehand the exact types and dependencies of the objects your code should work with
    // this class consider as creator
    public void planDelivery(){
        Transport t=createTransport();
        t.deliver();

    }

    // this is the factory method for creating the transport and it will be implemented by subclasses
    abstract Transport createTransport();
}
