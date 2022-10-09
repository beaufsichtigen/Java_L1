package l3_and_l4_abstract;

import java.io.Serializable;

public class Planet extends SpaceObject  {

    public Planet() {
        super();
        this.typeOfObject = "Planet";
        System.out.println("Planet(w, v, t , w)");
    }


}
