import java.io.*;

class DeleteFile {
    public static void main(String args[])
    {
        try {
            String File_Name = args[0];

            File File_Object = new File(File_Name);
            if(File_Object.delete())
            {
                System.out.println("File Deleted Successfully...");
            } else {
                System.out.println("File Not Found!!");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
