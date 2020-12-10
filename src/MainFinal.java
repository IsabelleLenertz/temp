import Control.GameControleur;
import Model.*;
import View.MainWindow;

import java.awt.*;
import java.util.ArrayList;

import static Model.JobEnum.*;

public class MainFinal {
    public static void main(String[] args) {

        // all list need
        ArrayList<Relic> relics = new ArrayList<>();
        ArrayList<Person> personArrayList = new ArrayList<>();
        ArrayList<ExcavationTool> excavationTools = new ArrayList<>();
        ArrayList<ExploitationTool> exploitationTools = new ArrayList<>();


        // Excavation tool creation
        ArrayList<JobEnum> requirementForThePick = new ArrayList<>();
        ExcavationTool pick = new ExcavationTool("Pioche", "La pioche est un outil composé de deux pièces : " +
                "une pièce de travail en acier fixée par l'intermédiaire d'un œil à un manche en bois dur. " +
                "La pièce de métal forme un angle d'environ 90° avec le manche.", requirementForThePick);

        ArrayList<JobEnum> requirementForTheShovel = new ArrayList<>();
        ExcavationTool shovel = new ExcavationTool("Pelle", "Sorte de grande cuillière qui sert a creuser le sol",
                requirementForTheShovel);

        ArrayList<JobEnum> requirementForSieve = new ArrayList<>();
        ExcavationTool sieve = new ExcavationTool("Tamis", "Instrument qui sert à séparer, " +
                "à trier les éléments d'un mélange.", requirementForSieve);

        ArrayList<JobEnum> requirementForBrush = new ArrayList<>();
        ExcavationTool brush = new ExcavationTool("Pinceau", "Utilisés pour chasser la poussière qui peut, " +
                "en partie, cacher les vestiges déjà visible ou en cours de fouille", requirementForBrush);


        // Person creation
        ArrayList<JobEnum> bobJobs = new ArrayList<>();
        bobJobs.add(directeur_de_chantier);
        bobJobs.add(archéologue);
        Person bob = new Person("Bob", "C'est qui le patron ?", bobJobs, "./src/img/person.jpg");

        ArrayList<JobEnum> aliceJobs = new ArrayList<>();
        aliceJobs.add(scientifique_de_laboratoire);
        aliceJobs.add(céramologue);
        Person alice = new Person("Alice", "La science c'est cool !", aliceJobs, "./src/img/person.jpg");

        ArrayList<JobEnum> jamesJobs = new ArrayList<>();
        jamesJobs.add(bénévoles);
        jamesJobs.add(conducteur_engin_de_chantier);
        Person james = new Person("James", "C'est pas la taille qui compte, mais les gros engins sont les meilleurs", jamesJobs, "./src/img/person.jpg");

        ArrayList<JobEnum> tobyJobs = new ArrayList<>();
        tobyJobs.add(bénévoles);
        tobyJobs.add(géoarchéologue);
        Person toby = new Person("Toby", "Mais au fond est ce si important ce terrain ?",
                tobyJobs, "./src/img/person.jpg");

        ArrayList<JobEnum> gastonJobs = new ArrayList<>();
        gastonJobs.add(bénévoles);
        gastonJobs.add(médiéviste);
        Person gaston = new Person("Gaston", "Un combat d'épée et bien plus passionant qu'un math de foot",
                gastonJobs, "./src/img/person.jpg");


        // Exploitation tools / method creation
        ArrayList<JobEnum> requirementForCarbon14 = new ArrayList<>();
        requirementForCarbon14.add(scientifique_de_laboratoire);
        ExploitationTool carbone14 = new ExploitationTool("Datation au carbone 14",
                "Dater les objets a l'aide de " + "l'isotope radioactif carbonne 14", requirementForCarbon14);

        ArrayList<JobEnum> requirementForDatingByFluid = new ArrayList<>();
        requirementForDatingByFluid.add(scientifique_de_laboratoire);
        ExploitationTool datingByFluid = new ExploitationTool("Datation par les fluide",
                "Dater les ceramiques par la quantité d'eau qu'ils continennent", requirementForDatingByFluid);

        ArrayList<JobEnum> requirementForStratigraphy = new ArrayList<>();
        requirementForStratigraphy.add(géoarchéologue);
        ExploitationTool stratigraphy = new ExploitationTool("stratigraphie", "méthode de la géoarchéologie qui tâche " +
                "d’analyser les strates et couches dans le sol pour déterminer leur chronologie et leur agencement dans le temps",
                requirementForStratigraphy);

        // Relics creation
        ArrayList<ExcavationTool> terrainExcavationListRelic = new ArrayList<>();
        ArrayList<ExploitationTool> terrainExploitationRelic = new ArrayList<>();
        terrainExploitationRelic.add(stratigraphy);
        ArrayList<String> terrainInfo = new ArrayList<>();
        terrainInfo.add("Avec ces renseignements on peut maintenant daté les couches");
        ArrayList<Integer> terrainValues = new ArrayList<>();
        terrainValues.add(15);

        Relic terrain = new Relic("Terrain", "", "./src/img/person.jpg",
                0, terrainInfo, terrainValues, terrainExploitationRelic, terrainExcavationListRelic);


        // adding all objects in the game
        excavationTools.add(pick);
        excavationTools.add(shovel);
        excavationTools.add(sieve);
        excavationTools.add(brush);

        exploitationTools.add(carbone14);
        exploitationTools.add(datingByFluid);
        exploitationTools.add(stratigraphy);

        personArrayList.add(alice);
        personArrayList.add(james);
        personArrayList.add(bob);
        personArrayList.add(toby);
        personArrayList.add(gaston);


        relics.add(terrain);

        // Game creation
        GameModel gameModel = new GameModel(relics, personArrayList, excavationTools, exploitationTools);
        GameControleur g = new GameControleur(gameModel);

        MainWindow window = new MainWindow(g);
        gameModel.addObserver(window);
        window.setMinimumSize(new Dimension(850, 650));
    }
}
