// Multi Class Program
// For getting user input I import something called Scanner
import java.util.Scanner;

// Class Calculator
class Calculator {
    // Function for addition
    public static int Sum(int x, int y)
    {
        return x + y;
    }

    // Function for Subtraction
    public static int Subtract(int x, int y)
    {
        return x - y;
    }

    // Function for Multiplication
    public static int Multiply(int x, int y)
    {
        return x * y;
    }

    // Function for Division
    public static float Divide(int x, int y)
    {
        float result = 0.0f;

        // If Denominator is zero
        if(y == 0)
        {
            System.out.println("ZeroDivisionError");
        } else { // Else Divide x by y
            result = x / (float) y;
        }
        return result;
    }
}

// Main class
class Third_Program
{
    // main function of Main class
    public static void main(String[] args)
    {
        Calculator Calc = new Calculator(); // New Calculator Object stored in datatype Calculator
        Scanner scan = new Scanner(System.in); // Scanner for getting user input

        int A, B, Oper;

        float Result = 0.0f;

        System.out.print("Enter first number: ");
        A = scan.nextInt(); // Gets the integer input from user.

        System.out.print("Enter second number: ");
        B = scan.nextInt();

        System.out.print("1 - Add\n2 - Subtract\n3 - Multiply\n4 - Divide\n# ");
        Oper = scan.nextInt();

        scan.close();

        switch(Oper)
        {
            case 1:
                Result = Calc.Sum(A, B);
                break;
            case 2:
                Result = Calc.Subtract(A, B);
                break;
            case 3:
                Result = Calc.Multiply(A, B);
                break;
            case 4:
                Result = Calc.Divide(A, B);
                break;
            default:
                System.out.println("Invalid Choice");
        }
        System.out.println("Result : " + Result);
    }
}
