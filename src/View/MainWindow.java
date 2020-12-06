package View;

import Control.GameControleur;
import observer.Observer;

import javax.swing.*;

public class MainWindow extends JFrame implements Observer {

    private JPanel stagePanel;
    private GameControleur g;
    private StageView stage;
    private int curentStage = -1;

    public MainWindow(GameControleur g)
    {
        this.g = g;
        this.stagePanel = new JPanel();
        this.add(stagePanel);
        update();
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
                    stagePanel.add(new MainMenuView(g));
                    break;
                case 1:
                    this.stage = new TeamView(g);
                    stagePanel.add(stage);
                    break;
                case 2:
                    this.stage = new TeamView(g);
                    stagePanel.add(stage);
                    break;
                case 3:
                    this.stage = new TeamView(g);
                    stagePanel.add(stage);
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
