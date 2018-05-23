package behavioral.observer;

/**
 * Created by amit.jain on 07/12/14.
 */
public class ConcreteObserver implements Observer {

    @Override
    public void update(Subject subject) {
        if(subject == this.subject) {
            System.out.println("ConcreteObserver: update() --> Update happened");
        }
    }

    public ConcreteObserver(Subject subject) {
        this.subject = subject;
    }

    private Subject subject;
}
