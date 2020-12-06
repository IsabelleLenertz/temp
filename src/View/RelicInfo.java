package View;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Displays a relic's information
 */
public class RelicInfo extends SideInfos {

    /**
     * @param name
     * @param desc
     * @param img
     *
     * Default constructor
     */
    public RelicInfo(String name, String desc, String img)
    {
        super(name, desc);
        this.image = img;
    }

    private String image;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public void setDisplay() {

        this.setLayout(new GridLayout(3, 0));

        BufferedImage image = null;
        try{
            image = ImageIO.read(new File(this.getImage()));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        JLabel labelImg = new JLabel(new ImageIcon(image));
        labelImg.setVisible(true);

        JLabel personnalName = new JLabel(this.getName());
        personnalName.setVisible(true);

        JLabel personnalDesc = new JLabel(this.getDesc());
        personnalDesc.setVisible(true);

        this.add(labelImg);
        this.add(personnalName);
        this.add(personnalDesc);

    }
}