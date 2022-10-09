package l7_io;

import l3_and_l4_abstract.SpaceObject;

import java.io.*;

public class ReadUniverse {
    ReadUniverse(String path) throws IOException {
        FileInputStream readUniverse = null;
        ObjectInputStream objectOfUniverse = null;

        try {

            readUniverse = new FileInputStream(path);
            objectOfUniverse = new ObjectInputStream(readUniverse);

            SpaceObject readedObject = (SpaceObject) objectOfUniverse.readObject();
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
