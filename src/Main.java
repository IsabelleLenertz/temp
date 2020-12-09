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

        ExploitationTool exploitationTool1 = new ExploitationTool("Datation carbone", "Dater les objets a l'aide de l'isotope radioactif carbonne 14", requirement1);
        ExploitationTool exploitationTool2 = new ExploitationTool("Regarder en détails", "Lance in d100 de percéption pour voir si tu trouve quelque chose", requirement1);

        ExcavationTool excavationTool1 = new ExcavationTool("Pioche", "T'as joué a minecraft quand même", requirement1);
        ExcavationTool excavationTool2 = new ExcavationTool("TNT", "ça va plus vite que la pioche mais c'est plus destructeur", requirement1);
        ExcavationTool excavationTool3 = new ExcavationTool("Scan sismique", "Tu deviens Toff dans le dernier maitre de l'air et tu scan le sol avec tes pieds", requirement1);

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


        excavationTools.add(excavationTool1);
        excavationTools.add(excavationTool2);
        excavationTools.add(excavationTool3);

        exploitationTools.add(exploitationTool1);
        exploitationTools.add(exploitationTool2);

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


        ArrayList<ExcavationTool> relicExcavationToolList = new ArrayList<>();
        relicExcavationToolList.add(excavationTool2);

        ArrayList<ExploitationTool> relicExploitationToolList = new ArrayList<>();
        relicExploitationToolList.add(exploitationTool1);
        relicExploitationToolList.add(exploitationTool2);

        ArrayList<String> relicInfos = new ArrayList<>();
        relicInfos.add("C'est un vieux nonos");
        relicInfos.add("Ce nonos est gros, ton chien l'adorerais");

        ArrayList<Integer> relicInfoValues = new ArrayList<>();
        relicInfoValues.add(15);
        relicInfoValues.add(12);

        Relic relic1 = new Relic("TRE GROS OS", "Ossements chelou", "./quel/beau/chemin", 10, relicInfos, relicInfoValues, relicExploitationToolList, relicExcavationToolList);
        relics.add(relic1);

        GameControleur g = new GameControleur(new GameModel(relics, personArrayList, excavationTools, exploitationTools));

        MainWindow window = new MainWindow(g);
        g.getG().addObserver(window);
        window.setMinimumSize(new Dimension(850, 650));
    }
}
