package l9regexpwithenherit;

public class FieldChecker extends PatternChecker {

    public static final String FIELD_PATTERN = "^(order_id|client_id|order_date|ordered_book_id|quantity)$";
    public FieldChecker() {
        super(FIELD_PATTERN);



    }

}



