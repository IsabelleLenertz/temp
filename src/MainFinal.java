import Control.GameControleur;
import Model.*;
import View.MainWindow;

import java.awt.*;
import java.util.ArrayList;

import static Model.JobEnum.directeur_de_chantier;
import static Model.JobEnum.scientifique_de_laboratoire;

public class MainFinal {
    public static void main(String[] args) {

        ArrayList<Relic> relics = new ArrayList<>();
        ArrayList<Person> personArrayList = new ArrayList<>();
        ArrayList<ExcavationTool> excavationTools = new ArrayList<>();
        ArrayList<ExploitationTool> exploitationTools = new ArrayList<>();

        ArrayList<JobEnum> requirementForThePick = new ArrayList<>();

        ExcavationTool pick = new ExcavationTool("Pioche", "La pioche est un outil composé de deux pièces : une pièce de travail en acier fixée par l'intermédiaire " +
                "d'un œil à un manche en bois dur. La pièce de métal forme un angle d'environ 90° avec le manche.", requirementForThePick);

        ArrayList<JobEnum> bobJobs = new ArrayList<>();
        bobJobs.add(directeur_de_chantier);
        Person bob = new Person("Bob", "C'est qui le patron ?", bobJobs);

        ArrayList<JobEnum> requirementForCarbon14 = new ArrayList<>();
        requirementForCarbon14.add(scientifique_de_laboratoire);

        ArrayList<JobEnum> aliceJobs = new ArrayList<>();
        aliceJobs.add(scientifique_de_laboratoire);
        Person alice = new Person("Alice", "La science c'est cool !", aliceJobs);

        ExploitationTool carbone14 = new ExploitationTool("Datation au carbone 14", "Dater les objets a l'aide de " +
                "l'isotope radioactif carbonne 14", requirementForCarbon14);

        excavationTools.add(pick);
        personArrayList.add(bob);

        exploitationTools.add(carbone14);
        personArrayList.add(alice);

        GameModel gameModel = new GameModel(relics, personArrayList, excavationTools, exploitationTools);
        GameControleur g = new GameControleur(gameModel);

        MainWindow window = new MainWindow(g);
        gameModel.addObserver(window);
        window.setMinimumSize(new Dimension(850, 650));
    }
}
