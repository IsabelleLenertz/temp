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
        this.image = "src/img/person.jpg";

        this.setLayout(new GridBagLayout());
        GridBagConstraints gc = new GridBagConstraints();
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        gc.fill = GridBagConstraints.BOTH;

        int i = 3;

        for(String job : jobs)
        {
            i++;
        }

        BufferedImage image = null;
        try{
            image = ImageIO.read(new File(this.getImage()));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        JLabel labelImg = new JLabel(new ImageIcon(image));
        labelImg.setVisible(true);

        JLabel personnalName = new JLabel(this.getName());
        personnalName.setVisible(true);
        personnalName.setHorizontalAlignment(JLabel.CENTER);

        JLabel personnalDesc = new JLabel(this.getDesc());
        personnalDesc.setVisible(true);
        personnalDesc.setHorizontalAlignment(JLabel.CENTER);

        gc.weighty = 0.1;
        gc.gridx = 0;
        gc.gridy = 0;
        this.add(labelImg, gc);

        gc.weighty = 0.2;
        gc.gridy = 1;
        this.add(personnalName, gc);
        gc.gridy = 2;
        this.add(personnalDesc, gc);

        for(String job : jobs)
        {
            gc.gridy++;
            JLabel competence = new JLabel(job);
            competence.setHorizontalAlignment(JLabel.CENTER);
            this.add(competence, gc);
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