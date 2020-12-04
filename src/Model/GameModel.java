package Model;

import java.util.*;

/**
 * 
 */
public class GameModel {

    private ArrayList<Relic> relics;
    private ArrayList<Person> personList;
    private ArrayList<ExcavationTool> excavationTools;
    private ArrayList<ExploitationTool> exploitationTools;
    private String rapport;

    /**
     * Default constructor
     */
    public GameModel() {
    }
    public GameModel(ArrayList<Relic> relic, ArrayList<Person> person, ArrayList<ExcavationTool> excavationTool, ArrayList<ExploitationTool> exploitationTool) {
        this.relics = relic;
        this.personList = person;
        this.excavationTools = excavationTool;
        this.exploitationTools = exploitationTool;
    }

    public Set<Relic> Relics() {
        // TODO implement here
        return null;
    }
    public Set<Person> Persons() {
        // TODO implement here
        return null;
    }
    public Set<ExcavationTool> ExcavationTools() {
        // TODO implement here
        return null;
    }
    public Set<ExploitationTool> ExploitationTools() {
        // TODO implement here
        return null;
    }

    public ArrayList<Relic> getRelic() {
        return relics;
    }
    public void setRelic(ArrayList<Relic>  relic) {
        this.relics = relic;
    }

    public ArrayList<Person> getPerson() {
        return this.personList;
    }
    public void setPerson(ArrayList<Person> person) {
        this.personList = person;
    }

    public ArrayList<ExcavationTool>getExcavationTool() {
        return excavationTools;
    }
    public void setExcavationTool(ArrayList<ExcavationTool> excavationTool) {
        this.excavationTools = excavationTool;
    }

    public ArrayList<ExploitationTool> getExploitationTool() {
        return exploitationTools;
    }
    public void setExploitationTool(ArrayList<ExploitationTool> exploitationTool) {
        this.exploitationTools = exploitationTool;
    }

    public String getRapport() {
        return rapport;
    }
    public void setRapport(String rapport) {
        this.rapport = rapport;
    }

    public Relic getHighlightedRelic() {
        Relic highlightedRelic = null;
        for (Relic rel : relics) {
            if (rel.isHighlighted()) {
                highlightedRelic = rel;
                break;
            }
        }
        return highlightedRelic;
    }

    public Person getHighlightedPerson() {
        Person highlightedPerson = null;
        for (Person pers : personList) {
            if (pers.isHighlighted()) {
                highlightedPerson = pers;
                break;
            }
        }
        return highlightedPerson;
    }

    public ExcavationTool getHighlightedExcavationTool() {
        ExcavationTool highlightedExcavationTool = null;
        for (ExcavationTool excaTool : excavationTools) {
            if (excaTool.isHighligt()) {
                highlightedExcavationTool = excaTool;
                break;
            }
        }
        return  highlightedExcavationTool;
    }

    public ExploitationTool getHighlightedExploitationTool() {
        ExploitationTool highlitedExploitationTool = null;
        for (ExploitationTool explTool : exploitationTools) {
            if (explTool.isHighlighted()) {
                highlitedExploitationTool = explTool;
                break;
            }
        }
        return highlitedExploitationTool;
    }
}