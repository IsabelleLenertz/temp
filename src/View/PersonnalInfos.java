package View;

import java.util.*;

/**
 * Displays a character's information
 */
public class PersonnalInfos extends SideInfos {

    /**
     * @param name
     * @param desc
     * @param jobs
     * @param img
     *
     * Default constructor
     */
    public PersonnalInfos(String name, String desc, ArrayList<String> jobs, String img) {
        super(name, desc);
        this.jobs = jobs;
        this.images = img;
    }
    /**
     *  List of the jobs that the character can do
     */
    private ArrayList<String> jobs;

    /**
     * Path to the image
     */
    private String images;

}