// Class for reading user input
import java.util.Scanner;

// Main class
public class variable_swap
{
    // Main method of main class
    public static void main(String[] args)
    {
        // integer variable declared
        int x, y;

        // Scanner object for user input
        Scanner input = new Scanner(System.in);

        // user input for x
        System.out.print("Enter value of x: ");
        x = input.nextInt();

        // user input for y
        System.out.print("Enter value of y: ");
        y = input.nextInt();

        // closing or detroying Scanner object
        input.close();

        // Display x and y before swap
        System.out.print("Before Swapping of values\nx : " + x + "\ny : " + y + "\n");

        // Swap of 2 variables without temporary variable
        x = x + y;
        y = x - y;
        x = x - y;

        // Display x and y after swap
        System.out.print("After Swapping of values\nx : " + x + "\ny : " + y + "\n");
    }
}
