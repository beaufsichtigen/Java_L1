package l11kursovaya.methods;

import l11kursovaya.Dao.DaoUpdateWithParameter;

import java.sql.SQLException;
import java.sql.Statement;

public class DeleteByColumn implements DaoUpdateWithParameter {

    @Override
    public int updateTableWithParameter(String parameter) {

        String sql = "DELETE from orders where ordered_book_id =" + parameter + ";";
        System.out.println(sql);


        int result = 0;
        try (Statement statement = Connection.getConnection().createStatement()) {

            result = statement.executeUpdate(sql);

            System.out.println(result);

        } catch (SQLException e) {
            System.err.println("Exception deleting");
        }


        Connection.close();

        return result;
    }

}