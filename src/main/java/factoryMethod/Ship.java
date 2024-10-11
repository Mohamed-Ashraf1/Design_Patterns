package factoryMethod;

public class Ship implements Transport{
    @Override
    public void deliver() {
        System.out.println("deliver by sea in a container");
    }
}
