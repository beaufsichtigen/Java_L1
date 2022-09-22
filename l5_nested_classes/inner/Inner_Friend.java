package l5_nested_classes.inner;

public class Inner_Friend {
    private int id;
    private String name;

    @Override
    public String toString() {
        return "Inner_Friend{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Inner_Friend() {
    }


    public Inner_Friend(int id, String name) {
        this.id = id;
        this.name = name;


    }

    public class Birthday {
        private int dateOfBirth;
        private int monthOfBirth;
        private int yearOfBirth;

        public Birthday() {

        }

        @Override
        public String toString() {
            return "Birthday{" +
                    "dateOfBirth=" + dateOfBirth +
                    ", monthOfBirth=" + monthOfBirth +
                    ", yearOfBirth=" + yearOfBirth +
                    '}';
        }

        public Birthday(int dateOfBirth, int monthOfBirth, int yearOfBirth) {
            this.dateOfBirth = dateOfBirth;
            this.monthOfBirth = monthOfBirth;
            this.yearOfBirth = yearOfBirth;


        }
    }

    public class Address {
        private String country;
        private String city;
        private String street;
        private int building;
        private int apartment;

        @Override
        public String toString() {
            return "Address{" +
                    "country='" + country + '\'' +
                    ", city='" + city + '\'' +
                    ", street='" + street + '\'' +
                    ", building=" + building +
                    ", apartment=" + apartment +
                    '}';
        }

        public Address(String country, String city, String street, int building, int apartment) {
            this.country = country;
            this.city = city;
            this.street = street;
            this.building = building;
            this.apartment = apartment;


        }
    }

}
