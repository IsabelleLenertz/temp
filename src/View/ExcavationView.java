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
        this.resources().add(new JLabel("<html><h2 style='padding-left: 10px; padding-top: 10px'>Compétences disponibles :"));
        ArrayList<String> availableJobList = this.getG().getAvailableJobs();
        if (availableJobList.size() == 0)
            this.resources().add(new JLabel("<html><p style='font-size: 10px; padding-left: 25px;'>Aucunes</p>"));
        while (availableJobList.size() != 0) {
            String job = availableJobList.get(0);
            int count = 0;
            for (int i = availableJobList.size()-1; i >= 0; i--) {
                if (availableJobList.get(i) == job) {
                    count++;
                    availableJobList.remove(i);
                }
            }
            this.resources().add(new JLabel("<html><p style='font-size: 10px; padding-left: 25px;'>" + job + " x" + count + "</p>"));
        }
        this.resources().add(new JLabel("<html><h2 style='padding-left: 10px; padding-top: 10px'>Compétences utilisés :"));
        ArrayList<String> usedJobList = this.getG().getUsedJobs();
        if (usedJobList.size() == 0)
            this.resources().add(new JLabel("<html><p style='font-size: 10px; padding-left: 25px;'>Aucunes</p>"));
        while (usedJobList.size() != 0) {
            String job = usedJobList.get(0);
            int count = 0;
            for (int i = usedJobList.size()-1; i >= 0; i--) {
                if (usedJobList.get(i) == job) {
                    count++;
                    usedJobList.remove(i);
                }
            }
            this.resources().add(new JLabel("<html><p style='font-size: 10px; padding-left: 25px;'>" + job + " x" + count + "</p>"));
        }
        this.resources().repaint();
        this.resources().revalidate();
    }

    @Override
    public void initText() {
        this.setText(new JLabel("<html><h1>Etape 2 : Fouille du site</h1><p>Veuiller selectionner les méthodes de fouille à utiliser."));
        getText().setBackground(Color.CYAN);
        getText().setOpaque(true);
    }
}