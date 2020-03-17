package part2;

public class TextContent implements ContentBehavior {

    /**
     * This data field holds information about text content.
     */
    private String info;
    /**
     * Consstructor takes information about text.
     * @param info information about text content.
     */
    public TextContent(String info) {
        this.info=info;
    }

    /**
     * This method returns information about the content.
     * @return information about the content
     */
    @Override
    public String getInfo() {
        return "Audio name: "+this.info;
    }
}
