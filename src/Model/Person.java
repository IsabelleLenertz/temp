package Model;

import java.util.ArrayList;

/**
 * 
 */
public class Person {

    private final String name;
    private final String desc;
    private final ArrayList<JobEnum> jobs;
    private boolean isHighlighted;
    private State status;
    private final String img;

    public Person(String name, String desc, ArrayList<JobEnum> jobs, String img) {
        this.name = name;
        this.desc = desc;
        this.jobs = jobs;
        this.isHighlighted = false;
        this.status = State.UNSELECTED;
        this.img = img;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return
     */
    public String getDesc() {
        return desc;
    }

    /**
     *
     * @return
     */
    public ArrayList<JobEnum> getJobs() {
        return jobs;
    }

    /**
     *
     * @return
     */
    public State getStatus() {
        return status;
    }

    /**
     *
     * @param status
     */
    public void setStatus(State status) {
        this.status = status;
    }

    /**
     *
     * @return
     */
    public String getImg(){
        return this.img;
    }

    /**
     *
     * @param val
     */
    public void setHighlighted(boolean val){
        this.isHighlighted = val;
    }

    /**
     * 
     * @return
     */
    public boolean isHighlighted() {
        return isHighlighted;
    }
}