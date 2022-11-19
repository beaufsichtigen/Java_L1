package l11kursovaya.methods;


import l11kursovaya.Dao.DaoUpdateDelete;
import l6_exceptions.MyException;
import l9regexpwithenherit.DateNewChecker;
import l9regexpwithenherit.NumberChecker;
import org.apache.logging.log4j.core.Logger;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class InsertManually implements DaoUpdateDelete {

    @Override

    public int insertTable() {

        Scanner scanInsert = new Scanner(System.in);


        boolean clientIdcheck = false;
        boolean orderDateCheck = false;
        boolean bookIdcheck = false;
        boolean quantityCheck = false;

        String  clientId = null;
        String orderDate = null;
        String bookId = null;
        String quantity = null;
        int i = 0;


        System.out.println("Please enter client_id");

        while (!clientIdcheck && i < 3) {
            clientId = (scanInsert.next());
            clientIdcheck = new NumberChecker().check(clientId);
            i++;
            if (!clientIdcheck && i <3) {
               System.out.println("Wrong clientId format. Try once more.");
            } else if (!clientIdcheck && i == 3) {
                System.out.println("Attempts exceeded. Return to menu.");
                throw new MyException("Wrong parameter");

            }
        }



        System.out.println("Please enter order_date. For example: 2025-05-20");
i = 0;
           while (orderDateCheck == false) {
            orderDate = (scanInsert.next());
            orderDateCheck = new DateNewChecker().check(orderDate);
               if (orderDateCheck == false) {System.out.println("Wrong orderDate format.Return to menu.");}
        }

        System.out.println("Please enter ordered_book_id. For example: 1");

        while (bookIdcheck == false && i < 3) {
            bookId = (scanInsert.next());
            bookIdcheck = new NumberChecker().check(bookId);
            if (bookIdcheck == false) {System.out.println("Wrong bookId format. Return to menu.");}
        }

        System.out.println("Please enter quantity");

        while (quantityCheck == false) {
            quantity = (scanInsert.next());
            quantityCheck = new NumberChecker().check(quantity);
            if (quantityCheck == false) {System.out.println("Wrong quantity format. Return to menu.");}
            }


        String sql = "INSERT INTO orders (client_id, order_date, ordered_book_id, quantity) VALUES (?, ?, ?, ?);";



        int result = 0;
        try (PreparedStatement statement1 = Connection.getConnection().prepareStatement(sql)) {

            statement1.setInt(1, Integer.parseInt(clientId));
            statement1.setDate(2, Date.valueOf(orderDate));
            statement1.setInt(3, Integer.parseInt(bookId));
            statement1.setInt(4, Integer.parseInt(quantity));

            System.out.println(statement1);

            result = statement1.executeUpdate();

            System.out.println("Rows added: " + result);

        } catch (SQLException e) {
            System.err.println("Check the values" + e);
        }


        Connection.close();

        return result;
    }
}
