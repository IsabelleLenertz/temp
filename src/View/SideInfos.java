package View;

import javax.swing.*;

/**
 * Name of the character/method/object
 **/
public abstract class SideInfos extends JPanel {

    /**
     * @param name
     * @param desc
     *
     * Default constructor
     */
    public SideInfos(String name, String desc) {
        this.name = name;
        this.desc = "<html>" + desc;
        setDisplay();
    }

    private String name;

    private String desc;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public abstract void setDisplay();
}
