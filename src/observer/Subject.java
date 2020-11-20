package observer;

import java.util.ArrayList;

/**
 * Subject that can notify observers, the storing of those observers is left to be handled by the implementation
 */
public interface Subject {
    /**
     * Add an observer to this subject
     * @param obs
     */
    public void addObserver(Observer obs);

    /**
     * Getter of the list of observers
     * @return
     */
    public ArrayList<Observer> getObservers();

    /**
     * Procedure to notify all observer by using their update() method
     */
    public default void notifyObservers() {
        for (Observer obs : getObservers()) {
            obs.update();
        }
    }
}
