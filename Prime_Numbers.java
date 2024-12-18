// class for getting user input
import java.util.Scanner;

// Main class
class Prime_Numbers
{
    // Main Method
    public static void main(String[] args)
    {
        // Scanner Object for taking input from user
        Scanner Input = new Scanner(System.in);
        
        // Getting Lower and Upper Ranges
        System.out.print("Enter Lower limit: ");
        int Lower_Limit = Input.nextInt();

        System.out.print("Enter Upper limit: ");
        int Upper_Limit = Input.nextInt();

        // Calling method find_prime
        find_prime(Lower_Limit, Upper_Limit);

        // Closing the Scanner Object.
        Input.close();

    }

    // Method for printing all prime numbers between a range
    public static void find_prime(int lower, int upper)
    {
        for(int i=lower; i <= upper; i++)
        {
            // Function call isPrime to check if i is prime, if return value is true, code inside if block is executed
            if(isPrime(i))
            {
                System.out.printf("%d\t", i);
            }
        }
    }

    // Method for checking if a number is prime
    public static boolean isPrime(int num)
    {
        // If input number is less than 2 then return false
        if(num < 2)
        {
            return false;
        }

        for(int i = 2; i * i <= num; i++)
        {
            // if a perfect division occurs then it's not prime and therefore false is returned
            if(num % i == 0)
            {
                return false;
            }
        }
        return true;
    }
}