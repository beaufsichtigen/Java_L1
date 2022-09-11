package L2;

public class Palindrome
{

    public static boolean isPalindrome(int num)
    {
        int n = num;
        int rev = 0;
        while (n > 0)
        {

            int r = n % 10; // 1. = 7, 2. = 5, 3. = 6 - last digit
            rev = rev * 10 + r; // 1. = 7, 2. = 75, 3. = 756 - add r to new reversed
            n = n / 10; // 1. = 65, 2. = 6, 3. = 0,6 - delete last digit from n
        }

        return (num == rev); //compare
    }

    public static void main(String[] args)
    {
        int n = 657;
        if (isPalindrome(n)) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }
}

