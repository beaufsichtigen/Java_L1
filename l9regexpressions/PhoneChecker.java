package l9regexpressions;

import java.util.InputMismatchException;
import java.util.regex.Pattern;

// case 2
public class PhoneChecker {
    public PhoneChecker(String phone) {
        try {
            Pattern phoneCheck = Pattern.compile("^(\\+7|8)-?(\\d{3})-?(\\d{3})-?(\\d{2})-?(\\d{2})$");
            boolean phoneCheckResult = phoneCheck.matcher(phone).find();
            System.out.println(phoneCheckResult);
            if (phoneCheckResult == true) {
                System.out.println("Phone Validated");
            } else {
                System.out.println("Incorrect Phone");

            }
        } catch (InputMismatchException e) {
            System.out.println("Incorrect E-mail Exception" + e);
        }
    }
}
