package l11kursovaya.methods;


import java.sql.SQLException;
import java.sql.Statement;
import l11kursovaya.Dao.DaoCreate;



public class CreateTables implements DaoCreate  {

@Override
        public void createTable() {


        try (Statement statement = Connection.getConnection().createStatement()) {

            int result = statement.executeUpdate(
                    "CREATE TABLE clients (\n" +
                            "client_id int NOT NULL CONSTRAINT clients_pk PRIMARY KEY,\n" +
                            "client_name varchar(100) NOT NULL,\n" +
                            "client_phone bigint);\n" +
                            "\n" +
                            "CREATE TABLE books (\n" +
                            "book_id int NOT NULL CONSTRAINT book_pk PRIMARY KEY,\n" +
                            "book_name varchar(100) NOT NULL,\n" +
                            "book_author varchar(100) NOT NULL,\n" +
                            "books_year date NOT NULL);\n" +
                            "\n" +
                            "CREATE TABLE orders (\n" +
                            "order_id int NOT NULL CONSTRAINT order_pk PRIMARY KEY,\n" +
                            "client_id int NOT NULL references clients (client_id),\n" +
                            "order_date date NOT NULL,\n" +
                            "ordered_book_id int NOT NULL references books (book_id),\n" +
                            "quantity int);");

            System.out.println(result);

        } catch (SQLException e) {
            System.err.println("Exception error while creating tables. Check that tables have not been created before.");
        }


        Connection.close();


        }

}
