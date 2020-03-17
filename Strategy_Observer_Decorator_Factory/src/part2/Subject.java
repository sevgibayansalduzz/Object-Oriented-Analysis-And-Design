package part2;

public interface Subject {
    /**
     * Default constructor creates an observer list.
     */
    public void registerObserver(Observer o);
    /**
     * Removes observer from the observers list
     * @param o observer
     */
    public void removeObserver(Observer o);
    /**
     * Notifys observers about new content.
     */
    public void notifyObserver();
}
