package l11kursovaya.methods;

import l11kursovaya.Dao.DaoCountInt;
import l11kursovaya.objects.Order;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GetAmountOfRecords implements DaoCountInt<Order> {



    @Override
    public int countAmount() {

        try (Statement statement = Connection.getConnection().createStatement()) {

            ResultSet result = statement.executeQuery(
                    "SELECT\n" +
                            "COUNT (orders.order_id) +\n" +
                            "(SELECT COUNT (client_id) FROM clients) +\n" +
                            "(SELECT COUNT (book_id) FROM books)\n" +
                            "AS amount FROM orders;");

            while (result.next()) {
                System.out.println("Amount of records:");
                System.out.println(result.getInt(1));
            }
            result.close();

        } catch (SQLException e) {
            System.err.println("Exception during the Order statement execution");
        }


        Connection.close();

        return 1;
    }



}










//SELECT * FROM orders WHERE client_id IN (1,2) and order_date BETWEEN '2020-04-15' and '2020-05-20';
//
//        SELECT * FROM clients WHERE client_name LIKE '%ya';
