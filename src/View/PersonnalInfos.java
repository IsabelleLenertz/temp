package View;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.*;

/**
 * Displays a character's information
 */
public class PersonnalInfos extends SideInfos {

    /**
     * @param name
     * @param desc
     * @param jobs
     * @param img
     *
     * Default constructor
     */
    public PersonnalInfos(String name, String desc, ArrayList<String> jobs, String img) {
        super(name, desc);
        this.jobs = jobs;
        this.image = img;

        int i = 3;

        for(String job : jobs)
        {
            i++;
        }

        this.setLayout(new GridLayout(i, 0));

        /*BufferedImage image = null;
        try{
            image = ImageIO.read(new File(this.getImage()));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        JLabel labelImg = new JLabel(new ImageIcon(image));
        labelImg.setVisible(true);*/

        JLabel personnalName = new JLabel(this.getName());
        personnalName.setVisible(true);

        JLabel personnalDesc = new JLabel(this.getDesc());
        personnalDesc.setVisible(true);

        //this.add(labelImg);
        this.add(personnalName);
        this.add(personnalDesc);

        for(String job : jobs)
        {
            JLabel competence = new JLabel(job);
            this.add(competence);
        }
    }
    /**
     *  List of the jobs that the character can do
     */
    private ArrayList<String> jobs;

    /**
     * Path to the image
     */
    private String image;

    public ArrayList<String> getJobs() {
        return jobs;
    }

    public void setJobs(ArrayList<String> jobs) {
        this.jobs = jobs;
    }

    public String getImage()
    {
        return this.image;
    }

    public void setDisplay()
    {
        this.setVisible(true);
    }
}