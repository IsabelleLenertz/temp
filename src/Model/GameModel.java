package Model;

import java.util.*;

/**
 * 
 */
public class GameModel {

    private ArrayList<Relic> relics;
    private ArrayList<Person> personList;
    private ArrayList<ExcavationTool> excavationTools;
    private ArrayList<ExploitationTool> exploitationTool;
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
        this.exploitationTool = exploitationTool;
    }

    /**
     * @return
     */
    public Set<Relic> Relics() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public Set<Person> Persons() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public Set<ExcavationTool> ExcavationTools() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
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
        return exploitationTool;
    }
    public void setExploitationTool(ArrayList<ExploitationTool> exploitationTool) {
        this.exploitationTool = exploitationTool;
    }

    public String getRapport() {
        return rapport;
    }
    public void setRapport(String rapport) {
        this.rapport = rapport;
    }
}