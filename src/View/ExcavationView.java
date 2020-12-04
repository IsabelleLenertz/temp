package View;

import Control.GameControleur;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Excavation part's view
 */
public class ExcavationView extends StageView {

    /**
     * Default constructor
     */
    public ExcavationView(GameControleur g)
    {
        super(g);
        this.setLayout(new GridBagLayout());
        setDisplay();
        this.setVisible(true);

        // generating the selectable tool panels
        // TODO test once the scenario is implemented in the model
        selectableExcavationTools = new ArrayList<SelectableExcavationToolPanel>();
        for (String toolName : g.getExcavationToolsList()) {
            SelectableExcavationToolPanel toolPan = new SelectableExcavationToolPanel(toolName, g);
            selectableExcavationTools.add(toolPan);
            tools.add(toolPan);
        }
    }

    @Override
    public void update() {
        super.update();
        // TODO test once the scenario is implemented in the model
        // updating each selectable tool panel
        for (SelectableExcavationToolPanel toolPan : selectableExcavationTools) {
            toolPan.update();
        }
    }

    private ArrayList<SelectableExcavationToolPanel> selectableExcavationTools;

    private JPanel resource;

    private JPanel tools;

    private JPanel sideInfos;

    private JLabel text;

    private JButton confirm;

    private GridBagConstraints gc;

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

    private void setResource()
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

    private void setTools()
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

    private void setSideInfos()
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

    private void setText()
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

    private void setConfirm()
    {
        confirm = new JButton("confirm");
        confirm.setBackground(Color.PINK);
        confirm.setVisible(true);

        gc.gridx = 2;
        gc.gridy = 1;
        gc.fill = GridBagConstraints.BOTH;
    }
}