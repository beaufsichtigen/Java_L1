package L3;

public class SpaceObject {
    final public static int speed_of_light = 299792458; //м*с^-1
    final public static float gravity = 6.67430F; //(15)⋅10−11 м3·с−2·кг−1

    int Volume;
    int Weight;
    String typeOfObject;
    boolean well_known = false;
    String name;

    SpaceObject(String name, int Weight, int Volume, String typeOfObject, boolean well_known) {
    System.out.println("Space object(w, v)");
        this.name = null;
        this.Weight = 0;
        this.Volume = 0;
        this.typeOfObject = null;
        this.well_known = false;

}
}
