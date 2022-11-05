package l11kursovaya.methods;

import l11kursovaya.Dao.DaoGetObjects;
import l11kursovaya.objects.Order;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class GetRecordsWithBetweenIn implements DaoGetObjects<Order> {


    @Override
    public List<Order> getAllObjects() {
        List<Order> orders = new ArrayList<>();

        try (Statement statement = Connection.getConnection().createStatement()) {

            ResultSet resultSetBetweenIn = statement.executeQuery(
                    "SELECT * FROM orders WHERE client_id IN (1,2) and order_date BETWEEN '2020-04-15' and '2020-05-20';");

            while (resultSetBetweenIn.next()) {
                orders.add(new Order(
                        resultSetBetweenIn.getInt(1),
                        resultSetBetweenIn.getInt(2),
                        resultSetBetweenIn.getDate(3),
                        resultSetBetweenIn.getInt(4),
                        resultSetBetweenIn.getInt(5)));
            }
            resultSetBetweenIn.close();

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
