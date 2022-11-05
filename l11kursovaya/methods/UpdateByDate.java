package l11kursovaya.methods;

import l11kursovaya.Dao.DaoUpdateDelete;

import java.sql.*;

public class UpdateByDate implements DaoUpdateDelete {

    @Override
    public int insertTable() {

        int result = 0;

        try (Statement statement = Connection.getConnection().createStatement()) {

            result = statement.executeUpdate(
                    "UPDATE orders\n" +
                            "SET order_date = '2022-05-20'\n" +
                            "WHERE order_date > '2021-05-20';");

            System.out.println(result + " rows updated.");


        } catch (SQLException e) {
            System.err.println("Error during update execution.");
        }


        Connection.close();


        return result;
    }


}
