package View;

import Control.GameControleur;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * The view where the characters are chosen
 */
public class TeamView extends StageView {

    private ArrayList<SelectablePersonPanel> selectablePersons;


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
            persPan.setLayout(new GridBagLayout());
            selectablePersons.add(persPan);
            this.mainContent().add(persPan);
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
        // updating resource display
        setResourceRestantes();
    }

    public void setResourceRestantes()
    {
        int nb = this.getG().getAvailableHireCount();
        JLabel nbHireCount = new JLabel("<html><body style='box-shadow: inset 0 0 10px #000000;text-align: center;align-self: center;'><h3>Vous pouvez encore engager</h3><h1 style='font-size: 75px'>" + nb + "</h1><h2>personnes !</h2>", JLabel.CENTER);
        nbHireCount.setVerticalAlignment(JLabel.CENTER);
        nbHireCount.setVisible(true);

        this.resources().removeAll();
        this.resources().setLayout(new BorderLayout());
        this.resources().add(nbHireCount, BorderLayout.CENTER);
        this.resources().revalidate();
    }

    @Override
    public void initText() {
        this.setText(new JLabel("<html><h1>Etape 1 : Préparation de l'opération</h1><p>Veuillez séléctionner les personnes pour l'opération."));
        getText().setBackground(Color.CYAN);
        getText().setOpaque(true);
    }
}