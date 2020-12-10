import Control.GameControleur;
import Model.*;
import View.MainWindow;

import java.awt.*;
import java.util.ArrayList;

import static Model.JobEnum.*;

public class MainFinal {
    public static void main(String[] args) throws Exception {

        // all list need
        ArrayList<Relic> relics = new ArrayList<>();
        ArrayList<Person> personArrayList = new ArrayList<>();
        ArrayList<ExcavationTool> excavationTools = new ArrayList<>();
        ArrayList<ExploitationTool> exploitationTools = new ArrayList<>();


        // Excavation tool creation
        ArrayList<JobEnum> requirementForThePick = new ArrayList<>();
        requirementForThePick.add(personnel);
        ExcavationTool pick = new ExcavationTool("Pioche", "La pioche est un outil composé de deux pièces : " +
                "une pièce de travail en acier fixée par l'intermédiaire d'un œil à un manche en bois dur. " +
                "La pièce de métal forme un angle d'environ 90° avec le manche.", requirementForThePick);

        ArrayList<JobEnum> requirementForTheShovel = new ArrayList<>();
        requirementForTheShovel.add(personnel);
        ExcavationTool shovel = new ExcavationTool("Pelle", "Sorte de grande cuillière qui sert a creuser le sol",
                requirementForTheShovel);

        ArrayList<JobEnum> requirementForSieve = new ArrayList<>();
        requirementForSieve.add(personnel);
        ExcavationTool sieve = new ExcavationTool("Tamis", "Instrument qui sert à séparer, " +
                "à trier les éléments d'un mélange.", requirementForSieve);

        ArrayList<JobEnum> requirementForBrush = new ArrayList<>();
        requirementForBrush.add(personnel);
        ExcavationTool brush = new ExcavationTool("Pinceau", "Utilisés pour chasser la poussière qui peut, " +
                "en partie, cacher les vestiges déjà visible ou en cours de fouille", requirementForBrush);

        ArrayList<JobEnum> requirementForTheExcavator = new ArrayList<>();
        requirementForTheExcavator.add(conducteur_engin_de_chantier);
        ExcavationTool excavator = new ExcavationTool("Pelleteuse", "Gros engin qui fait plein de gros trous",
                requirementForTheExcavator);

        ArrayList<JobEnum> requirementForTheTrowel = new ArrayList<>();
        requirementForTheTrowel.add(personnel);
        ExcavationTool trowel = new ExcavationTool("Truelle", "Outil de fouille par excellence, " +
                "la truelle ouvre une exploration progressive de la terre, " +
                "et moins destructrice des vestiges potentiellement découverts",
                requirementForTheTrowel);

        // Person creation
        ArrayList<JobEnum> bobJobs = new ArrayList<>();
        bobJobs.add(directeur_de_chantier);
        bobJobs.add(personnel);
        bobJobs.add(archéologue);
        Person bob = new Person("Bob", "C'est qui le patron ?", bobJobs, "./src/img/person.jpg");

        ArrayList<JobEnum> aliceJobs = new ArrayList<>();
        aliceJobs.add(personnel);
        aliceJobs.add(scientifique_de_laboratoire);
        aliceJobs.add(céramologue);
        Person alice = new Person("Alice", "La science c'est cool !", aliceJobs, "./src/img/person.jpg");

        ArrayList<JobEnum> jamesJobs = new ArrayList<>();
        jamesJobs.add(personnel);
        jamesJobs.add(conducteur_engin_de_chantier);
        Person james = new Person("James", "C'est pas la taille qui compte, mais les gros engins sont les " +
                "meilleurs", jamesJobs, "./src/img/person.jpg");

        ArrayList<JobEnum> tobyJobs = new ArrayList<>();
        tobyJobs.add(personnel);
        tobyJobs.add(géoarchéologue);
        Person toby = new Person("Toby", "Mais au fond est ce si important ce terrain ?",
                tobyJobs, "./src/img/person.jpg");

        ArrayList<JobEnum> gastonJobs = new ArrayList<>();
        gastonJobs.add(personnel);
        gastonJobs.add(médiéviste);
        Person gaston = new Person("Gaston", "Un combat d'épée et bien plus passionant qu'un math de foot",
                gastonJobs, "./src/img/person.jpg");

        ArrayList<JobEnum> franckJobs = new ArrayList<>();
        franckJobs.add(personnel);
        franckJobs.add(archéobotaniste);
        Person franck = new Person("franck", "les plantes apportent tellement de douceur dans ce monde",
                franckJobs, "./src/img/person.jpg");

        ArrayList<JobEnum> julieJob = new ArrayList<>();
        julieJob.add(personnel);
        julieJob.add(étudiante_en_archéologie);
        Person julie = new Person("Julie", "Une etudiante motivée venue donnée un coup de main pour" +
                "trouver pleins d'objets",
                julieJob, "./src/img/person.jpg");


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
        ExploitationTool stratigraphy = new ExploitationTool("Stratigraphie", "méthode de la géoarchéologie " +
                "qui tâche d’analyser les strates et couches dans le sol pour déterminer leur chronologie et leur " +
                "agencement dans le temps",
                requirementForStratigraphy);

        ArrayList<JobEnum> requirementForLabsAnalyze = new ArrayList<>();
        requirementForLabsAnalyze.add(scientifique_de_laboratoire);
        ExploitationTool labsAnalyze = new ExploitationTool("Analyse en laboratoire",
                "Les echantillions sont envoyés dans un laboratoire pour une analyse", requirementForLabsAnalyze);

        ArrayList<JobEnum> requirementForParasitology = new ArrayList<>();
        requirementForParasitology.add(scientifique_de_laboratoire);
        ExploitationTool parasitology = new ExploitationTool("Etude des parasites present sur les découvertes",
                "On réhydrate les parasites trouver sur les objets, puis lorsque l'on a assez pour former une pate," +
                        "on le met dans le mortier, on ecrase cette pate et on l'analyse en laboratoire",
                requirementForParasitology);

        // Relics creation
        try{
            ArrayList<ExcavationTool> terrainExcavationListRelic = new ArrayList<>();
            ArrayList<ExploitationTool> terrainExploitationRelic = new ArrayList<>();
            terrainExploitationRelic.add(stratigraphy);
            ArrayList<String> terrainInfo = new ArrayList<>();
            terrainInfo.add("Avec ces renseignements on peut maintenant daté les couches");
            ArrayList<Integer> terrainValues = new ArrayList<>();
            terrainValues.add(15);
            Relic terrain = new Relic("Terrain", "", "./src/img/person.jpg",
                    0, terrainInfo, terrainValues, terrainExploitationRelic, terrainExcavationListRelic);

            ArrayList<ExcavationTool> seedExcavationListRelic = new ArrayList<>();
            ArrayList<ExploitationTool> seedExploitationRelic = new ArrayList<>();
            seedExcavationListRelic.add(sieve);
            seedExploitationRelic.add(labsAnalyze);
            ArrayList<String> seedInfo = new ArrayList<>();
            seedInfo.add("");
            ArrayList<Integer> seedValues = new ArrayList<>();
            seedValues.add(15);
            Relic seed = new Relic("Graines", "Des petits bouts qui pourrais bien etre des graine",
                    "./src/img/person.jpg", 15, seedInfo, seedValues, seedExploitationRelic, seedExcavationListRelic);

            ArrayList<ExcavationTool> osExcavationListRelic = new ArrayList<>();
            ArrayList<ExploitationTool> osExploitationRelic = new ArrayList<>();
            osExcavationListRelic.add(brush);
            osExploitationRelic.add(labsAnalyze);
            ArrayList<String> osInfo = new ArrayList<>();
            osInfo.add("Avec ces renseignements on peut maintenant daté les couches");
            ArrayList<Integer> osValues = new ArrayList<>();
            osValues.add(15);
            Relic os = new Relic("Grand ossement", "Un grand os qui pourrait provenir d'un animal",
                    "./src/img/person.jpg", 10, osInfo, osValues, osExploitationRelic, osExcavationListRelic);

            ArrayList<ExcavationTool> pieceOfMudExcavationListRelic = new ArrayList<>();
            ArrayList<ExploitationTool> pieceOfMudExploitationRelic = new ArrayList<>();
            pieceOfMudExcavationListRelic.add(brush);
            pieceOfMudExploitationRelic.add(carbone14);
            ArrayList<String> pieceOfMudInfo = new ArrayList<>();
            pieceOfMudInfo.add("Avec ces renseignements on peut maintenant daté les couches");
            ArrayList<Integer> pieceOfMudValues = new ArrayList<>();
            pieceOfMudValues.add(15);
            Relic pieceOfMud = new Relic("Morceau de vase cassé", "Morceau d'un vase ancien en ceramique",
                    "./src/img/person.jpg", 10,
                    pieceOfMudInfo, pieceOfMudValues, pieceOfMudExploitationRelic, pieceOfMudExcavationListRelic);

            relics.add(terrain);
            relics.add(seed);
            relics.add(os);
            relics.add(pieceOfMud);

        }catch (Exception e){
            System.out.println(e);
        }


        // adding all objects in the game
        excavationTools.add(pick);
        excavationTools.add(shovel);
        excavationTools.add(sieve);
        excavationTools.add(brush);
        excavationTools.add(excavator);
        excavationTools.add(trowel);

        exploitationTools.add(carbone14);
        exploitationTools.add(datingByFluid);
        exploitationTools.add(stratigraphy);
        exploitationTools.add(labsAnalyze);
        exploitationTools.add(parasitology);

        personArrayList.add(alice);
        personArrayList.add(james);
        personArrayList.add(bob);
        personArrayList.add(toby);
        personArrayList.add(gaston);
        personArrayList.add(franck);
        personArrayList.add(julie);

        // Game creation
        GameModel gameModel = new GameModel(relics, personArrayList, excavationTools, exploitationTools);
        GameControleur g = new GameControleur(gameModel);

        MainWindow window = new MainWindow(g);
        gameModel.addObserver(window);
        window.setMinimumSize(new Dimension(850, 650));
    }
}