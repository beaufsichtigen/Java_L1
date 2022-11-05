package l11kursovaya;

import l11kursovaya.methods.*;
import l6_exceptions.MyException;
import l9regexpwithenherit.PhoneChecker;

import java.io.IOException;
import java.util.Scanner;

public class Kursovaya {

    public static void main(String[] args) throws IOException {



            Scanner scanner = new Scanner(System.in);

            while (scanner.hasNext()) {
                switch (scanner.nextInt()) {
                    case 1:
                        System.out.println("Create 3 tables with references");
                        CreateTables createTables = new CreateTables();
                        createTables.createTable();
                        break;
                    case 2:
                        System.out.println("Create insert script");
                        Insert insert = new Insert();
                        insert.insertTable();
                        break;
                    case 3:
                        System.out.println("Create update script");
                        UpdateByDate updateByDate = new UpdateByDate();
                        updateByDate.insertTable();
                        break;

//                    UPDATE orders
//                    SET order_date = '2022-05-20'
//                    WHERE order_date > '2021-05-20';

                    case 4:
                        System.out.println("Create delete script to delete dy specific column");
                        System.out.println("Please enter the number of ordered book id, by which orders will be deleted");
                        DeleteByColumn deleteByColumn = new DeleteByColumn();
                        String parameter = (scanner.next());
                        deleteByColumn.updateTableWithParameter(parameter);

                        break;

//                    DELETE from orders where ordered_book_id = 2;

                    case 5:
                        System.out.println("Create delete script to delete all");
                        DeleteAll deleteAll = new DeleteAll();
                        deleteAll.insertTable();
                        break;


                    case 6:
                        System.out.println("Create script to get records using between/in/like");
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

                    case 7:
                        System.out.println("Create  script to get records from all 3 tables");
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


                    case 8:
                        System.out.println("Count amount of records in all tables");
                        GetAmountOfRecords getAmountOfRecords = new GetAmountOfRecords();
                        getAmountOfRecords.countAmount();
                        break;


//                    SELECT
//                    COUNT (orders.order_id) +
//                            (SELECT COUNT (client_id) FROM clients) +
//                            (SELECT COUNT (book_id) FROM books)
//                    AS amount FROM orders;
                    case 9:
                        System.out.println("Any aggregated function");
                        GetAggregate getAggregate = new GetAggregate();
                        getAggregate.countAmount();
                        break;

//                    SELECT
//                    AVG (quantity) as average_quantity,
//                    MAX (quantity) AS maximum_quantity,
//                    MIN (quantity) AS minimum_quantity
//                    FROM orders;

                    case 11:
                        System.out.println("Эксперименты");
                        String phone = scanner.next();
                        boolean checkPhoneResult = new PhoneChecker().check(phone);



                        System.out.println(checkPhoneResult ? "Phone validated": "Incorrect Phone");

                        break;

//                    case 3:
//                        System.out.println("Enter Book ISBN. Format ISBN-13:888-9999999999 or ISBN-10:9999999999 ");
//                        String isbn = scanner.next();
//                        boolean checkISBNResult = new IsbnChecker().check(isbn);
//                        System.out.println(checkISBNResult ? "ISBN validated": "Incorrect ISBN");
//
//                        break;
//
//                    case 4:
//                        System.out.println("Enter date in format (2022-Oct-17)");
//                        String date = scanner.next();
//                        boolean checkDateResult = new DateChecker().check(date);
//                        System.out.println(checkDateResult ? "Date validated": "Incorrect Date");
//                        break;

                    case 10:
                        System.out.println("Quit");
                        scanner.close();
                        return;


                    default:
                        throw new MyException("Invalid argument. \n" +
                                "Input '1' for e-mail validation. \n" +
                                "Input '2' for phone validation. \n" +
                                "Input '3' for ISBN validation. \n" +
                                "Input '4' for date validation. \n" +
                                "Input '5' for Quit.");

                }
            }


        }

    }

