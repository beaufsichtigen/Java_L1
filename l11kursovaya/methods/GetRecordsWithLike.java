package l11kursovaya.methods;

import l11kursovaya.Dao.DaoGetObjects;
import l11kursovaya.objects.Client;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class GetRecordsWithLike implements DaoGetObjects<Client> {

    @Override
    public List<Client> getAllObjects() {
        List<Client> clients = new ArrayList<>();

        try (Statement statement = Connection.getConnection().createStatement()) {

            ResultSet resultSetLike = statement.executeQuery(
                    "SELECT * FROM clients WHERE client_name LIKE '%ya';");

            while (resultSetLike.next()) {

                clients.add(new Client(

                        resultSetLike.getInt(1),
                        resultSetLike.getString(2),
                        resultSetLike.getLong(3)));
            }
            resultSetLike.close();

        } catch (SQLException e) {
            System.err.println("Exception during the Order statement execution");
        }


        Connection.close();

        return clients;
    }


}










//SELECT * FROM orders WHERE client_id IN (1,2) and order_date BETWEEN '2020-04-15' and '2020-05-20';
//
//        SELECT * FROM clients WHERE client_name LIKE '%ya';
