package l7_io;

import l6_exceptions.MyException;

import java.io.IOException;
import java.util.Scanner;

public class MyScanner {
    public static void main(String[] args) throws IOException {
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            switch (scanner.nextInt()) {
                case 1:
                    System.out.println("Save new object to file");
                    UniverseToFile print = new UniverseToFile();

                    break;
                case 2:
                    System.out.println("Read all objects from file");
                    ReadUniverse read = new ReadUniverse("C:\\data\\projects\\Java_L1\\files\\planets.txt");
                    //read.ReadUniverse("C:\\data\\projects\\Java_L1\\files\\planets.txt");

                    break;

                case 3:
                    System.out.println("Quit");
                    scanner.close();
                    return;
                default:
                    throw new MyException("Invalid argument. Input '1' for print to file. Input '2' for read from file. Input '3' for Quit.");

            }


        }
    }
}
