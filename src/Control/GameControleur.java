package Control;

import Model.State;
import View.*;

import java.util.*;

/**
 * 
 */
public class GameControleur {

    /**
     * Default constructor
     */
    public GameControleur() {
    }



    /**
     * ask the model for highlight person
     * @param personName name of the person who want highlight
     */
    public void highlightPerson(String personName) {
        // TODO implement here
    }

    /**
     * ask the model for highlight excavation tool
     * @param excavactionToolName name of the excavation tool who want the name
     */
    public void highlightExcavationTool(String excavactionToolName) {
        // TODO implement here
    }

    /**
     * ask the model for highlight exploitation exploitation tool
     * @param exploitationToolName name of the exploitation tool who want the name
     */
    public void highlightExploitationTool(String exploitationToolName) {
        // TODO implement here
    }

    /**
     * ask the model for highlight exploitation exploitation tool
     * @param relicName name of the relic who want highlight
     */
    public void highlightRelic(String relicName) {
        // TODO implement here
    }

    /**
     * remove all the highlight from the interface
     */
    public void clearHighlight() {
        // TODO implement here
    }

    /**
     * moves to the next window
     */
    public void nextStage() {
        // TODO implement here
    }

    /**
     * getter of person
     * @return status of the person
     */
    public State getPersonStatus() {
        // TODO implement here
        return null;
    }

    /**
     * getter of person
     * @return name of the person
     */
    public String getPersonName() {
        // TODO implement here
        return "";
    }

    /**
     * getter of person
     * @return description of person
     */
    public String getPersonDesc() {
        // TODO implement here
        return "";
    }

    /**
     * getter of person
     * @return image of person
     */
    public String getPersonImage() {
        // TODO implement here
        return "";
    }

    /**
     * getter of person
     * @return list of person's jobs
     */
    public Set<String> getPersonJobs() {
        // TODO implement here
        return null;
    }

    /**
     * getter of excavation tool
     * @return excavation tool status
     */
    public State getExcavationToolStatus() {
        // TODO implement here
        return null;
    }

    /**
     * getter of excavation tool
     * @return excavation tool name
     */
    public String getExcavationToolName() {
        // TODO implement here
        return "";
    }

    /**
     * getter of excavation tool
     * @return the excavation tool description
     */
    public String getExcavationToolDesc() {
        // TODO implement here
        return "";
    }

    /**
     * getter of excavation tool
     * @return the requirements for excavation tool
     */
    public Set<String> getExcavationToolRequirements() {
        // TODO implement here
        return null;
    }

    /**
     * getter of exploitation tool
     * @return the exploitation tool status
     */
    public State getExploitationToolStatus() {
        // TODO implement here
        return null;
    }

    /**
     * getter of exploitation tool
     * @return the exploitation tool name
     */
    public String getExploitationToolName() {
        // TODO implement here
        return "";
    }

    /**
     * getter of exploitation tool
     * @return exploitation tool description
     */
    public String getExploitationToolDesc() {
        // TODO implement here
        return "";
    }

    /**
     * getter of exploitation tool
     * @return exploitation tool's requirements
     */
    public ArrayList<String> getExploitationToolRequirements() {
        // TODO implement here
        return null;
    }

    /**
     * gette of relic
     * @return name of the relic
     */
    public String getRelicName() {
        // TODO implement here
        return "";
    }

    /**
     * getter of relic
     * @return description of the relic
     */
    public String getRelicDesc() {
        // TODO implement here
        return "";
    }

    /**
     * getter of relic
     * @return relic image
     */
    public String getRelicImage() {
        // TODO implement here
        return "";
    }

    /**
     * getter of relic
     * @return list of person in the game
     */
    public ArrayList<String> getPersonsList() {
        // TODO implement here
        return null;
    }

    /**
     * getter of excavation tool
     * @return list of excavation tool in the game
     */
    public ArrayList<String> getExcavationToolsList() {
        // TODO implement here
        return null;
    }

    /**
     * getter of exploitation tool
     * @return list of exploitation tool in game
     */
    public ArrayList<String> getExploitationToolsList() {
        // TODO implement here
        return null;
    }

    /**
     * getter of relic
     * @return list of relics found by the player
     */
    public Set<String> getFoundRelicsList() {
        // TODO implement here
        return null;
    }

    /**
     * getter of job
     * @return list of available jobs
     */
    public ArrayList<String> getAvailableJobs() {
        // TODO implement here
        return null;
    }

    /**
     * set the person on SELECT
     * @param name name of the person who want change status on SELECT
     */
    public void selectPerson(String name) {
        // TODO implement here
    }

    /**
     * set the status of the person on UNSELECT
     * @param name name for the person who want unselect
     */
    public void unselectPerson(String name) {
        // TODO implement here
    }

    /**
     * @param name
     */
    public void selectExcavationTool(String name) {
        // TODO implement here
    }

    /**
     * set the status of the excavation tool on UNSELECT
     * @param name name of the excavation tool who want unselect
     */
    public void unselectExcavationTool(String name) {
        // TODO implement here
    }

    /**
     * @param name
     */
    public void selectExploitationTool(String name) {
        // TODO implement here
    }

    /**
     * @param name
     */
    public void unselectExploitationTool(String name) {
        // TODO implement here
    }

    /**
     * @return
     */
    public SideInfos getSideInfo() {
        // TODO implement here
        return null;
    }
}