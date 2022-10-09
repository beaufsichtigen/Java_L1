package l7_io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadUniverse_donttouch {
    //public ReadUniverse() {

    void ReadUniverse(String path) throws IOException {
        FileReader readUniverse = null;
        BufferedReader bufferedUniverse = null;

        try {
            readUniverse = new FileReader(path);
            bufferedUniverse = new BufferedReader(readUniverse);
            System.out.println(bufferedUniverse.readLine());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // }
//    public static void main(String[] args) throws IOException {
//        ReadUniverse FilePlanets = new ReadUniverse();
//        FilePlanets.ReadUniverse("C:\\data\\projects\\Java_L1\\files\\planets.txt"); //проассоциировать объект с назначением
//    }

}

