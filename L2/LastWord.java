package L2;

public class LastWord {
    public int lengthOfLastWord(final String a)
    {
        int len = 0;

        String x = a.trim(); //Trim spaces before and after string

        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == ' ')
                len = 0;
            else
                len++; //count number of characters till space
        }

        return len;
    }

    // Input
    public static void main(String[] args)
    {
        String input = "Cats love only food";
        LastWord word = new LastWord();
        System.out.println("The length of last word is " + word.lengthOfLastWord(input));
    }
}
