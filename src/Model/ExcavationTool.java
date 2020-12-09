package Model;

import java.util.ArrayList;

/**
 * 
 */
public class ExcavationTool {

    private String name;
    private String desc;
    private ArrayList<JobEnum> requirements;
    private boolean isHighligt;
    private State status;
    /**
     * Default constructor
     */
    public ExcavationTool() {
    }

    public ExcavationTool(String name, String desc, ArrayList<JobEnum> requirements) {
        this.name = name;
        this.desc = desc;
        this.requirements = requirements;
        this.isHighligt = false;
        this.status = State.UNSELECTED;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public ArrayList<JobEnum> getRequirements() {
        return requirements;
    }

    public boolean isHighligt() {
        return isHighligt;
    }
    public void setHighligt(boolean highligt) {
        isHighligt = highligt;
    }

    public State getStatus() {
        return status;
    }
    public void setStatus(State status) {
        this.status = status;
    }
}