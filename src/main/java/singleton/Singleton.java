package singleton;

public class Singleton {

    // Singleton patter is a creational design pattern that ensure you have only 1 instance of the class
    // and it provide a single point of access to that object
    private static Singleton instance;
    private String name ;

    private Singleton() {
        this.name = "Singleton Class";
    }
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
