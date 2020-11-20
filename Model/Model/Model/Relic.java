package Model;

import java.util.*;

/**
 * 
 */
public class Relic {

    /**
     * Default constructor
     */
    public Relic() {
    }

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private String desc;

    /**
     * 
     */
    private String img;

    /**
     * 
     */
    private Set<ExploitationTool> usedExploitationTool;

    /**
     * 
     */
    private Set<String> relicInformation;

    /**
     * 
     */
    private Integer value;

    /**
     * 
     */
    private Boolean isFound;


    /**
     * @param usedExpoitationTools 
     * @return
     */
    public String analyse(Set<ExploitationTool> usedExpoitationTools) {
        // TODO implement here
        return "";
    }

    /**
     * @return
     */
    public Integer getValue() {
        // TODO implement here
        return null;
    }

}