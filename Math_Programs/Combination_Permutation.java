// Java program for finding Combination and Permuations

// Importing Scanner class for user input
import java.util.Scanner;

// Main Class
public class Combination_Permutation
{
    // Main Method of Main class
    public static void main(String[] args)
    {
        // Scanner Instance for user input
        Scanner input = new Scanner(System.in);

        // User Input
        System.out.print("1 - Combination\n2 - Permutation\n# ");
        int Option = input.nextInt();

        if (Option != 1 && Option !=2)
        {
            System.out.println("Invalid Choice!!");
            return;
        }

        System.out.print("Enter n: ");
        int n = input.nextInt();

        System.out.print("Enter r: ");
        int r = input.nextInt();

        // Closing Scanner Instance
        input.close();

        int result = 0;
        String Method = "";

        switch (Option)
        {
            case 1:
                result = Combination(n, r);
                Method = "Combination";
                break;
            case 2:
                result = Permutation(n, r);
                Method = "Permutation";
                break;
        }

        System.out.println(n + " " + Method + " " + r + " is " + result);

    }

    // Private method for Factorial
    private static int factorial(int num)
    {
        int result = 1;
        for(int i = num; i > 1; i--)
        {
            result = result * i;
        }
        return result;
    }

    // Combination Method
    public static int Combination(int N, int R)
    {
        int C = factorial(N) / (factorial(N - R) * factorial(R));
        return C;
    }

    // Permutation Method
    public static int Permutation(int N, int R)
    {
        int P = factorial(N) / (factorial(N - R));
        return P;
    }
}
