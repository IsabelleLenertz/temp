package View;

import Control.GameControleur;
import observer.Observer;

import javax.swing.*;
import javax.xml.stream.Location;
import java.awt.*;

public class MainWindow extends JFrame implements Observer {

    private JPanel panel;
    private GameControleur g;
    private StageView stage;
    private int currentStage = -1;
    private GridBagConstraints gc;

    public MainWindow(GameControleur g) {
        this.g = g;
        this.panel = new JPanel();
        this.panel.setLayout(new BorderLayout());
        panel.setVisible(true);

        this.setSize(1000, 600);

        this.add(panel);
        update();

        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }

    @Override
    public void update() {
        int stageNumber = g.getGameStage();

        if (stageNumber != currentStage) {
            currentStage = stageNumber;
            panel.removeAll();
            switch (currentStage) {
                case 0:
                    this.stage = null;
                    MainMenuView mainMenu = new MainMenuView(g);
                    panel.add(mainMenu, BorderLayout.CENTER);
                    mainMenu.setVisible(true);
                    break;
                case 1:
                    this.stage = new TeamView(g);
                    panel.add(stage, BorderLayout.CENTER);
                    this.stage.setVisible(true);
                    break;
                case 2:
                    this.stage = new ExcavationView(g);
                    panel.add(stage, BorderLayout.CENTER);
                    this.stage.setVisible(true);
                    break;
                case 3:
                    this.stage = new ExploitationView(g);
                    panel.add(stage, BorderLayout.CENTER);
                    this.stage.setVisible(true);
                    break;
                case 4:
                    this.stage = null;
                    ResultsView vueScore = new ResultsView(g);
                    panel.add(vueScore, BorderLayout.CENTER);
                    vueScore.setVisible(true);
                    break;
            }
            panel.setSize(this.getSize());
            panel.revalidate();
            System.out.println(this.getSize());
        }
        if (stage != null) {
            stage.update();
        }
    }
}