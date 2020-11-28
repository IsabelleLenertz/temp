package Model;

import java.io.File;
import java.util.ArrayList;

/**
 * 
 */
public class Person {

    private String name;
    private String desc;
    private JobEnum jobs;
    private boolean isHighligthed;
    private State status;
    private File f;

    /**
     * Default constructor
     */
    public Person() {
    }

    public Person(String name, String desc, JobEnum jobs) {
        this.name = name;
        this.desc = desc;
        this.jobs = jobs;
        this.isHighligthed = false;
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

    public JobEnum getJobs() {
        return jobs;
    }
    public void setJobs(JobEnum jobs) {
        this.jobs = jobs;
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
    public void setHighligthed(boolean val){
        this.isHighligthed = val;
    }
}