import java.io.*;
public class inputchack
{
public static void main(String[] args)throws IOException{
int num1;
DataInputStream d=new DataInputStream(System.in);
System.out.println("Enter the number");
num1=Integer.parseInt(d.readLine());
}
}