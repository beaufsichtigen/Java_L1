package l5_nested_classes.nested_static;

public class Nested_static_class {
    private int id;
    private String name;
    private int age;

    public Nested_static_class(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public static class NameComparator {
        public boolean compare(Nested_static_class chel1, Nested_static_class chel2) {
            return chel1.name.equals(chel2.name);
        }
    }

    public static class AgeComparator {
        public boolean compare(Nested_static_class chel1, Nested_static_class chel2) {
            return chel1.age == (chel2.age);
        }
    }
}
