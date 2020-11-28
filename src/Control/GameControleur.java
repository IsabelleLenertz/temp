package Control;

import Model.*;
import View.*;

import java.io.File;
import java.util.*;

/**
 * 
 */
public class GameControleur {

    GameModel g;

    /**
     * Default constructor
     */
    public GameControleur() {
        GameModel g = new GameModel();
    }

    /**
     * ask the model for highlight person
     * @param personName name of the person who want highlight
     */
    public void highlightPerson(String personName, boolean highlight) {
        ArrayList<Person> persons = g.getPerson();
        for (Person p : persons) {
            if (personName.equals(p.getName())) {
                p.setHighlighted(highlight);
                break;
            }
        }
    }

    /**
     * ask the model for highlight excavation tool
     * @param excavationToolName name of the excavation tool who want the name
     */
    public void highlightExcavationTool(String excavationToolName, boolean highlight) {
        ArrayList<ExcavationTool> list = g.getExcavationTool();
        for (ExcavationTool e : list) {
            if (excavationToolName.equals(e.getName())) {
                e.setHighligt(highlight);
                break;
            }
        }
    }

    /**
     * ask the model for highlight exploitation exploitation tool
     * @param exploitationToolName name of the exploitation tool who want the name
     */
    public void highlightExploitationTool(String exploitationToolName, boolean highlight) {
        ArrayList<ExploitationTool> list = g.getExploitationTool();
        for (ExploitationTool e : list) {
            if (exploitationToolName.equals(e.getName())) {
                e.setHighligthed(highlight);
                break;
            }
        }
    }

    /**
     * ask the model for highlight exploitation exploitation tool
     * @param relicName name of the relic who want highlight
     */
    public void highlightRelic(String relicName, boolean highlight) {
        ArrayList<Relic> list = g.getRelic();
        for (Relic e : list) {
            if (relicName.equals(e.getName())) {
                e.setHighlighted(highlight);
                break;
            }
        }
    }

    /**
     * remove all the highlight from the interface
     */
    public void clearHighlight() {
        ArrayList<Person> listp = g.getPerson();
        for (Person p : listp) {
            if (p.isHighlighted()) {
                p.setHighlighted(false);
            }
        }
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
     * getter of person
     * @return name of the person
     */
    public String getPersonName(String name) {
        ArrayList<Person> listp = g.getPerson();
        String s = null;
        for (Person p : listp) {
            if (name.equals(p.getName())) {
                s = p.getName();
                break;
            }
        }
        return s;
    }

    /**
     * getter of person
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
     * @return image of person
     */
    public File getPersonImage(String name) {
        ArrayList<Person> listp = g.getPerson();
        File f = null;
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
    public State getExcavationToolStatus(String excavactionToolName) {
        ArrayList<ExcavationTool> liste = g.getExcavationTool();
        State s = null;
        for (ExcavationTool e : liste) {
            if (excavactionToolName.equals(e.getName())) {
                s = e.getStatus();
                break;
            }
        }
        return s;
    }

    /**
     * getter of excavation tool
     * @return excavation tool name
     */
    public String getExcavationToolName(String excavactionToolName) {
        ArrayList<ExcavationTool> liste = g.getExcavationTool();
        String s = "";
        for (ExcavationTool e : liste) {
            if (excavactionToolName.equals(e.getName())) {
                s = e.getName();
                break;
            }
        }
        return s;
    }

    /**
     * getter of excavation tool
     * @return the excavation tool description
     */
    public String getExcavationToolDesc(String excavactionToolName) {
        ArrayList<ExcavationTool> liste = g.getExcavationTool();
        String s = "";
        for (ExcavationTool e : liste) {
            if (excavactionToolName.equals(e.getName())) {
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
    public JobEnum getExcavationToolRequirements(String excavactionToolName) {
        ArrayList<ExcavationTool> liste = g.getExcavationTool();
        JobEnum s = null;
        for (ExcavationTool e : liste) {
            if (excavactionToolName.equals(e.getName())) {
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
        ArrayList<ExploitationTool> liste = g.getExploitationTool();
        State s = null;
        for (ExploitationTool e : liste) {
            if (exploitationToolName.equals(e.getName())) {
                s = e.getStatus();
                break;
            }
        }
        return s;
    }

    /**
     * getter of exploitation tool
     * @return the exploitation tool name
     */
    public String getExploitationToolName(String exploitationToolName) {
        ArrayList<ExploitationTool> liste = g.getExploitationTool();
        String s = "";
        for (ExploitationTool e : liste) {
            if (exploitationToolName.equals(e.getName())) {
                s = e.getName();
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
        ArrayList<ExploitationTool> liste = g.getExploitationTool();
        String s = "";
        for (ExploitationTool e : liste) {
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
        ArrayList<ExploitationTool> liste = g.getExploitationTool();
        ArrayList<String> s = new ArrayList<>();
        for (ExploitationTool e : liste) {
            s.add(e.getName());
        }
        return s;
    }

    /**
     * getter of relic
     * @return name of all the relic
     */
    public ArrayList<String> getRelicName() {
        ArrayList<Relic> liste = g.getRelic();
        ArrayList<String> s = new ArrayList<>();
        for (Relic e : liste) {
            s.add(e.getName());
        }
        return s;
    }

    /**
     * getter of relic
     * @return description of the relic
     */
    public String getRelicDesc(String relicName) {
        ArrayList<Relic> liste = g.getRelic();
        String s = "";
        for (Relic e : liste) {
            if(e.getName().equals(relicName)){
                s = e.getDesc();
            }
        }
        return s;
    }

    /**
     * getter of relic
     * @return relic image
     */
    public File getRelicImage(String relicName) {
        ArrayList<Relic> liste = g.getRelic();
        File s = null;
        for (Relic e : liste) {
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
        ArrayList<Relic> list = g.getRelic();
        ArrayList<String> s = new ArrayList<>();
        for (Relic e : list) {
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
    public ArrayList<String> getExploitationToolsList(String name) {
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
        ArrayList<Person> list = g.getPerson();
        ArrayList<String> s = new ArrayList<>();
        for (Person e : list) {
            s.add(e.getJobs().toString());
        }
        return s;
    }

    /**
     * set the person on SELECT
     * @param name name of the person who want change status on SELECT
     */
    public void selectPerson(String name) {
        ArrayList<Person> listp = g.getPerson();
        for (Person p : listp) {
            if (name.equals(p.getName())) {
                p.setStatus(State.SELECTED);
                break;
            }
        }
    }

    /**
     * set the status of the person on UNSELECT
     * @param name name for the person who want unselect
     */
    public void unselectPerson(String name) {
        ArrayList<Person> listp = g.getPerson();
        for (Person p : listp) {
            if (name.equals(p.getName())) {
                p.setStatus(State.UNSELECTED);
                break;
            }
        }
    }

    /**
     * @param name
     */
    public void selectExcavationTool(String name) {
        ArrayList<ExcavationTool> list = g.getExcavationTool();
        for (ExcavationTool p : list) {
            if (name.equals(p.getName())) {
                p.setStatus(State.SELECTED);
                break;
            }
        }
    }

    /**
     * set the status of the excavation tool on UNSELECT
     * @param name name of the excavation tool who want unselect
     */
    public void unselectExcavationTool(String name) {
        ArrayList<ExcavationTool> list = g.getExcavationTool();
        for (ExcavationTool p : list) {
            if (name.equals(p.getName())) {
                p.setStatus(State.UNSELECTED);
                break;
            }
        }
    }

    /**
     * @param name
     */
    public void selectExploitationTool(String name) {
        ArrayList<ExploitationTool> list = g.getExploitationTool();
        for (ExploitationTool p : list) {
            if (name.equals(p.getName())) {
                p.setStatus(State.SELECTED);
                break;
            }
        }
    }

    /**
     * @param name
     */
    public void unselectExploitationTool(String name) {
        ArrayList<ExploitationTool> list = g.getExploitationTool();
        for (ExploitationTool p : list) {
            if (name.equals(p.getName())) {
                p.setStatus(State.UNSELECTED);
                break;
            }
        }
    }

    /**
     * @return
     */
    public SideInfos getSideInfo() {
        // TODO implement here
        return null;
    }

    /**
     * moves to the next window
     */
    public void nextStage() {
        // TODO implement here
    }
}