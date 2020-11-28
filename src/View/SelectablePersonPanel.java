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

    /**
     * Updates the display of the person by checking the model through the controller
     */
    @Override
    public void update() {
        this.setState( this.getG().getPersonStatus(this.getSelectableName()));
        super.update();
    }

    /**
     * Selects the person (called when the select button is clicked)
     */
    @Override
    public void select() {
        this.getG().selectPerson(this.getSelectableName());
    }

    /**
     * Unselects the person (called when the unselect button is clicked)
     */
    @Override
    public void unselect() {
        this.getG().unselectPerson(this.getSelectableName());
    }
}