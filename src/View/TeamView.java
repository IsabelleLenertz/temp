package View;

import Control.GameControleur;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * The view where the characters are chosen
 */
public class TeamView extends StageView {

    /**
     * @param g
     *
     * Default constructor
     */
    public TeamView(GameControleur g)
    {
        super(g);

        this.setLayout(new GridBagLayout());
        setDisplay();

        // generating the selectable panels for the persons
        // TODO test once the scenario is implemented in the model
        selectablePersons = new ArrayList<SelectablePersonPanel>();
        for (String persName : g.getPersonsList()) {
            SelectablePersonPanel persPan = new SelectablePersonPanel(persName, g);
            selectablePersons.add(persPan);
            characters.add(persPan);
        }
    }

    @Override
    public void update() {
        super.update();
        // TODO test once the scenario is implemented in the model
        // updating the display of each selectable panel
        for (SelectablePersonPanel persPan : selectablePersons) {
            persPan.update();
        }
    }

    private ArrayList<SelectablePersonPanel> selectablePersons;

    private JPanel resource;

    private JPanel characters;

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
        setCharacters();
        this.add(characters, gc);
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

    private void setCharacters()
    {
        characters = new JPanel();
        characters.setName("Char");
        characters.setBackground(Color.BLUE);
        characters.setVisible(true);

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