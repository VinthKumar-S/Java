import java.io.File;

public class Print_list_of_files {

    public static void main(String[] args) {
   File file=new File("F:\\Documents\\Programing Languages\\Java");
       String[] List=file.list();
       for(int i=0;i<List.length;i++)
       {
           System.out.println(List[i]);
       }
    }
}