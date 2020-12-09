package View;

import Control.GameControleur;

import javax.swing.*;
import java.awt.*;

/**
 * The view that displays the results at the end of the game
 */
public class ResultsView extends JPanel {

    /**
     * Default constructor
     */
    public ResultsView(GameControleur g) {
        this.g = g;
        setDisplay();
    }

    private GameControleur g;

    private GridBagConstraints gc;

    private JPanel relicPanel;

    private JPanel scorePanel;

    private JButton toMainMenuButton;

    private JButton quitButton;

    public void setDisplay()
    {
        this.setLayout(new GridBagLayout());

        gc = new GridBagConstraints();
        this.setBackground(Color.ORANGE);
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        gc.fill = GridBagConstraints.VERTICAL;

        setRelicPanel();
        this.add(relicPanel, gc);
        setScorePanel();
        this.add(scorePanel, gc);
        setToMainMenuButton();
        this.add(toMainMenuButton, gc);
        setQuitButton();
        this.add(quitButton, gc);

        this.setVisible(true);
    }

    public void setRelicPanel()
    {
        relicPanel = new JPanel();
        relicPanel.setBackground(Color.RED);
        relicPanel.setVisible(true);

        gc.gridx = 0;
        gc.gridy = 0;
        gc.weightx = 0.4;
        gc.gridwidth = 1;
        gc.gridheight = 3;
        gc.fill = GridBagConstraints.BOTH;
    }

    public void setScorePanel()
    {
        scorePanel = new JPanel();
        scorePanel.setBackground(Color.BLUE);
        scorePanel.setVisible(true);

        gc.gridx = 1;
        gc.gridy = 0;
        gc.weightx = 0.6;
        gc.weighty = 0.9;
        gc.gridwidth = 2;
        gc.gridheight = 1;
        gc.fill = GridBagConstraints.BOTH;
    }

    public void setToMainMenuButton()
    {
        toMainMenuButton = new JButton("Main Menu");
        toMainMenuButton.setBackground(Color.PINK);
        toMainMenuButton.setVisible(true);

        gc.gridx = 1;
        gc.gridy = 2;
        gc.weighty = 0.05;
        gc.gridwidth = 1;
        gc.gridheight = 1;
        gc.fill = GridBagConstraints.BOTH;
    }

    public void setQuitButton()
    {
        quitButton = new JButton("Quit");
        quitButton.setBackground(Color.GRAY);
        quitButton.setVisible(true);

        gc.gridx = 2;
        gc.gridy = 2;
        gc.weighty = 0.05;
        gc.gridwidth = 1;
        gc.gridheight = 1;
        gc.fill = GridBagConstraints.BOTH;
    }

}