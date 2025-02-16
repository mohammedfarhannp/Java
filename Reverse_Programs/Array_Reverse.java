// Java code to reverse an array

// Importing classes
import java.util.Scanner; // For user input
import java.util.Arrays; // For using Array methods


// Main Class
public class Array_Reverse
{
    // Main method of Main class
    public static void main(String[] args)
    {
        String[] Arr = CreateArray();

        System.out.println("Original Order of Array : " + Arrays.toString(Arr)); // Converts String Array to python list like

        String[] Rev = ReverseArray(Arr);

        System.out.println("Reverse Order of Array : " + Arrays.toString(Rev));

    }

    // Private Array Creation method
    private static String[] CreateArray()
    {
        // Instance of Scanner class
        Scanner input = new Scanner(System.in);

        // User Input
        System.out.print("Enter the number of elements in of String Array to be created: ");
        int Limit = input.nextInt();
        input.nextLine(); // This is necessary to move to the next line.

        // String Array
        String[] Array = new String[Limit]; // Arrays in Java have fixed size and cannot be directly altered.

        for(int i = 0; i < Limit; i++)
        {
            System.out.print("Element " + (i+1) + " of String Array: ");
            String Tmp = input.nextLine();
            Array[i] = Tmp;
        }

        // Closing Scanner class instance
        input.close();

        return Array;
    }

    // Private Array for Reversing String Array
    private static String[] ReverseArray(String[] Array)
    {
        int n = Array.length; // Array attribute length stores the length or number of elements in array

        String[] Reverse_Array = new String[n];

        for(int i = 0; i < n; i++)
        {
            Reverse_Array[i] = Array[n-1-i];
        }

        return Reverse_Array;
    }
}
