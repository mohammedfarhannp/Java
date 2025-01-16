// Java code for executing system commands

// importing classes for reading output of the system command execution
import java.io.BufferedReader;
import java.io.InputStreamReader;

// importing class for taking user input
import java.util.Scanner;

// Main class
public class Exec {
    // Main Method of Main class
    public static void main(String[] args)
    {
        // Instance or object of Scanner class for user input
        Scanner input = new Scanner(System.in);


        // Taking user input
        System.out.print("Enter Command: ");
        String command = input.nextLine();

        // Closing Instance
        input.close();

        cmd(command);
    }

    public static void cmd(String Command)
    {
        try {
            // Executing System command
            Process process = Runtime.getRuntime().exec(Command);

            // Reading the output
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

            String line;

            // while line read from reader not equal to null print line
            while ((line = reader.readLine()) != null)
            {
                System.out.println(line);
            }

            // wait for completion of execution of system command
            process.waitFor();

        } catch (Exception error) {
            // Error Printing
            error.printStackTrace();

        }
    }
}
