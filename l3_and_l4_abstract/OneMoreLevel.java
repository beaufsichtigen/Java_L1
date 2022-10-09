package l3_and_l4_abstract;

import java.io.Serializable;

public class OneMoreLevel extends Planet {
    public OneMoreLevel() {
        super();
        this.typeOfObject = "Satellite";
        System.out.println("Satellite (w, v, t , w)");
    }
}