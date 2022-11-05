package l11kursovaya.methods;


import java.sql.SQLException;
import java.sql.Statement;

import l11kursovaya.Dao.DaoCreate;


public class CreateTables implements DaoCreate {

    @Override
    public void createTable() {


        try (Statement statement = Connection.getConnection().createStatement()) {

            int result = statement.executeUpdate(
                    "CREATE TABLE IF NOT EXISTS clients (\n" +
                            "client_id int NOT NULL generated always as identity,\n" +
                            "client_name varchar(100) NOT NULL,\n" +
                            "client_phone bigint,\n" +
                            "PRIMARY KEY(client_id));\n" +
                            "\n" +
                            "CREATE TABLE IF NOT EXISTS books (\n" +
                            "book_id int NOT NULL generated always as identity,\n" +
                            "book_name varchar(100) NOT NULL,\n" +
                            "book_author varchar(100) NOT NULL,\n" +
                            "books_year date NOT NULL,\n" +
                            "PRIMARY KEY(book_id));\n" +
                            "\n" +
                            "CREATE TABLE IF NOT EXISTS orders (\n" +
                            "order_id int NOT NULL generated always as identity,\n" +
                            "client_id int NOT NULL references clients (client_id),\n" +
                            "order_date date NOT NULL,\n" +
                            "ordered_book_id int NOT NULL references books (book_id),\n" +
                            "quantity int,\n" +
                            "PRIMARY KEY(order_id)\n" +
                            ");");

            System.out.println(result);

        } catch (SQLException e) {
            System.err.println("Exception error while creating tables.");
        }


        Connection.close();


    }

}
