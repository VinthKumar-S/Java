import java.io.*;
import EB.*;
public class Pack
{
	public static void main(String []args)throws IOException
	{
	int pre,cur;
	System.out.println("EB bill calculation using Packages"); 
	DataInputStream d=new DataInputStream(System.in);
	System.out.println("Enter the Previous unit:");	
	pre=Integer.parseInt(d.readLine());
	System.out.println("Enter the Current unit:");
	cur=Integer.parseInt(d.readLine());
	check c=new check();
	c.cal(pre,cur);
}
	}	
	