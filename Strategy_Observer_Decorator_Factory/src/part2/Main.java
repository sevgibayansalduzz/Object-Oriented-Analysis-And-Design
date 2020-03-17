package part2;

public class Main {
    public static void main(String[] args) {
        Publisher publisher=new Publisher();
        publisher.registerObserver(new PhotoObserver("observer1"));
        publisher.registerObserver(new AudioObserver("observer2"));
        publisher.registerObserver(new TextObserver("observer3"));
        publisher.registerObserver(new AudioAndPhotoObserver("observer4"));

        publisher.newContent(new AudioContent("Selena Gomez- look at her now."));
        publisher.newContent(new TextContent("Introduction to Design Pattern"));
        publisher.newContent(new PhotoContent("Istanbul Bogazı"));
    }
}
