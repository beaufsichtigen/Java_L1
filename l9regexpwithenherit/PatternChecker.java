package l9regexpwithenherit;

import java.util.regex.Pattern;

public abstract class PatternChecker {
    public final Pattern CHECK_PATTERN;

    protected PatternChecker(String patternForCheck) {
        this.CHECK_PATTERN = Pattern.compile(patternForCheck);
    }

    public boolean check(String value2Check) {
        return CHECK_PATTERN.matcher(value2Check).find();
    }
    public boolean check(int value2Check) { return CHECK_PATTERN.matcher(String.valueOf(value2Check)).find();
    }
}
