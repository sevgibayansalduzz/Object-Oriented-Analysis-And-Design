package part2;

public class AudioContent implements ContentBehavior {
    /**
     * This data field holds information about audio content .
     */
    private String info;
    /**
     * Consstructor takes information about audio.
     * @param info information about audio content.
     */
    public AudioContent(String info) {
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
