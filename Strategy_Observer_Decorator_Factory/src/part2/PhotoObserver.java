package part2;

public class PhotoObserver implements Observer {
    /**
     * This data field holds information about the observer name.
     */
    String name;
    /**
     * This constructor takes a name of observer as String
     * @param name
     */
    public PhotoObserver(String name) {
        this.name=name;
    }

    /**
     * This methods update observer about the new photograph content.
     * @param o content
     */
    @Override
    public void update(Object o) {
        if(o instanceof Publisher){
            Publisher p = (Publisher) o;
            if (p.getContent() instanceof PhotoContent)
                System.out.println(name+" --> New Photo Available: \t"+p.getContent().getInfo());
        }
    }
}
