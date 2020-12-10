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
        ExcavationTool pick = new ExcavationTool("Pioche", "La pioche est un outil composé de deux pièces : une pièce de travail en acier fixée par l'intermédiaire " +
                "d'un œil à un manche en bois dur. La pièce de métal forme un angle d'environ 90° avec le manche.", requirementForThePick);

        ArrayList<JobEnum> requirementForTheShovel = new ArrayList<>();
        ExcavationTool shovel = new ExcavationTool("Pelle", "Sorte de grande cuillière qui sert a creuser le sol", requirementForTheShovel);

        ArrayList<JobEnum> requirementForSieve = new ArrayList<>();
        ExcavationTool sieve = new ExcavationTool("Tamis", "Instrument qui sert à séparer, " +
                "à trier les éléments d'un mélange.", requirementForSieve);


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
        Person toby = new Person("Toby", "C'est pas la taille qui compte, mais les gros engins sont les meilleurs",
                tobyJobs, "./src/img/person.jpg");

        // Exploitation tools / method creation
        ArrayList<JobEnum> requirementForCarbon14 = new ArrayList<>();
        requirementForCarbon14.add(scientifique_de_laboratoire);
        ExploitationTool carbone14 = new ExploitationTool("Datation au carbone 14",
                "Dater les objets a l'aide de " + "l'isotope radioactif carbonne 14", requirementForCarbon14);

        ArrayList<JobEnum> requirementForDatingByFluid = new ArrayList<>();
        requirementForDatingByFluid.add(scientifique_de_laboratoire);
        ExploitationTool datingByFluid = new ExploitationTool("Datation par les fluide",
                "Dater les ceramique par la quantité d'eau qu'il continennent", requirementForDatingByFluid);

        ArrayList<JobEnum> requirementForStratigraphy = new ArrayList<>();
        requirementForDatingByFluid.add(géoarchéologue);
        ExploitationTool stratigraphy = new ExploitationTool("stratigraphie", "méthode de la géoarchéologie qui tâche " +
                "d’analyser les strates et couches dans le sol pour déterminer leur chronologie et leur agencement dans le temps",
                requirementForStratigraphy);

        // Relics creation
        ArrayList<ExcavationTool> ceramicExcavationListRelic = new ArrayList<>();
        ArrayList<ExploitationTool> ceramicExploitationRelic = new ArrayList<>();
        ceramicExcavationListRelic.add(pick);
        ceramicExcavationListRelic.add(shovel);
        ceramicExploitationRelic.add(datingByFluid);
        ArrayList<String> ceramicInfo = new ArrayList<>();
        ceramicInfo.add("Une vieille ceramique");
        ArrayList<Integer> ceramicValues = new ArrayList<>();
        ceramicValues.add(15);

        Relic ceramic = new Relic("Ceramique", "Une céramique est un objet en argile cuite. La céramique est le matériau, ou bien la technique qui permet de le confectionner. Par extension, de nombreux matériaux contemporains non métalliques et " +
                "inorganiques entrent dans le champ des céramiques techniques", "./super/chemin", 10, ceramicInfo, ceramicValues,
                ceramicExploitationRelic, ceramicExcavationListRelic);

        ArrayList<ExcavationTool> osExcavationListRelic = new ArrayList<>();
        ArrayList<ExploitationTool> osExploitationRelic = new ArrayList<>();
        osExcavationListRelic.add(pick);
        osExcavationListRelic.add(shovel);
        osExcavationListRelic.add(sieve);
        ceramicExploitationRelic.add(carbone14);
        ArrayList<String> osInfo = new ArrayList<>();
        ceramicInfo.add("Une ancienne ceramique");
        ArrayList<Integer> osValues = new ArrayList<>();
        ceramicValues.add(15);

        Relic os = new Relic("Os", "Les os restes d'un être vivant, après sa mort.", "./super/chemin",
                10, osInfo, osValues,
                osExploitationRelic, osExcavationListRelic);

        ArrayList<ExcavationTool> terrainExcavationListRelic = new ArrayList<>();
        ArrayList<ExploitationTool> terrainExploitationRelic = new ArrayList<>();
        ceramicExploitationRelic.add(stratigraphy);
        ArrayList<String> terrainInfo = new ArrayList<>();
        ceramicInfo.add("Avec ces renseignements on peut maintenant daté les couches");
        ArrayList<Integer> terrainValues = new ArrayList<>();
        ceramicValues.add(15);

        Relic terrain = new Relic("Terrain", "", "./super/chemin",
                0, terrainInfo, terrainValues, terrainExploitationRelic, terrainExcavationListRelic);


        // adding all objects in the game
        excavationTools.add(pick);
        excavationTools.add(shovel);
        excavationTools.add(sieve);

        exploitationTools.add(carbone14);
        exploitationTools.add(datingByFluid);
        exploitationTools.add(stratigraphy);
        personArrayList.add(alice);
        personArrayList.add(james);
        personArrayList.add(bob);

        relics.add(ceramic);
        relics.add(os);
        relics.add(terrain);

        // Game creation
        GameModel gameModel = new GameModel(relics, personArrayList, excavationTools, exploitationTools);
        GameControleur g = new GameControleur(gameModel);

        MainWindow window = new MainWindow(g);
        gameModel.addObserver(window);
        window.setMinimumSize(new Dimension(850, 650));
    }
}
