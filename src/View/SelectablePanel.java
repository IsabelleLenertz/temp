package View;

import Control.GameControleur;
import Model.*;

import javax.swing.*;

/**
 * 
 */
public class SelectablePanel {

    /**
     * Default constructor
     */
    public SelectablePanel() {
    }

    /**
     * @param name
     * @param g
     */
    public SelectablePanel(String name, GameControleur g) {
        this.g = g;
    }

    /**
     * 
     */
    public State state;

    /**
     * 
     */
    private JButton button;

    /**
     * 
     */
    private String name;
    private GameControleur g;


    /**
     * 
     */
    public void Uptade() {
        // TODO implement here
    }

}