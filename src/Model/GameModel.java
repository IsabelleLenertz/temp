package Model;

import View.StageView;
import observer.Observer;
import observer.Subject;

import java.util.*;

/**
 * 
 */
public class GameModel implements Subject {

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
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
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
}