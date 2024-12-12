// Testing Java coding with prior knowledge in C/C++
public class Main
{
    public static void main(String[] args)
    {
        String Greeting = "Hello World!!";
        System.out.println(Greeting);

        int a = 100;
        int b = 600;
        int c = Sum(a, b);

        String Key_Phrase = Key();
        System.out.println(Key_Phrase);

        System.out.println(c);
    }

    public static int Sum(int x, int y)
    {
        return x + y;
    }

    private static String Key()
    {
        return "KEY 218931";
    }
}