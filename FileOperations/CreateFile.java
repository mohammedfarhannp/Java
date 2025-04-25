import java.io.*;

class CreateFile {
    public static void main(String args[])
    {
        try {
            String File_Name = args[0];

            File File_Object = new File(File_Name);

            if(File_Object.createNewFile())
            {
                System.out.println("File Created Successfully!");
            } else {
                System.out.println("File not Created!\nFile may already exist or you do not have permission to make files in this folder!");
            }

        } catch (Exception e) {
            System.out.println(e);

        }

    }

}
