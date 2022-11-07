package l9regexpwithenherit;

//(2022-07-17) - case 4
public class DateNewChecker extends PatternChecker {
    public static final String DATE_NEW_PATTERN = "^\\d{4}-\\d{2}-\\d{2}$";
    public DateNewChecker() {
        super(DATE_NEW_PATTERN);
    }

}
