// importing class for taking user input
import java.util.Scanner;

// Main class
public class Palindrome {
    // Main Method
    public static void main(String[] args)
    {
        // Object for taking user input
        Scanner input = new Scanner(System.in);

        // Taking a String Input from user
        System.out.print("Enter a String(Word): ");
        String Word = input.nextLine();

        // Calling isPalindrome Method
        isPalindrome(Word);

        // Closing Input Object
        input.close();
    }

    // Palindrome checking method
    public static void isPalindrome(String Arg)
    {
        // String variable declared to empty string
        String Reverse_Arg = "";

        // Arg.length() -> returns the number of characters in the string.
        for(int i = Arg.length() -1; i >= 0; i--)
        {
            // Arg.charAt(i) -> returns the character at an index
            Reverse_Arg += Arg.charAt(i);
        }
        // Alternative
        // StringBuilder Reverse_String = new StringBuilder(Arg).reverse();

        // Checks if the both strings are equal
        // Arg.equals(Reverse_Arg) checks if Arg is equal to Reverse_Arg
        if(Arg.equals(Reverse_Arg))
        {
            System.out.println(Arg + " is Palindrome");
        } else {
            System.out.println(Arg + " is not Palindrom");
        }
    }
}