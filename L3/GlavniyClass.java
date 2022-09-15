package L3;

public class GlavniyClass {
    public static void main(String[] args) {
        Star Sun = new Star("Sun",332940, 1301019, null, true);
        Star SiriusA = new Star ("Sirius",660000, 2301019, null, false);
        Planet Earth = new Planet ("Earth",1, 1, "Zelenaya zelenaya trava", true);
        Planet Neptun = new Planet ("Neptun",57, 58, null, true); //Обработка некорректного

        System.out.println(String.format("%s: %s земных масс, %s земных объемов, тип %s, Хорошо известно = %s", Sun.getName(), Sun.getWeight(), Sun.getVolume(), Sun.typeOfObject, Sun.isWell_known()));
        System.out.println(String.format("%s: %s земных масс, %s земных объемов, %s, %s", SiriusA.getName(), SiriusA.getWeight(), SiriusA.getVolume(), SiriusA.typeOfObject, SiriusA.isWell_known()));
        System.out.println(String.format("%s: %s земных масс, %s земных объемов, %s, %s", Earth.getName(), Earth.getWeight(), Earth.getVolume(), Earth.typeOfObject, Earth.isWell_known()));
        System.out.println(String.format("%s: %s земных масс, %s земных объемов, %s, %s", Neptun.getName(), Neptun.getWeight(), Neptun.getVolume(), Neptun.typeOfObject, Neptun.isWell_known()));

    }
}