package behavioral.command;

/**
 * Created by amit.jain on 07/12/14.
 */
public class Invoker {

    public void click() {
        System.out.println("Invoker: click()");
        command.execute();
    }

    public Invoker(Command command) {
        this.command = command;
    }

    private Command command;
}
