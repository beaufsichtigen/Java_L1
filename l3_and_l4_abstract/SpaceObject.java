package l3_and_l4_abstract;

import java.io.Serializable;

public abstract class SpaceObject implements Serializable  {
    final public static int speed_of_light = 299792458; //м*с^-1
    final public static float gravity = 6.67430F; //(15)⋅10−11 м3·с−2·кг−1
    public static String not_well_known = "Загадочное место";
    public static String yes_well_known = "Хорошо известен";


    private int Volume = 0;
    private int Weight;
    public String typeOfObject;
    private boolean well_known = false;
    private String name = "AnyObject";
    private String new_well_known;


    public int getVolume() {
        return Volume;
    }

    public int getWeight() {
        return Weight;
    }

    public String getWell_known() {
        return new_well_known;
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

    public String setWell_known(boolean well_known) {
        if (well_known == true) {
            return new_well_known = yes_well_known;
        } else if (well_known == false) {
            return new_well_known = not_well_known;
        } else {
            System.out.println("incorrect well_known");
            return null;
        }
    }


    public void setName(String name) {
        this.name = name;
    }

    public SpaceObject() {
        System.out.println("Space object (w, v)");
        // this.name = name;
        // this.Weight = Weight;
        // this.Volume = Volume;
        // this.typeOfObject = typeOfObject;
        // this.well_known = well_known;
    }
    @Override
    public String toString(){
        return "Космический объект {" +
                "Имя =" + name +
                " Объем = " + Volume + "земных объемов" +
                " , вес " + Weight + "земных масс" +
                " , тип объекта: " + typeOfObject +
                " , хорошо известен: " + getWell_known() + "}"; }


    }

