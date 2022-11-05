package l11kursovaya.methods;

import l11kursovaya.Dao.DaoGetObjects;
import l11kursovaya.objects.JoinResult;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class GetRecordsWithJoin implements DaoGetObjects<JoinResult> {

    @Override
    public List<JoinResult> getAllObjects() {
        List<JoinResult> result = new ArrayList<>();


        try (Statement statement = Connection.getConnection().createStatement()) {

            ResultSet resultSetWithJoin = statement.executeQuery(
                    "SELECT\n" +
                            "orders.order_id,\n" +
                            "orders.client_id AS client_id,\n" +
                            "clients.client_id AS client_id_from_client,\n" +
                            "orders.order_date,\n" +
                            "orders.ordered_book_id,\n" +
                            "orders.quantity,\n" +
                            "clients.client_name,\n" +
                            "books.book_name\n" +
                            "FROM orders\n" +
                            "Full JOIN clients ON orders.client_id = clients.client_id\n" +
                            "Full JOIN books ON orders.ordered_book_id = books.book_id\n" +
                            "ORDER BY orders.client_id;");

            while (resultSetWithJoin.next()) {

                result.add(new JoinResult (
                        resultSetWithJoin.getInt(1),
                        resultSetWithJoin.getInt(2),
                        resultSetWithJoin.getInt(3),
                        resultSetWithJoin.getDate(4),
                        resultSetWithJoin.getInt(5),
                        resultSetWithJoin.getInt(6),
                        resultSetWithJoin.getString(7),
                        resultSetWithJoin.getString(8)));
            }
            resultSetWithJoin.close();

            } catch (SQLException e) {
            System.err.println("Exception during the Order statement execution");
        }


        Connection.close();

        return result;
    }



}










//SELECT * FROM orders WHERE client_id IN (1,2) and order_date BETWEEN '2020-04-15' and '2020-05-20';
//
//        SELECT * FROM clients WHERE client_name LIKE '%ya';
