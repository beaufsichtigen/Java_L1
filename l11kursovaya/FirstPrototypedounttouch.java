package l11kursovaya;

import l11kursovaya.objects.Order;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class FirstPrototype implements DaoOrder<Order>{

    @Override
    public Order get(int id) {
        String sql = "SELECT * FROM orders WHERE order_id = ?";
        Order order = null;

        try (PreparedStatement statement = Connection.getConnection().prepareStatement(sql)){
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            System.out.println(resultSet);

            while (resultSet.next()) {
                order = new Order(resultSet.getInt(1), resultSet.getInt(2), resultSet.getDate(3), resultSet.getInt(4), resultSet.getInt(5));
                //
                System.out.println(resultSet.getInt(1));
                System.out.println(resultSet.getInt(2));
                System.out.println(resultSet.getString(3));
            }



                resultSet.close();
            } catch (SQLException e) {
                System.err.println("Exception during the Order statement execution");
            }
            Connection.close();

            return order;
        }

    @Override
    public List<Order> getAll() {
        List<Order> orders = new ArrayList<>();

        try (Statement statement = Connection.getConnection().createStatement()){

            ResultSet resultSet = statement.executeQuery("SELECT * FROM orders");

            while (resultSet.next()) {
                orders.add(new Order(
                        resultSet.getInt(1),
                        resultSet.getInt(2),
                        resultSet.getDate(3),
                        resultSet.getInt(4),
                        resultSet.getInt(5)));
            }
            resultSet.close();
        } catch (SQLException e) {
            System.err.println("Exception during the Order statement execution");
        }
        Connection.close();

        return orders;
    }

}










//SELECT * FROM orders WHERE client_id IN (1,2) and order_date BETWEEN '2020-04-15' and '2020-05-20';
//
//        SELECT * FROM clients WHERE client_name LIKE '%ya';
