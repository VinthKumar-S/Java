import java.io.*;
import java.lang.ArrayStoreException;
class ARREXCP
{
	public static void main(String args[])throws IOException
	{
	int i;
	DataInputStream d=new DataInputStream(System.in);
	System.out.println("Enter the number");
	int n=Integer.parseInt(d.readLine());
	int[] arr=new int[n];
try
	{
	for(i=0;i<n;i++)
	{	
	arr[i]=Integer.parseInt(d.readLine());
	}
	for(i=0;i<n;i++)
	{	
	System.out.println("the values"+arr[i]);
	}
	}
	catch(ArrayStoreException ex)
	{
	System.out.println("wrong data type");
	}
}
	}