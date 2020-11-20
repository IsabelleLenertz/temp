package View;

/**
 * Displays a relic's information
 */
public class RelicInfo extends SideInfos {

    /**
     * @param name
     * @param desc
     * @param img
     *
     * Default constructor
     */
    public RelicInfo(String name, String desc, String img)
    {
        super(name, desc);
        this.image = img;
    }

    private String image;

}