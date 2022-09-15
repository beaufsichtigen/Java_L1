package L3;
import L3.Planet;

public class GlavniyClass {
    public static void main(String[] args) {
        Star Sun = new Star();
        Sun.setName("Sun");
        Sun.setWeight(332940);
        Sun.setVolume(1301019);
        Sun.setWell_known(true);

        Star SiriusA = new Star();
        SiriusA.setName("SiriusA");
        SiriusA.setWeight(660000);
        SiriusA.setVolume(2301019);
        SiriusA.setWell_known(false);

        Planet Earth = new Planet();
        Earth.setName("Earth");
        Earth.setWeight(332940);
        Earth.setVolume(1301019);
        Earth.setWell_known(true);

        Planet Neptun = new Planet();
        Neptun.setName("Neptun");
        Neptun.setWeight(-5);
        Neptun.setVolume(-10);



        System.out.println(String.format("%s: %s земных масс, %s земных объемов, тип %s, Хорошо известно = %s", Sun.getName(), Sun.getWeight(), Sun.getVolume(), Sun.typeOfObject, Sun.getWell_known()));
        System.out.println(String.format("%s: %s земных масс, %s земных объемов, %s, Хорошо известно = %s", SiriusA.getName(), SiriusA.getWeight(), SiriusA.getVolume(), SiriusA.typeOfObject, SiriusA.getWell_known()));
        System.out.println(String.format("%s: %s земных масс, %s земных объемов, %s, Хорошо известно = %s", Earth.getName(), Earth.getWeight(), Earth.getVolume(), Earth.typeOfObject, Earth.getWell_known()));
        System.out.println(String.format("%s: %s земных масс, %s земных объемов, %s, Хорошо известно = %s", Neptun.getName(), Neptun.getWeight(), Neptun.getVolume(), Neptun.typeOfObject, Neptun.getWell_known()));

    }
}