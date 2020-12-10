package View;

import javax.swing.*;
import java.awt.*;
import java.util.*;

/**
 * Displays a tool's information
 */
public class ToolsInfos extends SideInfos {

    /**
     * @param name
     * @param desc
     * @param Requirement
     * Default constructor
     */
    public ToolsInfos(String name, String desc, ArrayList<String> Requirement) {
        super(name, desc);
        this.requirement = Requirement;

        this.setLayout(new GridBagLayout());
        GridBagConstraints gc = new GridBagConstraints();
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        gc.fill = GridBagConstraints.BOTH;

        JLabel toolName = new JLabel(this.getName());
        toolName.setVisible(true);
        toolName.setHorizontalAlignment(JLabel.CENTER);

        JLabel toolDesc = new JLabel(this.getDesc());
        toolDesc.setVisible(true);
        toolDesc.setHorizontalAlignment(JLabel.CENTER);

        JLabel requis = new JLabel("Requis : ");
        requis.setVisible(true);
        requis.setHorizontalAlignment(JLabel.LEFT);
        requis.setVerticalAlignment(JLabel.BOTTOM);

        if(requirement.isEmpty())
        {
            gc.weightx = 1;
            gc.weighty = 0.1;
            gc.gridx = 0;
            gc.gridy = 0;
            this.add(toolName, gc);

            gc.gridy = 1;
            gc.weighty = 0.9;
            toolDesc.setVerticalAlignment(JLabel.TOP);
            this.add(toolDesc, gc);
        }
        else
        {
            gc.weightx = 1;
            gc.weighty = 0.25;
            gc.gridx = 0;
            gc.gridy = 0;
            this.add(toolName, gc);

            gc.gridy = 1;
            gc.weighty = 0.1;
            this.add(toolDesc, gc);

            gc.gridy = 2;
            gc.weighty = 0;
            this.add(requis, gc);

            //TODO GERER PLUSIEURS JOBS
            for(String job : requirement)
            {
                JLabel req = new JLabel(job);
                gc.gridy++;
                gc.weighty = 0.75;
                req.setHorizontalAlignment(JLabel.CENTER);
                req.setVerticalAlignment(JLabel.TOP);
                this.add(req, gc);
            }
        }
    }

    /**
     * Objects needed to discover relics
     */
    private ArrayList<String> requirement;

    public ArrayList<String> getRequirement() {
        return requirement;
    }

    public void setRequirement(ArrayList<String> requirement) {
        this.requirement = requirement;
    }

    @Override
    public void setDisplay()
    {
        this.setVisible(true);
    }
}
