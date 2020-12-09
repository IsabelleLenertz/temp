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
        int i = 2;

        for(String job : requirement)
        {
            i++;
        }

        this.setLayout(new GridLayout(i, 0));

        JLabel toolName = new JLabel(this.getName());
        toolName.setVisible(true);

        JLabel toolDesc = new JLabel(this.getDesc());
        toolDesc.setVisible(true);

        this.add(toolName);
        this.add(toolDesc);

        for(String job : requirement)
        {
            JLabel req = new JLabel(job);
            this.add(req);
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
