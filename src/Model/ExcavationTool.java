package Model;

import java.util.ArrayList;

/**
 * 
 */
public class ExcavationTool {

    private String name;
    private final String desc;
    private final ArrayList<JobEnum> requirements;
    private boolean isHighlight;
    private State status;

    /**
     * constructor for the excavation tool
     * @param name name of the excavation tool
     * @param desc description of the excavation tool
     * @param requirements job who require for used the relics
     */
    public ExcavationTool(String name, String desc, ArrayList<JobEnum> requirements) {
        this.name = name;
        this.desc = desc;
        this.requirements = requirements;
        this.isHighlight = false;
        this.status = State.UNSELECTED;
    }

    /**
     * getter for the excavation name
     * @return name of the excavation tool
     */
    public String getName() {
        return name;
    }

    /**
     * setter for the excavation name
     * @param name new name of the excavation tool
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * getter for the description of the excavation tool
     * @return the description of the exaction tool
     */
    public String getDesc() {
        return desc;
    }

    /**
     * getter for the requirement of the excavation tool
     * @return list of the jobs who is required for this excavation tool
     */
    public ArrayList<JobEnum> getRequirements() {
        return requirements;
    }

    /**
     * check if the excavation tool is highlighted or not
     * @return the status of the excavation tool
     */
    public boolean isHighlight() {
        return isHighlight;
    }

    /**
     * set the highlighted variable on true or false
     * @param highlight the value that the isHighlighted variable should take
     */
    public void setHighlight(boolean highlight) {
        isHighlight = highlight;
    }

    /**
     * getter for the status of the excavation tool
     * @return the state who is the excvation tool (SELECTED,UNSELECTED,UNAVAILABLE)
     */
    public State getStatus() {
        return status;
    }

    /**
     * set the status of the excavation tool
     * @param status the status that must be taken by the excavqtion tool
     *               (SELECTED,UNSELECTED,UNAVAILABLE)
     */
    public void setStatus(State status) {
        this.status = status;
    }
}