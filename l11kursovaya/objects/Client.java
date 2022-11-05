package l11kursovaya.objects;

public class Client {
    private int id;
    private String name;
    private long phone;

    public Client (int id, String name, long phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    public void setClientId(int id) {
        this.id = id;
    }

    public void setClientName(String name) {
        this.name = name;
    }

    public void setClientPhone(long phone) {
        this.phone = phone;
    }

    public int getClientId() {
        return id;
    }

    public String getClientName() {
        return name;
    }

    public long getClientPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone=" + phone +
                '}';
    }
}

