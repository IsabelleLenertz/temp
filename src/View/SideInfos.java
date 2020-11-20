package View;

/**
 * Name of the character/method/object
 **/
public abstract class SideInfos {

    /**
     * @param name
     * @param desc
     *
     * Default constructor
     */
    public SideInfos(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    private String name;

    private String desc;
}
