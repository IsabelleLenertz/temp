package View;

import Control.GameControleur;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

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
        // dynamic generation of the game results display
        // list of the found relics
        relicPanel.add(new JLabel("Liste des reliques trouvées :"));
        ArrayList<String> foundRelics = g.getFoundRelicsList();
        for (String relicName : foundRelics) {
            relicPanel.add(new JLabel(relicName));
        }
        // Report generation
        scorePanel.add(new JLabel("Rapport de fouille"));
        for (String relicName : foundRelics) {
            scorePanel.add(new JLabel(relicName + " :"));
            scorePanel.add(new JLabel(g.analyzeRelic(relicName)));
        }
        // point display
        scorePanel.add(new JLabel("Vous avez obtenu " + g.countPoints() + " points, recommencez et tentez de faire mieux !"));
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
        relicPanel.setLayout(new BoxLayout(relicPanel, BoxLayout.Y_AXIS));

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
        scorePanel.setLayout(new BoxLayout(scorePanel, BoxLayout.Y_AXIS));

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
        toMainMenuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                g.backToMainMenu();
            }
        });

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
        quitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        gc.gridx = 2;
        gc.gridy = 2;
        gc.weighty = 0.05;
        gc.gridwidth = 1;
        gc.gridheight = 1;
        gc.fill = GridBagConstraints.BOTH;
    }

}