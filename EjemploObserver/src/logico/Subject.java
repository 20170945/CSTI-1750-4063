package logico;

import java.util.ArrayList;

public abstract class Subject {
    private ArrayList<Observer> observers;

    public void notifyObservers() {
        for (Observer observer :
                observers) {
            observer.update();
        }
    }

    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    public boolean removeObserver(Observer observer) {
        return this.observers.remove(observer);
    }
}
