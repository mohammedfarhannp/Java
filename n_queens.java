// importing Scanner class for user input
import java.util.Scanner;

// Main class
class n_queens {
    // Global static variables
    private static int Arrangements = 0;
    private static int[] State_Tree = new int[25];
    
    // Main Method of Main class
    public static void main (String[] args) {
        
        // Instance of Scanner class
        Scanner input = new Scanner(System.in);
        
        // User Input
        System.out.print("Enter an integer value (n for n-queens solution): ");
        int n = input.nextInt();
        
        // Closing Instance of Scanner class
        input.close();
        
        // Method call
        n_Queens(n);
        
        // Conditional Statements to check for the existence of solution
        if(Arrangements == 0)
        {
            System.out.println("No Solution Exist for n = " + n);
        } else {
            System.out.println(n + " Possible Arrangements.");
        }
    }
    
    // Private static boolean method
    private static boolean Place(int Index)
    {
        // Loop for value i is 1 to value of i one less than Index (Parameter)
        for (int i = 1; i < Index; i++)
        {
            /* Checks if State_Tree[i] matches
            with State_Tree[Index] For making sure
            no 2 Queens are placed in the same column
            
            
            Checks |State_Tree[i] - State_Tree[Index]|
            matches |i-Index| For making sure that no
            2 Queens are placed in same diagonal 
            */
            
            if(State_Tree[i] == State_Tree[Index] || Math.abs(State_Tree[i] - State_Tree[Index]) == Math.abs(i - Index))
            {
                return false;
            }
        }
        return true;
    }
    
    // Public static method n_Queens
    public static void n_Queens(int N)
    {
        // Set tracker to 1
        int Tracker = 1;
        // Set the value of State_Tree at index of Tracker to 0
        State_Tree[Tracker] = 0;
        while(Tracker != 0) // while Tracker is not zero
        {
            // Increment the value in State_Tree of index Tracker by 1 and then repeat it until condition (where State_Tree[Tracker] is less than N and if Place(Tracker) return False) becomes False
            do
            {
                State_Tree[Tracker]++;
            } while (State_Tree[Tracker] <= N && !Place(Tracker));
            
            
            // Check if State_Tree[Tracker] is less than N
            if (State_Tree[Tracker] <= N)
            {
                // Check if Tracker is equal to N
                if (Tracker == N)
                {
                    // Method Call
                    Print_Solution(N);
                } else {
                    // Increment value of Tracker
                    Tracker++;
                    // Set value of State_Tree[Tracker] to 0
                    State_Tree[Tracker] = 0;
                }
            } else {
                // Decrement the value of Tracker by one
                Tracker--;
            }
        }
    }
    
    // Private static method
    private static void Print_Solution(int N)
    {
        // Increment global variable Arrangement by one
        Arrangements++;
        System.out.println("Arrangement #" + Arrangements);
        
        // Display Solution // Printing Board with 'Q's and '.'s  using State_Tree configuration
        for (int i = 1; i <= N; i++)
        {
            for (int j = 1; j <= N; j++)
            {
                if (State_Tree[i] == j)
                {
                    System.out.print("Q");
                } else {
                    System.out.print(".");
                }
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }
}