package View;
import javax.swing.*;

import Control.GameControleur;
import observer.Observer;

import java.awt.*;

/**
 * The stage's view
 */
public abstract class StageView extends JPanel implements Observer {

    /**
     * @param g
     *
     * Default constructor
     */
    public StageView(GameControleur g)
    {
        this.g = g;
        this.setLayout(new GridBagLayout());
        setDisplay();
        this.setVisible(true);
    }

    private GameControleur g;

    private JPanel resource;

    private JPanel tools;

    private JPanel sideInfos;

    private JLabel text;

    private JButton confirm;

    private GridBagConstraints gc;

    public GameControleur getG() {
        return g;
    }

    public void setG(GameControleur g) {
        this.g = g;
    }

    public void setDisplay()
    {
        gc = new GridBagConstraints();
        this.setBackground(Color.ORANGE);
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        gc.fill = GridBagConstraints.VERTICAL;

        setResource();
        this.add(resource, gc);
        setTools();
        this.add(tools, gc);
        setSideInfos();
        this.add(sideInfos, gc);
        setText();
        this.add(text, gc);
        setConfirm();
        this.add(confirm, gc);

        this.setVisible(true);
    }

    protected void setResource()
    {
        resource = new JPanel();
        resource.setName("RSS");
        resource.setBackground(Color.RED);
        resource.setVisible(true);

        gc.gridx = 0;
        gc.gridy = 0;
        gc.weightx = 1.0;
        gc.weighty = 0.9;
        gc.fill = GridBagConstraints.BOTH;
    }

    protected void setTools()
    {
        tools = new JPanel();
        tools.setName("Char");
        tools.setBackground(Color.BLUE);
        tools.setVisible(true);

        gc.gridx = 1;
        gc.gridy = 0;
        gc.weightx = 1.5;
        gc.fill = GridBagConstraints.BOTH;
    }

    protected void setSideInfos()
    {
        sideInfos = new JPanel();
        sideInfos.setName("side");
        sideInfos.setVisible(true);
        sideInfos.setBackground(Color.GRAY);

        gc.gridx = 2;
        gc.gridy = 0;
        gc.weightx = 1.0;
        gc.fill = GridBagConstraints.BOTH;
    }

    protected void setText()
    {
        text = new JLabel("text");
        text.setBackground(Color.CYAN);
        text.setOpaque(true);
        text.setVisible(true);

        gc.gridx = 0;
        gc.gridy = 1;
        gc.gridwidth = 2;
        gc.weighty = 0.1;
        gc.fill = GridBagConstraints.BOTH;
    }

    protected void setConfirm()
    {
        confirm = new JButton("confirm");
        confirm.setBackground(Color.PINK);
        confirm.setVisible(true);

        gc.gridx = 2;
        gc.gridy = 1;
        gc.fill = GridBagConstraints.BOTH;
    }

    public abstract void setResourceRestantes();

    @Override
    public void update() {
        // TODO update of the side info display
        sideInfos.removeAll();
        SideInfos side = g.getSideInfo();

        if(side != null)
        {
            sideInfos.add(side);
        }

        setResourceRestantes();
        sideInfos.revalidate();
    }
}