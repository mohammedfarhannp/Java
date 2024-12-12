// Calculator
import java.util.Scanner;

class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in); // For Input from user
        
        float result = 0.0f; // f to avoid ambiguity of compiler for it take it as double sometimes.

        System.out.print("Enter First Number: ");
        int A = scanner.nextInt();

        System.out.print("Enter Second Number: ");
        int B = scanner.nextInt();

        System.out.print("\n1 - Add\n2 - Subtract\n3 - Multiply\n4 - Divide\n# ");
        int C = scanner.nextInt();

        scanner.close();

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

        System.out.println("Result : " + result + "\n");
    }

    public static int Sum(int x, int y)
    {
        return x + y;
    }

    public static int Sub(int x, int y)
    {
        return x - y;
    }

    public static int Mul(int x, int y)
    {
        return x * y;
    }

    public static float Div(int x, int y)
    {
        float result = 0.0f;
        try
        {
            result = x / (float) y;
        } catch(ArithmeticException error)
        {
            System.out.println("Zero Division Error..\n");
        }
        return result;
    }
}