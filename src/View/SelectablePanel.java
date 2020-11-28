package View;

import Model.*;
import Control.GameControleur;
import observer.Observer;

import javax.swing.*;
import java.awt.*;

/**
 * The generic class for the selectable characters/tools
 */
public abstract class SelectablePanel extends JPanel implements Observer {

    /**
     * @param name
     * @param g
     *
     * Default constructor
     */
    public SelectablePanel(String name, GameControleur g) {
        this.name = name;
        this.g = g;
        this.state = State.UNSELECTED;
        this.selectButton = new JButton("Sélectionner");
        this.unselectButton = new JButton("Désélectionner");
        this.unavailableButton = new JButton("Ressources manquantes");
        this.unavailableButton.setEnabled(false);
        //this.unavailableButton.setBackground();
        this.add(new JLabel(name));
        this.update();

        this.setSize(325, 50);
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2, true));
    }

    private GameControleur g;

    /**
     * setter for the state
     * @param state
     */
    public void setState(State state) {
        this.state = state;
    }

    /**
     * State of the panel
     */
    private State state;

    /**
     * Select Button
     */
    private JButton selectButton;

    /**
     * Unselect Button
     */
    private JButton unselectButton;

    /**
     * Label to display when unavailable
     */
    private JButton unavailableButton;


    /**
     * getter for the name
     * @return
     */
    public String getPersonName() {
        return name;
    }

    /**
     * The panel's name
     */
    private String name;

    /**
     * Update the Panel
     */
    public void Update()
    {

    }

    public GameControleur getG() {
        return g;
    }

    public void setG(GameControleur g) {
        this.g = g;
    }

    /**
     * Updates the display and availability of the button depending on the state
     */
    public void update() {
        // remove all buttons from the display
        if (this.selectButton.getParent() == this)
            this.remove(this.selectButton);
        if (this.unselectButton.getParent() == this)
            this.remove(this.unselectButton);
        if (this.unavailableButton.getParent() == this)
            this.remove(this.unavailableButton);
        // generating the new display depending on the state
        switch (this.state) {
            case SELECTED:
                this.setBackground(Color.GREEN);
                this.add(this.unselectButton);
                break;
            case UNSELECTED:
                this.setBackground(Color.LIGHT_GRAY);
                this.add(this.selectButton);
                break;
            case UNAVAILABLE:
                this.setBackground((Color.RED));
                this.add(this.unavailableButton);
        }
        this.revalidate();
    }
}