package View;

import Model.*;
import Control.GameControleur;

import javax.swing.*;

/**
 * The generic class for the selectable characters/tools
 */
public abstract class SelectablePanel {

    /**
     * @param name
     * @param g
     *
     * Default constructor
     */
    public SelectablePanel(String name, GameControleur g) {
        this.name = name;
        this.g = g;
    }

    private GameControleur g;

    /**
     * State of the panel
     */
    private State state;

    /**
     * Select Button
     */
    private JButton button;

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
}