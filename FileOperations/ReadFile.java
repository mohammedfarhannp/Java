import java.util.Scanner;
import java.io.*;

class ReadFile {
    public static void main(String args[])
    {
        try {
            String File_Name = args[0];

            File File_Object = new File(File_Name);

            Scanner File_Reader = new Scanner(File_Object);

            while(File_Reader.hasNextLine())
            {
                System.out.println(File_Reader.nextLine());
            }

            File_Reader.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
