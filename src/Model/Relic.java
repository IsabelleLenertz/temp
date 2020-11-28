package Model;

import java.io.File;
import java.util.*;

/**
 * 
 */
public class Relic {

    private String name;
    private String desc;
    File f;
    private Set<ExploitationTool> usedExploitationTool;
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
    public Relic(String name, String desc, String img, Set<ExploitationTool> usedExploitationTool, Set<String> relicInformation, Integer value) throws Exception {
        this.name = name;
        this.desc = desc;
        File f = new File(img);
        this.usedExploitationTool = usedExploitationTool;
        this.relicInformation = relicInformation;
        this.value = value;
        this.isFound = false;
        this.isHighlighted = false;
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

    public File getImg() {
        return f;
    }
    public void setImg(String img){
        f = null;
        f = new File(img);
    }

    public Set<ExploitationTool> getUsedExploitationTool() {
        return usedExploitationTool;
    }
    public void setUsedExploitationTool(Set<ExploitationTool> usedExploitationTool) {
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