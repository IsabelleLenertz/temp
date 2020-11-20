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
     * @param personName String
     */
    public void highlightPerson(String personName) {
        // TODO implement here
    }

    /**
     * @param excavactionToolName String
     */
    public void highlightExcavationTool(String excavactionToolName) {
        // TODO implement here
    }

    /**
     *
     * @param exploitationToolName String
     */
    public void highlightExploitationTool(String exploitationToolName) {
        // TODO implement here
    }

    /**
     *
     * @param relicName String
     */
    public void highlightRelic(String relicName) {
        // TODO implement here
    }

    /**
     * 
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
     * @param name name of the personne who want status
     * @return status of the person
     */
    public State getPersonStatus(String name) {
        // TODO implement here
        return null;
    }

    /**
     * @return name of the person
     */
    public String getPersonName(String name) {
        // TODO implement here
        return "";
    }

    /**
     * @param name 
     * @return
     */
    public String getPersonDesc(String name) {
        // TODO implement here
        return "";
    }

    /**
     * @param name 
     * @return
     */
    public String getPersonImage(String name) {
        // TODO implement here
        return "";
    }

    /**
     * @param name 
     * @return
     */
    public Set<String> getPersonJobs(String name) {
        // TODO implement here
        return null;
    }

    /**
     * @param name 
     * @return
     */
    public State getExcavationToolStatus(String name) {
        // TODO implement here
        return null;
    }

    /**
     * @param name String
     * @return
     */
    public String getExcavationToolName(String name) {
        // TODO implement here
        return "";
    }

    /**
     * @param name
     * @return
     */
    public String getExcavationToolDesc(String name) {
        // TODO implement here
        return "";
    }

    /**
     * @param name
     * @return
     */
    public Set<String> getExcavationToolRequirements(String name) {
        // TODO implement here
        return null;
    }

    /**
     * @param name
     * @return
     */
    public State getExploitationToolStatus(String name) {
        // TODO implement here
        return null;
    }

    /**
     * @param name
     * @return
     */
    public String getExploitationToolName(String name) {
        // TODO implement here
        return "";
    }

    /**
     * @param name
     * @return
     */
    public String getExploitationToolDesc(String name) {
        // TODO implement here
        return "";
    }

    /**
     * @param name
     * @return
     */
    public Set<String> getExploitationToolRequirements(String name) {
        // TODO implement here
        return null;
    }

    /**
     * @param name
     * @return
     */
    public String getRelicName(String name) {
        // TODO implement here
        return "";
    }

    /**
     * @param name
     * @return
     */
    public String getRelicDesc(String name) {
        // TODO implement here
        return "";
    }

    /**
     * @param name
     * @return
     */
    public String getRelicImage(String name) {
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
     * @param name
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
     * @param name
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