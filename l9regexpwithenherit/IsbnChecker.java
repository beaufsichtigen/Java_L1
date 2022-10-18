package l9regexpwithenherit;

import java.util.InputMismatchException;
import java.util.regex.Pattern;

// - case 3 ISBN-13:888-9999999999 ISBN-10:9999999999
public class IsbnChecker extends PatternChecker {
    public static final String ISBN_PATTERN = "^(((ISBN-13:)(\\d{3})-?(\\d{10}))|((ISBN-10:)(\\d{10})))$";
public IsbnChecker() {
    super(ISBN_PATTERN);
}

}
