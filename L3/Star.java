package L3;

public class Star extends SpaceObject {
    //public String typeOfObject = "Star";

    // int Volume;
    // int Weight;
    // String typeOfObject;
    // boolean well_known = false;

    Star(String name, int Weight, int Volume, String typeOfObject, boolean well_known) {
        super(name, Weight, Volume, typeOfObject, well_known);
        //typeOfObject = "Star";
        System.out.println("Star (w, v, t , w)");
    }}
