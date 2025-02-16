// Java code for generating Random String
// importing random class for random numbers
import java.util.Random;

// Main class
class Random_String
{
    // Alphabets
    private static String Alphabets = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    // Main method of Main class
    public static void main(String[] args)
    {
        StringBuilder Rand_Str = randstr_1(10);
        System.out.println("Random String: " + Rand_Str);
    }

    // Public method for random string of fixed length
    public static StringBuilder randstr_1(int length)
    {
        StringBuilder Random_String = new StringBuilder();
        int position;
        for(int i = 0; i < length; i++)
        {
            position = randint(0, 51);
            Random_String.append(Alphabets.charAt(position)); 
        }
        return Random_String;
    }

    // Alternate method for random string of fixed length
    public static String randstr_2(int length)
    {
        String Random_String = "";
        int position;
        for(int i = 0; i < length; i++)
        {
            position = randint(0, 51);
            Random_String += Alphabets.charAt(position); 
        }
        return Random_String;
    }

    // private method for random integers between a range
    private static int randint(int lower, int upper)
    {
        Random random = new Random();
        return random.nextInt(upper - lower + 1) + lower; // nextInt takes one integer parameter x and gives back a random number between 0 and x
        // excluding x so if 5 then 0 to 4 is the range
    }

}