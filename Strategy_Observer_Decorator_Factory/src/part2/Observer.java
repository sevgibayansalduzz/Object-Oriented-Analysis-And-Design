package part2;

public interface Observer {
    /**
     * This methods notify observer with the given content.
     * @param o content
     */
    public void update(Object o);
}
