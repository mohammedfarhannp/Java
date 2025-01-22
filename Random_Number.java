// Java code for generating random numbers between a range
// Importing classes
import java.util.Random; // for random numbers

// Main class
public class Random_Number {
    // Main method for Main class
    public static void main (String[] args)
    {
        int random_integer = randint(5, 10);
        System.out.println("Random Number between 5 and 10: " + random_integer);
    }

    // Public method for random number between a range
    public static int randint(int lower, int upper)
    {
        Random random = new Random();
        return random.nextInt(upper - lower + 1) + lower; // nextInt takes one integer parameter x and gives back a random number between 0 and x
        // excluding x so if 5 then 0 to 4 is the range
    }

}

