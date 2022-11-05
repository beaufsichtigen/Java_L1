package l11kursovaya.objects;

public class Order {
    private int id;
    private int clientId;
    private java.sql.Date date;
    private int orderedBook;
    private int quantity;

    public Order (int id, int clientId, java.sql.Date date, int orderedBook, int quantity) {
        this.id = id;
        this.clientId = clientId;
        this.date = date;
        this.orderedBook = orderedBook;
        this.quantity = quantity;
    }

    public void setOrderId(int id) {
        this.id = id;
    }

    public void setOrderClientId(int clientId) {
        this.clientId = clientId;
    }

    public void setOrderDate(java.sql.Date date) {
        this.date = date;
    }

    public void setOrderedBook(int orderedBook) {
        this.orderedBook = orderedBook;
    }

    public void setOrderQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getOrderId() {
        return id;
    }

    public int getOrderClientId() {
        return clientId;
    }

    public java.sql.Date getOrderDate() {
        return date;
    }

    public int getOrderOrderedBook() {
        return orderedBook;
    }

    public int getOrderQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", clientId=" + clientId +
                ", date=" + date +
                ", orderedBook=" + orderedBook +
                ", quantity=" + quantity +
                '}';
    }
}


