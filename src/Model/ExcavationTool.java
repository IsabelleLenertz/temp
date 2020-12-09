package Model;

import java.util.ArrayList;

/**
 * 
 */
public class ExcavationTool {

    private final String name;
    private final String desc;
    private final ArrayList<JobEnum> requirements;
    private boolean isHighlight;
    private State status;

    /**
     * constructor for the excavation tool
     * @param name name of the excavation tool
     * @param desc description of the excavation tool
     * @param requirements list of jobs who are required for used this excavation tool
     */
    public ExcavationTool(String name, String desc, ArrayList<JobEnum> requirements) {
        this.name = name;
        this.desc = desc;
        this.requirements = requirements;
        this.isHighlight = false;
        this.status = State.UNSELECTED;
    }

    /**
     * getter for the excavation tool's name
     * @return name of the excavation tool
     */
    public String getName() {
        return name;
    }

    /**
     * getter for the excavation tool's description
     * @return description of the excavation tool
     */
    public String getDesc() {
        return desc;
    }

    /**
     * getter for the excavation tool's jobs requirements
     * @return list of the jobs required for used this excavation tool
     */
    public ArrayList<JobEnum> getRequirements() {
        return requirements;
    }

    /**
     * getter for know the highlight status
     * @return the highlight status, true or false
     */
    public boolean isHighligt() {
        return isHighlight;
    }

    /**
     * set the highlight status
     * @param highlight status that the isHighlight value should have
     */
    public void setHighligt(boolean highlight) {
        isHighlight = highlight;
    }

    /**
     * getter for the excavation tool's status
     * @return the status of the excavation tool (SELECT, UNSELECT,UNAVAILABLE)
     */
    public State getStatus() {
        return status;
    }

    /**
     * setter for the excavation tool's status
     * @param status make the status on one of these 3 possibilities : SELECT, UNSELECT,UNAVAILABLE
     */
    public void setStatus(State status) {
        this.status = status;
    }
}