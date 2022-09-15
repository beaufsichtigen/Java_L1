package L3;

public class Planet extends SpaceObject {

    public Planet(String name, int Weight, int Volume, String typeOfObject, boolean well_known) {
        super(name, Weight, Volume, typeOfObject, well_known);
        this.typeOfObject = "Planet";
        System.out.println("Planet(w, v, t , w)");
        }}
