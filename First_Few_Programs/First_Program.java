// Testing Java coding with prior knowledge in C/C++
// Main Class *Required for exec
public class First_Program
{
    // Main Function of Main class *Required for exec
    public static void main(String[] args)
    {
        // String Variable
        String Greeting = "Hello World!!";

        // Print line 
        System.out.println(Greeting);

        // Integer Variables
        int a = 100;
        int b = 600;

        // Public function call
        int c = Sum(a, b);

        // Calling a private function
        // Private functions can only be accessed inside a class while public functions can be accessed outside of class as well
        String Key_Phrase = Key(); // Private function call

        // Printing output from private function call
        System.out.println(Key_Phrase);

        // Output of public function call
        System.out.println(c);
    }

    // Public function accessible outside of class
    public static int Sum(int x, int y)
    {
        return x + y;
    }

    // Private function, only accessible inside the class
    private static String Key()
    {
        return "KEY 218931";
    }
}
