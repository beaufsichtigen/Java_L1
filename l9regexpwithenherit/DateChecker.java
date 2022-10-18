package l9regexpwithenherit;

import java.util.InputMismatchException;
import java.util.regex.Pattern;

//(2022-Oct-17) - case 4
public class DateChecker extends PatternChecker {
    public static final String DATE_PATTERN = "^\\(\\d{4}-(Jan|Mar|May|Jul|Aug|Oct|Dec)-\\d{2}\\)$";
    public DateChecker() {
        super(DATE_PATTERN);
    }

}
