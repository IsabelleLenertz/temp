package Control;

import Model.*;
import View.*;
import java.util.*;

/**
 * 
 */
public class GameControleur {

    private final GameModel g;

    /**
     * Default constructor
     */
    public GameControleur(GameModel game) {
        this.g = game;
    }

    /**
     * ask the model for highlight person
     * @param personName name of the person who want highlight
     */
    public void highlightPerson(String personName, boolean highlight) {
        g.highlightPerson(personName, highlight);
    }

    /**
     * ask the model for highlight excavation tool
     * @param excavationToolName name of the excavation tool who want the name
     */
    public void highlightExcavationTool(String excavationToolName, boolean highlight) {
        g.highlightExcavationTool(excavationToolName, highlight);
    }

    /**
     * ask the model for highlight exploitation exploitation tool
     * @param exploitationToolName name of the exploitation tool who want the name
     */
    public void highlightExploitationTool(String exploitationToolName, boolean highlight) {
        g.highlightExploitationTool(exploitationToolName, highlight);
    }

    /**
     * ask the model for highlight exploitation exploitation tool
     * @param relicName name of the relic who want highlight
     */
    public void highlightRelic(String relicName, boolean highlight) {
        g.highlightRelic(relicName, highlight);
    }

    /**
     * remove all the highlight from the interface
     */
    public void clearHighlight() {
        g.clearHighlight();
    }

    /**
     * getter of person
     * @return status of the person
     */
    public State getPersonStatus(String name) {
        ArrayList<Person> listp = g.getPerson();
        State s = null;
        for (Person p : listp) {
            if (name.equals(p.getName())) {
                s = p.getStatus();
                break;
            }
        }
        return s;
    }

    /**
     * getter of person desc
     * @return description of person
     */
    public String getPersonDesc(String name) {
        ArrayList<Person> listp = g.getPerson();
        String s = null;
        for (Person p : listp) {
            if (name.equals(p.getName())) {
                s = p.getDesc();
                break;
            }
        }
        return s;
    }

    /**
     * getter of person
     * @return image path of person
     */
    public String getPersonImage(String name) {
        ArrayList<Person> listp = g.getPerson();
        String f = null;
        for (Person p : listp) {
            if (name.equals(p.getName())) {
                f = p.getImg();
                break;
            }
        }
        return f;
    }

    /**
     * getter of person
     * @return list of person's jobs
     */
    public String getPersonJobs(String name) {
        ArrayList<Person> listp = g.getPerson();
        String jobs = "";
        for (Person p : listp) {
            if (name.equals(p.getName())) {
                jobs = p.getJobs().toString();
                break;
            }
        }
        return jobs;
    }

    /**
     * getter of excavation tool
     * @return excavation tool status
     */
    public State getExcavationToolStatus(String excavationToolName) {
        ArrayList<ExcavationTool> list = g.getExcavationTool();
        State s = null;
        for (ExcavationTool e : list) {
            if (excavationToolName.equals(e.getName())) {
                s = e.getStatus();
                break;
            }
        }
        return s;
    }

    /**
     * getter of excavation tool
     * @return the excavation tool description
     */
    public String getExcavationToolDesc(String excavationToolName) {
        ArrayList<ExcavationTool> list = g.getExcavationTool();
        String s = "";
        for (ExcavationTool e : list) {
            if (excavationToolName.equals(e.getName())) {
                s = e.getDesc();
                break;
            }
        }
        return s;
    }

    /**
     * getter of excavation tool
     * @return the requirements for excavation tool
     */
    public ArrayList<JobEnum> getExcavationToolRequirements(String excavationToolName) {
        ArrayList<ExcavationTool> list = g.getExcavationTool();
        ArrayList<JobEnum> s = null;
        for (ExcavationTool e : list) {
            if (excavationToolName.equals(e.getName())) {
                s = e.getRequirements();
                break;
            }
        }
        return s;
    }

    /**
     * getter of exploitation tool
     * @return the exploitation tool status
     */
    public State getExploitationToolStatus(String exploitationToolName) {
        ArrayList<ExploitationTool> list = g.getExploitationTool();
        State s = null;
        for (ExploitationTool e : list) {
            if (exploitationToolName.equals(e.getName())) {
                s = e.getStatus();
                break;
            }
        }
        return s;
    }

    /**
     * getter of exploitation tool
     * @return exploitation tool description
     */
    public String getExploitationToolDesc(String exploitationToolName) {
        ArrayList<ExploitationTool> list = g.getExploitationTool();
        String s = "";
        for (ExploitationTool e : list) {
            if (exploitationToolName.equals(e.getName())) {
                s = e.getDesc();
                break;
            }
        }
        return s;
    }

    /**
     * getter of exploitation tool
     * @return exploitation tool's requirements
     */
    public ArrayList<String> getExploitationToolRequirements() {
        ArrayList<ExploitationTool> list = g.getExploitationTool();
        ArrayList<String> s = new ArrayList<>();
        for (ExploitationTool e : list) {
            s.add(e.getName());
        }
        return s;
    }

    /**
     * getter of relic
     * @return name of all the relic
     */
    public ArrayList<String> getRelicName() {
        ArrayList<Relic> list = g.getRelic();
        ArrayList<String> s = new ArrayList<>();
        for (Relic e : list) {
            s.add(e.getName());
        }
        return s;
    }

    /**
     * getter of relic
     * @return description of the relic
     */
    public String getRelicDesc(String relicName) {
        ArrayList<Relic> list = g.getRelic();
        String s = "";
        for (Relic e : list) {
            if(e.getName().equals(relicName)){
                s = e.getDesc();
            }
        }
        return s;
    }

    /**
     * getter of relic
     * @return relic image path
     */
    public String getRelicImage(String relicName) {
        ArrayList<Relic> list = g.getRelic();
        String s = null;
        for (Relic e : list) {
            if(e.getName().equals(relicName)){
                s = e.getImg();
            }
        }
        return s;
    }

    /**
     * getter of relic
     * @return list of person in the game
     */
    public ArrayList<String> getPersonsList() {
        ArrayList<Person> list = g.getPerson();
        ArrayList<String> s = new ArrayList<>();
        for (Person e : list) {
            s.add(e.getName());
        }
        return s;
    }

    /**
     * getter of excavation tool
     * @return list of excavation tool in the game
     */
    public ArrayList<String> getExcavationToolsList() {
        ArrayList<ExcavationTool> list = g.getExcavationTool();
        ArrayList<String> s = new ArrayList<>();
        for (ExcavationTool e : list) {
            s.add(e.getName());
        }
        return s;
    }

    /**
     * getter of exploitation tool
     * @return list of exploitation tool in game
     */
    public ArrayList<String> getExploitationToolsList() {
        ArrayList<ExploitationTool> list = g.getExploitationTool();
        ArrayList<String> s = new ArrayList<>();
        for (ExploitationTool e : list) {
            s.add(e.getName());
        }
        return s;
    }

    /**
     * getter of relic
     * @return list of relics found by the player
     */
    public ArrayList<String> getFoundRelicsList() {
        ArrayList<Relic> list = g.getRelic();
        ArrayList<String> s = new ArrayList<>();
        for (Relic e : list) {
            if(e.getFound()){
                s.add(e.getName());
            }
        }
        return s;
    }

    /**
     * getter of job
     * @return list of available jobs
     */
    public ArrayList<String> getAvailableJobs() {
        ArrayList<String> availableJobs = new ArrayList<>();
        switch (g.getCurrentStage()) {
            case 2:
                for (JobEnum job : g.getAvailableExcavationJobs()) {
                    // TODO reformat the string to not be all capital letters
                    availableJobs.add(job.toString());
                }
                break;
            case 3:
                for (JobEnum job : g.getAvailableExploitationJobs()) {
                    // TODO reformat the string to not be all capital letters
                    availableJobs.add(job.toString());
                }
                break;
        }
        return availableJobs;
    }

    /**
     * set the person on SELECT
     * @param name name of the person who want change status on SELECT
     */
    public void selectPerson(String name) {
        g.selectPerson(name);
    }

    /**
     * set the status of the person on UNSELECT
     * @param name name for the person who want unselect
     */
    public void unselectPerson(String name) {
        g.unselectPerson(name);
    }

    /**
     * set the status of the excavation tool to SELECT
     * @param name name of the excavation tool who want change status
     */
    public void selectExcavationTool(String name) {
        g.selectExcavationTool(name);
    }

    /**
     * set the status of the excavation tool on UNSELECT
     * @param name name of the excavation tool who want unselect
     */
    public void unselectExcavationTool(String name) {
        g.unselectExcavationTool(name);
    }

    /**
     * set the status of the exploitation tool to SELECT
     * @param name name of the exploitation tool who want change status
     */
    public void selectExploitationTool(String name) {
        g.selectExploitationTool(name);
    }

    /**
     * set the status of the exploitation tool to UNSELECT
     * @param name name of the exploitation tool who want change status
     */
    public void unselectExploitationTool(String name) {
        g.unselectExploitationTool(name);
    }

    /**
     * Gets and create the side info view of the currently highlighted item in the model
     * @return The view panel of the currently highlighted item
     */
    public SideInfos getSideInfo() {
        // if there is a highlighted person
        Person highlightedPerson = g.getHighlightedPerson();
        if (highlightedPerson != null) {
            ArrayList<String> jobs = new ArrayList<>();
            for (JobEnum job : highlightedPerson.getJobs()) {
                jobs.add(job.toString());
                // TODO reformat the string to not be all capital letters
            }
            return new PersonnalInfos(highlightedPerson.getName(), highlightedPerson.getDesc(), jobs, highlightedPerson.getImg());
        }
        // if there is a highlighted relic
        Relic highlightedRelic = g.getHighlightedRelic();
        if (highlightedRelic != null) {
            return new RelicInfo(highlightedRelic.getName(), highlightedRelic.getDesc(), highlightedRelic.getImg());
        }
        // if there is a highlighted excavation tool
        ExcavationTool highlightedExcavationTool = g.getHighlightedExcavationTool();
        if (highlightedExcavationTool != null) {
            ArrayList<String> jobs = new ArrayList<>();
            for (JobEnum job : highlightedExcavationTool.getRequirements()) {
                jobs.add(job.toString());
                // TODO reformat the string to not be all capital letters
            }
            return new ToolsInfos(highlightedExcavationTool.getName(), highlightedExcavationTool.getDesc(), jobs);
        }
        // if there is a highlighted exploitation tool
        ExploitationTool highlightedExploitationTool = g.getHighlightedExploitationTool();
        if (highlightedExploitationTool != null) {
            ArrayList<String> jobs = new ArrayList<>();
            for (JobEnum job : highlightedExploitationTool.getRequirement()) {
                jobs.add(job.toString());
                // TODO reformat the string to not be all capital letters
            }
            return new ToolsInfos(highlightedExploitationTool.getName(), highlightedExploitationTool.getDesc(), jobs);
        }

        // if there is nothing highlighted
        return null;
    }

    /**
     * Getter for the max number of persons you can hire
     * @return max number of persons you can hire
     */
    public int getAvailableHireCount() {
        return g.getAvailableHireCount();
    }

    /**
     * Getter got the stage number
     * @return Number of the game stage
     */
    public int getGameStage() {
        return g.getCurrentStage();
    }

    /**
     * moves to the next window
     */
    public void nextStage() {
        g.nextStage();
    }
}