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

    /**
     * Updates the display of the excavationTool by checking the model through the controller
     */
    @Override
    public void update() {
        this.setState(this.getG().getExcavationToolStatus(this.getSelectableName()));
        super.update();
    }

    /**
     * Selects the excavation tool (called when the select button is clicked)
     */
    @Override
    public void select() {
        this.getG().selectExcavationTool(this.getSelectableName());
    }

    /**
     * Unselects the excavation tool (called when the unselect button is clicked)
     */
    @Override
    public void unselect() {
        this.getG().unselectExcavationTool(this.getSelectableName());
    }
}