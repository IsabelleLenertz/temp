package View;

import javax.swing.*;
import java.awt.*;

/**
 * The main menu's view
 */
public class mainMenuView extends JPanel {

    /**
     * Default constructor
     */
    public mainMenuView() {
        this.setLayout(null);
        setPlayButton("Play");
        setTitre("On l'appelle pas");
        this.setSize(500,500);
    }

    private JLabel titre;

    private JButton playButton;

    public JButton getPlayButton() {
        return playButton;
    }

    public void setPlayButton(String nom) {
        this.playButton = new JButton(nom);
        this.playButton.setBackground(Color.RED);
        this.playButton.setSize(200, 100);
        this.playButton.setLocation(150, 250);
        this.playButton.setVisible(true);
        this.add(this.playButton);
    }

    public JLabel getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = new JLabel(titre);
        this.titre.setVisible(true);
        this.titre.setSize(200, 100);
        this.titre.setLocation(150, 50);
        this.titre.setBackground(Color.BLUE);
        this.titre.setOpaque(true);
        this.titre.setHorizontalAlignment(JLabel.CENTER);
        this.titre.setVerticalAlignment(JLabel.CENTER);
        this.add(this.titre);
    }
}