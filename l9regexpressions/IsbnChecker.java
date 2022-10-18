package l9regexpressions;

import java.util.InputMismatchException;
import java.util.regex.Pattern;

// - case 3 ISBN-13:888-9999999999 ISBN-10:9999999999
public class IsbnChecker {
    public IsbnChecker(String isbn) {
        try{Pattern isbnCheck = Pattern.compile("^(((ISBN-13:)(\\d{3})-?(\\d{10}))|((ISBN-10:)(\\d{10})))$");
        boolean isbnCheckResult = isbnCheck.matcher(isbn).find();
        System.out.println(isbnCheckResult);
        if (isbnCheckResult == true) {
            System.out.println("ISBN Validated");
        } else {
            System.out.println("Incorrect ISBN");

        }} catch (InputMismatchException e) {
            System.out.println("Incorrect ISBN error" + e);
    }
    }
}
