package l11kursovaya.methods;

import l11kursovaya.Dao.DaoUpdateDelete;
import l11kursovaya.Dao.DaoUpdateWithParameter;

import java.sql.*;

public class UpdateByDate implements DaoUpdateWithParameter {

    @Override
    public int updateTableWithParameter (String oldDate, String newDate, String parameter3, String parameter4) {

        int result = 0;

        try (Statement statement = Connection.getConnection().createStatement()) {
            String sql = "UPDATE orders\n" +
                    "SET order_date = '" + newDate + "'\n" +
                    "WHERE order_date = '" + oldDate + "';";

            result = statement.executeUpdate(sql);

            System.out.println(sql);
            System.out.println(result + " rows updated.");


        } catch (SQLException e) {
            System.err.println("Error during update execution.");
        }


        Connection.close();


        return result;
    }


}
