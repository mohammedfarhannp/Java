// Multi Class Program

import java.util.Scanner;

class Calculator {
    public static int Sum(int x, int y)
    {
        return x + y;
    }

    public static int Subtract(int x, int y)
    {
        return x - y;
    }

    public static int Multiply(int x, int y)
    {
        return x * y;
    }

    public static float Divide(int x, int y)
    {
        float result = 0.0f;
        if(y == 0)
        {
            System.out.println("ZeroDivisionError");
        } else {
            result = x / (float) y;
        }
        return result;
    }
}

class Main
{
    public static void main(String[] args)
    {
        Calculator Calc = new Calculator();
        Scanner scan = new Scanner(System.in);

        int A, B, Oper;

        float Result = 0.0f;

        System.out.print("Enter first number: ");
        A = scan.nextInt();

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