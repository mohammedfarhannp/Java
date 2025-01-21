// Java code for bubble sorting an integer array

// importing classes
import java.util.Arrays;

// Main Class
public class Bubble_Sort
{
    // Main method of Main Class
    public static void main(String[] args)
    {
        // Given unsorted integer array
        int[] Arr = {9, 3, 5, 1, 5, 3, 2, 10, 0, 4};
        System.out.println("Unsorted Array: " + Arrays.toString(Arr));

        // Sorting Array using bubble sort
        BubbleSort(Arr);
        System.out.println("Sorted Array: " + Arrays.toString(Arr));
    }

    // Private method for checking an array is sorted or not
    private static boolean isSorted(int[] Array)
    {
        for(int i = 1; i < Array.length; i++)
        {
            if(Array[i - 1] > Array[i])
            {
                return false;
            }
        }
        return true;
    }

    // public method for bubble sorting an array
    public static void BubbleSort(int[] Array)
    {
        // Swaping of adjacent elements of array if needed
        int tmp;

        while(!isSorted(Array))
        {
            for(int i = 1; i < Array.length; i++)
            {
                if(Array[i-1] > Array[i])
                {
                    tmp = Array[i-1];
                    Array[i-1] = Array[i];
                    Array[i] = tmp;
                }
            }
        }
    }
}
