package View;
import javax.swing.*;

import Control.GameControleur;
import observer.Observer;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Flow;

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
        setDisplay();
    }

    private GameControleur g;

    private JPanel resource;

    private JPanel tools;

    private JPanel sideInfos;

    private JPanel panelTextButton;

    private JLabel text;

    private JButton toMainMenu;

    private JButton confirm;

    private GridBagConstraints gc;

    public GameControleur getG() {
        return g;
    }

    public JPanel mainContent() {
        return this.tools;
    }

    public JPanel resources() {
        return this.resource;
    }

    public void setG(GameControleur g) {
        this.g = g;
    }

    public void setDisplay()
    {
        this.setLayout(new GridBagLayout());

        gc = new GridBagConstraints();
        this.setBackground(Color.ORANGE);
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        gc.fill = GridBagConstraints.BOTH;

        setResource();
        this.add(resource, gc);
        setTools();
        this.add(tools, gc);
        setSideInfos();
        this.add(sideInfos, gc);
        setPanelTextButton();
        this.add(panelTextButton, gc);
        setConfirm();
        this.add(confirm, gc);

        this.setVisible(true);
    }

    protected void setResource()
    {
        resource = new JPanel();
        resource.setBackground(Color.RED);
        resource.setVisible(true);
        resource.setLayout(new BoxLayout(resource, BoxLayout.Y_AXIS));

        gc.gridx = 0;
        gc.gridy = 0;
        gc.weightx = 0.1;
        gc.weighty = 0.9;
        gc.fill = GridBagConstraints.BOTH;
    }

    protected void setTools()
    {
        tools = new JPanel();
        tools.setBackground(Color.BLUE);
        tools.setVisible(true);
        tools.setPreferredSize(tools.getSize());

        gc.gridx = 1;
        gc.gridy = 0;
        gc.weightx = 0.5;
        gc.fill = GridBagConstraints.BOTH;
        tools.setLayout(new BoxLayout(tools, BoxLayout.Y_AXIS));
    }

    protected JPanel setSideInfos()
    {
        sideInfos = new JPanel();
        sideInfos.setVisible(true);
        sideInfos.setBackground(Color.GRAY);

        if (gc != null) {
            gc.gridx = 2;
            gc.gridy = 0;
            gc.weightx = 0.4;
            gc.fill = GridBagConstraints.BOTH;
        }
        sideInfos.setPreferredSize(sideInfos.getSize());
        sideInfos.setLayout(new BorderLayout());
        return  sideInfos;
    }

    protected void setPanelTextButton()
    {
        panelTextButton = new JPanel();
        panelTextButton.setLayout(new GridBagLayout());
        panelTextButton.setBackground(Color.BLACK);
        panelTextButton.setVisible(true);

        setText();
        panelTextButton.add(text, gc);
        setToMainMenu();
        panelTextButton.add(toMainMenu, gc);

        gc.gridx = 0;
        gc.gridy = 1;
        gc.gridwidth = 2;
        gc.weighty = 0.1;
        gc.weightx = 0.8;
        gc.fill = GridBagConstraints.BOTH;
    }

    protected void setText()
    {
        text = new JLabel("text");
        text.setBackground(Color.CYAN);
        text.setOpaque(true);
        text.setVisible(true);

        gc.gridx = 0;
        gc.gridy = 0;
        gc.weightx = 0.8;
        gc.fill = GridBagConstraints.BOTH;
    }

    public void setToMainMenu()
    {
        toMainMenu = new JButton("Main Menu");
        toMainMenu.setBackground(Color.PINK);
        toMainMenu.setVisible(true);
        toMainMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                g.backToMainMenu();
            }
        });

        gc.gridx = 1;
        gc.gridy = 0;
        gc.weightx = 0.2;
        gc.fill = GridBagConstraints.BOTH;
    }

    protected void setConfirm()
    {
        confirm = new JButton("confirm");
        confirm.setBackground(Color.PINK);
        confirm.setVisible(true);
        confirm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                g.nextStage();
            }
        });

        gc.gridx = 2;
        gc.gridy = 1;
        gc.weightx = 0.1;
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
            sideInfos.add(side, BorderLayout.CENTER);
        }

        setResourceRestantes();
        sideInfos.revalidate();
        sideInfos.repaint();
    }
}