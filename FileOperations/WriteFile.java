import java.io.*;
import java.util.Scanner;


class WriteFile {
    public static void main(String args[])
    {
        try {
            String File_Name = args[0];

            FileWriter File_Object = new FileWriter(File_Name);

            Scanner Input_Object = new Scanner(System.in);

            String Input_String;

            while(true)
            {
                System.out.print("Enter Text (!# To Stop): ");
                Input_String = Input_Object.nextLine();

                if(Input_String.equals("!#"))
                    break;

                File_Object.write(Input_String + "\n");
            }

            File_Object.close();
            Input_Object.close();

            System.out.println("Content Written to File Successfully...");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
