
import  java.io.*;

public class Ex {

    public static void main(String[] args)throws IOException {
	// write your code here
        DataInputStream d=new DataInputStream(System.in);
        try{
            int number=Integer.parseInt(d.readLine());

            System.out.println("Num"+number);
        }
        catch (Exception ex){
            System.out.println("Only number is Accepted");
        }
    }
}
