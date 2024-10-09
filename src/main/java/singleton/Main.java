package singleton;

public class Main {
    public static void main(String[] args) {
        // test the singleton pattern

//      because the singleton class has private constructor we cannot create object
//        Singleton s1 = new Singleton();

        // we will get instance of the class twice and test if they have the same reference
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        boolean result = s1 == s2;
        System.out.println("is they have the same reference :  " +result);

        System.out.println("s1 name : "+s1.getName());
        s1.setName("Mohamed Ashraf");
        System.out.println("s2 name : "+s2.getName());
    }
}
