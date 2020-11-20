package Control;

import Model.State;
import View.ToolsInfos;

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
     *
     * @param personName name of the person who want highlight
     */
    public void highlightPerson(String personName) {
        // TODO implement here
    }

    /**
     * @param excavactionToolName name of the excavation tool who want the name
     */
    public void highlightExcavationTool(String excavactionToolName) {
        // TODO implement here
    }

    /**
     *
     * @param exploitationToolName name of the exploitation tool who want the name
     */
    public void highlightExploitationTool(String exploitationToolName) {
        // TODO implement here
    }

    /**
     *
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
     *
     * @return status of the person
     */
    public State getPersonStatus() {
        // TODO implement here
        return null;
    }

    /**
     * @return name of the person
     */
    public String getPersonName() {
        // TODO implement here
        return "";
    }

    /**
     * @return
     */
    public String getPersonDesc() {
        // TODO implement here
        return "";
    }

    /**
     * @return
     */
    public String getPersonImage() {
        // TODO implement here
        return "";
    }

    /**
     * @return
     */
    public Set<String> getPersonJobs() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public State getExcavationToolStatus() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public String getExcavationToolName() {
        // TODO implement here
        return "";
    }

    /**
     * @return
     */
    public String getExcavationToolDesc() {
        // TODO implement here
        return "";
    }

    /**
     * @return
     */
    public Set<String> getExcavationToolRequirements() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public State getExploitationToolStatus() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public String getExploitationToolName() {
        // TODO implement here
        return "";
    }

    /**
     * @return
     */
    public String getExploitationToolDesc() {
        // TODO implement here
        return "";
    }

    /**
     * @param name
     * @return
     */
    public Set<String> getExploitationToolRequirements() {
        // TODO implement here
        return null;
    }

    /**
     * @param name
     * @return
     */
    public String getRelicName() {
        // TODO implement here
        return "";
    }

    /**
     * @param name
     * @return
     */
    public String getRelicDesc() {
        // TODO implement here
        return "";
    }

    /**
     * @param name
     * @return
     */
    public String getRelicImage() {
        // TODO implement here
        return "";
    }

    /**
     * @return
     */
    public Set<String> getPersonsList() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public Set<String> getExcavationToolsList() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public Set<String> getExploitationToolsList() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public Set<String> getFoundRelicsList() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public Set<String> getAvailableJobs() {
        // TODO implement here
        return null;
    }

    /**
     * @param name
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
    public ToolsInfos.SideInfos getSideInfo() {
        // TODO implement here
        return null;
    }

}