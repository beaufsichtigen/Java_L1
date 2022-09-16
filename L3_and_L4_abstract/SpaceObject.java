package L3_and_L4_abstract;

public abstract class SpaceObject {
    final public static int speed_of_light = 299792458; //м*с^-1
    final public static float gravity = 6.67430F; //(15)⋅10−11 м3·с−2·кг−1

    private int Volume = 0;
    private int Weight;
    public String typeOfObject;
    private boolean well_known = false;
    private String name = "AnyObject";


    public int getVolume() {
        return Volume;
    }

    public int getWeight() {
        return Weight;
    }

    public boolean getWell_known() {
        return well_known;
    }

    public String getName() {
        return name;
    }

    public void setVolume(int Volume) {
        if (Volume > 0) {
            this.Volume = Volume;
        } else {
            System.out.println("incorrect Volume");
        }

    }

    public void setWeight(int Weight) {
        if (Weight > 0) {
            this.Weight = Weight;
        } else {
            System.out.println("incorrect Weight");
        }
    }

        public void setWell_known(boolean well_known) {
            this.well_known = well_known;
        }

    public void setName(String name) {
        this.name = name;
    }

    protected SpaceObject() {
    System.out.println("Space object(w, v)");
        //this.name = name;
       // this.Weight = Weight;
       // this.Volume = Volume;
       // this.typeOfObject = typeOfObject;
       // this.well_known = well_known;

}
}