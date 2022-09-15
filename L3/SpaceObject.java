package L3;

public class SpaceObject {
    final public static int speed_of_light = 299792458; //м*с^-1
    final public static float gravity = 6.67430F; //(15)⋅10−11 м3·с−2·кг−1

    int Volume = 0;
    int Weight;
    String typeOfObject;
    boolean well_known = false;
    String name = "AnyObject";

    protected SpaceObject(String name, int Weight, int Volume, String typeOfObject, boolean well_known) {
    System.out.println("Space object(w, v)");
        this.name = name;
        this.Weight = Weight;
        this.Volume = Volume;
        this.typeOfObject = typeOfObject;
        this.well_known = well_known;

}
}
