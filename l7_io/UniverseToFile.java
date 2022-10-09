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

    public UniverseToFile()  {
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
                new FileOutputStream("C:\\data\\projects\\Java_L1\\files\\planets.txt", true))) {
//            Star Sun = new Star();
//            Sun.setName("Sun");
//            Sun.setWeight(332940);
//            Sun.setVolume(1301019);
//            Sun.setWell_known(true);
            //out.writeObject(Sun);
            out.writeObject(Neptun);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

//
//    }
//    public String toString () {
//        return "Known Universe:" +
//                Sun.getName() + ":" + Sun.getWeight() + " земных масс," + Sun.getVolume() + " земных объемов," + "тип " + Sun.typeOfObject + " " + Sun.getWell_known() + "\n" +
//                SiriusA.getName() + ":" + SiriusA.getWeight() + " земных масс," + SiriusA.getVolume() + " земных объемов," + "тип " + SiriusA.typeOfObject + " " + SiriusA.getWell_known() + "\n" +
//                Earth.getName() + ":" + Earth.getWeight() + " земных масс," + Earth.getVolume() + " земных объемов," + "тип " + Earth.typeOfObject + " " + Earth.getWell_known() + "\n" +
//                Neptun.getName() + ":" + Neptun.getWeight() + " земных масс," + Neptun.getVolume() + " земных объемов," + "тип " + Neptun.typeOfObject + " " + Neptun.getWell_known() + "\n" +
//                OneMoreLevel.getName() + ":" + OneMoreLevel.getWeight() + " земных масс," + OneMoreLevel.getVolume() + " земных объемов," + "тип " + " " + OneMoreLevel.typeOfObject + OneMoreLevel.getWell_known() + "\n";
//    }

//    public static void main(String[] args) {
//        UniverseToFile MyUniverse = new UniverseToFile();
//        System.out.println(MyUniverse.toString());
   }
}









//        String s = String.format(
//            "Known Universe:" +
//                    Sun.getName() + ":" + Sun.getWeight() + "земных масс," + Sun.getVolume() + "земных объемов," + "тип" + Sun.typeOfObject + Sun.getWell_known() + "\n" +
//                    SiriusA.getName() + ":" + SiriusA.getWeight() + "земных масс," + SiriusA.getVolume() + "земных объемов," + "тип" + SiriusA.typeOfObject + SiriusA.getWell_known() + "\n" +
//                    Earth.getName() + ":" + Earth.getWeight() + "земных масс," + Earth.getVolume() + "земных объемов," + "тип" + Earth.typeOfObject + Earth.getWell_known() + "\n" +
//                    Neptun.getName() + ":" + Neptun.getWeight() + "земных масс," + Neptun.getVolume() + "земных объемов," + "тип" + Neptun.typeOfObject + Neptun.getWell_known() + "\n" +
//                    OneMoreLevel.getName() + ":" + OneMoreLevel.getWeight() + "земных масс," + OneMoreLevel.getVolume() + "земных объемов," + "тип" + OneMoreLevel.typeOfObject + OneMoreLevel.getWell_known() + "\n");
//            return s;


   // public String toString() {
    //    return "Known Universe:" +
    //            Sun.getName() + ":" + Sun.getWeight() + "земных масс," + Sun.getVolume() + "земных объемов," + "тип" + Sun.typeOfObject + Sun.getWell_known() + "\n" +
    //            SiriusA.getName() + ":" + SiriusA.getWeight() + "земных масс," + SiriusA.getVolume() + "земных объемов," + "тип" + SiriusA.typeOfObject + SiriusA.getWell_known() + "\n" +
    //            Earth.getName() + ":" + Earth.getWeight() + "земных масс," + Earth.getVolume() + "земных объемов," + "тип" + Earth.typeOfObject + Earth.getWell_known() + "\n" +
    //            Neptun.getName() + ":" + Neptun.getWeight() + "земных масс," + Neptun.getVolume() + "земных объемов," + "тип" + Neptun.typeOfObject + Neptun.getWell_known() + "\n" +
    //            OneMoreLevel.getName() + ":" + OneMoreLevel.getWeight() + "земных масс," + OneMoreLevel.getVolume() + "земных объемов," + "тип" + OneMoreLevel.typeOfObject + OneMoreLevel.getWell_known() + "\n";
