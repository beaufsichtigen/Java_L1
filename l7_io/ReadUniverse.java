package l7_io;

import l3_and_l4_abstract.SpaceObject;

import java.io.*;

public class ReadUniverse {
    public ReadUniverse(String path) throws IOException {

        ObjectInputStream objectOfUniverse = null;


        try (FileInputStream readUniverse = new FileInputStream(path); ObjectInputStream in = new ObjectInputStream(readUniverse)) {

            //readUniverse = new FileInputStream(path);
            //objectOfUniverse = new ObjectInputStream(readUniverse);

            SpaceObject[] readedObject = (SpaceObject[]) in.readObject();
            for (SpaceObject spaceObject : readedObject) {
                System.out.println(spaceObject);
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

