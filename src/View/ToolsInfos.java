package View;

import java.util.*;

/**
 * Displays a tool's information
 */
public class ToolsInfos extends SideInfos {

    /**
     * @param name
     * @param desc
     * @param Requirement
     * @param img         Default constructor
     */
    public ToolsInfos(String name, String desc, ArrayList<String> Requirement, String img) {
        super(name, desc);
        this.requirement = Requirement;
        this.image = img;
    }

    /**
     * Objects needed to discover relics
     */
    private ArrayList<String> requirement;

    /**
     * Path to the image
     */
    private String image;

    public ArrayList<String> getRequirement() {
        return requirement;
    }

    public void setRequirement(ArrayList<String> requirement) {
        this.requirement = requirement;
    }
}
