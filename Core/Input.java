

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		String name;
		int num1;
		int num2;
		
Scanner input=new Scanner(System.in);//	Scanner used get the output from the users
System.out.println("Enter the name");
name=input.nextLine();//next line used for get the output with space
System.out.println("Enter the numbers");
num1=input.nextInt();
num2=input.nextInt();
System.out.println("Welcome"+" "+name.toUpperCase());
System.out.println(num1+num2);
	}

}
