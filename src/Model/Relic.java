package Model;

import java.io.File;
import java.util.*;

/**
 * 
 */
public class Relic {

    private String name;
    private String desc;
    private String f;
    private ArrayList<ExploitationTool> usedExploitationTool;
    private Set<String> relicInformation;
    private Integer value;
    private Boolean isFound;
    private Boolean isHighlighted;
    private ArrayList<ExploitationTool> ExploitationToolsRequirement;

    /**
     * Default constructor
     */
    public Relic() {
    }

    /**
     * Constructor
     * @param name name of the relic
     * @param desc description of the reli
     * @param img img of the relic
     * @param usedExploitationTool list of the exploitation tools used
     * @param relicInformation list of information on the relic
     * @param value number of points
     * @throws Exception
     */
    public Relic(String name, String desc, String img, ArrayList<ExploitationTool> usedExploitationTool, Set<String> relicInformation, Integer value, ArrayList<ExploitationTool> exploitationToolsRequirement) throws Exception {
        this.name = name;
        this.desc = desc;
        this.f = img;
        this.usedExploitationTool = usedExploitationTool;
        this.relicInformation = relicInformation;
        this.value = value;
        this.isFound = false;
        this.isHighlighted = false;
        this.ExploitationToolsRequirement = exploitationToolsRequirement;
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

    public String getImg() {
        return f;
    }
    public void setImg(String img){
        this.f = img;
    }

    public ArrayList<ExploitationTool> getUsedExploitationTool() {
        return usedExploitationTool;
    }
    public void setUsedExploitationTool(ArrayList<ExploitationTool> usedExploitationTool) {
        this.usedExploitationTool = usedExploitationTool;
    }

    public Set<String> getRelicInformation() {
        return relicInformation;
    }
    public void setRelicInformation(Set<String> relicInformation) {
        this.relicInformation = relicInformation;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Boolean getFound() {
        return isFound;
    }
    public void setFound(Boolean found) {
        isFound = found;
    }

    public String analyse(ArrayList<ExploitationTool> usedExploitationTools) {
        StringBuilder res = new StringBuilder();
        for (ExploitationTool e: usedExploitationTools) {
            for (ExploitationTool j: ExploitationToolsRequirement) {
                if (e.getName().equals(j.getName())){
                    res.append(e.getName()).append(" est le bon outil\n");
                    // TODO implement the value increment
                }
            }
        }

        if(res.toString().equals("")){
            return "Aucun outils selectionner n'est le bon";
        }

        return res.toString();
    }

    public Integer getValue() {
        return this.value;
    }

    public boolean isHighlighted() {
        return isHighlighted;
    }
    public void setHighlighted(boolean highlighted) {
        isHighlighted = highlighted;
    }

    public ArrayList<ExploitationTool> getExploitationToolsRequirement() {
        return ExploitationToolsRequirement;
    }
    public void setExploitationToolsRequirement(ArrayList<ExploitationTool> exploitationToolsRequirement) {
        ExploitationToolsRequirement = exploitationToolsRequirement;
    }

}