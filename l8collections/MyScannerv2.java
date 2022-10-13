package l8collections;

import l6_exceptions.MyException;
import l7_io.ReadUniverse;
import l7_io.UniverseToFile;

import java.io.IOException;
import java.util.*;

public class MyScannerv2 {


    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public static void main(String[] args) throws IOException {



        Scanner scanner = new Scanner(System.in);
        Set<String> myHashSet = new HashSet<>();
        myHashSet.add("first");


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

                case 4:
                    System.out.println("Add object, input Integer key");

                    while (scanner.hasNextLine()) {
                        String name = scanner.next();
                        //myHashSet.add(name);
                        System.out.println(myHashSet.add(name)); //добавляем item из сканера и сразу проверяем добавился ли он
                        break;
                    }

                    break;


                case 5:
                    System.out.println("Remove object");
                    String name = scanner.next();
                    System.out.println(myHashSet.remove(name));
                    break;

                case 6:
                    System.out.println("Read all");
                    for (String item : myHashSet) {
                        System.out.println(item);
                    }
                    break;

                case 7:
                    System.out.println("Update object: input value that will be replaced");
                    String nameUpdate = scanner.next();
                    System.out.println(myHashSet.remove(nameUpdate));
                    System.out.println("Update object: input new value");
                    String newName = scanner.next();
                    System.out.println(myHashSet.add(newName));
                    break;

                case 3:
                    System.out.println("Quit");
                    scanner.close();
                    return;

                default:
                    throw new MyException("Invalid argument. \n" +
                            "Input '1' for print to file. \n" +
                            "Input '2' for read from file. \n" +
                            "Input '3' for Quit. Input '4' for AddObject. \n" +
                            "Input '5' for Remove object. \n" +
                            "Input '6' for Read all. \n" +
                            "Input '7' for Update object.");

            }
        }
    }
}
