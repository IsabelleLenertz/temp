package View;

import Model.*;
import Control.GameControleur;
import jdk.dynalink.linker.GuardedInvocationTransformer;
import observer.Observer;

import javax.imageio.plugins.tiff.GeoTIFFTagSet;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * The generic class for the selectable characters/tools
 */
public abstract class SelectablePanel extends JPanel implements Observer {

    private class MListener implements MouseListener {
        @Override
        public void mouseEntered(MouseEvent e) {
            highlight();
        }

        @Override
        public void mouseExited(MouseEvent e) {
            unhighlight();
        }
        // unused events, but have to be defined
        @Override
        public void mouseClicked(MouseEvent e) {}
        @Override
        public void mousePressed(MouseEvent e) {}
        @Override
        public void mouseReleased(MouseEvent e) {}
    }



    /**
     * @param name
     * @param g
     *
     * Default constructor
     */
    public SelectablePanel(String name, GameControleur g) {

        // attributes setup
        this.name = name;
        this.g = g;
        this.state = State.UNSELECTED;
        this.selectButton = new JButton("Sélectionner");

        this.unselectButton = new JButton("Désélectionner");

        this.unavailableButton = new JButton("Ressources manquantes");
        this.unavailableButton.setEnabled(false);

        this.add(new JLabel(name));

        // action listeners setup
        this.selectButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                select();
            }
        });
        this.unselectButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                unselect();
            }
        });
        MListener myListener = new MListener();
        this.addMouseListener(myListener);
        this.selectButton.addMouseListener(myListener);
        this.unselectButton.addMouseListener(myListener);
        this.unavailableButton.addMouseListener(myListener);

        // basic default display
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2, true));
        this.update();
    }

    private GameControleur g;

    /**
     * setter for the state
     * @param state
     */
    public void setState(State state) {
        this.state = state;
    }

    /**
     * State of the panel
     */
    private State state;

    /**
     * Select Button
     */
    private JButton selectButton;

    /**
     * Unselect Button
     */
    private JButton unselectButton;

    /**
     * Label to display when unavailable
     */
    private JButton unavailableButton;


    /**
     * getter for the name
     * @return
     */
    public String getSelectableName() {
        return name;
    }

    /**
     * The panel's name
     */
    private String name;

    public GameControleur getG() {
        return g;
    }

    public void setG(GameControleur g) {
        this.g = g;
    }


    /**
     * Updates the display and availability of the button depending on the state
     */
    public void update() {
        // remove all buttons from the display
        if (this.selectButton.getParent() == this)
            this.remove(this.selectButton);
        if (this.unselectButton.getParent() == this)
            this.remove(this.unselectButton);
        if (this.unavailableButton.getParent() == this)
            this.remove(this.unavailableButton);
        // generating the new display depending on the state
        switch (this.state) {
            case SELECTED:
                this.setBackground(Color.GREEN);
                this.add(this.unselectButton);
                break;
            case UNSELECTED:
                this.setBackground(Color.LIGHT_GRAY);
                this.add(this.selectButton);
                break;
            case UNAVAILABLE:
                this.setBackground((Color.RED));
                this.add(this.unavailableButton);
        }
        this.revalidate();
    }

    /**
     * Method to be called when the select button is clicked
     */
    abstract public void select();

    /**
     * Method to be called when the unselect button is clicked
     */
    abstract public void unselect();

    /**
     * Method to be called when the mouse hovers over the pannel
     */
    abstract public void highlight();

    /**
     * Method to be called when the mouse stops hovering over the pannel
     */
    abstract public void unhighlight();
}