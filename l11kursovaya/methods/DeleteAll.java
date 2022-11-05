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
        int result = result1 + result2 + result3;

        try (Statement statement = Connection.getConnection().createStatement()) {

            result1 = statement.executeUpdate(
                    "DELETE from orders; ");

            result2 = statement.executeUpdate(
                    "DELETE from books; ");

            result3 = statement.executeUpdate(
                    "DELETE from clients; ");

            System.out.println("From books " + result1 + " rows deleted. From clients " + result2 + " rows deleted. From orders " + result3 + " rows deleted.");


        } catch (SQLException e) {
            System.err.println("Error during update execution.");
        }


        Connection.close();


        return result;
    }


}
