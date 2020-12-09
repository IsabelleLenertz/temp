import Control.GameControleur;
import Model.*;
import View.*;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Relic> relics = new ArrayList<>();
        ArrayList<Person> personArrayList = new ArrayList<>();
        ArrayList<ExcavationTool> excavationTools = new ArrayList<>();
        ArrayList<ExploitationTool> exploitationTools = new ArrayList<>();

        ArrayList<JobEnum> requirement1 = new ArrayList<>();

        requirement1.add(JobEnum.JOB_ENUM1);
        requirement1.add(JobEnum.JOB_ENUM2);

        ExcavationTool excavationTool = new ExcavationTool("pioche", "objet de fouille", requirement1);

        ExploitationTool exploitationTool = new ExploitationTool("carbonne 14", "datation des composants", requirement1);
        ExploitationTool exploitationTool1 = new ExploitationTool("methode 2", "une methode2", requirement1);
        ExploitationTool exploitationTool2 = new ExploitationTool("o", "un o", requirement1);
        ExploitationTool exploitationTool3 = new ExploitationTool("outil 1.0", "un autre outil", requirement1);

        Person person1 = new Person("James", "Un mec", requirement1);
        Person person2 = new Person("James1", "Un mec", requirement1);
        Person person3 = new Person("James2", "Un mec", requirement1);
        Person person4 = new Person("James3", "Un mec", requirement1);
        Person person5 = new Person("James4", "Un mec", requirement1);
        Person person6 = new Person("James5", "Un mec", requirement1);
        Person person7 = new Person("James6", "Un mec", requirement1);
        Person person8 = new Person("James7", "Un mec", requirement1);
        Person person9 = new Person("James8", "Un mec", requirement1);
        Person person10 = new Person("James9", "Un mec", requirement1);
        Person person11 = new Person("James10", "Un mec", requirement1);


        excavationTools.add(excavationTool);

        exploitationTools.add(exploitationTool);
        exploitationTools.add(exploitationTool1);
        exploitationTools.add(exploitationTool2);
        exploitationTools.add(exploitationTool3);

        personArrayList.add(person1);
        personArrayList.add(person2);
        personArrayList.add(person3);
        personArrayList.add(person4);
        personArrayList.add(person5);
        personArrayList.add(person6);
        personArrayList.add(person7);
        personArrayList.add(person8);
        personArrayList.add(person9);
        personArrayList.add(person10);
        personArrayList.add(person11);

        Relic relic1 = new Relic("os", "matiere organique", exploitationTools, excavationTools);
        relics.add(relic1);

        GameControleur g = new GameControleur(new GameModel(relics, personArrayList, excavationTools, exploitationTools));

        MainWindow window = new MainWindow(g);
        g.getG().addObserver(window);
        window.setMinimumSize(new Dimension(850, 650));
    }
}
