// Java program to selection sort an integer array

// Importing Classes
import java.util.Arrays;

// Main class
public class Selection_Sort
{
    // Main Method of Main Class
    public static void main(String[] args)
    {
        // Unsorted Array
        int[] Given_Array = {10, 8, 11, 2, 6, 7, 9};

        // Sorted Array
        int[] Sorted_Array = SelectionSort(Given_Array);

        // Display the Arrays
        System.out.println("Unsorted Array: " + Arrays.toString(Given_Array));
        System.out.println("Sorted Array: " + Arrays.toString(Sorted_Array));
    }

    // Private method for retriving index of min number from an array
    private static int min(int[] Arr)
    {
        int index = 0;
        int min_value = Arr[index];
        for(int i = 1; i < Arr.length; i++)
        {
            // Checks if the min_value is greater than the next element
            // if yes then the min value is set smaller element
            if(min_value > Arr[i])
            {
                min_value = Arr[i];
                index = i;
            }
        }
        return index;
    }

    // Selection Sort method
    public static int[] SelectionSort(int[] Arr)
    {
        // New Array for sorting
        int[] Sorted = Arrays.copyOfRange(Arr, 0, Arr.length);

        // Gets index for min number from an array
        // And then swaps value at index i with value at index returned from 'min' method.
        int tmp, index;
        for(int i = 0; i < Sorted.length; i++)
        {
            index = min(Arrays.copyOfRange(Sorted, i, Sorted.length)) + i;
            tmp = Sorted[i];
            Sorted[i] = Sorted[index];
            Sorted[index] = tmp;
        }
        // Returns Sorted Array
        return Sorted;
    }
}
