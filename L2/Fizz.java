package L2;

public class Fizz {
    public static void ifFizz(int i)

    {
        int i3=(i%3);
        int i5=(i%5);
        if ((i3 == 0)&&(i5 == 0)) {
            System.out.println("Fizz-buzz");
        }
        else if (i3 == 0) {
            System.out.println("Fizz");

        }
        else if (i5 == 0) {
            System.out.println("Buzz");

        }
        else {System.out.println("Fignya");
    }}
//input:
    public static void main(String[] args) {
        ifFizz(15);
    }
}