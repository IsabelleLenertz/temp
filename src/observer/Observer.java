package observer;

/**
 * Interface to describe observers that can observer a subject
 */
public interface Observer {

    /**
     * Method that will be called when the subject notifies the observer
     */
    public void update();
}
