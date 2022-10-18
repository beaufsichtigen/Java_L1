package l9regexpwithenherit;

import l6_exceptions.MyException;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CheckerInherit {

    public static void main(String[] args) throws IOException {


        try {
            Scanner scanner = new Scanner(System.in);

            while (scanner.hasNext()) {
                switch (scanner.nextInt()) {
                    case 1:
                        System.out.println("Enter e-mail");
                        String email = scanner.next();
                        boolean checkEmailResult = new EmailChecker().check(email);
                        System.out.println(checkEmailResult ? "Email validated": "Incorrect Email");

                        break;
                    case 2:
                        System.out.println("Enter Phone number");
                        String phone = scanner.next();
                        boolean checkPhoneResult = new PhoneChecker().check(phone);
                        System.out.println(checkPhoneResult ? "Phone validated": "Incorrect Phone");

                        break;

                    case 3:
                        System.out.println("Enter Book ISBN. Format ISBN-13:888-9999999999 or ISBN-10:9999999999 ");
                        String isbn = scanner.next();
                        boolean checkISBNResult = new IsbnChecker().check(isbn);
                        System.out.println(checkISBNResult ? "ISBN validated": "Incorrect ISBN");

                        break;

                    case 4:
                        System.out.println("Enter date in format (2022-Oct-17)");
                        String date = scanner.next();
                        boolean checkDateResult = new DateChecker().check(date);
                        System.out.println(checkDateResult ? "Date validated": "Incorrect Date");
                        break;

                    case 5:
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
        } catch (InputMismatchException e) {
            System.out.println("Incorrect input. No spaces please " + e);

        }

    }
}
