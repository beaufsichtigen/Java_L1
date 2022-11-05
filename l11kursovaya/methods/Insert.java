package l11kursovaya.methods;


import l11kursovaya.Dao.DaoUpdateDelete;


import java.sql.SQLException;
import java.sql.Statement;


public class Insert implements DaoUpdateDelete {

@Override
        public int insertTable() {

    int result1 = 0;
    int result2 = 0;
    int result3 = 0;
    int result = result1 + result2 + result3;

    try (Statement statement = Connection.getConnection().createStatement()) {

        result1 = statement.executeUpdate(
                "INSERT INTO books(book_id, book_name, book_author, books_year)\n" +
                        "VALUES\n" +
                        "(1, 'Pena Dney', 'Boris Vian', '1947-03-20'),\n" +
                        "(2, 'Der Name der Rose', 'Umberto Eco', '1980-06-01'),\n" +
                        "(3, 'Way Station', 'Clifford Simak', '1963-06-01');");

        result2 = statement.executeUpdate(
                "INSERT INTO clients(client_id, client_name, client_phone)\n" +
                        "VALUES\n" +
                        "(1, 'Sanya', 88888888889),\n" +
                        "(2, 'Petr', 88887888889),\n" +
                        "(3, 'John', 88888888888),\n" +
                        "(4, 'Katya', 88888888889),\n" +
                        "(5, 'Tanya', 88887888889),\n" +
                        "(6, 'John', 89990009988),\n" +
                        "(7, 'Sanya', 53566637),\n" +
                        "(8, 'Petr', 9988857766),\n" +
                        "(9, 'John', 77663666),\n" +
                        "(10, 'Sanya', 88888888889),\n" +
                        "(11, 'Petr', 88887888889),\n" +
                        "(12, 'John', 44444),\n" +
                        "(13, 'Sanya', 88888888889),\n" +
                        "(14, 'Petr', 94988847),\n" +
                        "(15, 'John', 77476665);");

        result3 = statement.executeUpdate(
                "INSERT INTO orders(order_id, client_id, order_date, ordered_book_id, quantity)\n" +
                        "VALUES\n" +
                        "(1, 1, '2022-03-20', 1, 5),\n" +
                        "(2, 2, '2020-05-20', 2, 10),\n" +
                        "(3, 3, '2020-06-20', 3, 2),\n" +
                        "(4, 3, '2020-06-20', 2, 10),\n" +
                        "(5, 15, '2022-03-20', 1, 5),\n" +
                        "(6, 2, '2020-05-20', 2, 10),\n" +
                        "(7, 3, '2020-06-20', 3, 2),\n" +
                        "(8, 3, '1980-06-20', 2, 10),\n" +
                        "(9, 5, '1999-03-20', 1, 5),\n" +
                        "(10, 6, '2020-05-20', 2, 10),\n" +
                        "(11, 3, '2020-06-20', 3, 2),\n" +
                        "(12, 3, '2020-06-20', 2, 10);");

        System.out.println("Into books " + result1 + " rows inserted. Into clients " + result2 + " rows inserted. Into orders " + result3 + " rows inserted.");


    } catch (SQLException e) {
        System.err.println("Check the values, they may already exists.");
    }


    Connection.close();


    return result;
}


}
