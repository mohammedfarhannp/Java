// Java program to merge sort an integer array
// Importing classes
import java.util.Arrays; // For copying parts of array (from a range) like from 0th element to 4th element from 10 element array to be copied to a different array

// Main class
public class Merge_Sort
{
    // Main method of Main class
    public static void main(String[] args)
    {
        // Integer Array
        int[] Arr = {10, 8, 4, 9, 2, 7, 11, 5};

        // Sorted Array
        int[] Sorted_Arr = Merge_Sort(Arr);

        System.out.println("Sorted Array: " + Arrays.toString(Sorted_Arr));

    }

    // Merge Sort Method
    public static int[] Merge_Sort(int[] Array)
    {
        if(Array.length <= 1)
        {
            return Array; // If length of array is one then the array is sorted and if zero then array is empty
        }

        // middle index of Array
        int mid_point = Array.length / 2;

        // Splits the array into 2 sub array
        int[] Left = Arrays.copyOfRange(Array, 0, mid_point);
        int[] Right = Arrays.copyOfRange(Array, mid_point, Array.length);

        // Left and Right Sub Arrays are recursed
        Left = Merge_Sort(Left);
        Right = Merge_Sort(Right);

        // Returning return value of Merge method
        return Merge(Left, Right);
    }

    // Merge Method
    private static int[] Merge(int[] Left, int[] Right)
    {
        // index for new merged array, li for left sub array index, ri for right sub array index.
        int index=-1, li=0, ri=0;
        int[] Merged = new int[Left.length + Right.length];

        // iterating through both left and right sub arrays at once using while loop
        while(li < Left.length && ri < Right.length)
        {
            index++;
            if(Left[li] > Right[ri])
            {
                Merged[index] = Right[ri];
                ri++;
            } else if(Right[ri] > Left[li])
            {
                Merged[index] = Left[li];
                li++;
            } else {
                Merged[index] = Left[li];
                index++;
                li++;
                Merged[index] = Right[ri];
                ri++;
            }
        }

        // Iterating for any remaining elements;
        while(li < Left.length)
        {
            index++;
            Merged[index] = Left[li];
            li++;
        }

        while(ri < Right.length)
        {
            index++;
            Merged[index] = Right[ri];
            ri++;
        }

        return Merged;
    }
}
