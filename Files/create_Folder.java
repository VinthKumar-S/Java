import java.io.File;

public class create_Folder {

    public static void main(String[] args) {
	// write your code here
        File file =new File("F:\\Documents\\Programing Languages\\Java\\File\\own file");
        boolean present=file.exists();
        System.out.println(" we need do create a new folder..");
        if(present==false)
            file.mkdir();
        System.out.println("And the folder is created successfully--");
    }
}