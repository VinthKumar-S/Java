import java.io.File;

public class Delete_file {

    public static void main(String[] args) {
	// write your code here
        File file=new File("F:\\Documents\\Programing Languages\\C program");

        File[] filelist=file.listFiles();
        for(File f:filelist)
        {
            if(f.isFile())
            {
                String filename=f.getName();
                int Dot=filename.lastIndexOf(".");
                String extention=filename.substring(Dot+1);
                if(extention.equals("exe"))
                {
                    f.delete();
                    System.out.println("The exe files are deleted from the directory");
                }

            }
        }
    }