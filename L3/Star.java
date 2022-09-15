package L3;

public class Star extends SpaceObject {

    public Star(String name, int Weight, int Volume, String typeOfObject, boolean well_known) {
        super(name, Weight, Volume, typeOfObject, well_known);
        this.typeOfObject = "Star";
        System.out.println("Star (w, v, t , w)");
    }}
