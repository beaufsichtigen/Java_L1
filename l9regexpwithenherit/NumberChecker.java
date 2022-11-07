package l9regexpwithenherit;

public class NumberChecker extends PatternChecker {
    public static final String NUMBER_PATTERN = "^((\\d+)|(\\d{4}-\\d{2}-\\d{2}))$";
    public NumberChecker() {
        super(NUMBER_PATTERN);
    }

}

