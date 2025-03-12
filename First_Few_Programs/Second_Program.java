// Calculator
// For user input scanner module or class or something is imported
import java.util.Scanner;

// Main class
class Second_Program {
    // Main Function
    public static void main(String[] args)
    {
        // Scanner type variable scanner is declared and is instance of class Scanner
        Scanner scanner = new Scanner(System.in); // For Input from user

        // Floating Number
        float result = 0.0f; // f to avoid ambiguity of compiler for it take it as double sometimes.

        // Print function to avoid printing \n at the end unlike println
        System.out.print("Enter First Number: ");
        int A = scanner.nextInt();

        System.out.print("Enter Second Number: ");
        int B = scanner.nextInt();

        System.out.print("\n1 - Add\n2 - Subtract\n3 - Multiply\n4 - Divide\n# ");
        int C = scanner.nextInt();

        // Closing the Scanner class type scanner descriptor or something
        scanner.close();

        // Switch case like in C
        switch (C)
        {
            case 1:
                result = Sum(A, B);
                break;
            case 2:
                result = Sub(A, B);
                break;
            case 3:
                result = Mul(A, B);
                break;
            case 4:
                result = Div(A, B);
                break;
            default:
                System.out.println("Invalid Choice\n");
        }

        // String Concatenation "A" + "B" or "A" + String type variable 
        System.out.println("Result : " + result + "\n");
    }


    // Public function Sum
    public static int Sum(int x, int y)
    {
        return x + y;
    }

    // Public function Sub for Subtracting
    public static int Sub(int x, int y)
    {
        return x - y;
    }

    // Public function Mul for Multiplying
    public static int Mul(int x, int y)
    {
        return x * y;
    }

    // Public function Div for Dividing
    public static float Div(int x, int y)
    {
        // floating point number
        float result = 0.0f;
        if(y != 0) {
            result = x / (float) y;
        } else {
            System.out.println("Zero Division Error..\n");
        }
        return result;
    }
}
