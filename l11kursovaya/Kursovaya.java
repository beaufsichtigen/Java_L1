package l11kursovaya;

import l11kursovaya.methods.*;
import l6_exceptions.MyException;
import l9regexpwithenherit.DateNewChecker;
import l9regexpwithenherit.FieldChecker;
import l9regexpwithenherit.NumberChecker;

import java.io.IOException;
import java.util.Scanner;

public class Kursovaya {

    public static void main(String[] args) throws IOException {
        System.out.println("Input '1' for Create 3 tables with references. \n" +
                "Input '2' for Script, which will fill the table with default data. \n" +
                "Input '3' for Insert order manualy. \n" +
                "Input '4' for Update order by date. \n" +
                "Input '5' for Delete script to delete by specific column. \n" +
                "Input '6' for Delete all. \n" +
                "Input '7' for Get records using between/in/like. \n" +
                "Input '8' for Get records from all 3 tables. \n" +
                "Input '9' for Count amount of records in all tables. \n" +
                "Input '10' for AVG, MAX, MIN  aggregated function. \n" +
                "Input '11' for Quit.");



            Scanner scanner = new Scanner(System.in);

            while (scanner.hasNext()) {
                switch (scanner.nextInt()) {
                    case 1:
                        System.out.println("Create 3 tables with references");
                        CreateTables createTables = new CreateTables();
                        createTables.createTable();
                        break;
                    case 2:
                        System.out.println("Insert script, which will fill the table with default data");
                        InsertByDefault insertByDefaultDefault = new InsertByDefault();
                        insertByDefaultDefault.insertTable();
                        break;

                   // boolean checkISBNResult = new IsbnChecker().check(isbn);
                    //System.out.println(checkISBNResult ? "ISBN validated": "Incorrect ISBN");


                    case 3:
                        System.out.println("Insert order manualy");
                        InsertManually insertManually = new InsertManually();
                        insertManually.insertTable();

                        break;

                    case 4:
                        System.out.println("Update order by date");
                        UpdateByDate updateByDate = new UpdateByDate();
                        System.out.println("Please enter date, that you want to replace. For example: 2022-05-20");
                        String oldDate = (scanner.next());

                        boolean oldDatecheck = new DateNewChecker().check(oldDate);
                        if (oldDatecheck == false) {
                            System.out.println("Wrong Date format. Return to menu.");
                            break;
                        } else {
                        System.out.println("Please enter NEW date. For example: 2025-05-20");
                        String newDate = (scanner.next());
                            boolean newDatecheck = new DateNewChecker().check(newDate);
                            if (newDatecheck == false) {
                                System.out.println("Wrong Date format. Return to menu.");
                                break;
                            } else {
                                System.out.println("Create update script");
                        updateByDate.updateTableWithParameter(oldDate, newDate,  null, null);}}
                    break;

//                    UPDATE orders
//                    SET order_date = '2022-05-20'
//                    WHERE order_date > '2021-05-20';

                    case 5:
                        System.out.println("Delete script to delete by specific column");
                        DeleteByColumn deleteByColumn = new DeleteByColumn();
                        System.out.println("Please enter name of column. For example: ordered_book_id");
                        String columnName = (scanner.next());
                        boolean orderedBookCheck = new FieldChecker().check(columnName);
                        if (orderedBookCheck == false) {
                            System.out.println("Wrong format. Return to menu.");
                            break;
                        } else {

                        System.out.println("Please enter column value, by which orders will be deleted. For example: 2");
                        String columnValue = (scanner.next());
                            boolean valueCheck = new NumberChecker().check(columnValue);
                            if (valueCheck == false) {
                                System.out.println("Wrong format. Return to menu.");
                                break;
                            } else {
                        deleteByColumn.updateTableWithParameter(columnName, columnValue,  null, null);}}

                        break;

//                    DELETE from orders where ordered_book_id = 2;

                    case 6:
                        System.out.println("Delete all");
                        DeleteAll deleteAll = new DeleteAll();
                        deleteAll.insertTable();
                        break;


                    case 7:
                        System.out.println("Get records using between/in/like");
                        System.out.println("SELECT * FROM orders WHERE client_id IN (1,2) and order_date BETWEEN '2020-04-15' and '2020-05-20';");
                        GetRecordsWithBetweenIn getRecordsWithBetweenIn = new GetRecordsWithBetweenIn();
                        getRecordsWithBetweenIn.getAllObjects().stream().forEach(System.out::println);
                        System.out.println("SELECT * FROM clients WHERE client_name LIKE '%ya';");
                        GetRecordsWithLike getRecordsWithLike = new GetRecordsWithLike();
                        getRecordsWithLike.getAllObjects().stream().forEach(System.out::println);
                        break;

                    //SELECT *
                    //FROM orders
                    //WHERE client_id IN (1,2) and order_date BETWEEN '2020-04-15' and '2020-05-20';
                    //
                    //SELECT *
                    //FROM clients
                    //WHERE client_name LIKE '%ya';

                    case 8:
                        System.out.println("Get records from all 3 tables");
                        GetRecordsWithJoin getRecordsWithJoin = new GetRecordsWithJoin();
                        getRecordsWithJoin.getAllObjects().stream().forEach(System.out::println);
                        break;

//                    SELECT
//                    orders.order_id,
//                            orders.client_id AS client_id,
//                    clients.client_id AS client_id_from_client,
//                            orders.order_date,
//                            orders.ordered_book_id,
//                            orders.quantity,
//                            clients.client_name,
//                            books.book_name
//                    FROM orders
//                    FULL JOIN clients ON orders.client_id = clients.client_id
//                    FULL JOIN books ON orders.ordered_book_id = books.book_id
//                    ORDER BY orders.client_id;


                    case 9:
                        System.out.println("Count amount of records in all tables");
                        GetAmountOfRecords getAmountOfRecords = new GetAmountOfRecords();
                        getAmountOfRecords.countAmount();
                        break;


//                    SELECT
//                    COUNT (orders.order_id) +
//                            (SELECT COUNT (client_id) FROM clients) +
//                            (SELECT COUNT (book_id) FROM books)
//                    AS amount FROM orders;
                    case 10:
                        System.out.println("AVG, MAX, MIN  aggregated function");
                        GetAggregate getAggregate = new GetAggregate();
                        getAggregate.countAmount();
                        break;

//                    SELECT
//                    AVG (quantity) as average_quantity,
//                    MAX (quantity) AS maximum_quantity,
//                    MIN (quantity) AS minimum_quantity
//                    FROM orders;


                    case 11:
                        System.out.println("Quit");
                        scanner.close();
                        return;


                    default:
                        throw new MyException("Invalid argument. \n" +
                                "Input '1' for Create 3 tables with references. \n" +
                                "Input '2' for Script, which will fill the table with default data. \n" +
                                "Input '3' for Insert order manualy. \n" +
                                "Input '4' for Update order by date. \n" +
                                "Input '5' for Delete script to delete by specific column. \n" +
                                "Input '6' for Delete all. \n" +
                                "Input '7' for Get records using between/in/like. \n" +
                                "Input '8' for Get records from all 3 tables. \n" +
                                "Input '9' for Count amount of records in all tables. \n" +
                                "Input '10' for AVG, MAX, MIN  aggregated function. \n" +
                                "Input '11' for Quit.");

                }
            }


        }

    }

