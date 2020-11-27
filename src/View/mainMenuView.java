package View;

import javax.swing.*;

/**
 * The main menu's view
 */
public class mainMenuView {

    /**
     * Default constructor
     */
    public mainMenuView(JPanel selectionScenario) {
        this.selectionScenario = selectionScenario;
    }

    /**
     * Panel where the scenario is chosen
     */
    public JPanel selectionScenario;


    public JPanel getSelectionScenario() {
        return selectionScenario;
    }

    public void setSelectionScenario(JPanel selectionScenario) {
        this.selectionScenario = selectionScenario;
    }
}