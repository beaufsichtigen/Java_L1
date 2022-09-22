package l5_nested_classes.inner;

public class Custom_Friend extends Inner_Friend {
    public Custom_Friend(int id, String name) {
        super(id, name);
    }

    public class Custom_birthday extends Inner_Friend.Birthday {
        public Custom_birthday(int dateOfBirth, int monthOfBirth, int yearOfBirth) {
            super(dateOfBirth, monthOfBirth, yearOfBirth);
        }
    }
}
