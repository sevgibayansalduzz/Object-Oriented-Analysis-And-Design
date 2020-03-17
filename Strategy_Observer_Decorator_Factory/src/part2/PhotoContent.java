package part2;

public class PhotoContent implements ContentBehavior {

    /**
     * This data field holds information about photograph content.
     */
    private String info;

    /**
     * Consstructor takes information about photograph.
     * @param info information about photograph content.
     */
    public PhotoContent(String info) {
        this.info=info;
    }

    /**
     * This method returns information about the content.
     * @return information about the content
     */
    @Override
    public String getInfo() {
        return "Photo name: "+this.info;
    }
}
