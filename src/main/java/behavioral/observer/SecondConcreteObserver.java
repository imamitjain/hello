package behavioral.observer;

/**
 * Created by amit.jain on 07/12/14.
 */
public class SecondConcreteObserver implements Observer {

    @Override
    public void update(Subject subject) {
        if(subject == this.subject) {
            System.out.println("SecondConcreteObserver: update() --> Update happened");
        }
    }

    public SecondConcreteObserver(Subject subject) {
        this.subject = subject;
    }

    private Subject subject;
}
