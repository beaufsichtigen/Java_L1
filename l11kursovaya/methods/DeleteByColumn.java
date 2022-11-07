package l11kursovaya.methods;

import l11kursovaya.Dao.DaoUpdateWithParameter;

import java.sql.SQLException;
import java.sql.Statement;

public class DeleteByColumn implements DaoUpdateWithParameter {

    @Override
    public int updateTableWithParameter(String columnName, String columnValue, String parameter3, String parameter4) {

        String sql = "DELETE from orders where " + columnName +" = " + columnValue + ";";
        System.out.println(sql);


        int result = 0;
        try (Statement statement = Connection.getConnection().createStatement()) {

            result = statement.executeUpdate(sql);

            System.out.println(result);

        } catch (SQLException e) {
            System.err.println("Exception while deleting");
        }


        Connection.close();

        return result;
    }

}