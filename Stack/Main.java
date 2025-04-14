// Stack Program in Java

// Main Class
public class Main {
    // Global Variables for the entire class
    static int Stack_Size = 10; // Max Size of Stack
    static int Stack_Index = 0; // Index Variable to keep track of stack top position
    
    // Main method of Main Class
    public static void main(String args[]) {
        // New Integer Array
        int[] Stack = new int[Stack_Size];
        
        push(Stack, 10); // Push 10 to stack
        push(Stack, 20); // Push 20 to stack
        
        pop(); // Pop // 20 is poped from stack
        
        push(Stack, 30); // Push 30 to stack
        
        // Display Stack
        for (int i = Stack_Index - 1; i >= 0; i--) {
            System.out.println("|" + Stack[i] + "|");
        }
        System.out.println("____");
    }
    
    // Private method for pushing to stack
    private static void push(int[] S, int element)
    {
        // Check if Stack is full
        if(Stack_Size == Stack_Index)
        {
            System.out.println("Stack Full!! Element not Added!!");
            return;
        }
        
        // Add element to Stack at index 'Stack_Index'
        S[Stack_Index] = element;
        // Increment 'Stack_Index' variable by 1
        Stack_Index++;
    }
    
    private static void pop()
    {
        // Decrement 'Stack_Index' variable by 1
        Stack_Index--;
    }   
}
