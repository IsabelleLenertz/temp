package View;

import Control.GameControleur;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * The view where the characters are chosen
 */
public class TeamView extends StageView {

    /**
     * @param g
     *
     * Default constructor
     */
    public TeamView(GameControleur g)
    {
        super(g);

        // generating the selectable panels for the persons
        // TODO test once the scenario is implemented in the model
        selectablePersons = new ArrayList<SelectablePersonPanel>();
        for (String persName : g.getPersonsList()) {
            SelectablePersonPanel persPan = new SelectablePersonPanel(persName, g);
            selectablePersons.add(persPan);
            characters.add(persPan);
        }
    }

    @Override
    public void update() {
        super.update();
        // TODO test once the scenario is implemented in the model
        // updating the display of each selectable panel
        for (SelectablePersonPanel persPan : selectablePersons) {
            persPan.update();
        }
    }

    private ArrayList<SelectablePersonPanel> selectablePersons;

    private JPanel resource;

    private JPanel characters;

    private JPanel sideInfos;

    private JLabel text;

    private JButton confirm;

    private GridBagConstraints gc;

    public void setResourceRestantes()
    {
        int nb = this.getG().getAvailableHireCount();
        JLabel nbHireCount = new JLabel("Vous pouvez encore engager " + nb + " personnes !");
        nbHireCount.setVisible(true);

        resource.removeAll();
        resource.add(nbHireCount);
        resource.revalidate();
    }

}