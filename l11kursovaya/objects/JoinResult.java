package l11kursovaya.objects;

import java.sql.Date;

public class JoinResult {


    private int orderId;
    private int clientIdFromOrder;
    private int clientIdFromClient;
    private java.sql.Date orderDate;
    private int orderedBook_id;
    private int quantity;
    private String clientName;
    private String bookName;

    public JoinResult(int orderId, int clientIdFromOrder, int clientIdFromClient, Date orderDate, int orderedBook_id, int quantity, String clientName, String bookName) {
        this.orderId = orderId;
        this.clientIdFromOrder = clientIdFromOrder;
        this.clientIdFromClient = clientIdFromClient;
        this.orderDate = orderDate;
        this.orderedBook_id = orderedBook_id;
        this.quantity = quantity;
        this.clientName = clientName;
        this.bookName = bookName;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public void setClientIdFromOrder(int clientIdFromOrder) {
        this.clientIdFromOrder = clientIdFromOrder;
    }

    public void setClientIdFromClient(int clientIdFromClient) {
        this.clientIdFromClient = clientIdFromClient;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public void setOrderedBook_id(int orderedBook_id) {
        this.orderedBook_id = orderedBook_id;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getOrderId() {
        return orderId;
    }

    public int getClientIdFromOrder() {
        return clientIdFromOrder;
    }

    public int getClientIdFromClient() {
        return clientIdFromClient;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public int getOrderedBook_id() {
        return orderedBook_id;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getClientName() {
        return clientName;
    }

    public String getBookName() {
        return bookName;
    }

    @Override
    public String toString() {
        return "JoinResult{" +
                "orderId=" + orderId +
                ", clientIdFromOrder=" + clientIdFromOrder +
                ", clientIdFromClient=" + clientIdFromClient +
                ", orderDate=" + orderDate +
                ", orderedBook_id=" + orderedBook_id +
                ", quantity=" + quantity +
                ", clientName='" + clientName + '\'' +
                ", bookName='" + bookName + '\'' +
                '}';
    }
}
