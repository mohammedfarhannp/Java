// importing class for getting user input
import java.util.Scanner;

// Main Class
public class Int_Reverse
{
    // Main Method
    public static void main(String[] args)
    {
        // input object
        Scanner input = new Scanner(System.in);

        // Taking user input for an integer value 
        System.out.print("Enter a Number: ");
        int number = input.nextInt();

        // Reversing Number
        int rev_number = Reverse(number);
        System.out.println("Reversed Number: " + rev_number);

        // Close input object
        input.close();
    }

    // Method to reverse a number
    public static int Reverse(int n)
    {
        int result = 0;
        int tmp;
        while(n != 0)
        {
            tmp = n % 10;
            result = result * 10 + tmp;
            n = n / 10;
        }
        return result;
    }
}