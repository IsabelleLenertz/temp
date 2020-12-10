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
    private final ArrayList<Relic> relics;
    private final ArrayList<Person> personList;
    private final ArrayList<ExcavationTool> excavationTools;
    private final ArrayList<ExploitationTool> exploitationTools;
    private String rapport;
    private final ArrayList<Observer> observers;
    private int currentStage;


    /**
     * Constructor for the GameModel
     * @param relic list of relics presents in the game
     * @param person list of the persons presents in the game
     * @param excavationTool list of the excavation tools presents in the game
     * @param exploitationTool list of the exploitation tools presents in the game
     */
    public GameModel(ArrayList<Relic> relic, ArrayList<Person> person, ArrayList<ExcavationTool> excavationTool, ArrayList<ExploitationTool> exploitationTool) {
        this.relics = relic;
        this.personList = person;
        this.excavationTools = excavationTool;
        this.exploitationTools = exploitationTool;
        this.observers = new ArrayList<>();
        this.currentStage = 0;
    }

    /**
     * getter for
     * @return
     */
    public ArrayList<Relic> getRelic() {
        return relics;
    }
    
    public ArrayList<Person> getPerson() {
        return this.personList;
    }

    public ArrayList<ExcavationTool>getExcavationTool() {
        return excavationTools;
    }

    public ArrayList<ExploitationTool> getExploitationTool() {
        return exploitationTools;
    }

    public String getRapport() {
        return rapport;
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
        for (Person person : personList) {
            if (person.isHighlighted()) {
                highlightedPerson = person;
                break;
            }
        }
        return highlightedPerson;
    }
    public ExcavationTool getHighlightedExcavationTool() {
        ExcavationTool highlightedExcavationTool = null;
        for (ExcavationTool excavationTool : excavationTools) {
            if (excavationTool.isHighligt()) {
                highlightedExcavationTool = excavationTool;
                break;
            }
        }
        return  highlightedExcavationTool;
    }
    public ExploitationTool getHighlightedExploitationTool() {
        ExploitationTool highlightedExploitationTool = null;
        for (ExploitationTool exploitationTool : exploitationTools) {
            if (exploitationTool.isHighlighted()) {
                highlightedExploitationTool = exploitationTool;
                break;
            }
        }
        return highlightedExploitationTool;
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
                checkExcavationResources();
                // starting excavation
                break;
            case 3:
                checkFoundRelics();
                checkExploitationResources();
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
        ArrayList<Person> selectedP = new ArrayList<>();
        for (Person person : personList) {
            if (person.getStatus() == State.SELECTED) {
                selectedP.add(person);
            }
        }
        return selectedP;
    }

    private ArrayList<ExcavationTool> getSelectedExcavationTools() {
        ArrayList<ExcavationTool> selectedT = new ArrayList<>();
        for (ExcavationTool tool : excavationTools) {
            if (tool.getStatus() == State.SELECTED) {
                selectedT.add(tool);
            }
        }
        return selectedT;
    }

    private ArrayList<ExploitationTool> getSelectedExploitationTools() {
        ArrayList<ExploitationTool> selectedT = new ArrayList<>();
        for (ExploitationTool tool : exploitationTools) {
            if (tool.getStatus() == State.SELECTED) {
                selectedT.add(tool);
            }
        }
        return selectedT;
    }

    private ArrayList<JobEnum> getUsableJobs() {
        ArrayList<JobEnum> jobs = new ArrayList<>();
        for (Person person : getSelectedPersons()) {
            for (JobEnum job : person.getJobs()) {
                jobs.add(job);
            }
        }
        return jobs;
    }

    private ArrayList<JobEnum> getUsedJobsForExcavation() {
        ArrayList<JobEnum> jobs = new ArrayList<>();
        for (ExcavationTool excavationTool : getSelectedExcavationTools()) {
            for (JobEnum job : excavationTool.getRequirements()) {
                jobs.add(job);
            }
        }
        return jobs;
    }

    private ArrayList<JobEnum> getUsedJobsForExploitation() {
        ArrayList<JobEnum> jobs = new ArrayList<>();
        for (ExploitationTool exploitationTool : getSelectedExploitationTools()) {
            for (JobEnum job : exploitationTool.getRequirement()) {
                jobs.add(job);
            }
        }
        return jobs;
    }

    public ArrayList<JobEnum> getAvailableExcavationJobs() {
        ArrayList<JobEnum> availableJobs = getUsableJobs();
        ArrayList<JobEnum> usedJobs = getUsedJobsForExcavation();
        // or each used job, we need to remove 1 of the resource in the available jobs
        for (JobEnum usedJob : usedJobs) {
            for (int j = 0; j < availableJobs.size(); j++) {
                if (availableJobs.get(j) == usedJob) {
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
        for (JobEnum usedJob : usedJobs) {
            for (int j = 0; j < availableJobs.size(); j++) {
                if (availableJobs.get(j) == usedJob) {
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
            for (Person person : personList) {
                if (person.getStatus() == State.UNSELECTED) {
                    person.setStatus(State.UNAVAILABLE);
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
            for (Person person : personList) {
                if (person.getStatus() == State.UNAVAILABLE) {
                    person.setStatus(State.UNSELECTED);
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
        checkExcavationResources();
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
        checkExcavationResources();
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
        checkExploitationResources();
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
        checkExploitationResources();
        // sending an update to views
        notifyObservers();
    }

    private void checkExcavationResources() {
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
            else if (tool.getStatus() == State.UNAVAILABLE) {
                boolean requirementMet = true;
                ArrayList<JobEnum> requiredJobs = tool.getRequirements();
                for (int i = 0; i < requiredJobs.size() && requirementMet; i++) {
                    requirementMet = availableJobs.contains(requiredJobs.get(i));
                }
                if (requirementMet)
                    tool.setStatus(State.UNSELECTED);
            }
        }
    }

    private void checkExploitationResources() {
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
            else if (tool.getStatus() == State.UNAVAILABLE) {
                boolean requirementMet = true;
                ArrayList<JobEnum> requiredJobs = tool.getRequirement();
                for (int i = 0; i < requiredJobs.size() && requirementMet; i++) {
                    requirementMet = availableJobs.contains(requiredJobs.get(i));
                }
                if (requirementMet)
                    tool.setStatus(State.UNSELECTED);
            }
        }
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
            boolean requirementsMet = requiredTools.isEmpty();
            for (int i = 0; i < requiredTools.size() && !requirementsMet; i++) {
                requirementsMet = usedTools.contains(requiredTools.get(i));
            }
            rel.setFound(requirementsMet);
        }
    }

    public ArrayList<Relic> getFoundRelics() {
        ArrayList<Relic> foundRelics = new ArrayList<>();
        for (Relic rel : relics) {
            if (rel.getFound()) {
                foundRelics.add(rel);
            }
        }
        return foundRelics;
    }

    public int countPoints() {
        int points = 0;
        for (Relic rel : getFoundRelics()) {
            points += rel.getTotalValue();
        }
        return points;
    }

    public String analyzeRelic(String relicName) {
        String report = null;
        for (Relic rel : relics) {
            if (rel.getName().equals(relicName)) {
                report = rel.analyze(getSelectedExploitationTools());
                break;
            }
        }
        return report;
    }

    public void resetGameProgress() {
        for (Person pers : personList) {
            pers.setStatus(State.UNSELECTED);
            pers.setHighlighted(false);
        }
        for (ExcavationTool excaTool : excavationTools) {
            excaTool.setStatus(State.UNSELECTED);
            excaTool.setHighligt(false);
        }
        for (ExploitationTool exploTool : exploitationTools) {
            exploTool.setStatus(State.UNSELECTED);
            exploTool.setHighlighted(false);
        }
        for (Relic rel : relics) {
            rel.setFound(false);
            rel.setHighlighted(false);
        }
        currentStage = 0;
        notifyObservers();
    }
}