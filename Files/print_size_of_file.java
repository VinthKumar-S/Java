import java.io.*;

public class print_size_of_file {

    public static void main(String[] args)throws IOException {
	// write your code here
        float s,size=0;
        DataInputStream d=new DataInputStream(System.in);
        File file=new File("F:\\Documents\\PDF(for all)\\Second year\\Data Structure");

        File[] filelist=file.listFiles();
        for(File f:filelist)
        {
            if(f.isFile())
            {
                String filename=f.getName();
                int Dot=filename.lastIndexOf(".");
                String extention=filename.substring(Dot+1);
                if(extention.equals("pdf"))
                {
                    if(f.length()>12000000)
                    System.out.println(filename+"=size:"+f.length());
                }

            }
        }
    }
}