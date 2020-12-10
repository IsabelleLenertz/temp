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

        this.setLayout(new GridBagLayout());
        GridBagConstraints gc = new GridBagConstraints();
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        gc.fill = GridBagConstraints.BOTH;

        BufferedImage image;
        JLabel labelImg;

        try{
            image = ImageIO.read(new File(this.getImage()));
            labelImg = new JLabel(new ImageIcon(image));
            labelImg.setVisible(true);

            gc.weighty = 0.1;
            gc.gridx = 0;
            gc.gridy = 0;
            this.add(labelImg, gc);
        } catch (IOException e) {
            try {
                image = ImageIO.read(new File("src/img/person.jpg"));
                labelImg = new JLabel(new ImageIcon(image));
                labelImg.setVisible(true);

                gc.weighty = 0.1;
                gc.gridx = 0;
                gc.gridy = 0;
                this.add(labelImg, gc);
            } catch (IOException error){
                System.out.println(error.getMessage());
            }
        }
        catch (NullPointerException np) {
            try {
                image = ImageIO.read(new File("src/img/person.jpg"));
                labelImg = new JLabel(new ImageIcon(image));
                labelImg.setVisible(true);

                gc.weighty = 0.1;
                gc.gridx = 0;
                gc.gridy = 0;
                this.add(labelImg, gc);
            } catch (IOException error){
                System.out.println(error.getMessage());
            }
        }

        JLabel relicName = new JLabel(this.getName());
        relicName.setVisible(true);

        JLabel relicDesc = new JLabel(this.getDesc());
        relicDesc.setVisible(true);

        gc.weighty = 0.2;
        gc.gridy = 1;
        relicName.setHorizontalAlignment(JLabel.CENTER);
        this.add(relicName, gc);

        gc.gridy = 2;
        relicDesc.setHorizontalAlignment(JLabel.CENTER);
        this.add(relicDesc, gc);
    }
}