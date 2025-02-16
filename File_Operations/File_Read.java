// Importing essential builtin - classes
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;

// import java.nio.file.*; // for everything in java.nio.file

import java.io.IOException;

// Main Class
public class File_Read
{
    // Main Function of Main Class
    public static void main (String[] args)
    {
        String File_Name = "File.txt";

        // Path to the file you want to read
        Path File_Path = Paths.get(File_Name);

        // Try and catch block
        try {
            // Reading File Contents
            String File_Contents = Files.readString(File_Path);

            // Displaying File Contents
            System.out.print(File_Contents);

        } catch (IOException error) {
            // Displaying Error Message if error
            System.out.println("An Error Occured while reading this file: " + File_Name + "\nError: " + error);
        }
    }
}
