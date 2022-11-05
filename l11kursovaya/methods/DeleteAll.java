package l11kursovaya.methods;

import l11kursovaya.Dao.DaoUpdateDelete;

import java.sql.SQLException;
import java.sql.Statement;

public class DeleteAll implements DaoUpdateDelete {

    @Override
    public int insertTable() {

        int result1 = 0;
        int result2 = 0;
        int result3 = 0;
        int result4 = 0;
        int result = result1 + result2 + result3;


        try (Statement statement = Connection.getConnection().createStatement()) {

            result1 = statement.executeUpdate(
                    "DELETE from orders; ");

            result2 = statement.executeUpdate(
                    "DELETE from books; ");

            result3 = statement.executeUpdate(
                    "DELETE from clients; ");

            result4 = statement.executeUpdate("alter sequence clients_client_id_seq restart with 1;" +
                    "alter sequence books_book_id_seq restart with 1;" +
                    "alter sequence orders_order_id_seq restart with 1;");


            System.out.println("From books " + result1 + " rows deleted. From clients " + result2 + " rows deleted. From orders " + result3 + " rows deleted.");


        } catch (SQLException e) {
            System.err.println("Error during delete execution.");
        }


        Connection.close();


        return result;
    }


}
