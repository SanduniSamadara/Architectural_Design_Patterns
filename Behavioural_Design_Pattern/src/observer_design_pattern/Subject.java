package observer_design_pattern;

import java.util.*;

public class Subject {
    private List<Observer> observers = new ArrayList<>();

    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyToAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyToAllObservers(){
        for (Observer observer:observers) {
            observer.update();
        }
    }
}
