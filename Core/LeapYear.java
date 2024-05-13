
import java.io.*;
public class LeapYear {

    public static void main(String[] args)throws IOException {
	int year;
	System.out.println("Cheak the given yaer is Leap or Not");
	System.out.println("************************************");

	DataInputStream d=new DataInputStream(System.in);
	System.out.println("Enter the Year:");

	year=Integer.parseInt(d.readLine());
		if((year%4 == 0) && (year%100 != 0) || (year%400 == 0))
	  {
		  System.out.println("This Year is Leap Year:");
	  }
	  else {
		  System.out.println("This Year is Not Leap Year");
	  }
    }
}
