package creational.singleton;

/**
 * Created by amit.jain on 07/12/14.
 */
public class Singleton {

    public static Singleton getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }

    private Singleton() {}

    private static Singleton INSTANCE;
}
