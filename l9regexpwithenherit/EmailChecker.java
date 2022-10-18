package l9regexpwithenherit;

import java.util.InputMismatchException;
import java.util.regex.Pattern;

// - case 1
public class EmailChecker extends PatternChecker {
    public static final String EMAIL_PATTERN = "^\\w*@\\w*\\.[a-z]{1,3}$";
public EmailChecker() {
        super(EMAIL_PATTERN);
    }

}
