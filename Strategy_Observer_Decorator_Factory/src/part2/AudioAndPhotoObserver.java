package part2;

public class AudioAndPhotoObserver implements Observer
{
    /**
     * This data field holds information about the observer name .
     */
    String name;
    /**
     * This constructor takes a name of observer as String
     * @param name
     */
    public AudioAndPhotoObserver(String name) {
        this.name=name;
    }

    /**
     * This methods update observer about the new photograph and audio content.
     * @param o content
     */
    @Override
    public void update(Object o) {
        if(o instanceof Publisher){
            Publisher p = (Publisher) o;
            if (p.getContent() instanceof PhotoContent)
                System.out.println(name+" --> New Photo Available: \t"+p.getContent().getInfo());
            else if (p.getContent() instanceof AudioContent)
                System.out.println(name+" --> New Audio Available: \t"+p.getContent().getInfo());
        }
    }
}
