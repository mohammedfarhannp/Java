// Java program for counting vowels in a string

// Importing Scanner class for user input
import java.util.Scanner;

// Importing List class for working with Lists
import java.util.List;

// Main Class
public class Vowel_Count
{
    // Main method of Main class
    public static void main(String[] args)
    {
        // Instance of Scanner class
        Scanner input = new Scanner(System.in);

        // User Input
        System.out.print("Enter a Sentence: ");
        String Str = input.nextLine();

        // Closing of Scanner Instance
        input.close();

        // Calling private method for displaying number of vowels in string
        Counter(Str);
    }

    // Private method for counting a displaying frequency
    private static void Counter(String Input)
    {
        // Declaring and initializing the String List with values
        List<String> Vowels = List.of("a","e","i","o","u");

        char ch;
        int Count = 0;

        // Iterating Sentence received
        for (int i = 0; i < Input.length(); i++)
        {
            // For getting element at index i
            ch = Input.charAt(i);

            // contains() to check if some element is present in List or iterable
            // String.valueOf() to convert char to string
            // Character.toLowerCase() to convert entire thing to lowercase.
            if(Vowels.contains(String.valueOf(Character.toLowerCase(ch))))
            {
                Count++;
            }

        }
        System.out.println("Number of vowels in the Sentence Input: " + Count);
    }
}
