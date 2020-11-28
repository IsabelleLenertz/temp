package View;

import Control.GameControleur;
import Model.State;

/**
 * Displays the selectable characters
 */
public class SelectablePersonPanel extends SelectablePanel {

    /**
     * Default constructor
     */
    public SelectablePersonPanel(String name, GameControleur g)
    {
        super(name, g);
    }

    @Override
    public void update() {
        this.setState( this.getG().getPersonStatus(this.getName()) );
        super.update();
    }
}