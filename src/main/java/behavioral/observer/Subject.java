package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by amit.jain on 07/12/14.
 */

public class Subject {

    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    public void removeObserver(Observer observer) {
        if(observerList.contains(observer)) {
            observerList.remove(observer);
        }
    }

    public void notifyAllObserver() {
        for(Observer observer: observerList) {
            observer.update(this);
        }
    }

    private List<Observer> observerList = new ArrayList<Observer>();
}
