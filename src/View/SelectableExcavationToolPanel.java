package View;

import Control.GameControleur;

/**
 * Displays selectable excavation tools
 */
public class SelectableExcavationToolPanel extends SelectablePanel {

    /**
     * Default constructor
     */
    public SelectableExcavationToolPanel(String name, GameControleur g)
    {
        super(name, g);
    }

    @Override
    public void update() {
        this.setState(this.getG().getExcavationToolStatus(this.getName()));
        super.update();
    }
}