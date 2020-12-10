package Model;

import java.util.*;

/**
 * 
 */
public class Relic {

    private final String name;
    private final String desc;
    private final String imgPath;
    private final Integer baseValue;

    private final ArrayList<String> relicInformation;
    private final ArrayList<Integer> infoValues;

    private Boolean isFound = false;
    private Boolean isHighlighted = false;
    private int totalValue = 0;

    private final ArrayList<ExploitationTool> exploitationToolsRequirement;
    private final ArrayList<ExcavationTool> excavationToolsRequirement;

    /**
     *
     */
    public Relic(String name,
                 String desc,
                 String img,
                 Integer baseValue,
                 ArrayList<String> relicInformation,
                 ArrayList<Integer> infoValues,
                 ArrayList<ExploitationTool> exploitationToolsRequirement,
                 ArrayList<ExcavationTool> excavationToolsRequirement
    ) throws Exception {
        if (relicInformation.size() != infoValues.size() || relicInformation.size() != exploitationToolsRequirement.size())
            throw new Exception("Can not create the " + name + "relic, the size of relicInformation, infoValues and exploitationToolsRequirement must be the same");
        this.name = name;
        this.desc = desc;
        this.imgPath = img;
        this.baseValue = baseValue;
        this.relicInformation = relicInformation;
        this.infoValues = infoValues;
        this.exploitationToolsRequirement = exploitationToolsRequirement;
        this.excavationToolsRequirement = excavationToolsRequirement;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public String getImg() {
        return imgPath;
    }

    public Boolean getFound() {
        return isFound;
    }
    public void setFound(Boolean found) {
        isFound = found;
    }

    public boolean isHighlighted() {
        return isHighlighted;
    }
    public void setHighlighted(boolean highlighted) {
        isHighlighted = highlighted;
    }

    public ArrayList<ExcavationTool> getExcavationToolsRequirement() {
        return excavationToolsRequirement;
    }

    // public ArrayList<ExploitationTool> getExploitationToolsRequirement() {
    //    return exploitationToolsRequirement;
    // }

    public String analyze(ArrayList<ExploitationTool> usedExploitationTools) {
        totalValue = 0;
        String recap = "<html>";
        if (isFound) {
            totalValue += baseValue;
            for (int i = 0; i < exploitationToolsRequirement.size(); i++) {
                ExploitationTool tool = exploitationToolsRequirement.get(i);
                if (usedExploitationTools.contains(tool)) {
                    totalValue += infoValues.get(i);
                    recap += tool.getName() + " : ";
                    recap += relicInformation.get(i) + "<br>";
                }
            }
            if (recap.equals("<html>")) {
                recap = "Aucune information pertinente n'as été trouvée.";
            }
        }
        return recap;
    }

    public int getTotalValue() {
        return totalValue;
    }
}