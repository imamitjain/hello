package behavioral.observer;

/**
 * Created by amit.jain on 07/12/14.
 */
public class Main {

    public static void main(String args[]) {
        Subject subject = new Subject();
        Observer concreteObserver = new ConcreteObserver(subject);
        Observer secondConcreteObserver = new SecondConcreteObserver(subject);

        subject.addObserver(concreteObserver);
        subject.addObserver(secondConcreteObserver);
        subject.notifyAllObserver();

        subject.removeObserver(concreteObserver);
        subject.notifyAllObserver();

        subject.removeObserver(secondConcreteObserver);
        subject.notifyAllObserver();
    }
}
