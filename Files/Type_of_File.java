import java.io.*;
public class Type_of_File {

    public static void main(String[] args)throws IOException {
	// write your code
        DataInputStream d=new DataInputStream(System.in);
        File file=new File("F:\\Documents\\PDF(for all)\\Second year\\Data Structure");
        System.out.println("Which types of file are you want?");
        String type=new String(d.readLine());
        File[] filelist=file.listFiles();
        for(File f:filelist)
        {
            if(f.isFile())
            {
                String filename=f.getName();
                int Dot=filename.lastIndexOf(".");
                String extention=filename.substring(Dot+1);
                if(extention.equals(type))
                    System.out.println(filename);
            }
        }
    }
}