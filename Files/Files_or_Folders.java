import java.io.*;
public class Files_or_Folders {

    public static void main(String[] args)throws IOException {
	// write your code here
        File file=new File("F:\\Documents\\PDF(for all)\\Second year\\Java");
        File[] Folderlist=file.listFiles();
        int choice;
        DataInputStream d=new DataInputStream(System.in);
        do{
            System.out.println("1 for file,2 for folders,0 for Exit..");
            System.out.println("Enter your choice:");
            choice=Integer.parseInt(d.readLine());
            switch (choice)
            {
                case 1:
                    System.out.println("The list of files.");
                   for(File f:Folderlist)
                   {
                    if(f.isFile())
                        System.out.println(f);
                   }
                   break;
                case 2:
                    System.out.println("The List of Folders.");
                    for(File F:Folderlist)
                    {
                        if(F.isDirectory())
                            System.out.println(F);
                    }
                    break;
            }
        }while(choice!=0);
    }
}