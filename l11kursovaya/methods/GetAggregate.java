package l11kursovaya.methods;

import l11kursovaya.Dao.DaoCountInt;
import l11kursovaya.objects.Order;
import org.apache.log4j.Logger;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GetAggregate implements DaoCountInt<Order> {


    @Override
    public int countAmount() {

        try (Statement statement = Connection.getConnection().createStatement()) {

            ResultSet result = statement.executeQuery(
                    "SELECT\n" +
                            "AVG (quantity) as average_quantity,\n" +
                            "MAX (quantity) AS maximum_quantity,\n" +
                            "MIN (quantity) AS minimum_quantity\n" +
                            "FROM orders;");

            while (result.next()) {
                System.out.println("Average quantity in order:");
                System.out.println(result.getInt(1));
                System.out.println("Maximum quantity in order:");
                System.out.println(result.getInt(2));
                System.out.println("Minimum quantity in order:");
                System.out.println(result.getInt(3));
            }
            result.close();

        } catch (SQLException e) {
            System.err.println("Exception during the Order statement execution");
        }


        Connection.close();

        return 0;
    }


}










//SELECT * FROM orders WHERE client_id IN (1,2) and order_date BETWEEN '2020-04-15' and '2020-05-20';
//
//        SELECT * FROM clients WHERE client_name LIKE '%ya';
