package creational.singleton;

/**
 * Created by amit.jain on 07/12/14.
 */
public class Main {

    public static void main(String args[]) {
        Singleton singleton_1 = Singleton.getInstance();
        Singleton singleton_2 = Singleton.getInstance();

        if(singleton_1 == singleton_2) {
            System.out.println("Both are same");
        } else {
            System.out.println("Both are different");
        }

    }
}