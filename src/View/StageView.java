package View;
import javax.swing.*;

import Control.GameControleur;

/**
 * The stage's view
 */
public abstract class StageView extends JPanel {

    /**
     * @param g
     *
     * Default constructor
     */
    public StageView(GameControleur g)
    {
        this.g = g;
    }

    private GameControleur g;

    /**
     * Displays how many ressources remains
     */
    private JPanel ressourcesPanel;

    /**
     * Displays informations
     */
    private JPanel displayInfos;

    /**
     * Displays the main content with all the selectable objects
     */
    private JPanel panelContent;

    /**
     * Button to skip to the next panel
     */
    private JButton buttonNext;

    public GameControleur getG() {
        return g;
    }

    public void setG(GameControleur g) {
        this.g = g;
    }
}