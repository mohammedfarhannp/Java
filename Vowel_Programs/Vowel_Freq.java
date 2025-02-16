// Java program to display the frequency of vowels in a text

// importing classes
import java.util.Scanner; // For user input

// Main class
public class Vowel_Freq
{
    // Main method of Main class
    public static void main(String[] args)
    {
        // Scanner Instance
        Scanner input = new Scanner(System.in);

        // User Input
        System.out.print("Enter Text: ");
        String Text = input.nextLine();

        // Scanner Instance closed
        input.close();

        // Calling public method count_vowels()
        count_vowels(Text);
    }


    // Public method for displaying frequency of each vowel
    public static void count_vowels(String Str)
    {
        // List of vowels
        // List<char> Vowels = List.of("a","e","i","o","u");

        // String Array of Vowels
        String[] Vowels = {"a", "e", "i", "o", "u"};

        System.out.println("Frequency of Vowels");

        // Iterating each vowel in list of vowels
        for(String Vowel : Vowels)
        {
            int Frequency = return_count(Vowel, Str); // Calling private method return_count();
            System.out.println(Vowel + " : " + Frequency);
        }
    }

    // Private method for counting the number of times a character occurs in a text
    private static int return_count(String Vowel, String Str)
    {

        int Count = 0;
        char ch;

        // Iterating each char of Str
        for(int i = 0; i < Str.length(); i++)
        {
            // Getting element at index i of Str
            ch = Str.charAt(i);

            // Converts ch char type to String using String.valueOf()
            // Converts ch to lowercase before converting type to String
            // Checks if it matches Vowel
            if(Vowel.equals(String.valueOf(Character.toLowerCase(ch))))
            {
                Count++;
            }
        }
        return Count;
    }
}
