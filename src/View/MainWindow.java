package View;

public class MainWindow {

    StageView stage;

    public MainWindow(StageView stage)
    {
        this.stage = stage;
    }

    public StageView getStage() {
        return stage;
    }

    public void setStage(StageView stage) {
        this.stage = stage;
    }
}
