// Java code for writing contents to a file

// Importing classes for writing contents to a file
import java.io.FileWriter;
import java.io.IOException;

// Import class for user input
import java.util.Scanner;


// Main class
public class File_Write
{
    // Main method of main class
    public static void main(String[] args)
    {
        // Instance of Scanner class for user input
        Scanner input = new Scanner(System.in);

        // File Name or File Name with path
        System.out.print("Enter the name of the file: ");
        String File_Name = input.nextLine();

        // Content to write to File
        System.out.print("Enter the Content of the file, use \\n for new line: ");
        String Content = input.nextLine();

        // Close the instance of Scanner
        input.close();

        // Making sure \n is properly given as special char
        Content = Content.replace("\\n", "\n");

        // Try to create an instance of FileWriter with the File Name or File Path
        try (FileWriter writer = new FileWriter(File_Name))
        {
            // Write Contents to File with writer instance of FileWriter
            writer.write(Content);
            // Display Success message
            System.out.println("Content written to file successfully...");

        } catch (IOException error) // Catch Exception / Error to error variable
        {
            // Print Error Message incase of Error
            error.printStackTrace();
        }
    }
}
