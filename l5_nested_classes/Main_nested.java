package l5_nested_classes;

import l5_nested_classes.inner.Inner_Friend;
import l5_nested_classes.nested_static.Nested_static_class;

public class Main_nested {
    public static void main(String[] args) {

        //INNER CLASS

        System.out.println("INNER CLASS");

        Inner_Friend Vasya = new Inner_Friend(1, "Vasilii");
        Inner_Friend.Birthday birthday = Vasya.new Birthday(5, 5, 1990);
        Inner_Friend.Address address = Vasya.new Address("Portugal", "Lissboa", "25April", 24, 1);
        System.out.println(String.format("%s, %s, %s", Vasya, birthday, address));

     // Custom_Friend New_era_Friend = new Custom_Friend (2, "Кто-то");
      // Custom_Friend.Custom_birthday New_day = new Custom_Friend.Custom_birthday(5,3,3000);
      // System.out.println(String.format("%s, %s", New_era_Friend, New_day));

        // NESTED STATIC CLASS

        System.out.println("NESTED STATIC CLASS");

        Nested_static_class Chel = new Nested_static_class(1, "Kolya", 51);
        Nested_static_class Neighbour = new Nested_static_class(2, "Kolya", 42);
        Nested_static_class Sister = new Nested_static_class(2, "Lena", 51);
        Nested_static_class.NameComparator nameComparator = new Nested_static_class.NameComparator();
        Nested_static_class.AgeComparator ageComparator  = new Nested_static_class.AgeComparator();

        System.out.println(nameComparator.compare(Chel, Neighbour));
        System.out.println(nameComparator.compare(Chel, Sister));
        System.out.println(nameComparator.compare(Neighbour, Sister));

        System.out.println(ageComparator.compare(Chel, Neighbour));
        System.out.println(ageComparator.compare(Chel, Sister));
        System.out.println(ageComparator.compare(Neighbour, Sister));

        // ANONYMOUS CLASS











    }

    }
