import java.io.File;
import java.io.IOException;

public class create_typesoffiles {

    public static void main(String[] args) {
        // write your code here
        File file = new File("F:\\Documents\\Programing Languages\\Java\\File\\start.txt");
        boolean present = file.exists();
        System.out.println("we need create a new type of file");

            try {
                if (present == false)
                file.createNewFile();

            } catch (IOException e)
            {
                System.out.println("wrong dirctory");
            }

    }
}