package L2;

public class Fibonacciother {
    public static int Fibonacciother(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return Fibonacciother(n - 1) + Fibonacciother(n - 2);
        }
    }
    public static void main(String[] args)  //распечатать n чисел последовательности Фибоначчи
    {
        int n = 8;
        for (int i = 0; i < n; i++) {
            System.out.println(Fibonacciother(i));
        }
    }
}
