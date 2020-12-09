package Model;

import View.StageView;
import observer.Observer;
import observer.Subject;

import java.util.*;

/**
 * 
 */
public class GameModel implements Subject {
    private final int maxHireNumber = 10; // TODO to balance for the game scenario
    private ArrayList<Relic> relics;
    private ArrayList<Person> personList;
    private ArrayList<ExcavationTool> excavationTools;
    private ArrayList<ExploitationTool> exploitationTools;
    private String rapport;
    private ArrayList<Observer> observers;
    private int currentStage;

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
        this.observers = new ArrayList<>();
        this.currentStage = 0;
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

    public void nextStage(){
        if (currentStage < 4){
            currentStage++;
        }
        else{
            currentStage = 0;
        }

        switch (currentStage){
            case 0:
                // Main menu
                break;
            case 1:
                // starting team selection
                break;
            case 2:
                // starting excavation
                break;
            case 3:
                checkFoundRelics();
                // starting exploitation
                break;
            case 4:
                // results
                break;
        }
        this.notifyObservers();
    }

    @Override
    public void addObserver(Observer obs) {
        this.observers.add(obs);
    }

    @Override
    public ArrayList<Observer> getObservers() {
        return this.observers;
    }

    public ArrayList<Person> getSelectedPersons() {
        ArrayList<Person> selectedP = new ArrayList<Person>();
        for (Person pers : personList) {
            if (pers.getStatus() == State.SELECTED) {
                selectedP.add(pers);
            }
        }
        return selectedP;
    }

    private ArrayList<ExcavationTool> getSelectedExcavationTools() {
        ArrayList<ExcavationTool> selectedT = new ArrayList<ExcavationTool>();
        for (ExcavationTool tool : excavationTools) {
            if (tool.getStatus() == State.SELECTED) {
                selectedT.add(tool);
            }
        }
        return selectedT;
    }

    private ArrayList<ExploitationTool> getSelectedExploitationTools() {
        ArrayList<ExploitationTool> selectedT = new ArrayList<ExploitationTool>();
        for (ExploitationTool tool : exploitationTools) {
            if (tool.getStatus() == State.SELECTED) {
                selectedT.add(tool);
            }
        }
        return selectedT;
    }

    private ArrayList<JobEnum> getUsableJobs() {
        ArrayList<JobEnum> jobs = new ArrayList<JobEnum>();
        for (Person pers : getSelectedPersons()) {
            for (JobEnum job : pers.getJobs()) {
                jobs.add(job);
            }
        }
        return jobs;
    }

    private ArrayList<JobEnum> getUsedJobsForExcavation() {
        ArrayList<JobEnum> jobs = new ArrayList<JobEnum>();
        for (ExcavationTool excaTool : getSelectedExcavationTools()) {
            for (JobEnum job : excaTool.getRequirements()) {
                jobs.add(job);
            }
        }
        return jobs;
    }

    private ArrayList<JobEnum> getUsedJobsForExploitation() {
        ArrayList<JobEnum> jobs = new ArrayList<JobEnum>();
        for (ExploitationTool exploTool : getSelectedExploitationTools()) {
            for (JobEnum job : exploTool.getRequirement()) {
                jobs.add(job);
            }
        }
        return jobs;
    }

    public ArrayList<JobEnum> getAvailableExcavationJobs() {
        ArrayList<JobEnum> availableJobs = getUsableJobs();
        ArrayList<JobEnum> usedJobs = getUsedJobsForExcavation();
        // or each used job, we need to remove 1 of the resource in the available jobs
        for (int i = 0; i < usedJobs.size(); i++) {
            for (int j = 0; j < availableJobs.size(); j++) {
                if (availableJobs.get(j) == usedJobs.get(i)) {
                    availableJobs.remove(j);
                    break;
                }
            }
        }
        return availableJobs;
    }

    public ArrayList<JobEnum> getAvailableExploitationJobs() {
        ArrayList<JobEnum> availableJobs = getUsableJobs();
        ArrayList<JobEnum> usedJobs = getUsedJobsForExploitation();
        // or each used job, we need to remove 1 of the resource in the available jobs
        for (int i = 0; i < usedJobs.size(); i++) {
            for (int j = 0; j < availableJobs.size(); j++) {
                if (availableJobs.get(j) == usedJobs.get(i)) {
                    availableJobs.remove(j);
                    break;
                }
            }
        }
        return availableJobs;
    }

    public int getCurrentStage() {
        return currentStage;
    }

    public int getAvailableHireCount() {
        return maxHireNumber - getSelectedPersons().size();
    }

    public void selectPerson(String name) {
        // selecting the person
        for (Person p : personList) {
            if (name.equals(p.getName())) {
                p.setStatus(State.SELECTED);
                break;
            }
        }
        // updating the available persons
        if (getAvailableHireCount() == 0) {
            for (Person pers : personList) {
                if (pers.getStatus() == State.UNSELECTED) {
                    pers.setStatus(State.UNAVAILABLE);
                }
            }
        }
        // sending an update to views
        notifyObservers();
    }

    public void unselectPerson(String name) {
        // unselecting the person
        for (Person p : personList) {
            if (name.equals(p.getName())) {
                p.setStatus(State.UNSELECTED);
                break;
            }
        }
        // updating the available persons
        if (getAvailableHireCount() != 0) {
            for (Person pers : personList) {
                if (pers.getStatus() == State.UNAVAILABLE) {
                    pers.setStatus(State.UNSELECTED);
                }
            }
        }
        // sending an update to views
        notifyObservers();
    }

    public void selectExcavationTool(String name) {
        // selecting the tool
        for (ExcavationTool p : excavationTools) {
            if (name.equals(p.getName())) {
                p.setStatus(State.SELECTED);
                break;
            }
        }
        // updating available tools
        ArrayList<JobEnum> availableJobs = getAvailableExcavationJobs();
        for (ExcavationTool tool : excavationTools) {
            if (tool.getStatus() == State.UNSELECTED) {
                boolean requirementMet = true;
                ArrayList<JobEnum> requiredJobs = tool.getRequirements();
                for (int i = 0; i < requiredJobs.size() && requirementMet; i++) {
                    requirementMet = availableJobs.contains(requiredJobs.get(i));
                }
                if (!requirementMet)
                    tool.setStatus(State.UNAVAILABLE);
            }
        }
        // sending an update to views
        notifyObservers();
    }

    public void unselectExcavationTool(String name) {
        // unselecting the tool
        for (ExcavationTool p : excavationTools) {
            if (name.equals(p.getName())) {
                p.setStatus(State.UNSELECTED);
                break;
            }
        }
        // updating available tools
        ArrayList<JobEnum> availableJobs = getAvailableExcavationJobs();
        for (ExcavationTool tool : excavationTools) {
            if (tool.getStatus() == State.UNAVAILABLE) {
                boolean requirementMet = true;
                ArrayList<JobEnum> requiredJobs = tool.getRequirements();
                for (int i = 0; i < requiredJobs.size() && requirementMet; i++) {
                    requirementMet = availableJobs.contains(requiredJobs.get(i));
                }
                if (requirementMet)
                    tool.setStatus(State.UNSELECTED);
            }
        }
        // sending an update to views
        notifyObservers();
    }

    public void selectExploitationTool(String name) {
        // selecting the tool
        for (ExploitationTool p : exploitationTools) {
            if (name.equals(p.getName())) {
                p.setStatus(State.SELECTED);
                break;
            }
        }
        // updating available tools
        ArrayList<JobEnum> availableJobs = getAvailableExploitationJobs();
        for (ExploitationTool tool : exploitationTools) {
            if (tool.getStatus() == State.UNSELECTED) {
                boolean requirementMet = true;
                ArrayList<JobEnum> requiredJobs = tool.getRequirement();
                for (int i = 0; i < requiredJobs.size() && requirementMet; i++) {
                    requirementMet = availableJobs.contains(requiredJobs.get(i));
                }
                if (!requirementMet)
                    tool.setStatus(State.UNAVAILABLE);
            }
        }
        // sending an update to views
        notifyObservers();
    }

    public void unselectExploitationTool(String name) {
        // selecting the tool
        for (ExploitationTool p : exploitationTools) {
            if (name.equals(p.getName())) {
                p.setStatus(State.UNSELECTED);
                break;
            }
        }
        // updating available tools
        ArrayList<JobEnum> availableJobs = getAvailableExploitationJobs();
        for (ExploitationTool tool : exploitationTools) {
            if (tool.getStatus() == State.UNAVAILABLE) {
                boolean requirementMet = true;
                ArrayList<JobEnum> requiredJobs = tool.getRequirement();
                for (int i = 0; i < requiredJobs.size() && requirementMet; i++) {
                    requirementMet = availableJobs.contains(requiredJobs.get(i));
                }
                if (requirementMet)
                    tool.setStatus(State.UNSELECTED);
            }
        }
        // sending an update to views
        notifyObservers();
    }

    public void highlightPerson(String personName, boolean highlight) {
        ArrayList<Person> persons = getPerson();
        for (Person p : persons) {
            if (personName.equals(p.getName())) {
                p.setHighlighted(highlight);
                break;
            }
        }
        notifyObservers();
    }

    public void highlightExcavationTool(String excavationToolName, boolean highlight) {
        ArrayList<ExcavationTool> list = getExcavationTool();
        for (ExcavationTool e : list) {
            if (excavationToolName.equals(e.getName())) {
                e.setHighligt(highlight);
                break;
            }
        }
        notifyObservers();

    }

    public void highlightExploitationTool(String exploitationToolName, boolean highlight) {
        ArrayList<ExploitationTool> list = getExploitationTool();
        for (ExploitationTool e : list) {
            if (exploitationToolName.equals(e.getName())) {
                e.setHighlighted(highlight);
                break;
            }
        }
        notifyObservers();
    }

    public void highlightRelic(String relicName, boolean highlight) {
        ArrayList<Relic> list = getRelic();
        for (Relic e : list) {
            if (relicName.equals(e.getName())) {
                e.setHighlighted(highlight);
                break;
            }
        }
        notifyObservers();
    }

    public void clearHighlight() {
        ArrayList<Person> listp = getPerson();
        for (Person p : listp) {
            if (p.isHighlighted()) {
                p.setHighlighted(false);
            }
        }
        notifyObservers();
    }

    private void checkFoundRelics() {
        ArrayList<ExcavationTool> usedTools = getSelectedExcavationTools();
        for (Relic rel : relics) {
            ArrayList<ExcavationTool> requiredTools = rel.getExcavationToolsRequirement();
            boolean requirementsMet = true;
            for (int i = 0; i < requiredTools.size() && requirementsMet; i++) {
                requirementsMet = usedTools.contains(requiredTools.get(i));
            }
            rel.setFound(requirementsMet);
        }
    }
}