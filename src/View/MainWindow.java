package View;

import Control.GameControleur;
import observer.Observer;

import javax.swing.*;

public class MainWindow extends JFrame implements Observer {

    private JPanel stagePanel;
    private GameControleur g;
    private StageView stage;
    private int curentStage = -1;

    public MainWindow(GameControleur g) {
        this.g = g;
        this.stagePanel = new JPanel();
        this.add(stagePanel);
        update();
        this.setVisible(true);
    }

    @Override
    public void update() {
        int stageNumber = g.getGameStage();

        if (stageNumber != curentStage) {
            curentStage = stageNumber;
            this.stagePanel.removeAll();
            switch (curentStage) {
                case 0:
                    this.stage = null;
                    MainMenuView mainMenu = new MainMenuView(g);
                    mainMenu.setSize(this.getSize());
                    stagePanel.add(mainMenu);
                    stagePanel.setSize(this.getSize());
                    break;
                case 1:
                    this.stage = new TeamView(g);
                    this.stage.setSize(this.getSize());
                    stagePanel.add(stage);
                    stagePanel.setSize(this.getSize());
                    break;
                case 2:
                    this.stage = new ExcavationView(g);
                    this.stage.setSize(this.getSize());
                    stagePanel.add(stage);
                    stagePanel.setSize(this.getSize());
                    break;
                case 3:
                    this.stage = new ExploitationView(g);
                    this.stage.setSize(this.getSize());
                    stagePanel.add(stage);
                    stagePanel.setSize(this.getSize());
                    break;
                case 4:
                    this.stage = null;
                    // stagePanel.add(new ResultsView(g));
                    break;
            }
            stagePanel.revalidate();
        }
        if (stage != null) {
            stage.update();
        }
    }
}



