package part2;
import java.util.ArrayList;
import java.util.List;

public class Publisher implements Subject {

    /**
     * This data field holds reference to content.
     */
    private ContentBehavior content;
    /**
     * This data field holds observers.
     */
    private List<Observer> observers ;

    /**
     * Default constructor creates an observer list.
     */
    public Publisher() {
        this.observers=new ArrayList();
    }

    /**
     * Adds new observer to observers list.
     * @param o Observer
     */
    @Override
    public void registerObserver(Observer o) {
        this.observers.add(o);
    }

    /**
     * Removes observer from the observers list
     * @param o observer
     */
    @Override
    public void removeObserver(Observer o) {
        int i=this.observers.indexOf(o);
        if (i>=0)
            this.observers.remove(i);
    }

    /**
     * Notifys observers about new content.
     */
    @Override
    public void notifyObserver() {
        for(Observer o:this.observers)
            o.update(this);
    }

    /**
     * Getter method for content
     * @return content
     */
    public ContentBehavior getContent() {
        return content;
    }

    /**
     * This method uses for set new content.
     * @param content
     */
    public void newContent(ContentBehavior content) {
        this.content = content;
        notifyObserver();
    }

}
