import java.io.*;
class nextl
{
int i,j;
	void backward()
	{
	for(i=6;i>=1;i--)
	{
	for(j=0;j<i;j++)
	{
	System.out.print("*");
	}
	System.out.println("");
	}
	}

	void backward1()
	{
	for(i=1;i<=6;i++)
	{
	for(j=6;j>i||j==i;j--)
	{
		if(j==i)
		System.out.print("*");
		else
		System.out.print(" ");
	}
	for(int k=1;k<i;k++)
	{
	System.out.print("*");
	}
	System.out.println("");
	}
	
	
}
		
}
class loops
{
	public static void main(String []args)
	{
	int n=6,i,j;
	for(i=1;i<=n;i++)
	{
	for(j=0;j<i;j++)
	{
	System.out.print("*");
	}
	System.out.println("");
	}
	System.out.println("\n");
	nextl ni=new nextl();
	ni.backward();
	ni.backward1();
	}
	}
