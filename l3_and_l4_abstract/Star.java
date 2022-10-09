package l3_and_l4_abstract;

import java.io.Serializable;

public class Star extends SpaceObject {

    public Star() {
        super();
        this.typeOfObject = "Star";
        System.out.println("Star (w, v, t , w)");
    }
}
