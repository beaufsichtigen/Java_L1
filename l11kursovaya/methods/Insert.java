package l11kursovaya.methods;


import l11kursovaya.Dao.DaoUpdateDelete;
import l11kursovaya.Dao.DaoUpdateWithParameter;


import java.sql.SQLException;
import java.sql.Statement;


public class Insert implements DaoUpdateDelete, DaoUpdateWithParameter {

    @Override
    public int insertTable() {

        int result1 = 0;
        int result2 = 0;
        int result3 = 0;
        int result = result1 + result2 + result3;

        try (Statement statement = Connection.getConnection().createStatement()) {

            result1 = statement.executeUpdate(
                    "INSERT INTO books(book_name, book_author, books_year)\n" +
                            "VALUES\n" +
                            "('Pena Dney', 'Boris Vian', '1947-03-20'),\n" +
                            "('Der Name der Rose', 'Umberto Eco', '1980-06-01'),\n" +
                            "('Way Station', 'Clifford Simak', '1963-06-01');");

            result2 = statement.executeUpdate(
                    "INSERT INTO clients(client_name, client_phone)\n" +
                            "VALUES\n" +
                            "('Sanya', 88888888889),\n" +
                            "('Petr', 88887888889),\n" +
                            "('John', 88888888888),\n" +
                            "('Katya', 88888888889),\n" +
                            "('Tanya', 88887888889),\n" +
                            "('John', 89990009988),\n" +
                            "('Sanya', 53566637),\n" +
                            "('Petr', 9988857766),\n" +
                            "('John', 77663666),\n" +
                            "('Sanya', 88888888889),\n" +
                            "('Petr', 88887888889),\n" +
                            "('John', 44444),\n" +
                            "('Sanya', 88888888889),\n" +
                            "('Petr', 94988847),\n" +
                            "('John', 77476665);");

            result3 = statement.executeUpdate(
                    "INSERT INTO orders(client_id, order_date, ordered_book_id, quantity)\n" +
                            "VALUES\n" +
                            "(1, '2022-03-20', 1, 5),\n" +
                            "(2, '2020-05-20', 2, 10),\n" +
                            "(3, '2020-06-20', 3, 2),\n" +
                            "(3, '2020-06-20', 2, 10),\n" +
                            "(15, '2022-03-20', 1, 5),\n" +
                            "(2, '2020-05-20', 2, 10),\n" +
                            "(3, '2020-06-20', 3, 2),\n" +
                            "(3, '1980-06-20', 2, 10),\n" +
                            "(5, '1999-03-20', 1, 5),\n" +
                            "(6, '2020-05-20', 2, 10),\n" +
                            "(3, '2020-06-20', 3, 2),\n" +
                            "(3, '2020-06-20', 2, 10);");

            System.out.println("Into books " + result1 + " rows inserted. Into clients " + result2 + " rows inserted. Into orders " + result3 + " rows inserted.");


        } catch (SQLException e) {
            System.err.println("Check the values, they may already exists.");
        }


        Connection.close();


        return result;
    }


    @Override
    public int updateTableWithParameter(String clientId, String orderDate, String bookId, String quantity) {

        String sql = "INSERT INTO orders (client_id, order_date, ordered_book_id, quantity) VALUES (" + clientId + ", '" + orderDate + "', " + bookId + ", " + quantity + ");";
        System.out.println(sql);

        int result = 0;
        try (Statement statement = Connection.getConnection().createStatement()) {

            result = statement.executeUpdate(sql);

            System.out.println(result);

        } catch (SQLException e) {
            System.err.println("Check the values");
        }


        Connection.close();

        return result;
    }
}
