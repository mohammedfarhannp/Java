// Java program to find factorial or a number

// importing class for getting user input
import java.util.Scanner;

// Main class
public class Factorial {
    // Main method of main class
    public static void main(String[] args)
    {
        // Scanner Instance
        Scanner input = new Scanner(System.in);

        // Getting user input
        System.out.print("Enter a number to find it's factorial: ");
        int number = input.nextInt();

        // Closing Scanner Instance
        input.close();

        System.out.println("Factorial of " + number + " is " + factorial(number));

    }

    // Method for factorial without using recursion
    public static int fact(int num)
    {
        int result = 1;
        for(int i = num; i > 1; i--)
        {
            result = result * i;
        }
        return result;
    }

    // Method for factorial using recursion
    public static int factorial(int num)
    {
        if(num > 1)
        {
            return num * factorial(num - 1);
        } else {
            return 1;
        }
    }
}
