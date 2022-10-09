package l6_exceptions;

public class MyException extends IllegalArgumentException {
    public MyException() {}
    public MyException(String message) {
        super(message);
    }

//    public static void main(String[] args) {throw new MyException();}

}
