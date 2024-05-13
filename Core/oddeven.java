import java.io.*;
class odd extends Thread
{
	int i,j,s1,e1;
	void get(int s,int e)
	{
		s1=s;
		e1=e;
	}
	public void run()
	{
		for(i=s1;i<=e1;i++)
		{
			if(i%2!=0)
			{
				System.out.println("odd number is:"+i);
			}
		}
	}
}
class even extends Thread
{
	int i,j,s2,e2;
	void get1(int s,int e)
	{
		s2=s;
		e2=e;
	}
	public void run()
	{
		for(i=s2;i<=e2;i++)
		{
			if(i%2==0)
			{
				System.out.println("Even number is :"+i);
			}
		}
	}
}
class oddeven
{
	public static void main(String arge[])throws IOException
	{
		int first,end;
		DataInputStream d=new DataInputStream(System.in);
		System.out.println("Print Odd and Even Numbers using Range and Thread");
		System.out.println("-------------------------------------------------");
		System.out.println("Enter the First number:");
		first=Integer.parseInt(d.readLine());
		System.out.println("Enter the End number:");
		end=Integer.parseInt(d.readLine());
		odd o1=new odd();
		even e1=new even();
		o1.get(first,end);
		o1.start();
		e1.get1(first,end);
		e1.start();
	}
}