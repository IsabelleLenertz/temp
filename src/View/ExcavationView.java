package View;

import Control.GameControleur;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Excavation part's view
 */
public class ExcavationView extends StageView {

    /**
     * Default constructor
     */
    public ExcavationView(GameControleur g)
    {
        super(g);

        // generating the selectable tool panels
        // TODO test once the scenario is implemented in the model
        selectableExcavationTools = new ArrayList<SelectableExcavationToolPanel>();
        for (String toolName : g.getExcavationToolsList()) {
            SelectableExcavationToolPanel toolPan = new SelectableExcavationToolPanel(toolName, g);
            selectableExcavationTools.add(toolPan);
            this.mainContent().add(toolPan);
        }
    }

    @Override
    public void update() {
        super.update();
        // TODO test once the scenario is implemented in the model
        // updating each selectable tool panel
        for (SelectableExcavationToolPanel toolPan : selectableExcavationTools) {
            toolPan.update();
        }
    }

    private ArrayList<SelectableExcavationToolPanel> selectableExcavationTools;

    public void setResourceRestantes()
    {
        this.resources().removeAll();

        ArrayList<String> jobsList = this.getG().getAvailableJobs();
        while (jobsList.size() != 0) {
            String job = jobsList.get(0);
            int count = 0;
            for (int i = jobsList.size()-1; i >= 0; i--) {
                if (jobsList.get(i) == job) {
                    count++;
                    jobsList.remove(i);
                }
            }
            this.resources().add(new JLabel(job + " x" + count));
        }

        this.resources().revalidate();
    }

}