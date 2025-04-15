// Stack Public Class

// Class Stack
public class Stack {
    private int Stack_Index = 0; // Global Attribute
    private int[] Stack; // Global Attribute // Declaring // no size specified as this is just saying to the compiler that this 'Stack' will be an array in future
    
    // Constructor
    public Stack(int Stack_Size)
    {
        // Creates a new integer array of size 'Stack_Size'
        this.Stack = new int[Stack_Size];  // Global Attribute accessed using 'this' keyword
    }
    
    // Public method for displaying the stack
    public void display()
    {
        System.out.println("--Stack Displayed--");
        for(int i=this.Stack_Index - 1; i >= 0; i--)
        {
            System.out.println("| " + this.Stack[i] + " |");
        }
        System.out.println("--#--");
    }
    
    // Public method for pushing an element to Stack
    public void push(int element)
    {
        if(this.Stack_Index == this.Stack.length)
        {
            System.out.println("Stack is Full! Element '" + element + "' not added!");
            return;
        }
        this.Stack[this.Stack_Index] = element;
        this.Stack_Index++;
    }
    
    // Public method for poping an element from stack
    public void pop()
    {
        if(this.Stack_Index == 0)
        {
            System.out.println("Stack is Empty! Nothing to pop!");
            return;
        }
        this.Stack_Index--;
        /*
            In reality the element is not removed but rather the top stack index is decreased by 1, and the next time a push occurs the element is replaced.
            
            An example say this is the stack os size 4
            the array will be [0, 0, 0, 0]
                               ^
            index is at first position (0)
            
            Now after pushing 10, 20, 30
            the array will be [10, 20, 30, 0]
                                           ^
            index is not at fourth position (3)
            
            Now we pop 
            the array will be [10, 20, 30, 0]
                                        ^
            index is at third position (2)
            
            Now push 40
            the array will be [10, 20, 40, 0]
                                           ^
            index is at fourth position (3)
            
            This is how it works in the background.
        */
    }
}
