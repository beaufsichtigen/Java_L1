package l2;

public class Fibonacci {
    public static int Fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return Fibonacci(n - 1) + Fibonacci(n - 2);
         }
    }
    public static void main(String[] args) //распечатать n-нное число последовательности фибоначчи
    {
        int n = 8;
        System.out.println(Fibonacci(n));

    }
}

