package l11kursovaya.objects;

public class Book {
    private int id;
    private String name;
    private String author;
    private byte year;


    public Book (int id, String name, String author, byte year) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public void setBookId(int id) {
        this.id = id;
    }

    public void setBookName(String name) {
        this.name = name;
    }

    public void setBookAuthor(String author) {
        this.author = author;
    }

    public void setBookYear(byte year) {
        this.year = year;
    }

    public int getBookId() {
        return id;
    }

    public String getBookName() {
        return name;
    }

    public String getBookAuthor() {
        return author;
    }

    public byte getBookYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                '}';
    }
}

