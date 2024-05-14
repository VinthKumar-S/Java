import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;

public class delete_and_rename{

    public static void main(String[] args)throws IOException {
	// write your code here
        int choice=0;
        DataInputStream d=new DataInputStream(System.in);
        boolean present;
        File file = new File("F:\\Documents\\Programing Languages\\Java\\File\\delete.txt");
        do {
            System.out.println("1.Create a file,2.delete a file,3.rename a file.");
            System.out.println("Enter your choice:");
            choice=Integer.parseInt(d.readLine());
            switch (choice)
            {
                case 1:
                file.createNewFile();
                System.out.println("Creation is successfull");
                break;
                case 2:
                present = file.exists();
                if (present == true) {
                    file.delete();
                    System.out.println("Deletion is success");
                }
                break;
                case 3:
                    present = file.exists();
                    if (present == true) {
                        File newName = new File("F:\\Documents\\Programing Languages\\Java\\File\\newone.txt");
                        file.renameTo(newName);
                        System.out.println("file  is  renamed successfully");
                    }
                    break;
                }

        }while (choice!=0);
    }
}
