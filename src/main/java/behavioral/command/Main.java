package behavioral.command;

/**
 * Created by amit.jain on 07/12/14.
 */
public class Main {
    public static void main(String args[]) {
        Application app = new Application();
        Invoker invoker = new Invoker(new ConcreteCommand(app));

        invoker.click();


    }
}
