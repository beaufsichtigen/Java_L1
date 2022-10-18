package l9regexpressions;

import java.util.InputMismatchException;
import java.util.regex.Pattern;

//(2022-Oct-17) - case 4
public class DateChecker {
    public DateChecker(String date) {
        try {
            Pattern dateCheck = Pattern.compile("^\\(\\d{4}-(Jan|Mar|May|Jul|Aug|Oct|Dec)-\\d{2}\\)$");
            boolean dateCheckResult = dateCheck.matcher(date).find();
            System.out.println(dateCheckResult);
            if (dateCheckResult == true) {
                System.out.println("Date Validated");
            } else {
                System.out.println("Incorrect Date");

            }
        } catch (InputMismatchException e) {
            System.out.println("Incorrect E-mail Exception" + e);
        }
    }
}
