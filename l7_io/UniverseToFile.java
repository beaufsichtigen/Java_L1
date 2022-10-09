package l7_io;

import l3_and_l4_abstract.OneMoreLevel;
import l3_and_l4_abstract.Planet;
import l3_and_l4_abstract.SpaceObject;
import l3_and_l4_abstract.Star;

import java.io.*;

public class UniverseToFile {

    private SpaceObject Sun;
    private SpaceObject SiriusA;
    private SpaceObject Earth;
    private SpaceObject Neptun;
    private SpaceObject OneMoreLevel;

    public UniverseToFile() {
        Sun = new Star();
        Sun.setName("Sun");
        Sun.setWeight(332940);
        Sun.setVolume(1301019);
        Sun.setWell_known(true);

        SiriusA = new Star();
        SiriusA.setName("SiriusA");
        SiriusA.setWeight(660000);
        SiriusA.setVolume(2301019);
        SiriusA.setWell_known(false);

        Earth = new Planet();
        Earth.setName("Earth");
        Earth.setWeight(332940);
        Earth.setVolume(1301019);
        Earth.setWell_known(true);

        Neptun = new Planet();
        Neptun.setName("Neptun");
        Neptun.setWeight(-5);
        Neptun.setVolume(-10);

        OneMoreLevel = new OneMoreLevel();
        OneMoreLevel.setName("Moon");
        OneMoreLevel.setWell_known(true);

        try (ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream("C:\\data\\projects\\Java_L1\\files\\planets.txt"))) {
//            Star Sun = new Star();
//            Sun.setName("Sun");
//            Sun.setWeight(332940);
//            Sun.setVolume(1301019);
//            Sun.setWell_known(true);
            //out.writeObject(Sun);
            out.writeObject(new SpaceObject[]{Sun, SiriusA, Earth});
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

//
//    }
//

//    public static void main(String[] args) {
//        UniverseToFile MyUniverse = new UniverseToFile();
//        System.out.println(MyUniverse.toString());
    }
}