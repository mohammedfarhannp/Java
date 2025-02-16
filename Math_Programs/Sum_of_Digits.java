// Class for reading user input
import java.util.Scanner;

// Main class
public class Sum_of_Digits
{
    // Main method of main class
    public static void main(String[] args)
    {
        // Variables Declared;
        int user_input, sum;

        // Scanner Object
        Scanner input = new Scanner(System.in);

        // User Input
        System.out.print("Enter a number: ");
        user_input = input.nextInt();

        // Close Scanner Object
        input.close();

        // Sum of Digits
        sum = Sum_Digits(user_input);

        // Display Result
        System.out.println("Sum of Digits of " + user_input + " is " + sum);
    }

    public static int Sum_Digits(int Input)
    {
        if(Input == 0)
        {
            return 0;
        } else {
            return Input % 10 + Sum_Digits(Input / (int) 10);
        }
    }
}
