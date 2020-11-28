package Model;

import java.io.File;
import java.util.ArrayList;

/**
 * 
 */
public class Person {

    private String name;
    private String desc;
    private ArrayList<JobEnum> jobs;
    private boolean isHighlighted;
    private State status;
    private File f;

    /**
     * Default constructor
     */
    public Person() {
    }

    public Person(String name, String desc, ArrayList<JobEnum> jobs) {
        this.name = name;
        this.desc = desc;
        this.jobs = jobs;
        this.isHighlighted = false;
        this.status = State.UNSELECTED;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public ArrayList<JobEnum> getJobs() {
        return jobs;
    }

    public State getStatus() {
        return status;
    }
    public void setStatus(State status) {
        this.status = status;
    }

    public File getImg(){
        return this.f;
    }

    public void setHighlighted(boolean val){
        this.isHighlighted = val;
    }
    public boolean isHighlighted() {
        return isHighlighted;
    }
}