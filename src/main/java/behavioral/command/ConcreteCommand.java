package behavioral.command;

/**
 * Created by amit.jain on 07/12/14.
 */
public class ConcreteCommand implements Command {

    @Override
    public void execute() {
        System.out.println("ConcreateCommand: execute()");
        app.doSomething();
    }

    public ConcreteCommand(Application app) {
        this.app = app;
    }

    private Application app;

}
