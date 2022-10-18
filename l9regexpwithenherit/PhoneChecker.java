package l9regexpwithenherit;

import java.util.InputMismatchException;
import java.util.regex.Pattern;

// case 2
public class PhoneChecker extends PatternChecker {
    public static final String PHONE_PATTERN = "^(\\+7|8)-?(\\d{3})-?(\\d{3})-?(\\d{2})-?(\\d{2})$";
    public PhoneChecker() {
        super(PHONE_PATTERN);
    }

}
