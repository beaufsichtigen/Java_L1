package L3;

public class GlavniyClass {
    public static void main(String[] args) {
        Star Sun = new Star("Sun",332940, 1301019, null, true);
        Star SiriusA = new Star ("Sirius",660000, 2301019, null, false);
        Planet Earth = new Planet ("Earth",1, 1, "Zelenaya zelenaya trava", true);
        Planet Neptun = new Planet ("Neptun",17, 58, null, true);

        System.out.println(String.format("%s: %s земных масс, %s земных объемов, %s, %s", Sun.name, Sun.Weight, Sun.Volume, Sun.typeOfObject, Sun.well_known));
        System.out.println(String.format("%s: %s земных масс, %s земных объемов, %s, %s", Earth.name, Earth.Weight, Earth.Volume, Earth.typeOfObject, Earth.well_known));

    }
}