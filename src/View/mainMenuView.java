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
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setTitre("On l'appelle pas");
        this.add(new Box.Filler(new Dimension(100, 100), new Dimension(100, 100), new Dimension(getMaximumSize())));
        setPlayButton("PLAY !");
        this.setSize(500,500);
    }

    private JLabel titre;

    private JButton playButton;

    public void setPlayButton(String nom) {
        this.playButton = new JButton(nom);
        this.playButton.setBackground(Color.RED);
        this.playButton.setMaximumSize(new Dimension(200, 50));
        this.playButton.setVisible(true);
        this.playButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        this.add(this.playButton);
    }

    public void setTitre(String titre) {
        this.titre = new JLabel(titre);
        this.titre.setVisible(true);
        this.titre.setMaximumSize(new Dimension(200, 80));
        this.titre.setBackground(Color.BLUE);
        this.titre.setOpaque(true);
        this.titre.setHorizontalAlignment(JLabel.CENTER);
        this.titre.setVerticalAlignment(JLabel.CENTER);
        this.titre.setAlignmentX(Component.CENTER_ALIGNMENT);
        this.titre.setAlignmentX(Component.CENTER_ALIGNMENT);
        this.add(this.titre);
    }

    public JLabel getTitre() {
        return titre;
    }

    public JButton getPlayButton() {
        return playButton;
    }
}