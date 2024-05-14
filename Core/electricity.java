import java.io.*;
class electricity
{
	public static void main(String arg[])throws IOException
	{
		int punit,cunit,unitcon;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the value of print:");
		punit=Integer.parseInt(br.readLine());
		System.out.println("Enter the value of print:");
		cunit=Integer.parseInt(br.readLine());
		System.out.println("\t\t Electricty bill calculation:");
		System.out.println("\t\t......................:");
		unitcon=cunit-punit;
		System.out.println("\t the value of unitcon:"+unitcon);
		if(unitcon<100)
		{
		System.out.println("\n\t Rupees is 0.00:");
		}
		else if(unitcon>=100&&unitcon<200)
		{
		System.out.println("\n\tRupees is10.00:");
		}
		else if(unitcon>= 200&& unitcon<400)
		{
		System.out.println("\n\t Rupee is 20.00");
		}
		else
		{
		System.out.println("\n\tRupee is 30.00");
		}
}
	}