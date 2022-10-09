package l7_io;

import l3_and_l4_abstract.SpaceObject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadUniverse_dontztouch_v2 {
    //public ReadUniverse() {
    public static void main(String[] args) {
        ReadUniverse_dontztouch_v2 FilePlanets = new ReadUniverse_dontztouch_v2();


        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:\\data\\projects\\Java_L1\\files\\planets.txt"))) {
            SpaceObject readedObject = (SpaceObject) in.readObject();
            System.out.println(readedObject);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}

